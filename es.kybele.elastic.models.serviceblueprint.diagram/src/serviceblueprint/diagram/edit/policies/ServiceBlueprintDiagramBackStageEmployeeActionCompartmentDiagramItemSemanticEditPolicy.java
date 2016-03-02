package serviceblueprint.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import serviceblueprint.diagram.edit.commands.BackStageEmployeeActionCreateCommand;
import serviceblueprint.diagram.providers.ServiceblueprintElementTypes;

/**
 * @generated
 */
public class ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramItemSemanticEditPolicy
		extends ServiceblueprintBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramItemSemanticEditPolicy() {
		super(ServiceblueprintElementTypes.ServiceBlueprintDiagram_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ServiceblueprintElementTypes.BackStageEmployeeAction_3004 == req
				.getElementType()) {
			return getGEFWrapper(new BackStageEmployeeActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
