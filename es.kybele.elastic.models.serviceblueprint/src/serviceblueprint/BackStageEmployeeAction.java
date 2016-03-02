/**
 */
package serviceblueprint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Back Stage Employee Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceblueprint.BackStageEmployeeAction#getContent <em>Content</em>}</li>
 *   <li>{@link serviceblueprint.BackStageEmployeeAction#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceblueprint.ServiceblueprintPackage#getBackStageEmployeeAction()
 * @model
 * @generated
 */
public interface BackStageEmployeeAction extends ServiceBlueprintNode {
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
	 * @see serviceblueprint.ServiceblueprintPackage#getBackStageEmployeeAction_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link serviceblueprint.BackStageEmployeeAction#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>In Service Blueprint Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link serviceblueprint.ServiceBlueprintDiagram#getHasBackStageEmployeeActions <em>Has Back Stage Employee Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Service Blueprint Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Service Blueprint Model</em>' container reference.
	 * @see #setInServiceBlueprintModel(ServiceBlueprintDiagram)
	 * @see serviceblueprint.ServiceblueprintPackage#getBackStageEmployeeAction_InServiceBlueprintModel()
	 * @see serviceblueprint.ServiceBlueprintDiagram#getHasBackStageEmployeeActions
	 * @model opposite="hasBackStageEmployeeActions" transient="false"
	 * @generated
	 */
	ServiceBlueprintDiagram getInServiceBlueprintModel();

	/**
	 * Sets the value of the '{@link serviceblueprint.BackStageEmployeeAction#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Service Blueprint Model</em>' container reference.
	 * @see #getInServiceBlueprintModel()
	 * @generated
	 */
	void setInServiceBlueprintModel(ServiceBlueprintDiagram value);

} // BackStageEmployeeAction
