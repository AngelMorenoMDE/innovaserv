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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import serviceblueprint.ServiceBlueprintConnection;
import serviceblueprint.ServiceBlueprintDiagram;
import serviceblueprint.ServiceBlueprintModel;
import serviceblueprint.ServiceblueprintPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Blueprint Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceblueprint.impl.ServiceBlueprintModelImpl#getHasServiceBlueprintDiagram <em>Has Service Blueprint Diagram</em>}</li>
 *   <li>{@link serviceblueprint.impl.ServiceBlueprintModelImpl#getHasServiceBlueprintConnection <em>Has Service Blueprint Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceBlueprintModelImpl extends MinimalEObjectImpl.Container implements ServiceBlueprintModel {
	/**
	 * The cached value of the '{@link #getHasServiceBlueprintDiagram() <em>Has Service Blueprint Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasServiceBlueprintDiagram()
	 * @generated
	 * @ordered
	 */
	protected ServiceBlueprintDiagram hasServiceBlueprintDiagram;

	/**
	 * The cached value of the '{@link #getHasServiceBlueprintConnection() <em>Has Service Blueprint Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasServiceBlueprintConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceBlueprintConnection> hasServiceBlueprintConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBlueprintModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceblueprintPackage.Literals.SERVICE_BLUEPRINT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintDiagram getHasServiceBlueprintDiagram() {
		return hasServiceBlueprintDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasServiceBlueprintDiagram(ServiceBlueprintDiagram newHasServiceBlueprintDiagram, NotificationChain msgs) {
		ServiceBlueprintDiagram oldHasServiceBlueprintDiagram = hasServiceBlueprintDiagram;
		hasServiceBlueprintDiagram = newHasServiceBlueprintDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_DIAGRAM, oldHasServiceBlueprintDiagram, newHasServiceBlueprintDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasServiceBlueprintDiagram(ServiceBlueprintDiagram newHasServiceBlueprintDiagram) {
		if (newHasServiceBlueprintDiagram != hasServiceBlueprintDiagram) {
			NotificationChain msgs = null;
			if (hasServiceBlueprintDiagram != null)
				msgs = ((InternalEObject)hasServiceBlueprintDiagram).eInverseRemove(this, ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL, ServiceBlueprintDiagram.class, msgs);
			if (newHasServiceBlueprintDiagram != null)
				msgs = ((InternalEObject)newHasServiceBlueprintDiagram).eInverseAdd(this, ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__IN_SERVICE_BLUEPRINT_MODEL, ServiceBlueprintDiagram.class, msgs);
			msgs = basicSetHasServiceBlueprintDiagram(newHasServiceBlueprintDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_DIAGRAM, newHasServiceBlueprintDiagram, newHasServiceBlueprintDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceBlueprintConnection> getHasServiceBlueprintConnection() {
		if (hasServiceBlueprintConnection == null) {
			hasServiceBlueprintConnection = new EObjectContainmentEList<ServiceBlueprintConnection>(ServiceBlueprintConnection.class, this, ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_CONNECTION);
		}
		return hasServiceBlueprintConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_DIAGRAM:
				if (hasServiceBlueprintDiagram != null)
					msgs = ((InternalEObject)hasServiceBlueprintDiagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_DIAGRAM, null, msgs);
				return basicSetHasServiceBlueprintDiagram((ServiceBlueprintDiagram)otherEnd, msgs);
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
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_DIAGRAM:
				return basicSetHasServiceBlueprintDiagram(null, msgs);
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_CONNECTION:
				return ((InternalEList<?>)getHasServiceBlueprintConnection()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_DIAGRAM:
				return getHasServiceBlueprintDiagram();
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_CONNECTION:
				return getHasServiceBlueprintConnection();
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
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_DIAGRAM:
				setHasServiceBlueprintDiagram((ServiceBlueprintDiagram)newValue);
				return;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_CONNECTION:
				getHasServiceBlueprintConnection().clear();
				getHasServiceBlueprintConnection().addAll((Collection<? extends ServiceBlueprintConnection>)newValue);
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
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_DIAGRAM:
				setHasServiceBlueprintDiagram((ServiceBlueprintDiagram)null);
				return;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_CONNECTION:
				getHasServiceBlueprintConnection().clear();
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
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_DIAGRAM:
				return hasServiceBlueprintDiagram != null;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_MODEL__HAS_SERVICE_BLUEPRINT_CONNECTION:
				return hasServiceBlueprintConnection != null && !hasServiceBlueprintConnection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceBlueprintModelImpl
