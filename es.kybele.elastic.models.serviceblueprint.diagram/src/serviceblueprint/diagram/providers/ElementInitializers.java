package serviceblueprint.diagram.providers;

import serviceblueprint.diagram.part.ServiceblueprintDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ServiceblueprintDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			ServiceblueprintDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
