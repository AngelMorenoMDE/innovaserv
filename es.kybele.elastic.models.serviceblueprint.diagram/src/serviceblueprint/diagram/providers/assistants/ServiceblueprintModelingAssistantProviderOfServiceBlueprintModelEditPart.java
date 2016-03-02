package serviceblueprint.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import serviceblueprint.diagram.providers.ServiceblueprintElementTypes;
import serviceblueprint.diagram.providers.ServiceblueprintModelingAssistantProvider;

/**
 * @generated
 */
public class ServiceblueprintModelingAssistantProviderOfServiceBlueprintModelEditPart
		extends ServiceblueprintModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ServiceblueprintElementTypes.ServiceBlueprintDiagram_2001);
		return types;
	}

}
