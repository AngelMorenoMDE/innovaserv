package serviceblueprint.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import serviceblueprint.diagram.edit.parts.BackStageEmployeeActionEditPart;
import serviceblueprint.diagram.edit.parts.CustomerActionEditPart;
import serviceblueprint.diagram.edit.parts.OnStageEmployeeActionEditPart;
import serviceblueprint.diagram.edit.parts.PhysicalEvidenceEditPart;
import serviceblueprint.diagram.edit.parts.SupportProcessEditPart;
import serviceblueprint.diagram.providers.ServiceblueprintElementTypes;
import serviceblueprint.diagram.providers.ServiceblueprintModelingAssistantProvider;

/**
 * @generated
 */
public class ServiceblueprintModelingAssistantProviderOfSupportProcessEditPart
		extends ServiceblueprintModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((SupportProcessEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			SupportProcessEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ServiceblueprintElementTypes.ServiceBlueprintConnection_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(SupportProcessEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			SupportProcessEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PhysicalEvidenceEditPart) {
			types.add(ServiceblueprintElementTypes.ServiceBlueprintConnection_4001);
		}
		if (targetEditPart instanceof CustomerActionEditPart) {
			types.add(ServiceblueprintElementTypes.ServiceBlueprintConnection_4001);
		}
		if (targetEditPart instanceof OnStageEmployeeActionEditPart) {
			types.add(ServiceblueprintElementTypes.ServiceBlueprintConnection_4001);
		}
		if (targetEditPart instanceof BackStageEmployeeActionEditPart) {
			types.add(ServiceblueprintElementTypes.ServiceBlueprintConnection_4001);
		}
		if (targetEditPart instanceof SupportProcessEditPart) {
			types.add(ServiceblueprintElementTypes.ServiceBlueprintConnection_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((SupportProcessEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			SupportProcessEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ServiceblueprintElementTypes.ServiceBlueprintConnection_4001) {
			types.add(ServiceblueprintElementTypes.PhysicalEvidence_3001);
			types.add(ServiceblueprintElementTypes.CustomerAction_3002);
			types.add(ServiceblueprintElementTypes.OnStageEmployeeAction_3003);
			types.add(ServiceblueprintElementTypes.BackStageEmployeeAction_3004);
			types.add(ServiceblueprintElementTypes.SupportProcess_3005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((SupportProcessEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			SupportProcessEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ServiceblueprintElementTypes.ServiceBlueprintConnection_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((SupportProcessEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			SupportProcessEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ServiceblueprintElementTypes.ServiceBlueprintConnection_4001) {
			types.add(ServiceblueprintElementTypes.PhysicalEvidence_3001);
			types.add(ServiceblueprintElementTypes.CustomerAction_3002);
			types.add(ServiceblueprintElementTypes.OnStageEmployeeAction_3003);
			types.add(ServiceblueprintElementTypes.BackStageEmployeeAction_3004);
			types.add(ServiceblueprintElementTypes.SupportProcess_3005);
		}
		return types;
	}

}
