/**
 */
package serviceblueprint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Blueprint Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceblueprint.ServiceBlueprintDiagram#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}</li>
 *   <li>{@link serviceblueprint.ServiceBlueprintDiagram#getHasPhysicalEvidences <em>Has Physical Evidences</em>}</li>
 *   <li>{@link serviceblueprint.ServiceBlueprintDiagram#getHasCustomerActions <em>Has Customer Actions</em>}</li>
 *   <li>{@link serviceblueprint.ServiceBlueprintDiagram#getHasOnStageEmployeeActions <em>Has On Stage Employee Actions</em>}</li>
 *   <li>{@link serviceblueprint.ServiceBlueprintDiagram#getHasBackStageEmployeeActions <em>Has Back Stage Employee Actions</em>}</li>
 *   <li>{@link serviceblueprint.ServiceBlueprintDiagram#getHasSupportProcesses <em>Has Support Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceblueprint.ServiceblueprintPackage#getServiceBlueprintDiagram()
 * @model
 * @generated
 */
public interface ServiceBlueprintDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>In Service Blueprint Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link serviceblueprint.ServiceBlueprintModel#getHasServiceBlueprintDiagram <em>Has Service Blueprint Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Service Blueprint Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Service Blueprint Model</em>' container reference.
	 * @see #setInServiceBlueprintModel(ServiceBlueprintModel)
	 * @see serviceblueprint.ServiceblueprintPackage#getServiceBlueprintDiagram_InServiceBlueprintModel()
	 * @see serviceblueprint.ServiceBlueprintModel#getHasServiceBlueprintDiagram
	 * @model opposite="hasServiceBlueprintDiagram" transient="false"
	 * @generated
	 */
	ServiceBlueprintModel getInServiceBlueprintModel();

	/**
	 * Sets the value of the '{@link serviceblueprint.ServiceBlueprintDiagram#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Service Blueprint Model</em>' container reference.
	 * @see #getInServiceBlueprintModel()
	 * @generated
	 */
	void setInServiceBlueprintModel(ServiceBlueprintModel value);

	/**
	 * Returns the value of the '<em><b>Has Physical Evidences</b></em>' containment reference list.
	 * The list contents are of type {@link serviceblueprint.PhysicalEvidence}.
	 * It is bidirectional and its opposite is '{@link serviceblueprint.PhysicalEvidence#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Physical Evidences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Physical Evidences</em>' containment reference list.
	 * @see serviceblueprint.ServiceblueprintPackage#getServiceBlueprintDiagram_HasPhysicalEvidences()
	 * @see serviceblueprint.PhysicalEvidence#getInServiceBlueprintModel
	 * @model opposite="inServiceBlueprintModel" containment="true"
	 * @generated
	 */
	EList<PhysicalEvidence> getHasPhysicalEvidences();

	/**
	 * Returns the value of the '<em><b>Has Customer Actions</b></em>' containment reference list.
	 * The list contents are of type {@link serviceblueprint.CustomerAction}.
	 * It is bidirectional and its opposite is '{@link serviceblueprint.CustomerAction#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Customer Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Customer Actions</em>' containment reference list.
	 * @see serviceblueprint.ServiceblueprintPackage#getServiceBlueprintDiagram_HasCustomerActions()
	 * @see serviceblueprint.CustomerAction#getInServiceBlueprintModel
	 * @model opposite="inServiceBlueprintModel" containment="true"
	 * @generated
	 */
	EList<CustomerAction> getHasCustomerActions();

	/**
	 * Returns the value of the '<em><b>Has On Stage Employee Actions</b></em>' containment reference list.
	 * The list contents are of type {@link serviceblueprint.OnStageEmployeeAction}.
	 * It is bidirectional and its opposite is '{@link serviceblueprint.OnStageEmployeeAction#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has On Stage Employee Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has On Stage Employee Actions</em>' containment reference list.
	 * @see serviceblueprint.ServiceblueprintPackage#getServiceBlueprintDiagram_HasOnStageEmployeeActions()
	 * @see serviceblueprint.OnStageEmployeeAction#getInServiceBlueprintModel
	 * @model opposite="inServiceBlueprintModel" containment="true"
	 * @generated
	 */
	EList<OnStageEmployeeAction> getHasOnStageEmployeeActions();

	/**
	 * Returns the value of the '<em><b>Has Back Stage Employee Actions</b></em>' containment reference list.
	 * The list contents are of type {@link serviceblueprint.BackStageEmployeeAction}.
	 * It is bidirectional and its opposite is '{@link serviceblueprint.BackStageEmployeeAction#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Back Stage Employee Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Back Stage Employee Actions</em>' containment reference list.
	 * @see serviceblueprint.ServiceblueprintPackage#getServiceBlueprintDiagram_HasBackStageEmployeeActions()
	 * @see serviceblueprint.BackStageEmployeeAction#getInServiceBlueprintModel
	 * @model opposite="inServiceBlueprintModel" containment="true"
	 * @generated
	 */
	EList<BackStageEmployeeAction> getHasBackStageEmployeeActions();

	/**
	 * Returns the value of the '<em><b>Has Support Processes</b></em>' containment reference list.
	 * The list contents are of type {@link serviceblueprint.SupportProcess}.
	 * It is bidirectional and its opposite is '{@link serviceblueprint.SupportProcess#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Support Processes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Support Processes</em>' containment reference list.
	 * @see serviceblueprint.ServiceblueprintPackage#getServiceBlueprintDiagram_HasSupportProcesses()
	 * @see serviceblueprint.SupportProcess#getInServiceBlueprintModel
	 * @model opposite="inServiceBlueprintModel" containment="true"
	 * @generated
	 */
	EList<SupportProcess> getHasSupportProcesses();

} // ServiceBlueprintDiagram
