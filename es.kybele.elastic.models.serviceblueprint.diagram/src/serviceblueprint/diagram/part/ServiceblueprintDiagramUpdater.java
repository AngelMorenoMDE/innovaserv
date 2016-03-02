package serviceblueprint.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import serviceblueprint.BackStageEmployeeAction;
import serviceblueprint.CustomerAction;
import serviceblueprint.OnStageEmployeeAction;
import serviceblueprint.PhysicalEvidence;
import serviceblueprint.ServiceBlueprintConnection;
import serviceblueprint.ServiceBlueprintDiagram;
import serviceblueprint.ServiceBlueprintModel;
import serviceblueprint.ServiceBlueprintNode;
import serviceblueprint.ServiceblueprintPackage;
import serviceblueprint.SupportProcess;
import serviceblueprint.diagram.edit.parts.BackStageEmployeeActionEditPart;
import serviceblueprint.diagram.edit.parts.CustomerActionEditPart;
import serviceblueprint.diagram.edit.parts.OnStageEmployeeActionEditPart;
import serviceblueprint.diagram.edit.parts.PhysicalEvidenceEditPart;
import serviceblueprint.diagram.edit.parts.ServiceBlueprintConnectionEditPart;
import serviceblueprint.diagram.edit.parts.ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramEditPart;
import serviceblueprint.diagram.edit.parts.ServiceBlueprintDiagramCustomerActionCompartmentDiagramEditPart;
import serviceblueprint.diagram.edit.parts.ServiceBlueprintDiagramEditPart;
import serviceblueprint.diagram.edit.parts.ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramEditPart;
import serviceblueprint.diagram.edit.parts.ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramEditPart;
import serviceblueprint.diagram.edit.parts.ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramEditPart;
import serviceblueprint.diagram.edit.parts.ServiceBlueprintModelEditPart;
import serviceblueprint.diagram.edit.parts.SupportProcessEditPart;
import serviceblueprint.diagram.providers.ServiceblueprintElementTypes;

/**
 * @generated
 */
public class ServiceblueprintDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ServiceblueprintNodeDescriptor> getSemanticChildren(
			View view) {
		switch (ServiceblueprintVisualIDRegistry.getVisualID(view)) {
		case ServiceBlueprintModelEditPart.VISUAL_ID:
			return getServiceBlueprintModel_1000SemanticChildren(view);
		case ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramEditPart.VISUAL_ID:
			return getServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagram_7001SemanticChildren(view);
		case ServiceBlueprintDiagramCustomerActionCompartmentDiagramEditPart.VISUAL_ID:
			return getServiceBlueprintDiagramCustomerActionCompartmentDiagram_7002SemanticChildren(view);
		case ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
			return getServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagram_7003SemanticChildren(view);
		case ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
			return getServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagram_7004SemanticChildren(view);
		case ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
			return getServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagram_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintNodeDescriptor> getServiceBlueprintModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ServiceBlueprintModel modelElement = (ServiceBlueprintModel) view
				.getElement();
		LinkedList<ServiceblueprintNodeDescriptor> result = new LinkedList<ServiceblueprintNodeDescriptor>();
		{
			ServiceBlueprintDiagram childElement = modelElement
					.getHasServiceBlueprintDiagram();
			int visualID = ServiceblueprintVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == ServiceBlueprintDiagramEditPart.VISUAL_ID) {
				result.add(new ServiceblueprintNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintNodeDescriptor> getServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagram_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ServiceBlueprintDiagram modelElement = (ServiceBlueprintDiagram) containerView
				.getElement();
		LinkedList<ServiceblueprintNodeDescriptor> result = new LinkedList<ServiceblueprintNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasPhysicalEvidences().iterator(); it
				.hasNext();) {
			PhysicalEvidence childElement = (PhysicalEvidence) it.next();
			int visualID = ServiceblueprintVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == PhysicalEvidenceEditPart.VISUAL_ID) {
				result.add(new ServiceblueprintNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintNodeDescriptor> getServiceBlueprintDiagramCustomerActionCompartmentDiagram_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ServiceBlueprintDiagram modelElement = (ServiceBlueprintDiagram) containerView
				.getElement();
		LinkedList<ServiceblueprintNodeDescriptor> result = new LinkedList<ServiceblueprintNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasCustomerActions().iterator(); it
				.hasNext();) {
			CustomerAction childElement = (CustomerAction) it.next();
			int visualID = ServiceblueprintVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == CustomerActionEditPart.VISUAL_ID) {
				result.add(new ServiceblueprintNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintNodeDescriptor> getServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagram_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ServiceBlueprintDiagram modelElement = (ServiceBlueprintDiagram) containerView
				.getElement();
		LinkedList<ServiceblueprintNodeDescriptor> result = new LinkedList<ServiceblueprintNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasOnStageEmployeeActions()
				.iterator(); it.hasNext();) {
			OnStageEmployeeAction childElement = (OnStageEmployeeAction) it
					.next();
			int visualID = ServiceblueprintVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == OnStageEmployeeActionEditPart.VISUAL_ID) {
				result.add(new ServiceblueprintNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintNodeDescriptor> getServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagram_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ServiceBlueprintDiagram modelElement = (ServiceBlueprintDiagram) containerView
				.getElement();
		LinkedList<ServiceblueprintNodeDescriptor> result = new LinkedList<ServiceblueprintNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasBackStageEmployeeActions()
				.iterator(); it.hasNext();) {
			BackStageEmployeeAction childElement = (BackStageEmployeeAction) it
					.next();
			int visualID = ServiceblueprintVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == BackStageEmployeeActionEditPart.VISUAL_ID) {
				result.add(new ServiceblueprintNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintNodeDescriptor> getServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagram_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ServiceBlueprintDiagram modelElement = (ServiceBlueprintDiagram) containerView
				.getElement();
		LinkedList<ServiceblueprintNodeDescriptor> result = new LinkedList<ServiceblueprintNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasSupportProcesses().iterator(); it
				.hasNext();) {
			SupportProcess childElement = (SupportProcess) it.next();
			int visualID = ServiceblueprintVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == SupportProcessEditPart.VISUAL_ID) {
				result.add(new ServiceblueprintNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getContainedLinks(
			View view) {
		switch (ServiceblueprintVisualIDRegistry.getVisualID(view)) {
		case ServiceBlueprintModelEditPart.VISUAL_ID:
			return getServiceBlueprintModel_1000ContainedLinks(view);
		case ServiceBlueprintDiagramEditPart.VISUAL_ID:
			return getServiceBlueprintDiagram_2001ContainedLinks(view);
		case PhysicalEvidenceEditPart.VISUAL_ID:
			return getPhysicalEvidence_3001ContainedLinks(view);
		case CustomerActionEditPart.VISUAL_ID:
			return getCustomerAction_3002ContainedLinks(view);
		case OnStageEmployeeActionEditPart.VISUAL_ID:
			return getOnStageEmployeeAction_3003ContainedLinks(view);
		case BackStageEmployeeActionEditPart.VISUAL_ID:
			return getBackStageEmployeeAction_3004ContainedLinks(view);
		case SupportProcessEditPart.VISUAL_ID:
			return getSupportProcess_3005ContainedLinks(view);
		case ServiceBlueprintConnectionEditPart.VISUAL_ID:
			return getServiceBlueprintConnection_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getIncomingLinks(
			View view) {
		switch (ServiceblueprintVisualIDRegistry.getVisualID(view)) {
		case ServiceBlueprintDiagramEditPart.VISUAL_ID:
			return getServiceBlueprintDiagram_2001IncomingLinks(view);
		case PhysicalEvidenceEditPart.VISUAL_ID:
			return getPhysicalEvidence_3001IncomingLinks(view);
		case CustomerActionEditPart.VISUAL_ID:
			return getCustomerAction_3002IncomingLinks(view);
		case OnStageEmployeeActionEditPart.VISUAL_ID:
			return getOnStageEmployeeAction_3003IncomingLinks(view);
		case BackStageEmployeeActionEditPart.VISUAL_ID:
			return getBackStageEmployeeAction_3004IncomingLinks(view);
		case SupportProcessEditPart.VISUAL_ID:
			return getSupportProcess_3005IncomingLinks(view);
		case ServiceBlueprintConnectionEditPart.VISUAL_ID:
			return getServiceBlueprintConnection_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (ServiceblueprintVisualIDRegistry.getVisualID(view)) {
		case ServiceBlueprintDiagramEditPart.VISUAL_ID:
			return getServiceBlueprintDiagram_2001OutgoingLinks(view);
		case PhysicalEvidenceEditPart.VISUAL_ID:
			return getPhysicalEvidence_3001OutgoingLinks(view);
		case CustomerActionEditPart.VISUAL_ID:
			return getCustomerAction_3002OutgoingLinks(view);
		case OnStageEmployeeActionEditPart.VISUAL_ID:
			return getOnStageEmployeeAction_3003OutgoingLinks(view);
		case BackStageEmployeeActionEditPart.VISUAL_ID:
			return getBackStageEmployeeAction_3004OutgoingLinks(view);
		case SupportProcessEditPart.VISUAL_ID:
			return getSupportProcess_3005OutgoingLinks(view);
		case ServiceBlueprintConnectionEditPart.VISUAL_ID:
			return getServiceBlueprintConnection_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getServiceBlueprintModel_1000ContainedLinks(
			View view) {
		ServiceBlueprintModel modelElement = (ServiceBlueprintModel) view
				.getElement();
		LinkedList<ServiceblueprintLinkDescriptor> result = new LinkedList<ServiceblueprintLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ServiceBlueprintConnection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getServiceBlueprintDiagram_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getPhysicalEvidence_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getCustomerAction_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getOnStageEmployeeAction_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getBackStageEmployeeAction_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getSupportProcess_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getServiceBlueprintConnection_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getServiceBlueprintDiagram_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getPhysicalEvidence_3001IncomingLinks(
			View view) {
		PhysicalEvidence modelElement = (PhysicalEvidence) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ServiceblueprintLinkDescriptor> result = new LinkedList<ServiceblueprintLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ServiceBlueprintConnection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getCustomerAction_3002IncomingLinks(
			View view) {
		CustomerAction modelElement = (CustomerAction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ServiceblueprintLinkDescriptor> result = new LinkedList<ServiceblueprintLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ServiceBlueprintConnection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getOnStageEmployeeAction_3003IncomingLinks(
			View view) {
		OnStageEmployeeAction modelElement = (OnStageEmployeeAction) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ServiceblueprintLinkDescriptor> result = new LinkedList<ServiceblueprintLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ServiceBlueprintConnection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getBackStageEmployeeAction_3004IncomingLinks(
			View view) {
		BackStageEmployeeAction modelElement = (BackStageEmployeeAction) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ServiceblueprintLinkDescriptor> result = new LinkedList<ServiceblueprintLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ServiceBlueprintConnection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getSupportProcess_3005IncomingLinks(
			View view) {
		SupportProcess modelElement = (SupportProcess) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ServiceblueprintLinkDescriptor> result = new LinkedList<ServiceblueprintLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ServiceBlueprintConnection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getServiceBlueprintConnection_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getServiceBlueprintDiagram_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getPhysicalEvidence_3001OutgoingLinks(
			View view) {
		PhysicalEvidence modelElement = (PhysicalEvidence) view.getElement();
		LinkedList<ServiceblueprintLinkDescriptor> result = new LinkedList<ServiceblueprintLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ServiceBlueprintConnection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getCustomerAction_3002OutgoingLinks(
			View view) {
		CustomerAction modelElement = (CustomerAction) view.getElement();
		LinkedList<ServiceblueprintLinkDescriptor> result = new LinkedList<ServiceblueprintLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ServiceBlueprintConnection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getOnStageEmployeeAction_3003OutgoingLinks(
			View view) {
		OnStageEmployeeAction modelElement = (OnStageEmployeeAction) view
				.getElement();
		LinkedList<ServiceblueprintLinkDescriptor> result = new LinkedList<ServiceblueprintLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ServiceBlueprintConnection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getBackStageEmployeeAction_3004OutgoingLinks(
			View view) {
		BackStageEmployeeAction modelElement = (BackStageEmployeeAction) view
				.getElement();
		LinkedList<ServiceblueprintLinkDescriptor> result = new LinkedList<ServiceblueprintLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ServiceBlueprintConnection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getSupportProcess_3005OutgoingLinks(
			View view) {
		SupportProcess modelElement = (SupportProcess) view.getElement();
		LinkedList<ServiceblueprintLinkDescriptor> result = new LinkedList<ServiceblueprintLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ServiceBlueprintConnection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ServiceblueprintLinkDescriptor> getServiceBlueprintConnection_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ServiceblueprintLinkDescriptor> getContainedTypeModelFacetLinks_ServiceBlueprintConnection_4001(
			ServiceBlueprintModel container) {
		LinkedList<ServiceblueprintLinkDescriptor> result = new LinkedList<ServiceblueprintLinkDescriptor>();
		for (Iterator<?> links = container.getHasServiceBlueprintConnection()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ServiceBlueprintConnection) {
				continue;
			}
			ServiceBlueprintConnection link = (ServiceBlueprintConnection) linkObject;
			if (ServiceBlueprintConnectionEditPart.VISUAL_ID != ServiceblueprintVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ServiceBlueprintNode dst = link.getTargetServiceBlueprintNode();
			ServiceBlueprintNode src = link.getSourceServiceBlueprintNode();
			result.add(new ServiceblueprintLinkDescriptor(
					src,
					dst,
					link,
					ServiceblueprintElementTypes.ServiceBlueprintConnection_4001,
					ServiceBlueprintConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ServiceblueprintLinkDescriptor> getIncomingTypeModelFacetLinks_ServiceBlueprintConnection_4001(
			ServiceBlueprintNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ServiceblueprintLinkDescriptor> result = new LinkedList<ServiceblueprintLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ServiceblueprintPackage.eINSTANCE
					.getServiceBlueprintConnection_TargetServiceBlueprintNode()
					|| false == setting.getEObject() instanceof ServiceBlueprintConnection) {
				continue;
			}
			ServiceBlueprintConnection link = (ServiceBlueprintConnection) setting
					.getEObject();
			if (ServiceBlueprintConnectionEditPart.VISUAL_ID != ServiceblueprintVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ServiceBlueprintNode src = link.getSourceServiceBlueprintNode();
			result.add(new ServiceblueprintLinkDescriptor(
					src,
					target,
					link,
					ServiceblueprintElementTypes.ServiceBlueprintConnection_4001,
					ServiceBlueprintConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ServiceblueprintLinkDescriptor> getOutgoingTypeModelFacetLinks_ServiceBlueprintConnection_4001(
			ServiceBlueprintNode source) {
		ServiceBlueprintModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ServiceBlueprintModel) {
				container = (ServiceBlueprintModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ServiceblueprintLinkDescriptor> result = new LinkedList<ServiceblueprintLinkDescriptor>();
		for (Iterator<?> links = container.getHasServiceBlueprintConnection()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ServiceBlueprintConnection) {
				continue;
			}
			ServiceBlueprintConnection link = (ServiceBlueprintConnection) linkObject;
			if (ServiceBlueprintConnectionEditPart.VISUAL_ID != ServiceblueprintVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ServiceBlueprintNode dst = link.getTargetServiceBlueprintNode();
			ServiceBlueprintNode src = link.getSourceServiceBlueprintNode();
			if (src != source) {
				continue;
			}
			result.add(new ServiceblueprintLinkDescriptor(
					src,
					dst,
					link,
					ServiceblueprintElementTypes.ServiceBlueprintConnection_4001,
					ServiceBlueprintConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<ServiceblueprintNodeDescriptor> getSemanticChildren(
				View view) {
			return ServiceblueprintDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ServiceblueprintLinkDescriptor> getContainedLinks(View view) {
			return ServiceblueprintDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ServiceblueprintLinkDescriptor> getIncomingLinks(View view) {
			return ServiceblueprintDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ServiceblueprintLinkDescriptor> getOutgoingLinks(View view) {
			return ServiceblueprintDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
