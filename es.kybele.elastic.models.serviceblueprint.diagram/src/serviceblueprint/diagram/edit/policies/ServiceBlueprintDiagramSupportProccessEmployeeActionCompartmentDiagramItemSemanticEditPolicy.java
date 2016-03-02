package serviceblueprint.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import serviceblueprint.diagram.edit.commands.SupportProcessCreateCommand;
import serviceblueprint.diagram.providers.ServiceblueprintElementTypes;

/**
 * @generated
 */
public class ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramItemSemanticEditPolicy
		extends ServiceblueprintBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramItemSemanticEditPolicy() {
		super(ServiceblueprintElementTypes.ServiceBlueprintDiagram_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ServiceblueprintElementTypes.SupportProcess_3005 == req
				.getElementType()) {
			return getGEFWrapper(new SupportProcessCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
