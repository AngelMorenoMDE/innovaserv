package serviceblueprint.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import serviceblueprint.ServiceblueprintPackage;
import serviceblueprint.diagram.edit.parts.BackStageEmployeeActionEditPart;
import serviceblueprint.diagram.edit.parts.CustomerActionEditPart;
import serviceblueprint.diagram.edit.parts.OnStageEmployeeActionEditPart;
import serviceblueprint.diagram.edit.parts.PhysicalEvidenceEditPart;
import serviceblueprint.diagram.edit.parts.ServiceBlueprintConnectionEditPart;
import serviceblueprint.diagram.edit.parts.ServiceBlueprintDiagramEditPart;
import serviceblueprint.diagram.edit.parts.ServiceBlueprintModelEditPart;
import serviceblueprint.diagram.edit.parts.SupportProcessEditPart;
import serviceblueprint.diagram.part.ServiceblueprintDiagramEditorPlugin;

/**
 * @generated
 */
public class ServiceblueprintElementTypes {

	/**
	 * @generated
	 */
	private ServiceblueprintElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ServiceblueprintDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ServiceBlueprintModel_1000 = getElementType("es.kybele.elastic.models.serviceblueprint.diagram.ServiceBlueprintModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceBlueprintDiagram_2001 = getElementType("es.kybele.elastic.models.serviceblueprint.diagram.ServiceBlueprintDiagram_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PhysicalEvidence_3001 = getElementType("es.kybele.elastic.models.serviceblueprint.diagram.PhysicalEvidence_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CustomerAction_3002 = getElementType("es.kybele.elastic.models.serviceblueprint.diagram.CustomerAction_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OnStageEmployeeAction_3003 = getElementType("es.kybele.elastic.models.serviceblueprint.diagram.OnStageEmployeeAction_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BackStageEmployeeAction_3004 = getElementType("es.kybele.elastic.models.serviceblueprint.diagram.BackStageEmployeeAction_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SupportProcess_3005 = getElementType("es.kybele.elastic.models.serviceblueprint.diagram.SupportProcess_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceBlueprintConnection_4001 = getElementType("es.kybele.elastic.models.serviceblueprint.diagram.ServiceBlueprintConnection_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ServiceBlueprintModel_1000,
					ServiceblueprintPackage.eINSTANCE
							.getServiceBlueprintModel());

			elements.put(ServiceBlueprintDiagram_2001,
					ServiceblueprintPackage.eINSTANCE
							.getServiceBlueprintDiagram());

			elements.put(PhysicalEvidence_3001,
					ServiceblueprintPackage.eINSTANCE.getPhysicalEvidence());

			elements.put(CustomerAction_3002,
					ServiceblueprintPackage.eINSTANCE.getCustomerAction());

			elements.put(OnStageEmployeeAction_3003,
					ServiceblueprintPackage.eINSTANCE
							.getOnStageEmployeeAction());

			elements.put(BackStageEmployeeAction_3004,
					ServiceblueprintPackage.eINSTANCE
							.getBackStageEmployeeAction());

			elements.put(SupportProcess_3005,
					ServiceblueprintPackage.eINSTANCE.getSupportProcess());

			elements.put(ServiceBlueprintConnection_4001,
					ServiceblueprintPackage.eINSTANCE
							.getServiceBlueprintConnection());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ServiceBlueprintModel_1000);
			KNOWN_ELEMENT_TYPES.add(ServiceBlueprintDiagram_2001);
			KNOWN_ELEMENT_TYPES.add(PhysicalEvidence_3001);
			KNOWN_ELEMENT_TYPES.add(CustomerAction_3002);
			KNOWN_ELEMENT_TYPES.add(OnStageEmployeeAction_3003);
			KNOWN_ELEMENT_TYPES.add(BackStageEmployeeAction_3004);
			KNOWN_ELEMENT_TYPES.add(SupportProcess_3005);
			KNOWN_ELEMENT_TYPES.add(ServiceBlueprintConnection_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ServiceBlueprintModelEditPart.VISUAL_ID:
			return ServiceBlueprintModel_1000;
		case ServiceBlueprintDiagramEditPart.VISUAL_ID:
			return ServiceBlueprintDiagram_2001;
		case PhysicalEvidenceEditPart.VISUAL_ID:
			return PhysicalEvidence_3001;
		case CustomerActionEditPart.VISUAL_ID:
			return CustomerAction_3002;
		case OnStageEmployeeActionEditPart.VISUAL_ID:
			return OnStageEmployeeAction_3003;
		case BackStageEmployeeActionEditPart.VISUAL_ID:
			return BackStageEmployeeAction_3004;
		case SupportProcessEditPart.VISUAL_ID:
			return SupportProcess_3005;
		case ServiceBlueprintConnectionEditPart.VISUAL_ID:
			return ServiceBlueprintConnection_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return serviceblueprint.diagram.providers.ServiceblueprintElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return serviceblueprint.diagram.providers.ServiceblueprintElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return serviceblueprint.diagram.providers.ServiceblueprintElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
