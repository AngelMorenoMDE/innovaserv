/**
 */
package serviceblueprint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import serviceblueprint.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceblueprintFactoryImpl extends EFactoryImpl implements ServiceblueprintFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceblueprintFactory init() {
		try {
			ServiceblueprintFactory theServiceblueprintFactory = (ServiceblueprintFactory)EPackage.Registry.INSTANCE.getEFactory(ServiceblueprintPackage.eNS_URI);
			if (theServiceblueprintFactory != null) {
				return theServiceblueprintFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServiceblueprintFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceblueprintFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL: return createServiceBlueprintModel();
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_CONNECTION: return createServiceBlueprintConnection();
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM: return createServiceBlueprintDiagram();
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_NODE: return createServiceBlueprintNode();
			case ServiceblueprintPackage.PHYSICAL_EVIDENCE: return createPhysicalEvidence();
			case ServiceblueprintPackage.CUSTOMER_ACTION: return createCustomerAction();
			case ServiceblueprintPackage.ON_STAGE_EMPLOYEE_ACTION: return createOnStageEmployeeAction();
			case ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION: return createBackStageEmployeeAction();
			case ServiceblueprintPackage.SUPPORT_PROCESS: return createSupportProcess();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintModel createServiceBlueprintModel() {
		ServiceBlueprintModelImpl serviceBlueprintModel = new ServiceBlueprintModelImpl();
		return serviceBlueprintModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintConnection createServiceBlueprintConnection() {
		ServiceBlueprintConnectionImpl serviceBlueprintConnection = new ServiceBlueprintConnectionImpl();
		return serviceBlueprintConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintDiagram createServiceBlueprintDiagram() {
		ServiceBlueprintDiagramImpl serviceBlueprintDiagram = new ServiceBlueprintDiagramImpl();
		return serviceBlueprintDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintNode createServiceBlueprintNode() {
		ServiceBlueprintNodeImpl serviceBlueprintNode = new ServiceBlueprintNodeImpl();
		return serviceBlueprintNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEvidence createPhysicalEvidence() {
		PhysicalEvidenceImpl physicalEvidence = new PhysicalEvidenceImpl();
		return physicalEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAction createCustomerAction() {
		CustomerActionImpl customerAction = new CustomerActionImpl();
		return customerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnStageEmployeeAction createOnStageEmployeeAction() {
		OnStageEmployeeActionImpl onStageEmployeeAction = new OnStageEmployeeActionImpl();
		return onStageEmployeeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackStageEmployeeAction createBackStageEmployeeAction() {
		BackStageEmployeeActionImpl backStageEmployeeAction = new BackStageEmployeeActionImpl();
		return backStageEmployeeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportProcess createSupportProcess() {
		SupportProcessImpl supportProcess = new SupportProcessImpl();
		return supportProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceblueprintPackage getServiceblueprintPackage() {
		return (ServiceblueprintPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServiceblueprintPackage getPackage() {
		return ServiceblueprintPackage.eINSTANCE;
	}

} //ServiceblueprintFactoryImpl
