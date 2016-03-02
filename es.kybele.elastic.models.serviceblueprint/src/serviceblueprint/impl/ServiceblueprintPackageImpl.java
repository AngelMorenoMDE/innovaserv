/**
 */
package serviceblueprint.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import serviceblueprint.BackStageEmployeeAction;
import serviceblueprint.CustomerAction;
import serviceblueprint.OnStageEmployeeAction;
import serviceblueprint.PhysicalEvidence;
import serviceblueprint.ServiceBlueprintConnection;
import serviceblueprint.ServiceBlueprintDiagram;
import serviceblueprint.ServiceBlueprintModel;
import serviceblueprint.ServiceBlueprintNode;
import serviceblueprint.ServiceblueprintFactory;
import serviceblueprint.ServiceblueprintPackage;
import serviceblueprint.SupportProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceblueprintPackageImpl extends EPackageImpl implements ServiceblueprintPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceBlueprintModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceBlueprintConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceBlueprintDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceBlueprintNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onStageEmployeeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backStageEmployeeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportProcessEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see serviceblueprint.ServiceblueprintPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServiceblueprintPackageImpl() {
		super(eNS_URI, ServiceblueprintFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ServiceblueprintPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServiceblueprintPackage init() {
		if (isInited) return (ServiceblueprintPackage)EPackage.Registry.INSTANCE.getEPackage(ServiceblueprintPackage.eNS_URI);

		// Obtain or create and register package
		ServiceblueprintPackageImpl theServiceblueprintPackage = (ServiceblueprintPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServiceblueprintPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServiceblueprintPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theServiceblueprintPackage.createPackageContents();

		// Initialize created meta-data
		theServiceblueprintPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServiceblueprintPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServiceblueprintPackage.eNS_URI, theServiceblueprintPackage);
		return theServiceblueprintPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceBlueprintModel() {
		return serviceBlueprintModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBlueprintModel_HasServiceBlueprintDiagram() {
		return (EReference)serviceBlueprintModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBlueprintModel_HasServiceBlueprintConnection() {
		return (EReference)serviceBlueprintModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceBlueprintConnection() {
		return serviceBlueprintConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBlueprintConnection_SourceServiceBlueprintNode() {
		return (EReference)serviceBlueprintConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBlueprintConnection_TargetServiceBlueprintNode() {
		return (EReference)serviceBlueprintConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceBlueprintDiagram() {
		return serviceBlueprintDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBlueprintDiagram_InServiceBlueprintModel() {
		return (EReference)serviceBlueprintDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBlueprintDiagram_HasPhysicalEvidences() {
		return (EReference)serviceBlueprintDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBlueprintDiagram_HasCustomerActions() {
		return (EReference)serviceBlueprintDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBlueprintDiagram_HasOnStageEmployeeActions() {
		return (EReference)serviceBlueprintDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBlueprintDiagram_HasBackStageEmployeeActions() {
		return (EReference)serviceBlueprintDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBlueprintDiagram_HasSupportProcesses() {
		return (EReference)serviceBlueprintDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceBlueprintNode() {
		return serviceBlueprintNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalEvidence() {
		return physicalEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalEvidence_Content() {
		return (EAttribute)physicalEvidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalEvidence_InServiceBlueprintModel() {
		return (EReference)physicalEvidenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerAction() {
		return customerActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerAction_Content() {
		return (EAttribute)customerActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAction_InServiceBlueprintModel() {
		return (EReference)customerActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnStageEmployeeAction() {
		return onStageEmployeeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnStageEmployeeAction_Content() {
		return (EAttribute)onStageEmployeeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnStageEmployeeAction_InServiceBlueprintModel() {
		return (EReference)onStageEmployeeActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackStageEmployeeAction() {
		return backStageEmployeeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackStageEmployeeAction_Content() {
		return (EAttribute)backStageEmployeeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBackStageEmployeeAction_InServiceBlueprintModel() {
		return (EReference)backStageEmployeeActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportProcess() {
		return supportProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportProcess_Content() {
		return (EAttribute)supportProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportProcess_InServiceBlueprintModel() {
		return (EReference)supportProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceblueprintFactory getServiceblueprintFactory() {
		return (ServiceblueprintFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serviceBlueprintModelEClass = createEClass(SERVICE_BLUEPRINT_MODEL);
		createEReference(serviceBlueprintModelEClass, SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_DIAGRAM);
		createEReference(serviceBlueprintModelEClass, SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_CONNECTION);

		serviceBlueprintConnectionEClass = createEClass(SERVICE_BLUEPRINT_CONNECTION);
		createEReference(serviceBlueprintConnectionEClass, SERVICE_BLUEPRINT_CONNECTION__SOURCE_SERVICE_BLUEPRINT_NODE);
		createEReference(serviceBlueprintConnectionEClass, SERVICE_BLUEPRINT_CONNECTION__TARGET_SERVICE_BLUEPRINT_NODE);

		serviceBlueprintDiagramEClass = createEClass(SERVICE_BLUEPRINT_DIAGRAM);
		createEReference(serviceBlueprintDiagramEClass, SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL);
		createEReference(serviceBlueprintDiagramEClass, SERVICE_BLUEPRINT_DIAGRAM__HAS_PHYSICAL_EVIDENCES);
		createEReference(serviceBlueprintDiagramEClass, SERVICE_BLUEPRINT_DIAGRAM__HAS_CUSTOMER_ACTIONS);
		createEReference(serviceBlueprintDiagramEClass, SERVICE_BLUEPRINT_DIAGRAM__HAS_ON_STAGE_EMPLOYEE_ACTIONS);
		createEReference(serviceBlueprintDiagramEClass, SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS);
		createEReference(serviceBlueprintDiagramEClass, SERVICE_BLUEPRINT_DIAGRAM__HAS_SUPPORT_PROCESSES);

		serviceBlueprintNodeEClass = createEClass(SERVICE_BLUEPRINT_NODE);

		physicalEvidenceEClass = createEClass(PHYSICAL_EVIDENCE);
		createEAttribute(physicalEvidenceEClass, PHYSICAL_EVIDENCE__CONTENT);
		createEReference(physicalEvidenceEClass, PHYSICAL_EVIDENCE__IN_SERVICE_BLUEPRINT_MODEL);

		customerActionEClass = createEClass(CUSTOMER_ACTION);
		createEAttribute(customerActionEClass, CUSTOMER_ACTION__CONTENT);
		createEReference(customerActionEClass, CUSTOMER_ACTION__IN_SERVICE_BLUEPRINT_MODEL);

		onStageEmployeeActionEClass = createEClass(ON_STAGE_EMPLOYEE_ACTION);
		createEAttribute(onStageEmployeeActionEClass, ON_STAGE_EMPLOYEE_ACTION__CONTENT);
		createEReference(onStageEmployeeActionEClass, ON_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL);

		backStageEmployeeActionEClass = createEClass(BACK_STAGE_EMPLOYEE_ACTION);
		createEAttribute(backStageEmployeeActionEClass, BACK_STAGE_EMPLOYEE_ACTION__CONTENT);
		createEReference(backStageEmployeeActionEClass, BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL);

		supportProcessEClass = createEClass(SUPPORT_PROCESS);
		createEAttribute(supportProcessEClass, SUPPORT_PROCESS__CONTENT);
		createEReference(supportProcessEClass, SUPPORT_PROCESS__IN_SERVICE_BLUEPRINT_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		physicalEvidenceEClass.getESuperTypes().add(this.getServiceBlueprintNode());
		customerActionEClass.getESuperTypes().add(this.getServiceBlueprintNode());
		onStageEmployeeActionEClass.getESuperTypes().add(this.getServiceBlueprintNode());
		backStageEmployeeActionEClass.getESuperTypes().add(this.getServiceBlueprintNode());
		supportProcessEClass.getESuperTypes().add(this.getServiceBlueprintNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceBlueprintModelEClass, ServiceBlueprintModel.class, "ServiceBlueprintModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceBlueprintModel_HasServiceBlueprintDiagram(), this.getServiceBlueprintDiagram(), this.getServiceBlueprintDiagram_InServiceBlueprintModel(), "hasServiceBlueprintDiagram", null, 1, 1, ServiceBlueprintModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceBlueprintModel_HasServiceBlueprintConnection(), this.getServiceBlueprintConnection(), null, "hasServiceBlueprintConnection", null, 0, -1, ServiceBlueprintModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceBlueprintConnectionEClass, ServiceBlueprintConnection.class, "ServiceBlueprintConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceBlueprintConnection_SourceServiceBlueprintNode(), this.getServiceBlueprintNode(), null, "sourceServiceBlueprintNode", null, 1, 1, ServiceBlueprintConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceBlueprintConnection_TargetServiceBlueprintNode(), this.getServiceBlueprintNode(), null, "targetServiceBlueprintNode", null, 1, 1, ServiceBlueprintConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceBlueprintDiagramEClass, ServiceBlueprintDiagram.class, "ServiceBlueprintDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceBlueprintDiagram_InServiceBlueprintModel(), this.getServiceBlueprintModel(), this.getServiceBlueprintModel_HasServiceBlueprintDiagram(), "inServiceBlueprintModel", null, 0, 1, ServiceBlueprintDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceBlueprintDiagram_HasPhysicalEvidences(), this.getPhysicalEvidence(), this.getPhysicalEvidence_InServiceBlueprintModel(), "hasPhysicalEvidences", null, 0, -1, ServiceBlueprintDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceBlueprintDiagram_HasCustomerActions(), this.getCustomerAction(), this.getCustomerAction_InServiceBlueprintModel(), "hasCustomerActions", null, 0, -1, ServiceBlueprintDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceBlueprintDiagram_HasOnStageEmployeeActions(), this.getOnStageEmployeeAction(), this.getOnStageEmployeeAction_InServiceBlueprintModel(), "hasOnStageEmployeeActions", null, 0, -1, ServiceBlueprintDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceBlueprintDiagram_HasBackStageEmployeeActions(), this.getBackStageEmployeeAction(), this.getBackStageEmployeeAction_InServiceBlueprintModel(), "hasBackStageEmployeeActions", null, 0, -1, ServiceBlueprintDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceBlueprintDiagram_HasSupportProcesses(), this.getSupportProcess(), this.getSupportProcess_InServiceBlueprintModel(), "hasSupportProcesses", null, 0, -1, ServiceBlueprintDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceBlueprintNodeEClass, ServiceBlueprintNode.class, "ServiceBlueprintNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalEvidenceEClass, PhysicalEvidence.class, "PhysicalEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalEvidence_Content(), ecorePackage.getEString(), "content", null, 0, 1, PhysicalEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalEvidence_InServiceBlueprintModel(), this.getServiceBlueprintDiagram(), this.getServiceBlueprintDiagram_HasPhysicalEvidences(), "inServiceBlueprintModel", null, 0, 1, PhysicalEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerActionEClass, CustomerAction.class, "CustomerAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerAction_Content(), ecorePackage.getEString(), "content", null, 0, 1, CustomerAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerAction_InServiceBlueprintModel(), this.getServiceBlueprintDiagram(), this.getServiceBlueprintDiagram_HasCustomerActions(), "inServiceBlueprintModel", null, 0, 1, CustomerAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onStageEmployeeActionEClass, OnStageEmployeeAction.class, "OnStageEmployeeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnStageEmployeeAction_Content(), ecorePackage.getEString(), "content", null, 0, 1, OnStageEmployeeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnStageEmployeeAction_InServiceBlueprintModel(), this.getServiceBlueprintDiagram(), this.getServiceBlueprintDiagram_HasOnStageEmployeeActions(), "inServiceBlueprintModel", null, 0, 1, OnStageEmployeeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backStageEmployeeActionEClass, BackStageEmployeeAction.class, "BackStageEmployeeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBackStageEmployeeAction_Content(), ecorePackage.getEString(), "content", null, 0, 1, BackStageEmployeeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBackStageEmployeeAction_InServiceBlueprintModel(), this.getServiceBlueprintDiagram(), this.getServiceBlueprintDiagram_HasBackStageEmployeeActions(), "inServiceBlueprintModel", null, 0, 1, BackStageEmployeeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supportProcessEClass, SupportProcess.class, "SupportProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupportProcess_Content(), ecorePackage.getEString(), "content", null, 0, 1, SupportProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupportProcess_InServiceBlueprintModel(), this.getServiceBlueprintDiagram(), this.getServiceBlueprintDiagram_HasSupportProcesses(), "inServiceBlueprintModel", null, 0, 1, SupportProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ServiceblueprintPackageImpl
