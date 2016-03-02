package serviceblueprint.diagram.edit.parts.utils;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.widgets.Shell;

public class ServiceBlueprintEditPartUtils {
	public static Point calculateCenterLocationForShell(Shell shell, Point sizeWindow)
	{
		// Create a new point
		Point calculatedPoint = new Point(0, 0);
		
		// Calculate the middle of the display
		int middleHorizontalDisplay = shell.getBounds().width / 2;
		int middleVerticalDisplay = shell.getBounds().height / 2;
		
		// Calculate the centered position by the size of the display and the window to center
		calculatedPoint.x = middleHorizontalDisplay - (sizeWindow.x/2);
		calculatedPoint.y = middleVerticalDisplay - (sizeWindow.y/2);
		
		// Return the centered point
		return calculatedPoint;
	}
}
