/**
 */
package serviceblueprint.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import serviceblueprint.ServiceBlueprintConnection;
import serviceblueprint.ServiceBlueprintNode;
import serviceblueprint.ServiceblueprintPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Blueprint Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link serviceblueprint.impl.ServiceBlueprintConnectionImpl#getSourceServiceBlueprintNode <em>Source Service Blueprint Node</em>}</li>
 *   <li>{@link serviceblueprint.impl.ServiceBlueprintConnectionImpl#getTargetServiceBlueprintNode <em>Target Service Blueprint Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceBlueprintConnectionImpl extends MinimalEObjectImpl.Container implements ServiceBlueprintConnection {
	/**
	 * The cached value of the '{@link #getSourceServiceBlueprintNode() <em>Source Service Blueprint Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceServiceBlueprintNode()
	 * @generated
	 * @ordered
	 */
	protected ServiceBlueprintNode sourceServiceBlueprintNode;

	/**
	 * The cached value of the '{@link #getTargetServiceBlueprintNode() <em>Target Service Blueprint Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetServiceBlueprintNode()
	 * @generated
	 * @ordered
	 */
	protected ServiceBlueprintNode targetServiceBlueprintNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBlueprintConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceblueprintPackage.Literals.SERVICE_BLUEPRINT_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintNode getSourceServiceBlueprintNode() {
		if (sourceServiceBlueprintNode != null && sourceServiceBlueprintNode.eIsProxy()) {
			InternalEObject oldSourceServiceBlueprintNode = (InternalEObject)sourceServiceBlueprintNode;
			sourceServiceBlueprintNode = (ServiceBlueprintNode)eResolveProxy(oldSourceServiceBlueprintNode);
			if (sourceServiceBlueprintNode != oldSourceServiceBlueprintNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceblueprintPackage.SERVICE_BLUEPRINT_CONNECTION__SOURCE_SERVICE_BLUEPRINT_NODE, oldSourceServiceBlueprintNode, sourceServiceBlueprintNode));
			}
		}
		return sourceServiceBlueprintNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintNode basicGetSourceServiceBlueprintNode() {
		return sourceServiceBlueprintNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceServiceBlueprintNode(ServiceBlueprintNode newSourceServiceBlueprintNode) {
		ServiceBlueprintNode oldSourceServiceBlueprintNode = sourceServiceBlueprintNode;
		sourceServiceBlueprintNode = newSourceServiceBlueprintNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceblueprintPackage.SERVICE_BLUEPRINT_CONNECTION__SOURCE_SERVICE_BLUEPRINT_NODE, oldSourceServiceBlueprintNode, sourceServiceBlueprintNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintNode getTargetServiceBlueprintNode() {
		if (targetServiceBlueprintNode != null && targetServiceBlueprintNode.eIsProxy()) {
			InternalEObject oldTargetServiceBlueprintNode = (InternalEObject)targetServiceBlueprintNode;
			targetServiceBlueprintNode = (ServiceBlueprintNode)eResolveProxy(oldTargetServiceBlueprintNode);
			if (targetServiceBlueprintNode != oldTargetServiceBlueprintNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceblueprintPackage.SERVICE_BLUEPRINT_CONNECTION__TARGET_SERVICE_BLUEPRINT_NODE, oldTargetServiceBlueprintNode, targetServiceBlueprintNode));
			}
		}
		return targetServiceBlueprintNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintNode basicGetTargetServiceBlueprintNode() {
		return targetServiceBlueprintNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetServiceBlueprintNode(ServiceBlueprintNode newTargetServiceBlueprintNode) {
		ServiceBlueprintNode oldTargetServiceBlueprintNode = targetServiceBlueprintNode;
		targetServiceBlueprintNode = newTargetServiceBlueprintNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceblueprintPackage.SERVICE_BLUEPRINT_CONNECTION__TARGET_SERVICE_BLUEPRINT_NODE, oldTargetServiceBlueprintNode, targetServiceBlueprintNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_CONNECTION__SOURCE_SERVICE_BLUEPRINT_NODE:
				if (resolve) return getSourceServiceBlueprintNode();
				return basicGetSourceServiceBlueprintNode();
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_CONNECTION__TARGET_SERVICE_BLUEPRINT_NODE:
				if (resolve) return getTargetServiceBlueprintNode();
				return basicGetTargetServiceBlueprintNode();
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
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_CONNECTION__SOURCE_SERVICE_BLUEPRINT_NODE:
				setSourceServiceBlueprintNode((ServiceBlueprintNode)newValue);
				return;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_CONNECTION__TARGET_SERVICE_BLUEPRINT_NODE:
				setTargetServiceBlueprintNode((ServiceBlueprintNode)newValue);
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
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_CONNECTION__SOURCE_SERVICE_BLUEPRINT_NODE:
				setSourceServiceBlueprintNode((ServiceBlueprintNode)null);
				return;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_CONNECTION__TARGET_SERVICE_BLUEPRINT_NODE:
				setTargetServiceBlueprintNode((ServiceBlueprintNode)null);
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
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_CONNECTION__SOURCE_SERVICE_BLUEPRINT_NODE:
				return sourceServiceBlueprintNode != null;
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_CONNECTION__TARGET_SERVICE_BLUEPRINT_NODE:
				return targetServiceBlueprintNode != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceBlueprintConnectionImpl
