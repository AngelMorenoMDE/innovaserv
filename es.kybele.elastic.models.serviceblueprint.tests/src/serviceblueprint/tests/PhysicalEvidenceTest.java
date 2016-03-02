/**
 */
package serviceblueprint.tests;

import junit.textui.TestRunner;

import serviceblueprint.PhysicalEvidence;
import serviceblueprint.ServiceblueprintFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Physical Evidence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalEvidenceTest extends ServiceBlueprintNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PhysicalEvidenceTest.class);
	}

	/**
	 * Constructs a new Physical Evidence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEvidenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Physical Evidence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PhysicalEvidence getFixture() {
		return (PhysicalEvidence)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServiceblueprintFactory.eINSTANCE.createPhysicalEvidence());
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

} //PhysicalEvidenceTest
