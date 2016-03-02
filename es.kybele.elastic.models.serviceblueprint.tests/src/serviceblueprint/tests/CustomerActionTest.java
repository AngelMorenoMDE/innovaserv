/**
 */
package serviceblueprint.tests;

import junit.textui.TestRunner;

import serviceblueprint.CustomerAction;
import serviceblueprint.ServiceblueprintFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Customer Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerActionTest extends ServiceBlueprintNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CustomerActionTest.class);
	}

	/**
	 * Constructs a new Customer Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Customer Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CustomerAction getFixture() {
		return (CustomerAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServiceblueprintFactory.eINSTANCE.createCustomerAction());
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

} //CustomerActionTest
