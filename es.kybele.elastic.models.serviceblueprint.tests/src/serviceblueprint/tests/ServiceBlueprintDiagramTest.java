/**
 */
package serviceblueprint.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import serviceblueprint.ServiceBlueprintDiagram;
import serviceblueprint.ServiceblueprintFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Blueprint Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceBlueprintDiagramTest extends TestCase {

	/**
	 * The fixture for this Service Blueprint Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBlueprintDiagram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceBlueprintDiagramTest.class);
	}

	/**
	 * Constructs a new Service Blueprint Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintDiagramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Service Blueprint Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ServiceBlueprintDiagram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Service Blueprint Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBlueprintDiagram getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServiceblueprintFactory.eINSTANCE.createServiceBlueprintDiagram());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ServiceBlueprintDiagramTest
