/**
 */
package serviceblueprint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Blueprint Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceblueprint.ServiceBlueprintConnection#getSourceServiceBlueprintNode <em>Source Service Blueprint Node</em>}</li>
 *   <li>{@link serviceblueprint.ServiceBlueprintConnection#getTargetServiceBlueprintNode <em>Target Service Blueprint Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceblueprint.ServiceblueprintPackage#getServiceBlueprintConnection()
 * @model
 * @generated
 */
public interface ServiceBlueprintConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Service Blueprint Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Service Blueprint Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Service Blueprint Node</em>' reference.
	 * @see #setSourceServiceBlueprintNode(ServiceBlueprintNode)
	 * @see serviceblueprint.ServiceblueprintPackage#getServiceBlueprintConnection_SourceServiceBlueprintNode()
	 * @model required="true"
	 * @generated
	 */
	ServiceBlueprintNode getSourceServiceBlueprintNode();

	/**
	 * Sets the value of the '{@link serviceblueprint.ServiceBlueprintConnection#getSourceServiceBlueprintNode <em>Source Service Blueprint Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Service Blueprint Node</em>' reference.
	 * @see #getSourceServiceBlueprintNode()
	 * @generated
	 */
	void setSourceServiceBlueprintNode(ServiceBlueprintNode value);

	/**
	 * Returns the value of the '<em><b>Target Service Blueprint Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Service Blueprint Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Service Blueprint Node</em>' reference.
	 * @see #setTargetServiceBlueprintNode(ServiceBlueprintNode)
	 * @see serviceblueprint.ServiceblueprintPackage#getServiceBlueprintConnection_TargetServiceBlueprintNode()
	 * @model required="true"
	 * @generated
	 */
	ServiceBlueprintNode getTargetServiceBlueprintNode();

	/**
	 * Sets the value of the '{@link serviceblueprint.ServiceBlueprintConnection#getTargetServiceBlueprintNode <em>Target Service Blueprint Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Service Blueprint Node</em>' reference.
	 * @see #getTargetServiceBlueprintNode()
	 * @generated
	 */
	void setTargetServiceBlueprintNode(ServiceBlueprintNode value);

} // ServiceBlueprintConnection
