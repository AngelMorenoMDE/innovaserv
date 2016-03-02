/**
 */
package serviceblueprint.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import serviceblueprint.ServiceBlueprintNode;
import serviceblueprint.ServiceblueprintFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Blueprint Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceBlueprintNodeTest extends TestCase {

	/**
	 * The fixture for this Service Blueprint Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBlueprintNode fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceBlueprintNodeTest.class);
	}

	/**
	 * Constructs a new Service Blueprint Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintNodeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Service Blueprint Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ServiceBlueprintNode fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Service Blueprint Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBlueprintNode getFixture() {
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
		setFixture(ServiceblueprintFactory.eINSTANCE.createServiceBlueprintNode());
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

} //ServiceBlueprintNodeTest
