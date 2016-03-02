/**
 */
package serviceblueprint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import serviceblueprint.BackStageEmployeeAction;
import serviceblueprint.ServiceBlueprintDiagram;
import serviceblueprint.ServiceblueprintPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Back Stage Employee Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceblueprint.impl.BackStageEmployeeActionImpl#getContent <em>Content</em>}</li>
 *   <li>{@link serviceblueprint.impl.BackStageEmployeeActionImpl#getInServiceBlueprintModel <em>In Service Blueprint Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BackStageEmployeeActionImpl extends ServiceBlueprintNodeImpl implements BackStageEmployeeAction {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackStageEmployeeActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceblueprintPackage.Literals.BACK_STAGE_EMPLOYEE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintDiagram getInServiceBlueprintModel() {
		if (eContainerFeatureID() != ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL) return null;
		return (ServiceBlueprintDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInServiceBlueprintModel(ServiceBlueprintDiagram newInServiceBlueprintModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInServiceBlueprintModel, ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInServiceBlueprintModel(ServiceBlueprintDiagram newInServiceBlueprintModel) {
		if (newInServiceBlueprintModel != eInternalContainer() || (eContainerFeatureID() != ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL && newInServiceBlueprintModel != null)) {
			if (EcoreUtil.isAncestor(this, newInServiceBlueprintModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInServiceBlueprintModel != null)
				msgs = ((InternalEObject)newInServiceBlueprintModel).eInverseAdd(this, ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS, ServiceBlueprintDiagram.class, msgs);
			msgs = basicSetInServiceBlueprintModel(newInServiceBlueprintModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL, newInServiceBlueprintModel, newInServiceBlueprintModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInServiceBlueprintModel((ServiceBlueprintDiagram)otherEnd, msgs);
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
			case ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL:
				return basicSetInServiceBlueprintModel(null, msgs);
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
			case ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL:
				return eInternalContainer().eInverseRemove(this, ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS, ServiceBlueprintDiagram.class, msgs);
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
			case ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__CONTENT:
				return getContent();
			case ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL:
				return getInServiceBlueprintModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__CONTENT:
				setContent((String)newValue);
				return;
			case ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL:
				setInServiceBlueprintModel((ServiceBlueprintDiagram)newValue);
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
			case ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL:
				setInServiceBlueprintModel((ServiceBlueprintDiagram)null);
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
			case ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case ServiceblueprintPackage.BACK_STAGE_EMPLOYEE_ACTION__IN_SERVICE_BLUEPRINT_MODEL:
				return getInServiceBlueprintModel() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //BackStageEmployeeActionImpl
