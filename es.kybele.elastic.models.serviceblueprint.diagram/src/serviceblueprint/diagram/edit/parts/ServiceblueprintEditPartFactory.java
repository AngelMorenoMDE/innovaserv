package serviceblueprint.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import serviceblueprint.diagram.part.ServiceblueprintVisualIDRegistry;

/**
 * @generated
 */
public class ServiceblueprintEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ServiceblueprintVisualIDRegistry.getVisualID(view)) {

			case ServiceBlueprintModelEditPart.VISUAL_ID:
				return new ServiceBlueprintModelEditPart(view);

			case ServiceBlueprintDiagramEditPart.VISUAL_ID:
				return new ServiceBlueprintDiagramEditPart(view);

			case PhysicalEvidenceEditPart.VISUAL_ID:
				return new PhysicalEvidenceEditPart(view);

			case CustomerActionEditPart.VISUAL_ID:
				return new CustomerActionEditPart(view);

			case OnStageEmployeeActionEditPart.VISUAL_ID:
				return new OnStageEmployeeActionEditPart(view);

			case BackStageEmployeeActionEditPart.VISUAL_ID:
				return new BackStageEmployeeActionEditPart(view);

			case SupportProcessEditPart.VISUAL_ID:
				return new SupportProcessEditPart(view);

			case ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramEditPart.VISUAL_ID:
				return new ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramEditPart(
						view);

			case ServiceBlueprintDiagramCustomerActionCompartmentDiagramEditPart.VISUAL_ID:
				return new ServiceBlueprintDiagramCustomerActionCompartmentDiagramEditPart(
						view);

			case ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
				return new ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramEditPart(
						view);

			case ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
				return new ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramEditPart(
						view);

			case ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramEditPart.VISUAL_ID:
				return new ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramEditPart(
						view);

			case ServiceBlueprintConnectionEditPart.VISUAL_ID:
				return new ServiceBlueprintConnectionEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
