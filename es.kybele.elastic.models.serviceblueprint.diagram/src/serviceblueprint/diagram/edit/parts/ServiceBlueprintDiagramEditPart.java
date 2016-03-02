package serviceblueprint.diagram.edit.parts;

import java.nio.channels.FileChannel.MapMode;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import serviceblueprint.diagram.edit.parts.listeners.ServiceBlueprintDiagramFigureListener;
import serviceblueprint.diagram.edit.policies.ServiceBlueprintDiagramItemSemanticEditPolicy;

/**
 * @generated
 */
public class ServiceBlueprintDiagramEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ServiceBlueprintDiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ServiceBlueprintDiagramItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ServiceBlueprintDiagramFigure();
	}

	/**
	 * @generated
	 */
	public ServiceBlueprintDiagramFigure getPrimaryShape() {
		return (ServiceBlueprintDiagramFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompartmentBaseLayoutRowPhysicalEvidence();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ServiceBlueprintDiagramCustomerActionCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompartmentBaseLayoutRowCustomerAction();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ServiceBlueprintDiagramCustomerActionCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompartmentBaseLayoutRowOnStageEmployeeAction();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompartmentBaseLayoutRowBackStageEmployeeAction();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompartmentBaseLayoutRowSupportProcess();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompartmentBaseLayoutRowPhysicalEvidence();
			pane.remove(((ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ServiceBlueprintDiagramCustomerActionCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompartmentBaseLayoutRowCustomerAction();
			pane.remove(((ServiceBlueprintDiagramCustomerActionCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompartmentBaseLayoutRowOnStageEmployeeAction();
			pane.remove(((ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompartmentBaseLayoutRowBackStageEmployeeAction();
			pane.remove(((ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompartmentBaseLayoutRowSupportProcess();
			pane.remove(((ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof ServiceBlueprintDiagramPhysicalEvidenceCompartmentDiagramEditPart) {
			return getPrimaryShape().getFigureCompartmentBaseLayoutRowPhysicalEvidence();
		}
		if (editPart instanceof ServiceBlueprintDiagramCustomerActionCompartmentDiagramEditPart) {
			return getPrimaryShape().getFigureCompartmentBaseLayoutRowCustomerAction();
		}
		if (editPart instanceof ServiceBlueprintDiagramOnStageEmployeeActionCompartmentDiagramEditPart) {
			return getPrimaryShape()
					.getFigureCompartmentBaseLayoutRowOnStageEmployeeAction();
		}
		if (editPart instanceof ServiceBlueprintDiagramBackStageEmployeeActionCompartmentDiagramEditPart) {
			return getPrimaryShape()
					.getFigureCompartmentBaseLayoutRowBackStageEmployeeAction();
		}
		if (editPart instanceof ServiceBlueprintDiagramSupportProccessEmployeeActionCompartmentDiagramEditPart) {
			return getPrimaryShape().getFigureCompartmentBaseLayoutRowSupportProcess();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		figure.addFigureListener(new ServiceBlueprintDiagramFigureListener());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public class ServiceBlueprintDiagramFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentBaseLayoutRowPhysicalEvidence;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentBaseLayoutRowCustomerAction;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentBaseLayoutRowOnStageEmployeeAction;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentBaseLayoutRowBackStageEmployeeAction;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentBaseLayoutRowSupportProcess;

		/**
		 * @generated
		 */
		public ServiceBlueprintDiagramFigure() {
			this.setLayoutManager(new XYLayout());
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(1000),
					getMapMode().DPtoLP(800)));
			createContents();
		}

		public IMapMode getMapModeFigure()
		{
			return getMapMode();
		}
		
		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure baseLayoutRowPhysicalEvidence0 = new RectangleFigure();
			baseLayoutRowPhysicalEvidence0.setAlpha(0);
			baseLayoutRowPhysicalEvidence0.setLineWidth(0);
			baseLayoutRowPhysicalEvidence0
					.setBackgroundColor(ColorConstants.white);

			this.add(baseLayoutRowPhysicalEvidence0,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode()
							.DPtoLP(0), getMapMode().DPtoLP(1000), getMapMode()
							.DPtoLP(150)));
			baseLayoutRowPhysicalEvidence0.setLayoutManager(new XYLayout());

			RectangleFigure titleBaseLayoutRowPhysicalEvidence1 = new RectangleFigure();

			titleBaseLayoutRowPhysicalEvidence1.setOutline(false);
			titleBaseLayoutRowPhysicalEvidence1.setFill(false);
			titleBaseLayoutRowPhysicalEvidence1.setOpaque(false);

			baseLayoutRowPhysicalEvidence0
					.add(titleBaseLayoutRowPhysicalEvidence1, new Rectangle(
							getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
							getMapMode().DPtoLP(100), getMapMode().DPtoLP(150)));
			titleBaseLayoutRowPhysicalEvidence1
					.setLayoutManager(new XYLayout());

			WrappingLabel titlePhysicalEvidence2 = new WrappingLabel();

			titlePhysicalEvidence2.setText("PHYSICAL\nEVIDENCE");
			titlePhysicalEvidence2.setTextWrap(true);
			titlePhysicalEvidence2.setForegroundColor(ColorConstants.black);

			titlePhysicalEvidence2.setFont(TITLEPHYSICALEVIDENCE2_FONT);

			titleBaseLayoutRowPhysicalEvidence1.add(
					titlePhysicalEvidence2,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode().DPtoLP(
							60), getMapMode().DPtoLP(100), getMapMode().DPtoLP(
							150)));

			fFigureCompartmentBaseLayoutRowPhysicalEvidence = new RectangleFigure();
			fFigureCompartmentBaseLayoutRowPhysicalEvidence.setAlpha(0);
			fFigureCompartmentBaseLayoutRowPhysicalEvidence.setOutline(false);
			fFigureCompartmentBaseLayoutRowPhysicalEvidence.setFill(false);
			fFigureCompartmentBaseLayoutRowPhysicalEvidence.setOpaque(false);

			baseLayoutRowPhysicalEvidence0.add(
					fFigureCompartmentBaseLayoutRowPhysicalEvidence,
					new Rectangle(getMapMode().DPtoLP(100), getMapMode()
							.DPtoLP(-1), getMapMode().DPtoLP(900), getMapMode()
							.DPtoLP(151)));
			fFigureCompartmentBaseLayoutRowPhysicalEvidence
					.setLayoutManager(new StackLayout());

			RectangleFigure baseLayoutLineDivisorPhysicalEvidenceCustomerAction0 = new RectangleFigure();
			baseLayoutLineDivisorPhysicalEvidenceCustomerAction0.setAlpha(0);
			baseLayoutLineDivisorPhysicalEvidenceCustomerAction0
					.setLineWidth(0);

			this.add(
					baseLayoutLineDivisorPhysicalEvidenceCustomerAction0,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(
							150), getMapMode().DPtoLP(1000), getMapMode()
							.DPtoLP(4)));
			baseLayoutLineDivisorPhysicalEvidenceCustomerAction0
					.setLayoutManager(new XYLayout());

			PolylineShape lineDivisor1 = new PolylineShape();

			lineDivisor1.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(2)));
			lineDivisor1.addPoint(new Point(getMapMode().DPtoLP(1000),
					getMapMode().DPtoLP(2)));
			lineDivisor1.setForegroundColor(ColorConstants.black);

			baseLayoutLineDivisorPhysicalEvidenceCustomerAction0.add(
					lineDivisor1, new Rectangle(getMapMode().DPtoLP(0),
							getMapMode().DPtoLP(0), getMapMode().DPtoLP(1000),
							getMapMode().DPtoLP(4)));

			RectangleFigure baseLayoutCustomerAction0 = new RectangleFigure();
			baseLayoutCustomerAction0.setAlpha(0);
			baseLayoutCustomerAction0.setLineWidth(0);
			baseLayoutCustomerAction0.setBackgroundColor(ColorConstants.white);

			this.add(
					baseLayoutCustomerAction0,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(
							154), getMapMode().DPtoLP(1000), getMapMode()
							.DPtoLP(150)));
			baseLayoutCustomerAction0.setLayoutManager(new XYLayout());

			RectangleFigure titleBaseLayoutRowCustomerAction1 = new RectangleFigure();

			titleBaseLayoutRowCustomerAction1.setOutline(false);
			titleBaseLayoutRowCustomerAction1.setFill(false);
			titleBaseLayoutRowCustomerAction1.setOpaque(false);

			baseLayoutCustomerAction0.add(titleBaseLayoutRowCustomerAction1,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode()
							.DPtoLP(0), getMapMode().DPtoLP(100), getMapMode()
							.DPtoLP(150)));
			titleBaseLayoutRowCustomerAction1.setLayoutManager(new XYLayout());

			WrappingLabel titleCustomerAction2 = new WrappingLabel();

			titleCustomerAction2.setText("CUSTOMER\nACTION");
			titleCustomerAction2.setTextWrap(true);
			titleCustomerAction2.setForegroundColor(ColorConstants.black);

			titleCustomerAction2.setFont(TITLECUSTOMERACTION2_FONT);

			titleBaseLayoutRowCustomerAction1.add(
					titleCustomerAction2,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode().DPtoLP(
							60), getMapMode().DPtoLP(100), getMapMode().DPtoLP(
							150)));

			fFigureCompartmentBaseLayoutRowCustomerAction = new RectangleFigure();
			fFigureCompartmentBaseLayoutRowCustomerAction.setAlpha(0);
			fFigureCompartmentBaseLayoutRowCustomerAction.setOutline(false);
			fFigureCompartmentBaseLayoutRowCustomerAction.setFill(false);
			fFigureCompartmentBaseLayoutRowCustomerAction.setOpaque(false);

			baseLayoutCustomerAction0.add(
					fFigureCompartmentBaseLayoutRowCustomerAction,
					new Rectangle(getMapMode().DPtoLP(100), getMapMode()
							.DPtoLP(-1), getMapMode().DPtoLP(900), getMapMode()
							.DPtoLP(151)));
			fFigureCompartmentBaseLayoutRowCustomerAction
					.setLayoutManager(new StackLayout());

			RectangleFigure baseLayoutLineOfInteraction0 = new RectangleFigure();
			baseLayoutLineOfInteraction0.setAlpha(0);
			baseLayoutLineOfInteraction0.setLineWidth(0);

			this.add(
					baseLayoutLineOfInteraction0,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(
							300), getMapMode().DPtoLP(1000), getMapMode()
							.DPtoLP(20)));
			baseLayoutLineOfInteraction0.setLayoutManager(new XYLayout());

			WrappingLabel titleLineOfInteraction1 = new WrappingLabel();

			titleLineOfInteraction1.setText("LINE OF INTERACTION");
			titleLineOfInteraction1.setForegroundColor(ColorConstants.black);

			
			baseLayoutLineOfInteraction0.add(titleLineOfInteraction1,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode()
							.DPtoLP(2), getMapMode().DPtoLP(130), getMapMode()
							.DPtoLP(20)));

			PolylineShape lineOfInteraction1 = new PolylineShape();
			lineOfInteraction1.setLineWidth(2);
			lineOfInteraction1.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(9)));
			lineOfInteraction1.addPoint(new Point(getMapMode().DPtoLP(900),
					getMapMode().DPtoLP(9)));
			lineOfInteraction1.setForegroundColor(ColorConstants.black);

			baseLayoutLineOfInteraction0.add(lineOfInteraction1, new Rectangle(
					getMapMode().DPtoLP(130), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(900), getMapMode().DPtoLP(20)));

			RectangleFigure baseLayoutOnStageEmployeeAction0 = new RectangleFigure();
			baseLayoutOnStageEmployeeAction0.setAlpha(0);
			baseLayoutOnStageEmployeeAction0.setLineWidth(0);

			this.add(baseLayoutOnStageEmployeeAction0, new Rectangle(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(320),
					getMapMode().DPtoLP(1000), getMapMode().DPtoLP(150)));
			baseLayoutOnStageEmployeeAction0.setLayoutManager(new XYLayout());

			RectangleFigure titleBaseLayoutRowOnStageEmployeeAction1 = new RectangleFigure();
			titleBaseLayoutRowOnStageEmployeeAction1.setAlpha(0);
			titleBaseLayoutRowOnStageEmployeeAction1.setOutline(false);
			titleBaseLayoutRowOnStageEmployeeAction1.setFill(false);
			titleBaseLayoutRowOnStageEmployeeAction1.setOpaque(false);

			baseLayoutOnStageEmployeeAction0
					.add(titleBaseLayoutRowOnStageEmployeeAction1,
							new Rectangle(getMapMode().DPtoLP(0), getMapMode()
									.DPtoLP(0), getMapMode().DPtoLP(100),
									getMapMode().DPtoLP(150)));
			titleBaseLayoutRowOnStageEmployeeAction1
					.setLayoutManager(new XYLayout());

			WrappingLabel titleOnStageEmployeeAction2 = new WrappingLabel();

			titleOnStageEmployeeAction2.setText("ON STAGE\nEMPLOYEE ACTION");
			titleOnStageEmployeeAction2.setTextWrap(true);
			titleOnStageEmployeeAction2
					.setForegroundColor(ColorConstants.black);

			titleOnStageEmployeeAction2
					.setFont(TITLEONSTAGEEMPLOYEEACTION2_FONT);

			titleBaseLayoutRowOnStageEmployeeAction1.add(
					titleOnStageEmployeeAction2, new Rectangle(getMapMode()
							.DPtoLP(5), getMapMode().DPtoLP(60), getMapMode()
							.DPtoLP(100), getMapMode().DPtoLP(150)));

			fFigureCompartmentBaseLayoutRowOnStageEmployeeAction = new RectangleFigure();
			fFigureCompartmentBaseLayoutRowOnStageEmployeeAction.setAlpha(0);
			fFigureCompartmentBaseLayoutRowOnStageEmployeeAction
					.setOutline(false);
			fFigureCompartmentBaseLayoutRowOnStageEmployeeAction.setFill(false);
			fFigureCompartmentBaseLayoutRowOnStageEmployeeAction
					.setOpaque(false);

			baseLayoutOnStageEmployeeAction0.add(
					fFigureCompartmentBaseLayoutRowOnStageEmployeeAction,
					new Rectangle(getMapMode().DPtoLP(100), getMapMode()
							.DPtoLP(-1), getMapMode().DPtoLP(900), getMapMode()
							.DPtoLP(151)));
			fFigureCompartmentBaseLayoutRowOnStageEmployeeAction
					.setLayoutManager(new StackLayout());

			

			RectangleFigure baseLayoutLineOfVisibility0 = new RectangleFigure();
			baseLayoutLineOfVisibility0.setAlpha(0);
			baseLayoutLineOfVisibility0.setLineWidth(0);

			this.add(
					baseLayoutLineOfVisibility0,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(
							470), getMapMode().DPtoLP(1000), getMapMode()
							.DPtoLP(20)));
			baseLayoutLineOfVisibility0.setLayoutManager(new XYLayout());

			WrappingLabel titleLineOfVisibility1 = new WrappingLabel();

			titleLineOfVisibility1.setText("LINE OF VISIBILITY");
			titleLineOfVisibility1.setForegroundColor(ColorConstants.black);

			baseLayoutLineOfVisibility0.add(titleLineOfVisibility1,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode()
							.DPtoLP(2), getMapMode().DPtoLP(120), getMapMode()
							.DPtoLP(20)));

			PolylineShape lineOfVisibility1 = new PolylineShape();
			lineOfVisibility1.setLineWidth(2);
			lineOfVisibility1.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(9)));
			lineOfVisibility1.addPoint(new Point(getMapMode().DPtoLP(880),
					getMapMode().DPtoLP(9)));
			lineOfVisibility1.setForegroundColor(ColorConstants.black);

			baseLayoutLineOfVisibility0.add(lineOfVisibility1, new Rectangle(
					getMapMode().DPtoLP(120), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(900), getMapMode().DPtoLP(20)));

			RectangleFigure baseLayoutBackStageEmployeeAction0 = new RectangleFigure();
			baseLayoutBackStageEmployeeAction0.setAlpha(0);
			baseLayoutBackStageEmployeeAction0.setLineWidth(0);

			this.add(baseLayoutBackStageEmployeeAction0, new Rectangle(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(490),
					getMapMode().DPtoLP(1000), getMapMode().DPtoLP(150)));
			baseLayoutBackStageEmployeeAction0.setLayoutManager(new XYLayout());

			RectangleFigure titleBaseLayoutRowBackStageEmployeeAction1 = new RectangleFigure();
			titleBaseLayoutRowBackStageEmployeeAction1.setAlpha(0);
			titleBaseLayoutRowBackStageEmployeeAction1.setOutline(false);
			titleBaseLayoutRowBackStageEmployeeAction1.setFill(false);
			titleBaseLayoutRowBackStageEmployeeAction1.setOpaque(false);

			baseLayoutBackStageEmployeeAction0
					.add(titleBaseLayoutRowBackStageEmployeeAction1,
							new Rectangle(getMapMode().DPtoLP(0), getMapMode()
									.DPtoLP(0), getMapMode().DPtoLP(100),
									getMapMode().DPtoLP(150)));
			titleBaseLayoutRowBackStageEmployeeAction1
					.setLayoutManager(new XYLayout());

			WrappingLabel titleBackStageEmployeeAction2 = new WrappingLabel();

			titleBackStageEmployeeAction2
					.setText("BACK STAGE\nEMPLOYEE ACTION");
			titleBackStageEmployeeAction2.setTextWrap(true);
			titleBackStageEmployeeAction2
					.setForegroundColor(ColorConstants.black);

			titleBackStageEmployeeAction2
					.setFont(TITLEBACKSTAGEEMPLOYEEACTION2_FONT);

			titleBaseLayoutRowBackStageEmployeeAction1.add(
					titleBackStageEmployeeAction2, new Rectangle(getMapMode()
							.DPtoLP(5), getMapMode().DPtoLP(60), getMapMode()
							.DPtoLP(100), getMapMode().DPtoLP(150)));

			fFigureCompartmentBaseLayoutRowBackStageEmployeeAction = new RectangleFigure();
			fFigureCompartmentBaseLayoutRowBackStageEmployeeAction.setAlpha(0);
			fFigureCompartmentBaseLayoutRowBackStageEmployeeAction
					.setOutline(false);
			fFigureCompartmentBaseLayoutRowBackStageEmployeeAction
					.setFill(false);
			fFigureCompartmentBaseLayoutRowBackStageEmployeeAction
					.setOpaque(false);

			baseLayoutBackStageEmployeeAction0.add(
					fFigureCompartmentBaseLayoutRowBackStageEmployeeAction,
					new Rectangle(getMapMode().DPtoLP(100), getMapMode()
							.DPtoLP(-1), getMapMode().DPtoLP(900), getMapMode()
							.DPtoLP(151)));
			fFigureCompartmentBaseLayoutRowBackStageEmployeeAction
					.setLayoutManager(new StackLayout());

			RectangleFigure baseLayoutLineOfInternalInteraction0 = new RectangleFigure();
			baseLayoutLineOfInternalInteraction0.setAlpha(0);
			baseLayoutLineOfInternalInteraction0.setLineWidth(0);

			this.add(baseLayoutLineOfInternalInteraction0, new Rectangle(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(640),
					getMapMode().DPtoLP(1000), getMapMode().DPtoLP(20)));
			baseLayoutLineOfInternalInteraction0
					.setLayoutManager(new XYLayout());

			WrappingLabel titleLineOfInternalInteraction1 = new WrappingLabel();

			titleLineOfInternalInteraction1
					.setText("LINE OF INTERNAL INTERACTION");
			titleLineOfInternalInteraction1
					.setForegroundColor(ColorConstants.black);

			baseLayoutLineOfInternalInteraction0.add(
					titleLineOfInternalInteraction1, new Rectangle(getMapMode()
							.DPtoLP(5), getMapMode().DPtoLP(2), getMapMode()
							.DPtoLP(200), getMapMode().DPtoLP(20)));

			PolylineShape lineOfInternalInteraction1 = new PolylineShape();
			lineOfInternalInteraction1.setLineWidth(2);
			lineOfInternalInteraction1.addPoint(new Point(getMapMode()
					.DPtoLP(0), getMapMode().DPtoLP(9)));
			lineOfInternalInteraction1.addPoint(new Point(getMapMode().DPtoLP(
					800), getMapMode().DPtoLP(9)));
			lineOfInternalInteraction1.setForegroundColor(ColorConstants.black);

			baseLayoutLineOfInternalInteraction0.add(
					lineOfInternalInteraction1, new Rectangle(getMapMode()
							.DPtoLP(200), getMapMode().DPtoLP(0), getMapMode()
							.DPtoLP(900), getMapMode().DPtoLP(20)));

			RectangleFigure baseLayoutSupportProcess0 = new RectangleFigure();
			baseLayoutSupportProcess0.setAlpha(0);
			baseLayoutSupportProcess0.setLineWidth(0);

			this.add(
					baseLayoutSupportProcess0,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(
							660), getMapMode().DPtoLP(1000), getMapMode()
							.DPtoLP(150)));
			baseLayoutSupportProcess0.setLayoutManager(new XYLayout());

			RectangleFigure titleBaseLayoutRowSupportProcess1 = new RectangleFigure();
			titleBaseLayoutRowSupportProcess1.setAlpha(0);
			titleBaseLayoutRowSupportProcess1.setOutline(false);
			titleBaseLayoutRowSupportProcess1.setFill(false);
			titleBaseLayoutRowSupportProcess1.setOpaque(false);

			baseLayoutSupportProcess0.add(titleBaseLayoutRowSupportProcess1,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode()
							.DPtoLP(0), getMapMode().DPtoLP(100), getMapMode()
							.DPtoLP(150)));
			titleBaseLayoutRowSupportProcess1.setLayoutManager(new XYLayout());

			WrappingLabel titleSupportProcess2 = new WrappingLabel();

			titleSupportProcess2.setText("SUPPORT\nPROCCESS");
			titleSupportProcess2.setTextWrap(true);
			titleSupportProcess2.setForegroundColor(ColorConstants.black);

			titleSupportProcess2.setFont(TITLESUPPORTPROCESS2_FONT);

			titleBaseLayoutRowSupportProcess1.add(
					titleSupportProcess2,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode().DPtoLP(
							60), getMapMode().DPtoLP(100), getMapMode().DPtoLP(
							150)));

			fFigureCompartmentBaseLayoutRowSupportProcess = new RectangleFigure();
			fFigureCompartmentBaseLayoutRowSupportProcess.setAlpha(0);
			fFigureCompartmentBaseLayoutRowSupportProcess.setOutline(false);
			fFigureCompartmentBaseLayoutRowSupportProcess.setFill(false);
			fFigureCompartmentBaseLayoutRowSupportProcess.setOpaque(false);

			baseLayoutSupportProcess0.add(
					fFigureCompartmentBaseLayoutRowSupportProcess,
					new Rectangle(getMapMode().DPtoLP(100), getMapMode()
							.DPtoLP(-1), getMapMode().DPtoLP(900), getMapMode()
							.DPtoLP(151)));
			fFigureCompartmentBaseLayoutRowSupportProcess
					.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentBaseLayoutRowPhysicalEvidence() {
			return fFigureCompartmentBaseLayoutRowPhysicalEvidence;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentBaseLayoutRowCustomerAction() {
			return fFigureCompartmentBaseLayoutRowCustomerAction;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentBaseLayoutRowOnStageEmployeeAction() {
			return fFigureCompartmentBaseLayoutRowOnStageEmployeeAction;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentBaseLayoutRowBackStageEmployeeAction() {
			return fFigureCompartmentBaseLayoutRowBackStageEmployeeAction;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentBaseLayoutRowSupportProcess() {
			return fFigureCompartmentBaseLayoutRowSupportProcess;
		}

	}

	/**
	 * @generated
	 */
	static final Font TITLEPHYSICALEVIDENCE2_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font TITLECUSTOMERACTION2_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font TITLEONSTAGEEMPLOYEEACTION2_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font TITLEONSTAGEEMPLOYEEACTION3_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font TITLEBACKSTAGEEMPLOYEEACTION2_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font TITLESUPPORTPROCESS2_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
