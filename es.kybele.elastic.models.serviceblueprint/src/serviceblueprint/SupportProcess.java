/**
 */
package serviceblueprint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceblueprint.SupportProcess#getContent <em>Content</em>}</li>
 *   <li>{@link serviceblueprint.SupportProcess#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceblueprint.ServiceblueprintPackage#getSupportProcess()
 * @model
 * @generated
 */
public interface SupportProcess extends ServiceBlueprintNode {
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
	 * @see serviceblueprint.ServiceblueprintPackage#getSupportProcess_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link serviceblueprint.SupportProcess#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>In Service Blueprint Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link serviceblueprint.ServiceBlueprintDiagram#getHasSupportProcesses <em>Has Support Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Service Blueprint Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Service Blueprint Model</em>' container reference.
	 * @see #setInServiceBlueprintModel(ServiceBlueprintDiagram)
	 * @see serviceblueprint.ServiceblueprintPackage#getSupportProcess_InServiceBlueprintModel()
	 * @see serviceblueprint.ServiceBlueprintDiagram#getHasSupportProcesses
	 * @model opposite="hasSupportProcesses" transient="false"
	 * @generated
	 */
	ServiceBlueprintDiagram getInServiceBlueprintModel();

	/**
	 * Sets the value of the '{@link serviceblueprint.SupportProcess#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Service Blueprint Model</em>' container reference.
	 * @see #getInServiceBlueprintModel()
	 * @generated
	 */
	void setInServiceBlueprintModel(ServiceBlueprintDiagram value);

} // SupportProcess
