/**
 */
package serviceblueprint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see serviceblueprint.ServiceblueprintFactory
 * @model kind="package"
 * @generated
 */
public interface ServiceblueprintPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "serviceblueprint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kybele.es/projects/elastic/models/serviceblueprint/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "serviceblueprint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServiceblueprintPackage eINSTANCE = serviceblueprint.impl.ServiceblueprintPackageImpl.init();

	/**
	 * The meta object id for the '{@link serviceblueprint.impl.ServiceBlueprintModelImpl <em>Service Blueprint Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceblueprint.impl.ServiceBlueprintModelImpl
	 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getServiceBlueprintModel()
	 * @generated
	 */
	int SERVICE_BLUEPRINT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Has Service Blueprint Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Has Service Blueprint Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_CONNECTION = 1;

	/**
	 * The number of structural features of the '<em>Service Blueprint Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Blueprint Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link serviceblueprint.impl.ServiceBlueprintConnectionImpl <em>Service Blueprint Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceblueprint.impl.ServiceBlueprintConnectionImpl
	 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getServiceBlueprintConnection()
	 * @generated
	 */
	int SERVICE_BLUEPRINT_CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Source Service Blueprint Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_CONNECTION__SOURCE_SERVICE_BLUEPRINT_NODE = 0;

	/**
	 * The feature id for the '<em><b>Target Service Blueprint Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_CONNECTION__TARGET_SERVICE_BLUEPRINT_NODE = 1;

	/**
	 * The number of structural features of the '<em>Service Blueprint Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Blueprint Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link serviceblueprint.impl.ServiceBlueprintDiagramImpl <em>Service Blueprint Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceblueprint.impl.ServiceBlueprintDiagramImpl
	 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getServiceBlueprintDiagram()
	 * @generated
	 */
	int SERVICE_BLUEPRINT_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>In Service Blueprint Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Has Physical Evidences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_DIAGRAM__HAS_PHYSICAL_EVIDENCES = 1;

	/**
	 * The feature id for the '<em><b>Has Customer Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_DIAGRAM__HAS_CUSTOMER_ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Has On Stage Employee Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_DIAGRAM__HAS_ON_STAGE_EMPLOYEE_ACTIONS = 3;

	/**
	 * The feature id for the '<em><b>Has Back Stage Employee Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS = 4;

	/**
	 * The feature id for the '<em><b>Has Support Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_DIAGRAM__HAS_SUPPORT_PROCESSES = 5;

	/**
	 * The number of structural features of the '<em>Service Blueprint Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_DIAGRAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Service Blueprint Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link serviceblueprint.impl.ServiceBlueprintNodeImpl <em>Service Blueprint Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceblueprint.impl.ServiceBlueprintNodeImpl
	 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getServiceBlueprintNode()
	 * @generated
	 */
	int SERVICE_BLUEPRINT_NODE = 3;

	/**
	 * The number of structural features of the '<em>Service Blueprint Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Blueprint Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLUEPRINT_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link serviceblueprint.impl.PhysicalEvidenceImpl <em>Physical Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceblueprint.impl.PhysicalEvidenceImpl
	 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getPhysicalEvidence()
	 * @generated
	 */
	int PHYSICAL_EVIDENCE = 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EVIDENCE__CONTENT = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Service Blueprint Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EVIDENCE__IN_SERVICE_BLUEPRINT_MODEL = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Physical Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EVIDENCE_FEATURE_COUNT = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Physical Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EVIDENCE_OPERATION_COUNT = SERVICE_BLUEPRINT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link serviceblueprint.impl.CustomerActionImpl <em>Customer Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceblueprint.impl.CustomerActionImpl
	 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getCustomerAction()
	 * @generated
	 */
	int CUSTOMER_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACTION__CONTENT = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Service Blueprint Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACTION__IN_SERVICE_BLUEPRINT_MODEL = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Customer Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACTION_FEATURE_COUNT = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Customer Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACTION_OPERATION_COUNT = SERVICE_BLUEPRINT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link serviceblueprint.impl.OnStageEmployeeActionImpl <em>On Stage Employee Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceblueprint.impl.OnStageEmployeeActionImpl
	 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getOnStageEmployeeAction()
	 * @generated
	 */
	int ON_STAGE_EMPLOYEE_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_STAGE_EMPLOYEE_ACTION__CONTENT = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Service Blueprint Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>On Stage Employee Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_STAGE_EMPLOYEE_ACTION_FEATURE_COUNT = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>On Stage Employee Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_STAGE_EMPLOYEE_ACTION_OPERATION_COUNT = SERVICE_BLUEPRINT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link serviceblueprint.impl.BackStageEmployeeActionImpl <em>Back Stage Employee Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceblueprint.impl.BackStageEmployeeActionImpl
	 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getBackStageEmployeeAction()
	 * @generated
	 */
	int BACK_STAGE_EMPLOYEE_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_STAGE_EMPLOYEE_ACTION__CONTENT = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Service Blueprint Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Back Stage Employee Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_STAGE_EMPLOYEE_ACTION_FEATURE_COUNT = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Back Stage Employee Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_STAGE_EMPLOYEE_ACTION_OPERATION_COUNT = SERVICE_BLUEPRINT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link serviceblueprint.impl.SupportProcessImpl <em>Support Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceblueprint.impl.SupportProcessImpl
	 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getSupportProcess()
	 * @generated
	 */
	int SUPPORT_PROCESS = 8;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PROCESS__CONTENT = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Service Blueprint Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PROCESS__IN_SERVICE_BLUEPRINT_MODEL = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Support Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PROCESS_FEATURE_COUNT = SERVICE_BLUEPRINT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Support Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PROCESS_OPERATION_COUNT = SERVICE_BLUEPRINT_NODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link serviceblueprint.ServiceBlueprintModel <em>Service Blueprint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Blueprint Model</em>'.
	 * @see serviceblueprint.ServiceBlueprintModel
	 * @generated
	 */
	EClass getServiceBlueprintModel();

	/**
	 * Returns the meta object for the containment reference '{@link serviceblueprint.ServiceBlueprintModel#getHasServiceBlueprintDiagram <em>Has Service Blueprint Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Service Blueprint Diagram</em>'.
	 * @see serviceblueprint.ServiceBlueprintModel#getHasServiceBlueprintDiagram()
	 * @see #getServiceBlueprintModel()
	 * @generated
	 */
	EReference getServiceBlueprintModel_HasServiceBlueprintDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link serviceblueprint.ServiceBlueprintModel#getHasServiceBlueprintConnection <em>Has Service Blueprint Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Service Blueprint Connection</em>'.
	 * @see serviceblueprint.ServiceBlueprintModel#getHasServiceBlueprintConnection()
	 * @see #getServiceBlueprintModel()
	 * @generated
	 */
	EReference getServiceBlueprintModel_HasServiceBlueprintConnection();

	/**
	 * Returns the meta object for class '{@link serviceblueprint.ServiceBlueprintConnection <em>Service Blueprint Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Blueprint Connection</em>'.
	 * @see serviceblueprint.ServiceBlueprintConnection
	 * @generated
	 */
	EClass getServiceBlueprintConnection();

	/**
	 * Returns the meta object for the reference '{@link serviceblueprint.ServiceBlueprintConnection#getSourceServiceBlueprintNode <em>Source Service Blueprint Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Service Blueprint Node</em>'.
	 * @see serviceblueprint.ServiceBlueprintConnection#getSourceServiceBlueprintNode()
	 * @see #getServiceBlueprintConnection()
	 * @generated
	 */
	EReference getServiceBlueprintConnection_SourceServiceBlueprintNode();

	/**
	 * Returns the meta object for the reference '{@link serviceblueprint.ServiceBlueprintConnection#getTargetServiceBlueprintNode <em>Target Service Blueprint Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Service Blueprint Node</em>'.
	 * @see serviceblueprint.ServiceBlueprintConnection#getTargetServiceBlueprintNode()
	 * @see #getServiceBlueprintConnection()
	 * @generated
	 */
	EReference getServiceBlueprintConnection_TargetServiceBlueprintNode();

	/**
	 * Returns the meta object for class '{@link serviceblueprint.ServiceBlueprintDiagram <em>Service Blueprint Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Blueprint Diagram</em>'.
	 * @see serviceblueprint.ServiceBlueprintDiagram
	 * @generated
	 */
	EClass getServiceBlueprintDiagram();

	/**
	 * Returns the meta object for the container reference '{@link serviceblueprint.ServiceBlueprintDiagram#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Service Blueprint Model</em>'.
	 * @see serviceblueprint.ServiceBlueprintDiagram#getInServiceBlueprintModel()
	 * @see #getServiceBlueprintDiagram()
	 * @generated
	 */
	EReference getServiceBlueprintDiagram_InServiceBlueprintModel();

	/**
	 * Returns the meta object for the containment reference list '{@link serviceblueprint.ServiceBlueprintDiagram#getHasPhysicalEvidences <em>Has Physical Evidences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Physical Evidences</em>'.
	 * @see serviceblueprint.ServiceBlueprintDiagram#getHasPhysicalEvidences()
	 * @see #getServiceBlueprintDiagram()
	 * @generated
	 */
	EReference getServiceBlueprintDiagram_HasPhysicalEvidences();

	/**
	 * Returns the meta object for the containment reference list '{@link serviceblueprint.ServiceBlueprintDiagram#getHasCustomerActions <em>Has Customer Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Customer Actions</em>'.
	 * @see serviceblueprint.ServiceBlueprintDiagram#getHasCustomerActions()
	 * @see #getServiceBlueprintDiagram()
	 * @generated
	 */
	EReference getServiceBlueprintDiagram_HasCustomerActions();

	/**
	 * Returns the meta object for the containment reference list '{@link serviceblueprint.ServiceBlueprintDiagram#getHasOnStageEmployeeActions <em>Has On Stage Employee Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has On Stage Employee Actions</em>'.
	 * @see serviceblueprint.ServiceBlueprintDiagram#getHasOnStageEmployeeActions()
	 * @see #getServiceBlueprintDiagram()
	 * @generated
	 */
	EReference getServiceBlueprintDiagram_HasOnStageEmployeeActions();

	/**
	 * Returns the meta object for the containment reference list '{@link serviceblueprint.ServiceBlueprintDiagram#getHasBackStageEmployeeActions <em>Has Back Stage Employee Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Back Stage Employee Actions</em>'.
	 * @see serviceblueprint.ServiceBlueprintDiagram#getHasBackStageEmployeeActions()
	 * @see #getServiceBlueprintDiagram()
	 * @generated
	 */
	EReference getServiceBlueprintDiagram_HasBackStageEmployeeActions();

	/**
	 * Returns the meta object for the containment reference list '{@link serviceblueprint.ServiceBlueprintDiagram#getHasSupportProcesses <em>Has Support Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Support Processes</em>'.
	 * @see serviceblueprint.ServiceBlueprintDiagram#getHasSupportProcesses()
	 * @see #getServiceBlueprintDiagram()
	 * @generated
	 */
	EReference getServiceBlueprintDiagram_HasSupportProcesses();

	/**
	 * Returns the meta object for class '{@link serviceblueprint.ServiceBlueprintNode <em>Service Blueprint Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Blueprint Node</em>'.
	 * @see serviceblueprint.ServiceBlueprintNode
	 * @generated
	 */
	EClass getServiceBlueprintNode();

	/**
	 * Returns the meta object for class '{@link serviceblueprint.PhysicalEvidence <em>Physical Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Evidence</em>'.
	 * @see serviceblueprint.PhysicalEvidence
	 * @generated
	 */
	EClass getPhysicalEvidence();

	/**
	 * Returns the meta object for the attribute '{@link serviceblueprint.PhysicalEvidence#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see serviceblueprint.PhysicalEvidence#getContent()
	 * @see #getPhysicalEvidence()
	 * @generated
	 */
	EAttribute getPhysicalEvidence_Content();

	/**
	 * Returns the meta object for the container reference '{@link serviceblueprint.PhysicalEvidence#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Service Blueprint Model</em>'.
	 * @see serviceblueprint.PhysicalEvidence#getInServiceBlueprintModel()
	 * @see #getPhysicalEvidence()
	 * @generated
	 */
	EReference getPhysicalEvidence_InServiceBlueprintModel();

	/**
	 * Returns the meta object for class '{@link serviceblueprint.CustomerAction <em>Customer Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Action</em>'.
	 * @see serviceblueprint.CustomerAction
	 * @generated
	 */
	EClass getCustomerAction();

	/**
	 * Returns the meta object for the attribute '{@link serviceblueprint.CustomerAction#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see serviceblueprint.CustomerAction#getContent()
	 * @see #getCustomerAction()
	 * @generated
	 */
	EAttribute getCustomerAction_Content();

	/**
	 * Returns the meta object for the container reference '{@link serviceblueprint.CustomerAction#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Service Blueprint Model</em>'.
	 * @see serviceblueprint.CustomerAction#getInServiceBlueprintModel()
	 * @see #getCustomerAction()
	 * @generated
	 */
	EReference getCustomerAction_InServiceBlueprintModel();

	/**
	 * Returns the meta object for class '{@link serviceblueprint.OnStageEmployeeAction <em>On Stage Employee Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Stage Employee Action</em>'.
	 * @see serviceblueprint.OnStageEmployeeAction
	 * @generated
	 */
	EClass getOnStageEmployeeAction();

	/**
	 * Returns the meta object for the attribute '{@link serviceblueprint.OnStageEmployeeAction#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see serviceblueprint.OnStageEmployeeAction#getContent()
	 * @see #getOnStageEmployeeAction()
	 * @generated
	 */
	EAttribute getOnStageEmployeeAction_Content();

	/**
	 * Returns the meta object for the container reference '{@link serviceblueprint.OnStageEmployeeAction#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Service Blueprint Model</em>'.
	 * @see serviceblueprint.OnStageEmployeeAction#getInServiceBlueprintModel()
	 * @see #getOnStageEmployeeAction()
	 * @generated
	 */
	EReference getOnStageEmployeeAction_InServiceBlueprintModel();

	/**
	 * Returns the meta object for class '{@link serviceblueprint.BackStageEmployeeAction <em>Back Stage Employee Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Back Stage Employee Action</em>'.
	 * @see serviceblueprint.BackStageEmployeeAction
	 * @generated
	 */
	EClass getBackStageEmployeeAction();

	/**
	 * Returns the meta object for the attribute '{@link serviceblueprint.BackStageEmployeeAction#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see serviceblueprint.BackStageEmployeeAction#getContent()
	 * @see #getBackStageEmployeeAction()
	 * @generated
	 */
	EAttribute getBackStageEmployeeAction_Content();

	/**
	 * Returns the meta object for the container reference '{@link serviceblueprint.BackStageEmployeeAction#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Service Blueprint Model</em>'.
	 * @see serviceblueprint.BackStageEmployeeAction#getInServiceBlueprintModel()
	 * @see #getBackStageEmployeeAction()
	 * @generated
	 */
	EReference getBackStageEmployeeAction_InServiceBlueprintModel();

	/**
	 * Returns the meta object for class '{@link serviceblueprint.SupportProcess <em>Support Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Process</em>'.
	 * @see serviceblueprint.SupportProcess
	 * @generated
	 */
	EClass getSupportProcess();

	/**
	 * Returns the meta object for the attribute '{@link serviceblueprint.SupportProcess#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see serviceblueprint.SupportProcess#getContent()
	 * @see #getSupportProcess()
	 * @generated
	 */
	EAttribute getSupportProcess_Content();

	/**
	 * Returns the meta object for the container reference '{@link serviceblueprint.SupportProcess#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Service Blueprint Model</em>'.
	 * @see serviceblueprint.SupportProcess#getInServiceBlueprintModel()
	 * @see #getSupportProcess()
	 * @generated
	 */
	EReference getSupportProcess_InServiceBlueprintModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceblueprintFactory getServiceblueprintFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link serviceblueprint.impl.ServiceBlueprintModelImpl <em>Service Blueprint Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceblueprint.impl.ServiceBlueprintModelImpl
		 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getServiceBlueprintModel()
		 * @generated
		 */
		EClass SERVICE_BLUEPRINT_MODEL = eINSTANCE.getServiceBlueprintModel();

		/**
		 * The meta object literal for the '<em><b>Has Service Blueprint Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_DIAGRAM = eINSTANCE.getServiceBlueprintModel_HasServiceBlueprintDiagram();

		/**
		 * The meta object literal for the '<em><b>Has Service Blueprint Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_CONNECTION = eINSTANCE.getServiceBlueprintModel_HasServiceBlueprintConnection();

		/**
		 * The meta object literal for the '{@link serviceblueprint.impl.ServiceBlueprintConnectionImpl <em>Service Blueprint Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceblueprint.impl.ServiceBlueprintConnectionImpl
		 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getServiceBlueprintConnection()
		 * @generated
		 */
		EClass SERVICE_BLUEPRINT_CONNECTION = eINSTANCE.getServiceBlueprintConnection();

		/**
		 * The meta object literal for the '<em><b>Source Service Blueprint Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BLUEPRINT_CONNECTION__SOURCE_SERVICE_BLUEPRINT_NODE = eINSTANCE.getServiceBlueprintConnection_SourceServiceBlueprintNode();

		/**
		 * The meta object literal for the '<em><b>Target Service Blueprint Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BLUEPRINT_CONNECTION__TARGET_SERVICE_BLUEPRINT_NODE = eINSTANCE.getServiceBlueprintConnection_TargetServiceBlueprintNode();

		/**
		 * The meta object literal for the '{@link serviceblueprint.impl.ServiceBlueprintDiagramImpl <em>Service Blueprint Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceblueprint.impl.ServiceBlueprintDiagramImpl
		 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getServiceBlueprintDiagram()
		 * @generated
		 */
		EClass SERVICE_BLUEPRINT_DIAGRAM = eINSTANCE.getServiceBlueprintDiagram();

		/**
		 * The meta object literal for the '<em><b>In Service Blueprint Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL = eINSTANCE.getServiceBlueprintDiagram_InServiceBlueprintModel();

		/**
		 * The meta object literal for the '<em><b>Has Physical Evidences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BLUEPRINT_DIAGRAM__HAS_PHYSICAL_EVIDENCES = eINSTANCE.getServiceBlueprintDiagram_HasPhysicalEvidences();

		/**
		 * The meta object literal for the '<em><b>Has Customer Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BLUEPRINT_DIAGRAM__HAS_CUSTOMER_ACTIONS = eINSTANCE.getServiceBlueprintDiagram_HasCustomerActions();

		/**
		 * The meta object literal for the '<em><b>Has On Stage Employee Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BLUEPRINT_DIAGRAM__HAS_ON_STAGE_EMPLOYEE_ACTIONS = eINSTANCE.getServiceBlueprintDiagram_HasOnStageEmployeeActions();

		/**
		 * The meta object literal for the '<em><b>Has Back Stage Employee Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS = eINSTANCE.getServiceBlueprintDiagram_HasBackStageEmployeeActions();

		/**
		 * The meta object literal for the '<em><b>Has Support Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BLUEPRINT_DIAGRAM__HAS_SUPPORT_PROCESSES = eINSTANCE.getServiceBlueprintDiagram_HasSupportProcesses();

		/**
		 * The meta object literal for the '{@link serviceblueprint.impl.ServiceBlueprintNodeImpl <em>Service Blueprint Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceblueprint.impl.ServiceBlueprintNodeImpl
		 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getServiceBlueprintNode()
		 * @generated
		 */
		EClass SERVICE_BLUEPRINT_NODE = eINSTANCE.getServiceBlueprintNode();

		/**
		 * The meta object literal for the '{@link serviceblueprint.impl.PhysicalEvidenceImpl <em>Physical Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceblueprint.impl.PhysicalEvidenceImpl
		 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getPhysicalEvidence()
		 * @generated
		 */
		EClass PHYSICAL_EVIDENCE = eINSTANCE.getPhysicalEvidence();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_EVIDENCE__CONTENT = eINSTANCE.getPhysicalEvidence_Content();

		/**
		 * The meta object literal for the '<em><b>In Service Blueprint Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_EVIDENCE__IN_SERVICE_BLUEPRINT_MODEL = eINSTANCE.getPhysicalEvidence_InServiceBlueprintModel();

		/**
		 * The meta object literal for the '{@link serviceblueprint.impl.CustomerActionImpl <em>Customer Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceblueprint.impl.CustomerActionImpl
		 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getCustomerAction()
		 * @generated
		 */
		EClass CUSTOMER_ACTION = eINSTANCE.getCustomerAction();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ACTION__CONTENT = eINSTANCE.getCustomerAction_Content();

		/**
		 * The meta object literal for the '<em><b>In Service Blueprint Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_ACTION__IN_SERVICE_BLUEPRINT_MODEL = eINSTANCE.getCustomerAction_InServiceBlueprintModel();

		/**
		 * The meta object literal for the '{@link serviceblueprint.impl.OnStageEmployeeActionImpl <em>On Stage Employee Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceblueprint.impl.OnStageEmployeeActionImpl
		 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getOnStageEmployeeAction()
		 * @generated
		 */
		EClass ON_STAGE_EMPLOYEE_ACTION = eINSTANCE.getOnStageEmployeeAction();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_STAGE_EMPLOYEE_ACTION__CONTENT = eINSTANCE.getOnStageEmployeeAction_Content();

		/**
		 * The meta object literal for the '<em><b>In Service Blueprint Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL = eINSTANCE.getOnStageEmployeeAction_InServiceBlueprintModel();

		/**
		 * The meta object literal for the '{@link serviceblueprint.impl.BackStageEmployeeActionImpl <em>Back Stage Employee Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceblueprint.impl.BackStageEmployeeActionImpl
		 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getBackStageEmployeeAction()
		 * @generated
		 */
		EClass BACK_STAGE_EMPLOYEE_ACTION = eINSTANCE.getBackStageEmployeeAction();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACK_STAGE_EMPLOYEE_ACTION__CONTENT = eINSTANCE.getBackStageEmployeeAction_Content();

		/**
		 * The meta object literal for the '<em><b>In Service Blueprint Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL = eINSTANCE.getBackStageEmployeeAction_InServiceBlueprintModel();

		/**
		 * The meta object literal for the '{@link serviceblueprint.impl.SupportProcessImpl <em>Support Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceblueprint.impl.SupportProcessImpl
		 * @see serviceblueprint.impl.ServiceblueprintPackageImpl#getSupportProcess()
		 * @generated
		 */
		EClass SUPPORT_PROCESS = eINSTANCE.getSupportProcess();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT_PROCESS__CONTENT = eINSTANCE.getSupportProcess_Content();

		/**
		 * The meta object literal for the '<em><b>In Service Blueprint Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORT_PROCESS__IN_SERVICE_BLUEPRINT_MODEL = eINSTANCE.getSupportProcess_InServiceBlueprintModel();

	}

} //ServiceblueprintPackage
