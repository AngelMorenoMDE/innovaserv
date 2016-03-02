package serviceblueprint.diagram.edit.parts.listeners;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import serviceblueprint.BackStageEmployeeAction;
import serviceblueprint.CustomerAction;
import serviceblueprint.OnStageEmployeeAction;
import serviceblueprint.PhysicalEvidence;
import serviceblueprint.ServiceBlueprintNode;
import serviceblueprint.SupportProcess;
import serviceblueprint.diagram.edit.parts.BackStageEmployeeActionEditPart;
import serviceblueprint.diagram.edit.parts.CustomerActionEditPart;
import serviceblueprint.diagram.edit.parts.OnStageEmployeeActionEditPart;
import serviceblueprint.diagram.edit.parts.PhysicalEvidenceEditPart;
import serviceblueprint.diagram.edit.parts.SupportProcessEditPart;


public class SetChangesServiceBlueprintNode implements SelectionListener {

	protected ServiceBlueprintNode _serviceBlueprintNode = null;
	protected Shell _parentShell = null;
	protected Text _textContent = null;
	protected EditPart _editPart = null;
	public SetChangesServiceBlueprintNode(EditPart editPart, ServiceBlueprintNode canvasAnnotation, Text textContent, Shell parentShell) 
	{
		_editPart = editPart;
		_serviceBlueprintNode = canvasAnnotation;
		_parentShell = parentShell;
		_textContent = textContent;
		
	}
	
	@Override
	public void widgetSelected(SelectionEvent e) {
		// TODO Auto-generated method stub
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(_serviceBlueprintNode);
		domain.getCommandStack().execute(new RecordingCommand(domain)
		{
		    @Override
		    protected void doExecute() 
		    {
		    	if (_serviceBlueprintNode instanceof PhysicalEvidence)
		    	{

		    		((PhysicalEvidence)_serviceBlueprintNode).setContent(_textContent.getText());
		    		if (_editPart instanceof PhysicalEvidenceEditPart)
		    		{
		    			((PhysicalEvidenceEditPart) _editPart).getPrimaryShape().update(_serviceBlueprintNode);
		    		}
		    	}
		    	if (_serviceBlueprintNode instanceof CustomerAction)
		    	{

	    		
		    		((CustomerAction)_serviceBlueprintNode).setContent(_textContent.getText());
		    		if (_editPart instanceof CustomerActionEditPart)
		    		{
		    			((CustomerActionEditPart) _editPart).getPrimaryShape().update(_serviceBlueprintNode);
		    		}			    		
		    	}		    		
		    	if (_serviceBlueprintNode instanceof OnStageEmployeeAction)
		    	{
		    		
		    		((OnStageEmployeeAction)_serviceBlueprintNode).setContent(_textContent.getText());
		    		if (_editPart instanceof OnStageEmployeeActionEditPart)
		    		{
		    			((OnStageEmployeeActionEditPart) _editPart).getPrimaryShape().update(_serviceBlueprintNode);
		    		}		    		
		    	}		    		
		    	if (_serviceBlueprintNode instanceof BackStageEmployeeAction)
		    	{
		   		    		
		    		((BackStageEmployeeAction)_serviceBlueprintNode).setContent(_textContent.getText());
		    		if (_editPart instanceof BackStageEmployeeActionEditPart)
		    		{
		    			((BackStageEmployeeActionEditPart) _editPart).getPrimaryShape().update(_serviceBlueprintNode);
		    		}		    		
		    	}		    		
		    	if (_serviceBlueprintNode instanceof SupportProcess)
		    	{
		   			    		
		    		((SupportProcess)_serviceBlueprintNode).setContent(_textContent.getText());
		    		if (_editPart instanceof SupportProcessEditPart)
		    		{
		    			((SupportProcessEditPart) _editPart).getPrimaryShape().update(_serviceBlueprintNode);
		    		}		    		
		    	}		    		
		    		
		    		
		    	_parentShell.close();
		    }
		});
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		// TODO Auto-generated method stub

	}

}
