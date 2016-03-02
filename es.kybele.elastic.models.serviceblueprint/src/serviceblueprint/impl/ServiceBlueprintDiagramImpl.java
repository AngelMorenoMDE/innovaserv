/**
 */
package serviceblueprint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import serviceblueprint.BackStageEmployeeAction;
import serviceblueprint.CustomerAction;
import serviceblueprint.OnStageEmployeeAction;
import serviceblueprint.PhysicalEvidence;
import serviceblueprint.ServiceBlueprintDiagram;
import serviceblueprint.ServiceBlueprintModel;
import serviceblueprint.ServiceblueprintPackage;
import serviceblueprint.SupportProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Blueprint Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceblueprint.impl.ServiceBlueprintDiagramImpl#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}</li>
 *   <li>{@link serviceblueprint.impl.ServiceBlueprintDiagramImpl#getHasPhysicalEvidences <em>Has Physical Evidences</em>}</li>
 *   <li>{@link serviceblueprint.impl.ServiceBlueprintDiagramImpl#getHasCustomerActions <em>Has Customer Actions</em>}</li>
 *   <li>{@link serviceblueprint.impl.ServiceBlueprintDiagramImpl#getHasOnStageEmployeeActions <em>Has On Stage Employee Actions</em>}</li>
 *   <li>{@link serviceblueprint.impl.ServiceBlueprintDiagramImpl#getHasBackStageEmployeeActions <em>Has Back Stage Employee Actions</em>}</li>
 *   <li>{@link serviceblueprint.impl.ServiceBlueprintDiagramImpl#getHasSupportProcesses <em>Has Support Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceBlueprintDiagramImpl extends MinimalEObjectImpl.Container implements ServiceBlueprintDiagram {
	/**
	 * The cached value of the '{@link #getHasPhysicalEvidences() <em>Has Physical Evidences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPhysicalEvidences()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalEvidence> hasPhysicalEvidences;

	/**
	 * The cached value of the '{@link #getHasCustomerActions() <em>Has Customer Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCustomerActions()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerAction> hasCustomerActions;

	/**
	 * The cached value of the '{@link #getHasOnStageEmployeeActions() <em>Has On Stage Employee Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOnStageEmployeeActions()
	 * @generated
	 * @ordered
	 */
	protected EList<OnStageEmployeeAction> hasOnStageEmployeeActions;

	/**
	 * The cached value of the '{@link #getHasBackStageEmployeeActions() <em>Has Back Stage Employee Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBackStageEmployeeActions()
	 * @generated
	 * @ordered
	 */
	protected EList<BackStageEmployeeAction> hasBackStageEmployeeActions;

	/**
	 * The cached value of the '{@link #getHasSupportProcesses() <em>Has Support Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSupportProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportProcess> hasSupportProcesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBlueprintDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceblueprintPackage.Literals.SERVICE_BLUEPRINT_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintModel getInServiceBlueprintModel() {
		if (eContainerFeatureID() != ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL) return null;
		return (ServiceBlueprintModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInServiceBlueprintModel(ServiceBlueprintModel newInServiceBlueprintModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInServiceBlueprintModel, ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInServiceBlueprintModel(ServiceBlueprintModel newInServiceBlueprintModel) {
		if (newInServiceBlueprintModel != eInternalContainer() || (eContainerFeatureID() != ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL && newInServiceBlueprintModel != null)) {
			if (EcoreUtil.isAncestor(this, newInServiceBlueprintModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInServiceBlueprintModel != null)
				msgs = ((InternalEObject)newInServiceBlueprintModel).eInverseAdd(this, ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_DIAGRAM, ServiceBlueprintModel.class, msgs);
			msgs = basicSetInServiceBlueprintModel(newInServiceBlueprintModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL, newInServiceBlueprintModel, newInServiceBlueprintModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalEvidence> getHasPhysicalEvidences() {
		if (hasPhysicalEvidences == null) {
			hasPhysicalEvidences = new EObjectContainmentWithInverseEList<PhysicalEvidence>(PhysicalEvidence.class, this, ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_PHYSICAL_EVIDENCES, ServiceblueprintPackage.PHYSICAL_EVIDENCE__IN_SERVICE_BLUEPRINT_MODEL);
		}
		return hasPhysicalEvidences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerAction> getHasCustomerActions() {
		if (hasCustomerActions == null) {
			hasCustomerActions = new EObjectContainmentWithInverseEList<CustomerAction>(CustomerAction.class, this, ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_CUSTOMER_ACTIONS, ServiceblueprintPackage.CUSTOMER_ACTION__IN_SERVICE_BLUEPRINT_MODEL);
		}
		return hasCustomerActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnStageEmployeeAction> getHasOnStageEmployeeActions() {
		if (hasOnStageEmployeeActions == null) {
			hasOnStageEmployeeActions = new EObjectContainmentWithInverseEList<OnStageEmployeeAction>(OnStageEmployeeAction.class, this, ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_ON_STAGE_EMPLOYEE_ACTIONS, ServiceblueprintPackage.ON_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL);
		}
		return hasOnStageEmployeeActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BackStageEmployeeAction> getHasBackStageEmployeeActions() {
		if (hasBackStageEmployeeActions == null) {
			hasBackStageEmployeeActions = new EObjectContainmentWithInverseEList<BackStageEmployeeAction>(BackStageEmployeeAction.class, this, ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS, ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL);
		}
		return hasBackStageEmployeeActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportProcess> getHasSupportProcesses() {
		if (hasSupportProcesses == null) {
			hasSupportProcesses = new EObjectContainmentWithInverseEList<SupportProcess>(SupportProcess.class, this, ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_SUPPORT_PROCESSES, ServiceblueprintPackage.SUPPORT_PROCESS__IN_SERVICE_BLUEPRINT_MODEL);
		}
		return hasSupportProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInServiceBlueprintModel((ServiceBlueprintModel)otherEnd, msgs);
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_PHYSICAL_EVIDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasPhysicalEvidences()).basicAdd(otherEnd, msgs);
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_CUSTOMER_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasCustomerActions()).basicAdd(otherEnd, msgs);
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_ON_STAGE_EMPLOYEE_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasOnStageEmployeeActions()).basicAdd(otherEnd, msgs);
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasBackStageEmployeeActions()).basicAdd(otherEnd, msgs);
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_SUPPORT_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasSupportProcesses()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL:
				return basicSetInServiceBlueprintModel(null, msgs);
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_PHYSICAL_EVIDENCES:
				return ((InternalEList<?>)getHasPhysicalEvidences()).basicRemove(otherEnd, msgs);
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_CUSTOMER_ACTIONS:
				return ((InternalEList<?>)getHasCustomerActions()).basicRemove(otherEnd, msgs);
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_ON_STAGE_EMPLOYEE_ACTIONS:
				return ((InternalEList<?>)getHasOnStageEmployeeActions()).basicRemove(otherEnd, msgs);
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS:
				return ((InternalEList<?>)getHasBackStageEmployeeActions()).basicRemove(otherEnd, msgs);
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_SUPPORT_PROCESSES:
				return ((InternalEList<?>)getHasSupportProcesses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL:
				return eInternalContainer().eInverseRemove(this, ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_DIAGRAM, ServiceBlueprintModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL:
				return getInServiceBlueprintModel();
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_PHYSICAL_EVIDENCES:
				return getHasPhysicalEvidences();
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_CUSTOMER_ACTIONS:
				return getHasCustomerActions();
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_ON_STAGE_EMPLOYEE_ACTIONS:
				return getHasOnStageEmployeeActions();
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS:
				return getHasBackStageEmployeeActions();
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_SUPPORT_PROCESSES:
				return getHasSupportProcesses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL:
				setInServiceBlueprintModel((ServiceBlueprintModel)newValue);
				return;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_PHYSICAL_EVIDENCES:
				getHasPhysicalEvidences().clear();
				getHasPhysicalEvidences().addAll((Collection<? extends PhysicalEvidence>)newValue);
				return;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_CUSTOMER_ACTIONS:
				getHasCustomerActions().clear();
				getHasCustomerActions().addAll((Collection<? extends CustomerAction>)newValue);
				return;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_ON_STAGE_EMPLOYEE_ACTIONS:
				getHasOnStageEmployeeActions().clear();
				getHasOnStageEmployeeActions().addAll((Collection<? extends OnStageEmployeeAction>)newValue);
				return;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS:
				getHasBackStageEmployeeActions().clear();
				getHasBackStageEmployeeActions().addAll((Collection<? extends BackStageEmployeeAction>)newValue);
				return;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_SUPPORT_PROCESSES:
				getHasSupportProcesses().clear();
				getHasSupportProcesses().addAll((Collection<? extends SupportProcess>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL:
				setInServiceBlueprintModel((ServiceBlueprintModel)null);
				return;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_PHYSICAL_EVIDENCES:
				getHasPhysicalEvidences().clear();
				return;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_CUSTOMER_ACTIONS:
				getHasCustomerActions().clear();
				return;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_ON_STAGE_EMPLOYEE_ACTIONS:
				getHasOnStageEmployeeActions().clear();
				return;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS:
				getHasBackStageEmployeeActions().clear();
				return;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_SUPPORT_PROCESSES:
				getHasSupportProcesses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL:
				return getInServiceBlueprintModel() != null;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_PHYSICAL_EVIDENCES:
				return hasPhysicalEvidences != null && !hasPhysicalEvidences.isEmpty();
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_CUSTOMER_ACTIONS:
				return hasCustomerActions != null && !hasCustomerActions.isEmpty();
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_ON_STAGE_EMPLOYEE_ACTIONS:
				return hasOnStageEmployeeActions != null && !hasOnStageEmployeeActions.isEmpty();
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS:
				return hasBackStageEmployeeActions != null && !hasBackStageEmployeeActions.isEmpty();
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_SUPPORT_PROCESSES:
				return hasSupportProcesses != null && !hasSupportProcesses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceBlueprintDiagramImpl
