package serviceblueprint.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import serviceblueprint.diagram.providers.ServiceblueprintElementTypes;

/**
 * @generated
 */
public class ServiceBlueprintConnectionItemSemanticEditPolicy extends
		ServiceblueprintBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceBlueprintConnectionItemSemanticEditPolicy() {
		super(ServiceblueprintElementTypes.ServiceBlueprintConnection_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
