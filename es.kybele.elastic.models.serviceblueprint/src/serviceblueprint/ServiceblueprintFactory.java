/**
 */
package serviceblueprint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see serviceblueprint.ServiceblueprintPackage
 * @generated
 */
public interface ServiceblueprintFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServiceblueprintFactory eINSTANCE = serviceblueprint.impl.ServiceblueprintFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service Blueprint Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Blueprint Model</em>'.
	 * @generated
	 */
	ServiceBlueprintModel createServiceBlueprintModel();

	/**
	 * Returns a new object of class '<em>Service Blueprint Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Blueprint Connection</em>'.
	 * @generated
	 */
	ServiceBlueprintConnection createServiceBlueprintConnection();

	/**
	 * Returns a new object of class '<em>Service Blueprint Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Blueprint Diagram</em>'.
	 * @generated
	 */
	ServiceBlueprintDiagram createServiceBlueprintDiagram();

	/**
	 * Returns a new object of class '<em>Service Blueprint Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Blueprint Node</em>'.
	 * @generated
	 */
	ServiceBlueprintNode createServiceBlueprintNode();

	/**
	 * Returns a new object of class '<em>Physical Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Evidence</em>'.
	 * @generated
	 */
	PhysicalEvidence createPhysicalEvidence();

	/**
	 * Returns a new object of class '<em>Customer Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Action</em>'.
	 * @generated
	 */
	CustomerAction createCustomerAction();

	/**
	 * Returns a new object of class '<em>On Stage Employee Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Stage Employee Action</em>'.
	 * @generated
	 */
	OnStageEmployeeAction createOnStageEmployeeAction();

	/**
	 * Returns a new object of class '<em>Back Stage Employee Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Back Stage Employee Action</em>'.
	 * @generated
	 */
	BackStageEmployeeAction createBackStageEmployeeAction();

	/**
	 * Returns a new object of class '<em>Support Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support Process</em>'.
	 * @generated
	 */
	SupportProcess createSupportProcess();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServiceblueprintPackage getServiceblueprintPackage();

} //ServiceblueprintFactory
