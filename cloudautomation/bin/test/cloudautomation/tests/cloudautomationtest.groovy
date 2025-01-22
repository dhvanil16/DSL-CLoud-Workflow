package cloudautomation.tests

import org.junit.jupiter.api.Test
import cloudautomation.airflow.Model
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(AirflowInjectorProvider)
class cloudautomationtest {

	@Inject
	ParseHelper<Model> parseHelper

	    @Test
    void testWorkflowWithDependency() {
        def input = """
        Workflow WorkflowWithDeps {
            "Workflow with dependencies"
            Task Task1 {
                "First task"
                Medium
                Simple
            }
            Task Task2 {
                "Second task"
                High
                Compound
            }
            dependsOn Task2 on Task1
        }
        """
        def result = parseHelper.parse(input)
        Assertions.assertNotNull(result, "Parsed model should not be null")
        def errors = result.eResource().errors
        Assertions.assertTrue(errors.isEmpty(), "Unexpected errors: ${errors.join(", ")}")
        
        Assertions.assertEquals(1, result.workflows.size(), "There should be exactly one workflow")
        def workflow = result.workflows[0]
        Assertions.assertEquals("WorkflowWithDeps", workflow.name, "Workflow name should match")
        Assertions.assertEquals(2, workflow.tasks.size(), "Workflow should have two tasks")
        def dependency = workflow.dependencies[0]
        Assertions.assertEquals("Task2", dependency.task, "Dependency should point to Task2")
        Assertions.assertEquals("Task1", dependency.taskId, "Dependency should depend on Task1")
    }
	
}



