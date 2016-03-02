/**
 */
package serviceblueprint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Stage Employee Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceblueprint.OnStageEmployeeAction#getContent <em>Content</em>}</li>
 *   <li>{@link serviceblueprint.OnStageEmployeeAction#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceblueprint.ServiceblueprintPackage#getOnStageEmployeeAction()
 * @model
 * @generated
 */
public interface OnStageEmployeeAction extends ServiceBlueprintNode {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see serviceblueprint.ServiceblueprintPackage#getOnStageEmployeeAction_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link serviceblueprint.OnStageEmployeeAction#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>In Service Blueprint Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link serviceblueprint.ServiceBlueprintDiagram#getHasOnStageEmployeeActions <em>Has On Stage Employee Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Service Blueprint Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Service Blueprint Model</em>' container reference.
	 * @see #setInServiceBlueprintModel(ServiceBlueprintDiagram)
	 * @see serviceblueprint.ServiceblueprintPackage#getOnStageEmployeeAction_InServiceBlueprintModel()
	 * @see serviceblueprint.ServiceBlueprintDiagram#getHasOnStageEmployeeActions
	 * @model opposite="hasOnStageEmployeeActions" transient="false"
	 * @generated
	 */
	ServiceBlueprintDiagram getInServiceBlueprintModel();

	/**
	 * Sets the value of the '{@link serviceblueprint.OnStageEmployeeAction#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Service Blueprint Model</em>' container reference.
	 * @see #getInServiceBlueprintModel()
	 * @generated
	 */
	void setInServiceBlueprintModel(ServiceBlueprintDiagram value);

} // OnStageEmployeeAction
