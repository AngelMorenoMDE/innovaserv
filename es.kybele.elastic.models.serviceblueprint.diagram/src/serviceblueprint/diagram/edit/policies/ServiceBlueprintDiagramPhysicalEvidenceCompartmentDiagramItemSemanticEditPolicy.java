package serviceblueprint.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import serviceblueprint.diagram.edit.commands.PhysicalEvidenceCreateCommand;
import serviceblueprint.diagram.providers.ServiceblueprintElementTypes;

/**
 * @generated
 */
public class ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramItemSemanticEditPolicy
		extends ServiceblueprintBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramItemSemanticEditPolicy() {
		super(ServiceblueprintElementTypes.ServiceBlueprintDiagram_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ServiceblueprintElementTypes.PhysicalEvidence_3001 == req
				.getElementType()) {
			return getGEFWrapper(new PhysicalEvidenceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
