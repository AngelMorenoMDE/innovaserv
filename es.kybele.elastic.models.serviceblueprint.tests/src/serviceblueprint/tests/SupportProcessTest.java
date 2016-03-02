/**
 */
package serviceblueprint.tests;

import junit.textui.TestRunner;

import serviceblueprint.ServiceblueprintFactory;
import serviceblueprint.SupportProcess;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Support Process</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SupportProcessTest extends ServiceBlueprintNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SupportProcessTest.class);
	}

	/**
	 * Constructs a new Support Process test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportProcessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Support Process test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SupportProcess getFixture() {
		return (SupportProcess)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServiceblueprintFactory.eINSTANCE.createSupportProcess());
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

} //SupportProcessTest
