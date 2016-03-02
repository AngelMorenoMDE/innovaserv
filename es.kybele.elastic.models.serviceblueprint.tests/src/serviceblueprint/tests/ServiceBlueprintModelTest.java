/**
 */
package serviceblueprint.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import serviceblueprint.ServiceBlueprintModel;
import serviceblueprint.ServiceblueprintFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Blueprint Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceBlueprintModelTest extends TestCase {

	/**
	 * The fixture for this Service Blueprint Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBlueprintModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceBlueprintModelTest.class);
	}

	/**
	 * Constructs a new Service Blueprint Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Service Blueprint Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ServiceBlueprintModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Service Blueprint Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBlueprintModel getFixture() {
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
		setFixture(ServiceblueprintFactory.eINSTANCE.createServiceBlueprintModel());
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

} //ServiceBlueprintModelTest
