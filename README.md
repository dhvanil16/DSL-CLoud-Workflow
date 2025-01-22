# Cloudautomation: Workflow DSL and Airflow DAG Generator

Cloudautomation is a project for defining workflows using a custom Domain-Specific Language (DSL). 
It generates Apache Airflow DAGs based on these workflow definitions, enabling seamless automation of task scheduling and dependency management.

---

## Key Features

1. **Custom Workflow DSL**:
   - Define workflows, tasks, priorities, and dependencies in a simple, human-readable syntax.
  
2. **Airflow DAG Generator**:
   - Automatically converts DSL workflows into Python-based Airflow DAGs.
   - Output DAGs include task dependencies, scheduling, and dummy execution logic.

3. **Integrated Validation**:
   - Built-in testing ensures that workflows and dependencies are valid and free of parsing errors.

4. **Web Integration**:
   - Includes a lightweight web interface for managing workflows and generating DAGs.

---

## Project Structure

### Core Directories

1. **`src/main/java/Cloudautomation`**:
   - Contains Java implementations of the DSL, validation, and generator components.
   - Files include:
     - `Airflow.xtext`: The DSL grammar definition.
     - `AirflowStandaloneSetup.java`: Entry point for initializing the DSL environment.
     - `AirflowGenerator.xtend`: Logic for DAG generation from workflows.

2. **`src/main/resources/`**:
   - Example DSL files and generated DAG outputs.
   - Files include:
     - `Cloudautomation.airflow`: DSL file defining workflows.
     - `MyFirstWorkflow_dag.py`: Airflow DAG output.

3. **`src/test/`**:
   - Contains test cases for validating DSL parsing and DAG generation.

4. **`Cloudautomation.web`**:
   - Web application for interacting with the DSL and DAG generator.
   - Includes:
     - `index.html`: A simple frontend for workflow management.
     - `ServerLauncher.java`: Backend server setup for the web interface.

---

## Installation

### Prerequisites
Ensure the following are installed on your system:
- **Java Development Kit (JDK)**
- **Groovy**
- **Gradle**
- **Python (3.x)** and **Apache Airflow**

### Steps
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd Cloudautomation
   ```

2. Compile the project:
   ```bash
   gradle build
   ```

3. Run the web interface:
   ```bash
   gradle :agileairflow.web:run
   ```

4. Access the web interface.

### Generate Airflow DAGs
Run the generator script:
```bash
groovy src/main/java/agileairflow/generator/agilecompilergroovy.groovy
```
The generated DAGs will be saved in the `src/main/resources/` directory.

### Deploy DAGs to Airflow
Copy the generated DAGs to the Airflow DAG directory:
```bash
cp src/main/resources/*.py /path/to/airflow/dags/
```
Restart the Airflow scheduler and webserver:
```bash
airflow scheduler &
airflow webserver &
```
View and activate your DAG in the Airflow web interface.

### Testing
Run the unit tests to validate DSL parsing and DAG generation:
```bash
gradle test
```

---

## Usage

- **Core Module**:
  - Run standalone workflow tasks via CLI or integrate with other systems.
- **Web Module**:
  - Access the web interface at `http://localhost:8080` after starting the application.
  

### Define Workflows
Write your workflow definitions in the DSL format inside `src/main/resources/Cloudautomation.airflow`:
```plaintext
Workflow MyWorkflow {
    "Workflow description"
    Task TaskA {
        "Task A description"
        Low
        Simple
    }
    dependsOn TaskA on TaskB
}
```

