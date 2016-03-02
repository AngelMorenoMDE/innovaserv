/**
 */
package serviceblueprint.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import serviceblueprint.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see serviceblueprint.ServiceblueprintPackage
 * @generated
 */
public class ServiceblueprintSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServiceblueprintPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceblueprintSwitch() {
		if (modelPackage == null) {
			modelPackage = ServiceblueprintPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL: {
				ServiceBlueprintModel serviceBlueprintModel = (ServiceBlueprintModel)theEObject;
				T result = caseServiceBlueprintModel(serviceBlueprintModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_CONNECTION: {
				ServiceBlueprintConnection serviceBlueprintConnection = (ServiceBlueprintConnection)theEObject;
				T result = caseServiceBlueprintConnection(serviceBlueprintConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM: {
				ServiceBlueprintDiagram serviceBlueprintDiagram = (ServiceBlueprintDiagram)theEObject;
				T result = caseServiceBlueprintDiagram(serviceBlueprintDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_NODE: {
				ServiceBlueprintNode serviceBlueprintNode = (ServiceBlueprintNode)theEObject;
				T result = caseServiceBlueprintNode(serviceBlueprintNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServiceblueprintPackage.PHYSICAL_EVIDENCE: {
				PhysicalEvidence physicalEvidence = (PhysicalEvidence)theEObject;
				T result = casePhysicalEvidence(physicalEvidence);
				if (result == null) result = caseServiceBlueprintNode(physicalEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServiceblueprintPackage.CUSTOMER_ACTION: {
				CustomerAction customerAction = (CustomerAction)theEObject;
				T result = caseCustomerAction(customerAction);
				if (result == null) result = caseServiceBlueprintNode(customerAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServiceblueprintPackage.ON_STAGE_EMPLOYEE_ACTION: {
				OnStageEmployeeAction onStageEmployeeAction = (OnStageEmployeeAction)theEObject;
				T result = caseOnStageEmployeeAction(onStageEmployeeAction);
				if (result == null) result = caseServiceBlueprintNode(onStageEmployeeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION: {
				BackStageEmployeeAction backStageEmployeeAction = (BackStageEmployeeAction)theEObject;
				T result = caseBackStageEmployeeAction(backStageEmployeeAction);
				if (result == null) result = caseServiceBlueprintNode(backStageEmployeeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServiceblueprintPackage.SUPPORT_PROCESS: {
				SupportProcess supportProcess = (SupportProcess)theEObject;
				T result = caseSupportProcess(supportProcess);
				if (result == null) result = caseServiceBlueprintNode(supportProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Blueprint Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Blueprint Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceBlueprintModel(ServiceBlueprintModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Blueprint Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Blueprint Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceBlueprintConnection(ServiceBlueprintConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Blueprint Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Blueprint Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceBlueprintDiagram(ServiceBlueprintDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Blueprint Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Blueprint Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceBlueprintNode(ServiceBlueprintNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalEvidence(PhysicalEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerAction(CustomerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Stage Employee Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Stage Employee Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnStageEmployeeAction(OnStageEmployeeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Back Stage Employee Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Back Stage Employee Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackStageEmployeeAction(BackStageEmployeeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportProcess(SupportProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ServiceblueprintSwitch
