package serviceblueprint.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import serviceblueprint.diagram.providers.ServiceblueprintElementTypes;

/**
 * @generated
 */
public class ServiceblueprintPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createServiceblueprint1Group());
	}

	/**
	 * Creates "serviceblueprint" palette tool group
	 * @generated
	 */
	private PaletteContainer createServiceblueprint1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Serviceblueprint1Group_title);
		paletteContainer.setId("createServiceblueprint1Group"); //$NON-NLS-1$
		paletteContainer.add(createServiceBlueprintDiagram1CreationTool());
		paletteContainer.add(createServiceBlueprintActions());
		paletteContainer.add(createServiceBlueprintConnections());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private PaletteDrawer createServiceBlueprintDiagram1CreationTool() {
		PaletteDrawer paletteServiceBlueprintModels = new PaletteDrawer(/*
				Messages.E3value1Group_title*/"Modelos");
		
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ServiceBlueprintDiagram1CreationTool_title,
				Messages.ServiceBlueprintDiagram1CreationTool_desc,
				Collections
						.singletonList(ServiceblueprintElementTypes.ServiceBlueprintDiagram_2001));
		entry.setId("createServiceBlueprintDiagram1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ServiceblueprintElementTypes
				.getImageDescriptor(ServiceblueprintElementTypes.ServiceBlueprintDiagram_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		
		paletteServiceBlueprintModels.add(entry);
		return paletteServiceBlueprintModels;
	}

	private PaletteDrawer createServiceBlueprintActions() {
		PaletteDrawer paletteServiceBlueprintActions = new PaletteDrawer(/*
				Messages.E3value1Group_title*/"Acciones");
		
		paletteServiceBlueprintActions.add(createPhysicalEvidence2CreationTool());
		paletteServiceBlueprintActions.add(createCustomerAction3CreationTool());
		paletteServiceBlueprintActions.add(createOnStageEmployeeAction4CreationTool());
		paletteServiceBlueprintActions.add(createBackStageEmployeeAction5CreationTool());
		paletteServiceBlueprintActions.add(createSupportProcess6CreationTool());
		
		return paletteServiceBlueprintActions;
	}	
	
	private PaletteDrawer createServiceBlueprintConnections() {
		PaletteDrawer paletteServiceBlueprintConnections = new PaletteDrawer(/*
				Messages.E3value1Group_title*/"Conexiones");
		

		paletteServiceBlueprintConnections.add(createServiceBlueprintConnection7CreationTool());
		
		return paletteServiceBlueprintConnections;
	}
	
	/**
	 * @generated
	 */
	private ToolEntry createPhysicalEvidence2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.PhysicalEvidence2CreationTool_title,
				Messages.PhysicalEvidence2CreationTool_desc,
				Collections
						.singletonList(ServiceblueprintElementTypes.PhysicalEvidence_3001));
		entry.setId("createPhysicalEvidence2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ServiceblueprintElementTypes
				.getImageDescriptor(ServiceblueprintElementTypes.PhysicalEvidence_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomerAction3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.CustomerAction3CreationTool_title,
				Messages.CustomerAction3CreationTool_desc,
				Collections
						.singletonList(ServiceblueprintElementTypes.CustomerAction_3002));
		entry.setId("createCustomerAction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ServiceblueprintElementTypes
				.getImageDescriptor(ServiceblueprintElementTypes.CustomerAction_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOnStageEmployeeAction4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.OnStageEmployeeAction4CreationTool_title,
				Messages.OnStageEmployeeAction4CreationTool_desc,
				Collections
						.singletonList(ServiceblueprintElementTypes.OnStageEmployeeAction_3003));
		entry.setId("createOnStageEmployeeAction4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ServiceblueprintElementTypes
				.getImageDescriptor(ServiceblueprintElementTypes.OnStageEmployeeAction_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBackStageEmployeeAction5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.BackStageEmployeeAction5CreationTool_title,
				Messages.BackStageEmployeeAction5CreationTool_desc,
				Collections
						.singletonList(ServiceblueprintElementTypes.BackStageEmployeeAction_3004));
		entry.setId("createBackStageEmployeeAction5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ServiceblueprintElementTypes
				.getImageDescriptor(ServiceblueprintElementTypes.BackStageEmployeeAction_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSupportProcess6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.SupportProcess6CreationTool_title,
				Messages.SupportProcess6CreationTool_desc,
				Collections
						.singletonList(ServiceblueprintElementTypes.SupportProcess_3005));
		entry.setId("createSupportProcess6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ServiceblueprintElementTypes
				.getImageDescriptor(ServiceblueprintElementTypes.SupportProcess_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceBlueprintConnection7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ServiceBlueprintConnection7CreationTool_title,
				Messages.ServiceBlueprintConnection7CreationTool_desc,
				Collections
						.singletonList(ServiceblueprintElementTypes.ServiceBlueprintConnection_4001));
		entry.setId("createServiceBlueprintConnection7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ServiceblueprintElementTypes
				.getImageDescriptor(ServiceblueprintElementTypes.ServiceBlueprintConnection_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
