package serviceblueprint.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import serviceblueprint.diagram.edit.parts.ServiceBlueprintModelEditPart;
import serviceblueprint.diagram.edit.parts.ServiceblueprintEditPartFactory;
import serviceblueprint.diagram.part.ServiceblueprintVisualIDRegistry;

/**
 * @generated
 */
public class ServiceblueprintEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public ServiceblueprintEditPartProvider() {
		super(new ServiceblueprintEditPartFactory(),
				ServiceblueprintVisualIDRegistry.TYPED_INSTANCE,
				ServiceBlueprintModelEditPart.MODEL_ID);
	}

}
