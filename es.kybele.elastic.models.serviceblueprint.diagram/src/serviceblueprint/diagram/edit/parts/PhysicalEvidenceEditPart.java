package serviceblueprint.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import serviceblueprint.BackStageEmployeeAction;
import serviceblueprint.PhysicalEvidence;
import serviceblueprint.diagram.edit.parts.listeners.DoubleClickEditPartMouseListener;
import serviceblueprint.diagram.edit.policies.PhysicalEvidenceItemSemanticEditPolicy;

/**
 * @generated
 */
public class PhysicalEvidenceEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

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
	public PhysicalEvidenceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PhysicalEvidenceItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new PhysicalEvidenceFigure(this);
	}

	/**
	 * @generated
	 */
	public PhysicalEvidenceFigure getPrimaryShape() {
		return (PhysicalEvidenceFigure) primaryShape;
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
	public class PhysicalEvidenceFigure extends RectangleFigure {
		protected EditPart _editpart = null;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePhysicalEvidenceContentFigure;

		/**
		 * @generated
		 */
		public PhysicalEvidenceFigure(EditPart editpart) {
			_editpart = editpart;
			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(ColorConstants.white);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(60)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));			
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePhysicalEvidenceContentFigure = new WrappingLabel();

			EObject _eobject = ((View) _editpart.getModel()).getElement();
			if (_eobject instanceof PhysicalEvidence)
			{
				fFigurePhysicalEvidenceContentFigure.setText(((PhysicalEvidence)_eobject).getContent());
			}
			else
				fFigurePhysicalEvidenceContentFigure.setText("Define the\nPhysicalEvidence\nAction");

			fFigurePhysicalEvidenceContentFigure.addMouseListener(new DoubleClickEditPartMouseListener(_editpart, fFigurePhysicalEvidenceContentFigure));
			
			fFigurePhysicalEvidenceContentFigure.setPreferredSize(100, 60);
			fFigurePhysicalEvidenceContentFigure.setMinimumSize(new Dimension(100, 60));			
			
			fFigurePhysicalEvidenceContentFigure
				.setFont(FFIGUREPHYSICALEVIDENCECONTENTFIGURE_FONT);
			fFigurePhysicalEvidenceContentFigure.setTextWrap(true);

			this.add(fFigurePhysicalEvidenceContentFigure, new Rectangle(
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(90), getMapMode().DPtoLP(50)));			

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePhysicalEvidenceContentFigure() {
			return fFigurePhysicalEvidenceContentFigure;
		}
		
		public void update()
		{
			EObject _eobject = ((View) _editpart.getModel()).getElement();
			if (_eobject instanceof PhysicalEvidence)
			{
				fFigurePhysicalEvidenceContentFigure.setText(((PhysicalEvidence)_eobject).getContent());
			}
			else
				fFigurePhysicalEvidenceContentFigure.setText("Define the\nPhysicalEvidence\nAction");

		}
		public void update(EObject _eobject)
		{

			if (_eobject instanceof PhysicalEvidence)
			{
				fFigurePhysicalEvidenceContentFigure.setText(((PhysicalEvidence)_eobject).getContent());
			}
			else
				fFigurePhysicalEvidenceContentFigure.setText("Define the\nPhysicalEvidence\nAction");

		}			

	}
	
	static final Font FFIGUREPHYSICALEVIDENCECONTENTFIGURE_FONT = new Font(
			Display.getCurrent(), "Arial", 10, SWT.NORMAL);

}
