/**
 */
package serviceblueprint.tests;

import junit.textui.TestRunner;

import serviceblueprint.OnStageEmployeeAction;
import serviceblueprint.ServiceblueprintFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>On Stage Employee Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OnStageEmployeeActionTest extends ServiceBlueprintNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OnStageEmployeeActionTest.class);
	}

	/**
	 * Constructs a new On Stage Employee Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnStageEmployeeActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this On Stage Employee Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OnStageEmployeeAction getFixture() {
		return (OnStageEmployeeAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServiceblueprintFactory.eINSTANCE.createOnStageEmployeeAction());
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

} //OnStageEmployeeActionTest
