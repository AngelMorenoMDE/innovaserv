package serviceblueprint.diagram.edit.parts.listeners;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;

import serviceblueprint.diagram.edit.parts.wizards.ServiceBlueprintMultiLineEditor;


public class DoubleClickEditPartMouseListener implements MouseListener {

	protected EditPart _editPart = null; 
	protected long lastClick = System.currentTimeMillis();
	protected WrappingLabel _label = null;
	
	
	public DoubleClickEditPartMouseListener(EditPart editPart, WrappingLabel label) {		
		_editPart = editPart;
		_label = label;
	}
	
	public void mousePressed(MouseEvent me) {
		// TODO Auto-generated method stub
		long actualClick = System.currentTimeMillis();

		if ((actualClick - lastClick)<1000)
		{						
			new ServiceBlueprintMultiLineEditor(_editPart).open();
		}
		_label.setFocus(false);
		lastClick = actualClick;
	}
	
	public void mouseReleased(MouseEvent me) {
		lastClick = System.currentTimeMillis();
		_label.setFocus(false);
	}

	public void mouseDoubleClicked(MouseEvent me) {
		lastClick = System.currentTimeMillis();
		_label.setFocus(false);
	}

}
