from airflow import DAG
from airflow.operators.python_operator import PythonOperator
from datetime import datetime

def dummy_task(task_name):
    print(f"Executing task: {task_name}")

with DAG(
    dag_id='MyFirstWorkflow_dag',
    start_date=datetime(2023, 1, 1),
    schedule_interval='@daily',
    catchup=False
) as dag:

    TaskA = PythonOperator(
        task_id='TaskA',
        python_callable=dummy_task,
        op_args=['Initialize the environment']
    )
    TaskB = PythonOperator(
        task_id='TaskB',
        python_callable=dummy_task,
        op_args=['Process data and generate report']
    )
    TaskC = PythonOperator(
        task_id='TaskC',
        python_callable=dummy_task,
        op_args=['Archive the logs']
    )
    TaskB >> TaskA
    TaskC >> TaskB
