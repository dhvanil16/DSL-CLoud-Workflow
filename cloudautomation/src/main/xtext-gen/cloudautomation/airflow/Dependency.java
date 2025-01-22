/**
 * generated by Xtext 2.32.0
 */
package cloudautomation.airflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudautomation.airflow.Dependency#getTask <em>Task</em>}</li>
 *   <li>{@link cloudautomation.airflow.Dependency#getTaskId <em>Task Id</em>}</li>
 * </ul>
 *
 * @see cloudautomation.airflow.AirflowPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject
{
  /**
   * Returns the value of the '<em><b>Task</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task</em>' attribute.
   * @see #setTask(String)
   * @see cloudautomation.airflow.AirflowPackage#getDependency_Task()
   * @model
   * @generated
   */
  String getTask();

  /**
   * Sets the value of the '{@link cloudautomation.airflow.Dependency#getTask <em>Task</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' attribute.
   * @see #getTask()
   * @generated
   */
  void setTask(String value);

  /**
   * Returns the value of the '<em><b>Task Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Id</em>' attribute.
   * @see #setTaskId(String)
   * @see cloudautomation.airflow.AirflowPackage#getDependency_TaskId()
   * @model
   * @generated
   */
  String getTaskId();

  /**
   * Sets the value of the '{@link cloudautomation.airflow.Dependency#getTaskId <em>Task Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Id</em>' attribute.
   * @see #getTaskId()
   * @generated
   */
  void setTaskId(String value);

} // Dependency
