package serviceblueprint.diagram.edit.parts.wizards;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import serviceblueprint.BackStageEmployeeAction;
import serviceblueprint.CustomerAction;
import serviceblueprint.OnStageEmployeeAction;
import serviceblueprint.PhysicalEvidence;
import serviceblueprint.ServiceBlueprintNode;
import serviceblueprint.SupportProcess;
import serviceblueprint.diagram.edit.parts.listeners.SetChangesServiceBlueprintNode;
import serviceblueprint.diagram.edit.parts.utils.ServiceBlueprintEditPartUtils;


public class ServiceBlueprintMultiLineEditor {

	protected EditPart _editPart = null;
	
	public ServiceBlueprintMultiLineEditor(EditPart editPart)
	{
		_editPart = editPart;
	}
	
	public void open()
	{
		Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getActiveEditor().getSite().getShell();
		Shell childShell = new Shell(parent, SWT.SYSTEM_MODAL | SWT.CLOSE);
		childShell.setSize(250, 350);
		Point pSize = new Point(childShell.getSize().x, childShell.getSize().y);
		Point pCenter = ServiceBlueprintEditPartUtils.calculateCenterLocationForShell(parent, pSize);
		childShell.setLocation(pCenter.x, pCenter.y);		
		
		RowLayout rowLayout = new RowLayout();
		rowLayout.marginLeft = 5;
		rowLayout.marginRight = 5;
		rowLayout.fill = true;
		rowLayout.type = SWT.VERTICAL;
		rowLayout.justify = true;
		childShell.setLayout(rowLayout);
		
		EObject _eobject = ((View) _editPart.getModel()).getElement();
		String contentAction = "";
		
		
		if (_eobject instanceof PhysicalEvidence)
		{
			PhysicalEvidence action = (PhysicalEvidence) _eobject;
			contentAction = (action.getContent()== null) ? "<Introduce\nyour\naction>" : action.getContent();
		}
		if (_eobject instanceof CustomerAction)
		{
			CustomerAction action = (CustomerAction) _eobject;
			contentAction = (action.getContent()== null) ? "<Introduce\nyour\naction>" : action.getContent();
		}		
		if (_eobject instanceof OnStageEmployeeAction)
		{
			OnStageEmployeeAction action = (OnStageEmployeeAction) _eobject;
			contentAction = (action.getContent()== null) ? "<Introduce\nyour\naction>" : action.getContent();
		}
		if (_eobject instanceof BackStageEmployeeAction)
		{
			BackStageEmployeeAction action = (BackStageEmployeeAction) _eobject;
			contentAction = (action.getContent()== null) ? "<Introduce\nyour\naction>" : action.getContent();
		}	
		if (_eobject instanceof SupportProcess)
		{
			SupportProcess action = (SupportProcess) _eobject;
			contentAction = (action.getContent()== null) ? "<Introduce\nyour\naction>" : action.getContent();
		}			
		
		Label label = new Label(childShell, SWT.BOLD);
		label.setText("Introduzca el texto de la anotación");
		label.setLayoutData(new RowData(220, 20));
		
		Text text = new Text(childShell, SWT.MULTI);
		text.setLayoutData(new RowData(220, 200));
		text.setText(contentAction);
		Button buttonAccept = new Button(childShell, SWT.PUSH);
		buttonAccept.setText("Guardar Anotación");
		buttonAccept.setLayoutData(new RowData(220, 30));
		
		Button buttonCancel = new Button(childShell, SWT.PUSH);
		buttonCancel.setText("Cancelar");
		buttonCancel.setLayoutData(new RowData(220, 30));
		
		
		
		buttonAccept.addSelectionListener(new SetChangesServiceBlueprintNode(_editPart, (ServiceBlueprintNode) _eobject, text, childShell));
		buttonCancel.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				childShell.close();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				childShell.close();
			}
		});
		childShell.open();
	}
}
