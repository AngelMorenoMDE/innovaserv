package serviceblueprint.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import serviceblueprint.diagram.edit.commands.CustomerActionCreateCommand;
import serviceblueprint.diagram.providers.ServiceblueprintElementTypes;

/**
 * @generated
 */
public class ServiceBlueprintDiagramCustomerActionCompartmentDiagramItemSemanticEditPolicy
		extends ServiceblueprintBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceBlueprintDiagramCustomerActionCompartmentDiagramItemSemanticEditPolicy() {
		super(ServiceblueprintElementTypes.ServiceBlueprintDiagram_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ServiceblueprintElementTypes.CustomerAction_3002 == req
				.getElementType()) {
			return getGEFWrapper(new CustomerActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
