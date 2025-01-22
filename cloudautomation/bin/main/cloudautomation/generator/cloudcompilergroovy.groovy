package cloudautomation.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet
import cloudautomation.AirflowStandaloneSetup
import cloudautomation.airflow.Model
import cloudautomation.airflow.Workflow
import cloudautomation.airflow.Task
import cloudautomation.airflow.Dependency
import com.google.inject.Injector

class airflowGenerator {

    static void main(String[] args) {
        // Initialize the Xtext infrastructure
        Injector injector = new AirflowStandaloneSetup().createInjectorAndDoEMFRegistration()
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class)

        // Load the DSL input file
        Resource resource = resourceSet.getResource(URI.createFileURI("src/main/resources/cloudairflow.airflow"), true)
        Model model = resource.getContents().get(0) as Model

        // Generate the Airflow DAG Python file for each workflow
        model.workflows.each { workflow ->
            String airflowDag = generateAirflowDAG(workflow)
            File outputFile = new File("src/main/resources/${workflow.name}_dag.py")
            outputFile.write(airflowDag)
            println("Airflow DAG generated successfully: ${outputFile.absolutePath}")
        }
    }

    /**
     * Generate Airflow DAG content for a workflow.
     * 
     * @param workflow Workflow object from the DSL model
     * @return Python code for the Airflow DAG
     */
    static String generateAirflowDAG(Workflow workflow) {
        def dagName = workflow.name
        def dagContent = new StringBuilder()

        // Add DAG imports and definition
        dagContent.append("""\
from airflow import DAG
from airflow.operators.python_operator import PythonOperator
from datetime import datetime

def dummy_task(task_name):
    print(f"Executing task: {task_name}")

with DAG(
    dag_id='${dagName}_dag',
    start_date=datetime(2023, 1, 1),
    schedule_interval='@daily',
    catchup=False
) as dag:

""")

        // Add tasks as PythonOperators
        workflow.tasks.each { task ->
            def taskName = task.name
            def description = task.description.replaceAll("'", "\\\\'")
            dagContent.append("""\
    ${taskName} = PythonOperator(
        task_id='${taskName}',
        python_callable=dummy_task,
        op_args=['${description}']
    )
""")
        }

        // Add task dependencies
        workflow.dependencies.each { dependency ->
            def sourceTask = dependency.task
            def targetTask = dependency.taskId
            dagContent.append("    ${sourceTask} >> ${targetTask}\n")
        }

        return dagContent.toString()
    }
}
