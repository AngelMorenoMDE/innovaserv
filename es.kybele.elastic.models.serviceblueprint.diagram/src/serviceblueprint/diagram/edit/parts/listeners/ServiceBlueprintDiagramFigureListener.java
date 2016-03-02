package serviceblueprint.diagram.edit.parts.listeners;

import java.awt.Cursor;
import java.util.List;

import javax.swing.text.StyleConstants.ColorConstants;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ResizableCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import serviceblueprint.diagram.edit.parts.ServiceBlueprintDiagramEditPart;
import serviceblueprint.diagram.edit.parts.ServiceBlueprintDiagramEditPart.ServiceBlueprintDiagramFigure;

public class ServiceBlueprintDiagramFigureListener implements FigureListener {

	@Override
	public void figureMoved(IFigure source) {
		if (source instanceof DefaultSizeNodeFigure)
		{
			DefaultSizeNodeFigure dsnf = (DefaultSizeNodeFigure) source;
			
			if (dsnf.getChildren().size() > 0)
			{
				if (dsnf.getChildren().get(0) instanceof ServiceBlueprintDiagramFigure)
				{
					ServiceBlueprintDiagramFigure sbdf = 
							(ServiceBlueprintDiagramFigure) dsnf.getChildren().get(0);

					int widthParent = dsnf.getSize().width;
					IMapMode mapMode = sbdf.getMapModeFigure();

					sbdf.setLocation(new Point(dsnf.getBounds().x, dsnf.getBounds().y));
					dsnf.add(sbdf, 0);
					
					if (sbdf.getChildren().get(0) instanceof RectangleFigure)
					{
						
						RectangleFigure child = (RectangleFigure) sbdf.getChildren().get(0);
						child.setSize(mapMode.DPtoLP(widthParent),mapMode.DPtoLP(150));
						child.setLocation(new Point(dsnf.getBounds().x, dsnf.getBounds().y));
						sbdf.add(child, 0);
						RectangleFigure childChild = (RectangleFigure) child.getChildren().get(1);
						childChild.setSize(mapMode.DPtoLP(widthParent-100),mapMode.DPtoLP(150));
						childChild.setLocation(new Point(dsnf.getBounds().x+100, dsnf.getBounds().y));
						child.add(childChild, 1);			

					}
					if (sbdf.getChildren().get(1) instanceof RectangleFigure)
					{
						
						RectangleFigure child = (RectangleFigure) sbdf.getChildren().get(1);						
						child.setSize(mapMode.DPtoLP(widthParent),mapMode.DPtoLP(4));
						child.setLocation(new Point(dsnf.getBounds().x, dsnf.getBounds().y+150));
						sbdf.add(child, 1);		
						PolylineShape childChild = (PolylineShape) child.getChildren().get(0);						
						childChild.getPoints().removePoint(1);
						childChild.getPoints().addPoint(widthParent, 2);		
						childChild.setSize(mapMode.DPtoLP(widthParent),mapMode.DPtoLP(4));
						childChild.setLocation(new Point(child.getBounds().x, child.getBounds().y));
						child.add(childChild, 0);	
					}
					if (sbdf.getChildren().get(2) instanceof RectangleFigure)
					{
						
						RectangleFigure child = (RectangleFigure) sbdf.getChildren().get(2);
						child.setSize(mapMode.DPtoLP(widthParent),mapMode.DPtoLP(152));
						child.setLocation(new Point(dsnf.getBounds().x, dsnf.getBounds().y+152));
						sbdf.add(child, 2);					
						RectangleFigure childChild = (RectangleFigure) child.getChildren().get(1);
						childChild.setSize(mapMode.DPtoLP(widthParent-100),mapMode.DPtoLP(152));
						childChild.setLocation(new Point(child.getBounds().x+100, child.getBounds().y));
						child.add(childChild, 1);			
					}					
					if (sbdf.getChildren().get(3) instanceof RectangleFigure)
					{
						
						RectangleFigure child = (RectangleFigure) sbdf.getChildren().get(3);						
						child.setSize(mapMode.DPtoLP(widthParent),mapMode.DPtoLP(20));
						child.setLocation(new Point(dsnf.getBounds().x, dsnf.getBounds().y+300));
						sbdf.add(child, 3);						
						PolylineShape childChild = (PolylineShape) child.getChildren().get(1);						
						childChild.getPoints().removePoint(1);
						childChild.getPoints().addPoint(widthParent, 9);		
						childChild.setSize(mapMode.DPtoLP(widthParent-100),mapMode.DPtoLP(20));
						childChild.setLocation(new Point(child.getBounds().x+130, child.getBounds().y));
						child.add(childChild, 1);						
					}
					if (sbdf.getChildren().get(4) instanceof RectangleFigure)
					{						
						RectangleFigure child = (RectangleFigure) sbdf.getChildren().get(4);
						child.setSize(mapMode.DPtoLP(widthParent),mapMode.DPtoLP(170));
						child.setLocation(new Point(dsnf.getBounds().x, dsnf.getBounds().y+310));
						child.setForegroundColor(new Color(Display.getCurrent(), 255,255,255));
						sbdf.add(child, 4);
						RectangleFigure childChild = (RectangleFigure) child.getChildren().get(1);
						childChild.setSize(mapMode.DPtoLP(widthParent-100),mapMode.DPtoLP(170));
						childChild.setLocation(new Point(child.getBounds().x+100, child.getBounds().y));
						child.add(childChild, 1);			
					}
					if (sbdf.getChildren().get(5) instanceof RectangleFigure)
					{						
						RectangleFigure child = (RectangleFigure) sbdf.getChildren().get(5);						
						child.setSize(mapMode.DPtoLP(widthParent),mapMode.DPtoLP(20));
						child.setLocation(new Point(dsnf.getBounds().x, dsnf.getBounds().y+470));
						sbdf.add(child, 5);
						PolylineShape childChild = (PolylineShape) child.getChildren().get(1);						
						childChild.getPoints().removePoint(1);
						childChild.getPoints().addPoint(widthParent, 9);		
						childChild.setSize(mapMode.DPtoLP(widthParent-100),mapMode.DPtoLP(20));
						childChild.setLocation(new Point(child.getBounds().x+120, child.getBounds().y));
						child.add(childChild, 1);						
					}		
					if (sbdf.getChildren().get(6) instanceof RectangleFigure)
					{
						
						RectangleFigure child = (RectangleFigure) sbdf.getChildren().get(6);
						child.setSize(mapMode.DPtoLP(widthParent),mapMode.DPtoLP(170));
						child.setLocation(new Point(dsnf.getBounds().x, dsnf.getBounds().y+480));
						child.setForegroundColor(new Color(Display.getCurrent(), 255,255,255));
						sbdf.add(child, 6);
						RectangleFigure childChild = (RectangleFigure) child.getChildren().get(1);
						childChild.setSize(mapMode.DPtoLP(widthParent-100),mapMode.DPtoLP(170));
						childChild.setLocation(new Point(child.getBounds().x+100, child.getBounds().y));
						child.add(childChild, 1);			

					}	
					if (sbdf.getChildren().get(7) instanceof RectangleFigure)
					{						
						RectangleFigure child = (RectangleFigure) sbdf.getChildren().get(7);						
						child.setSize(mapMode.DPtoLP(widthParent),mapMode.DPtoLP(20));
						child.setLocation(new Point(dsnf.getBounds().x, dsnf.getBounds().y+640));
						sbdf.add(child, 7);						
						PolylineShape childChild = (PolylineShape) child.getChildren().get(1);						
						childChild.getPoints().removePoint(1);
						childChild.getPoints().addPoint(widthParent, 9);		
						childChild.setSize(mapMode.DPtoLP(widthParent-100),mapMode.DPtoLP(20));
						childChild.setLocation(new Point(child.getBounds().x+200, child.getBounds().y));
						child.add(childChild, 1);	
					}
					if (sbdf.getChildren().get(8) instanceof RectangleFigure)
					{						
						RectangleFigure child = (RectangleFigure) sbdf.getChildren().get(8);
						child.setSize(mapMode.DPtoLP(widthParent),mapMode.DPtoLP(150));
						child.setLocation(new Point(dsnf.getBounds().x, dsnf.getBounds().y+650));
						child.setForegroundColor(new Color(Display.getCurrent(), 255,255,255));
						sbdf.add(child, 8);						
						RectangleFigure childChild = (RectangleFigure) child.getChildren().get(1);
						childChild.setSize(mapMode.DPtoLP(widthParent-100),mapMode.DPtoLP(150));
						childChild.setLocation(new Point(child.getBounds().x+100, child.getBounds().y));
						child.add(childChild, 1);			
					}					
				}
			}
			
			dsnf.setLocation(dsnf.getBounds().getTopLeft());
			
		}
	}

}
