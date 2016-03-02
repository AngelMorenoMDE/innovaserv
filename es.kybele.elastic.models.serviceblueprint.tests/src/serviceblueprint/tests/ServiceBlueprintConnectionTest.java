/**
 */
package serviceblueprint.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import serviceblueprint.ServiceBlueprintConnection;
import serviceblueprint.ServiceblueprintFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Blueprint Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceBlueprintConnectionTest extends TestCase {

	/**
	 * The fixture for this Service Blueprint Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBlueprintConnection fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceBlueprintConnectionTest.class);
	}

	/**
	 * Constructs a new Service Blueprint Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintConnectionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Service Blueprint Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ServiceBlueprintConnection fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Service Blueprint Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBlueprintConnection getFixture() {
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
		setFixture(ServiceblueprintFactory.eINSTANCE.createServiceBlueprintConnection());
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

} //ServiceBlueprintConnectionTest
