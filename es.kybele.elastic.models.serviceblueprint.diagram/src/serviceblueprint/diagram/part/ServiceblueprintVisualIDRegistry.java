package serviceblueprint.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import serviceblueprint.ServiceBlueprintModel;
import serviceblueprint.ServiceblueprintPackage;
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

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ServiceblueprintVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "es.kybele.elastic.models.serviceblueprint.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ServiceBlueprintModelEditPart.MODEL_ID.equals(view.getType())) {
				return ServiceBlueprintModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return serviceblueprint.diagram.part.ServiceblueprintVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ServiceblueprintDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ServiceblueprintPackage.eINSTANCE.getServiceBlueprintModel()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ServiceBlueprintModel) domainElement)) {
			return ServiceBlueprintModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = serviceblueprint.diagram.part.ServiceblueprintVisualIDRegistry
				.getModelID(containerView);
		if (!ServiceBlueprintModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ServiceBlueprintModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = serviceblueprint.diagram.part.ServiceblueprintVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ServiceBlueprintModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ServiceBlueprintModelEditPart.VISUAL_ID:
			if (ServiceblueprintPackage.eINSTANCE.getServiceBlueprintDiagram()
					.isSuperTypeOf(domainElement.eClass())) {
				return ServiceBlueprintDiagramEditPart.VISUAL_ID;
			}
			break;
		case ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramEditPart.VISUAL_ID:
			if (ServiceblueprintPackage.eINSTANCE.getPhysicalEvidence()
					.isSuperTypeOf(domainElement.eClass())) {
				return PhysicalEvidenceEditPart.VISUAL_ID;
			}
			break;
		case ServiceBlueprintDiagramCustomerActionCompartmentDiagramEditPart.VISUAL_ID:
			if (ServiceblueprintPackage.eINSTANCE.getCustomerAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return CustomerActionEditPart.VISUAL_ID;
			}
			break;
		case ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
			if (ServiceblueprintPackage.eINSTANCE.getOnStageEmployeeAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return OnStageEmployeeActionEditPart.VISUAL_ID;
			}
			break;
		case ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
			if (ServiceblueprintPackage.eINSTANCE.getBackStageEmployeeAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return BackStageEmployeeActionEditPart.VISUAL_ID;
			}
			break;
		case ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
			if (ServiceblueprintPackage.eINSTANCE.getSupportProcess()
					.isSuperTypeOf(domainElement.eClass())) {
				return SupportProcessEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = serviceblueprint.diagram.part.ServiceblueprintVisualIDRegistry
				.getModelID(containerView);
		if (!ServiceBlueprintModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ServiceBlueprintModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = serviceblueprint.diagram.part.ServiceblueprintVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ServiceBlueprintModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ServiceBlueprintModelEditPart.VISUAL_ID:
			if (ServiceBlueprintDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceBlueprintDiagramEditPart.VISUAL_ID:
			if (ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServiceBlueprintDiagramCustomerActionCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramEditPart.VISUAL_ID:
			if (PhysicalEvidenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceBlueprintDiagramCustomerActionCompartmentDiagramEditPart.VISUAL_ID:
			if (CustomerActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
			if (OnStageEmployeeActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
			if (BackStageEmployeeActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
			if (SupportProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ServiceblueprintPackage.eINSTANCE.getServiceBlueprintConnection()
				.isSuperTypeOf(domainElement.eClass())) {
			return ServiceBlueprintConnectionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ServiceBlueprintModel element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramEditPart.VISUAL_ID:
		case ServiceBlueprintDiagramCustomerActionCompartmentDiagramEditPart.VISUAL_ID:
		case ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
		case ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
		case ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ServiceBlueprintModelEditPart.VISUAL_ID:
			return false;
		case PhysicalEvidenceEditPart.VISUAL_ID:
		case CustomerActionEditPart.VISUAL_ID:
		case OnStageEmployeeActionEditPart.VISUAL_ID:
		case BackStageEmployeeActionEditPart.VISUAL_ID:
		case SupportProcessEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return serviceblueprint.diagram.part.ServiceblueprintVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return serviceblueprint.diagram.part.ServiceblueprintVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return serviceblueprint.diagram.part.ServiceblueprintVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return serviceblueprint.diagram.part.ServiceblueprintVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return serviceblueprint.diagram.part.ServiceblueprintVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return serviceblueprint.diagram.part.ServiceblueprintVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
