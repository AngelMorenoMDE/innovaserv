/**
 */
package serviceblueprint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Blueprint Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceblueprint.ServiceBlueprintModel#getHasServiceBlueprintDiagram <em>Has Service Blueprint Diagram</em>}</li>
 *   <li>{@link serviceblueprint.ServiceBlueprintModel#getHasServiceBlueprintConnection <em>Has Service Blueprint Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceblueprint.ServiceblueprintPackage#getServiceBlueprintModel()
 * @model
 * @generated
 */
public interface ServiceBlueprintModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Service Blueprint Diagram</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link serviceblueprint.ServiceBlueprintDiagram#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Service Blueprint Diagram</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Service Blueprint Diagram</em>' containment reference.
	 * @see #setHasServiceBlueprintDiagram(ServiceBlueprintDiagram)
	 * @see serviceblueprint.ServiceblueprintPackage#getServiceBlueprintModel_HasServiceBlueprintDiagram()
	 * @see serviceblueprint.ServiceBlueprintDiagram#getInServiceBlueprintModel
	 * @model opposite="inServiceBlueprintModel" containment="true" required="true"
	 * @generated
	 */
	ServiceBlueprintDiagram getHasServiceBlueprintDiagram();

	/**
	 * Sets the value of the '{@link serviceblueprint.ServiceBlueprintModel#getHasServiceBlueprintDiagram <em>Has Service Blueprint Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Service Blueprint Diagram</em>' containment reference.
	 * @see #getHasServiceBlueprintDiagram()
	 * @generated
	 */
	void setHasServiceBlueprintDiagram(ServiceBlueprintDiagram value);

	/**
	 * Returns the value of the '<em><b>Has Service Blueprint Connection</b></em>' containment reference list.
	 * The list contents are of type {@link serviceblueprint.ServiceBlueprintConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Service Blueprint Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Service Blueprint Connection</em>' containment reference list.
	 * @see serviceblueprint.ServiceblueprintPackage#getServiceBlueprintModel_HasServiceBlueprintConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceBlueprintConnection> getHasServiceBlueprintConnection();

} // ServiceBlueprintModel
