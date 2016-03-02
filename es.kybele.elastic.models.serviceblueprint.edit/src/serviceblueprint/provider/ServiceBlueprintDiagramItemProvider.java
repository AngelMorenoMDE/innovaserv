/**
 */
package serviceblueprint.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import serviceblueprint.ServiceBlueprintDiagram;
import serviceblueprint.ServiceblueprintFactory;
import serviceblueprint.ServiceblueprintPackage;

/**
 * This is the item provider adapter for a {@link serviceblueprint.ServiceBlueprintDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceBlueprintDiagramItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprintDiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ServiceblueprintPackage.Literals.SERVICE_BLUEPRINT_DIAGRAM__HAS_PHYSICAL_EVIDENCES);
			childrenFeatures.add(ServiceblueprintPackage.Literals.SERVICE_BLUEPRINT_DIAGRAM__HAS_CUSTOMER_ACTIONS);
			childrenFeatures.add(ServiceblueprintPackage.Literals.SERVICE_BLUEPRINT_DIAGRAM__HAS_ON_STAGE_EMPLOYEE_ACTIONS);
			childrenFeatures.add(ServiceblueprintPackage.Literals.SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS);
			childrenFeatures.add(ServiceblueprintPackage.Literals.SERVICE_BLUEPRINT_DIAGRAM__HAS_SUPPORT_PROCESSES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ServiceBlueprintDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceBlueprintDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ServiceBlueprintDiagram_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ServiceBlueprintDiagram.class)) {
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_PHYSICAL_EVIDENCES:
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_CUSTOMER_ACTIONS:
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_ON_STAGE_EMPLOYEE_ACTIONS:
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS:
			case ServiceblueprintPackage.SERVICE_BLUEPRINT_DIAGRAM__HAS_SUPPORT_PROCESSES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ServiceblueprintPackage.Literals.SERVICE_BLUEPRINT_DIAGRAM__HAS_PHYSICAL_EVIDENCES,
				 ServiceblueprintFactory.eINSTANCE.createPhysicalEvidence()));

		newChildDescriptors.add
			(createChildParameter
				(ServiceblueprintPackage.Literals.SERVICE_BLUEPRINT_DIAGRAM__HAS_CUSTOMER_ACTIONS,
				 ServiceblueprintFactory.eINSTANCE.createCustomerAction()));

		newChildDescriptors.add
			(createChildParameter
				(ServiceblueprintPackage.Literals.SERVICE_BLUEPRINT_DIAGRAM__HAS_ON_STAGE_EMPLOYEE_ACTIONS,
				 ServiceblueprintFactory.eINSTANCE.createOnStageEmployeeAction()));

		newChildDescriptors.add
			(createChildParameter
				(ServiceblueprintPackage.Literals.SERVICE_BLUEPRINT_DIAGRAM__HAS_BACK_STAGE_EMPLOYEE_ACTIONS,
				 ServiceblueprintFactory.eINSTANCE.createBackStageEmployeeAction()));

		newChildDescriptors.add
			(createChildParameter
				(ServiceblueprintPackage.Literals.SERVICE_BLUEPRINT_DIAGRAM__HAS_SUPPORT_PROCESSES,
				 ServiceblueprintFactory.eINSTANCE.createSupportProcess()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ServiceblueprintEditPlugin.INSTANCE;
	}

}
