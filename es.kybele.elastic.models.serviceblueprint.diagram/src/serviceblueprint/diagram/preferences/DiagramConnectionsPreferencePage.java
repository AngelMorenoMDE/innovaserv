package serviceblueprint.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import serviceblueprint.diagram.part.ServiceblueprintDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(ServiceblueprintDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
