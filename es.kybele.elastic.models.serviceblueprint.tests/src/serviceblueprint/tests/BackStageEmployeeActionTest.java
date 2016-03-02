/**
 */
package serviceblueprint.tests;

import junit.textui.TestRunner;

import serviceblueprint.BackStageEmployeeAction;
import serviceblueprint.ServiceblueprintFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Back Stage Employee Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BackStageEmployeeActionTest extends ServiceBlueprintNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BackStageEmployeeActionTest.class);
	}

	/**
	 * Constructs a new Back Stage Employee Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackStageEmployeeActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Back Stage Employee Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BackStageEmployeeAction getFixture() {
		return (BackStageEmployeeAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServiceblueprintFactory.eINSTANCE.createBackStageEmployeeAction());
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

} //BackStageEmployeeActionTest
