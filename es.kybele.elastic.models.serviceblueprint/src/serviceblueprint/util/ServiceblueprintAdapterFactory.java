/**
 */
package serviceblueprint.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import serviceblueprint.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see serviceblueprint.ServiceblueprintPackage
 * @generated
 */
public class ServiceblueprintAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServiceblueprintPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceblueprintAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ServiceblueprintPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceblueprintSwitch<Adapter> modelSwitch =
		new ServiceblueprintSwitch<Adapter>() {
			@Override
			public Adapter caseServiceBlueprintModel(ServiceBlueprintModel object) {
				return createServiceBlueprintModelAdapter();
			}
			@Override
			public Adapter caseServiceBlueprintConnection(ServiceBlueprintConnection object) {
				return createServiceBlueprintConnectionAdapter();
			}
			@Override
			public Adapter caseServiceBlueprintDiagram(ServiceBlueprintDiagram object) {
				return createServiceBlueprintDiagramAdapter();
			}
			@Override
			public Adapter caseServiceBlueprintNode(ServiceBlueprintNode object) {
				return createServiceBlueprintNodeAdapter();
			}
			@Override
			public Adapter casePhysicalEvidence(PhysicalEvidence object) {
				return createPhysicalEvidenceAdapter();
			}
			@Override
			public Adapter caseCustomerAction(CustomerAction object) {
				return createCustomerActionAdapter();
			}
			@Override
			public Adapter caseOnStageEmployeeAction(OnStageEmployeeAction object) {
				return createOnStageEmployeeActionAdapter();
			}
			@Override
			public Adapter caseBackStageEmployeeAction(BackStageEmployeeAction object) {
				return createBackStageEmployeeActionAdapter();
			}
			@Override
			public Adapter caseSupportProcess(SupportProcess object) {
				return createSupportProcessAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link serviceblueprint.ServiceBlueprintModel <em>Service Blueprint Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see serviceblueprint.ServiceBlueprintModel
	 * @generated
	 */
	public Adapter createServiceBlueprintModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link serviceblueprint.ServiceBlueprintConnection <em>Service Blueprint Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see serviceblueprint.ServiceBlueprintConnection
	 * @generated
	 */
	public Adapter createServiceBlueprintConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link serviceblueprint.ServiceBlueprintDiagram <em>Service Blueprint Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see serviceblueprint.ServiceBlueprintDiagram
	 * @generated
	 */
	public Adapter createServiceBlueprintDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link serviceblueprint.ServiceBlueprintNode <em>Service Blueprint Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see serviceblueprint.ServiceBlueprintNode
	 * @generated
	 */
	public Adapter createServiceBlueprintNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link serviceblueprint.PhysicalEvidence <em>Physical Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see serviceblueprint.PhysicalEvidence
	 * @generated
	 */
	public Adapter createPhysicalEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link serviceblueprint.CustomerAction <em>Customer Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see serviceblueprint.CustomerAction
	 * @generated
	 */
	public Adapter createCustomerActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link serviceblueprint.OnStageEmployeeAction <em>On Stage Employee Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see serviceblueprint.OnStageEmployeeAction
	 * @generated
	 */
	public Adapter createOnStageEmployeeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link serviceblueprint.BackStageEmployeeAction <em>Back Stage Employee Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see serviceblueprint.BackStageEmployeeAction
	 * @generated
	 */
	public Adapter createBackStageEmployeeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link serviceblueprint.SupportProcess <em>Support Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see serviceblueprint.SupportProcess
	 * @generated
	 */
	public Adapter createSupportProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ServiceblueprintAdapterFactory
