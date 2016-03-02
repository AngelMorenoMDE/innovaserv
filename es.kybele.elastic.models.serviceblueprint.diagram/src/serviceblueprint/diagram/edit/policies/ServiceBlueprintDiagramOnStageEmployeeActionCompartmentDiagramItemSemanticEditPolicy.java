package serviceblueprint.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import serviceblueprint.diagram.edit.commands.OnStageEmployeeActionCreateCommand;
import serviceblueprint.diagram.providers.ServiceblueprintElementTypes;

/**
 * @generated
 */
public class ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramItemSemanticEditPolicy
		extends ServiceblueprintBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramItemSemanticEditPolicy() {
		super(ServiceblueprintElementTypes.ServiceBlueprintDiagram_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ServiceblueprintElementTypes.OnStageEmployeeAction_3003 == req
				.getElementType()) {
			return getGEFWrapper(new OnStageEmployeeActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
