package serviceblueprint.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import serviceblueprint.ServiceBlueprintConnection;
import serviceblueprint.ServiceBlueprintModel;
import serviceblueprint.ServiceBlueprintNode;
import serviceblueprint.diagram.edit.policies.ServiceblueprintBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ServiceBlueprintConnectionReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ServiceBlueprintConnectionReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ServiceBlueprintConnection) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ServiceBlueprintNode && newEnd instanceof ServiceBlueprintNode)) {
			return false;
		}
		ServiceBlueprintNode target = getLink().getTargetServiceBlueprintNode();
		if (!(getLink().eContainer() instanceof ServiceBlueprintModel)) {
			return false;
		}
		ServiceBlueprintModel container = (ServiceBlueprintModel) getLink()
				.eContainer();
		return ServiceblueprintBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistServiceBlueprintConnection_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ServiceBlueprintNode && newEnd instanceof ServiceBlueprintNode)) {
			return false;
		}
		ServiceBlueprintNode source = getLink().getSourceServiceBlueprintNode();
		if (!(getLink().eContainer() instanceof ServiceBlueprintModel)) {
			return false;
		}
		ServiceBlueprintModel container = (ServiceBlueprintModel) getLink()
				.eContainer();
		return ServiceblueprintBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistServiceBlueprintConnection_4001(container, getLink(),
						source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSourceServiceBlueprintNode(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTargetServiceBlueprintNode(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ServiceBlueprintConnection getLink() {
		return (ServiceBlueprintConnection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ServiceBlueprintNode getOldSource() {
		return (ServiceBlueprintNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ServiceBlueprintNode getNewSource() {
		return (ServiceBlueprintNode) newEnd;
	}

	/**
	 * @generated
	 */
	protected ServiceBlueprintNode getOldTarget() {
		return (ServiceBlueprintNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ServiceBlueprintNode getNewTarget() {
		return (ServiceBlueprintNode) newEnd;
	}
}
