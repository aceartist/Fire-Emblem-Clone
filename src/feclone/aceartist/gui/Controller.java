package feclone.aceartist.gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controller extends MouseAdapter {

	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		getCoords(x,y);		
	}
	
	public int[] getCoords(int x, int y) {
		if((x > 25 && y > 25) && (x < 775 && y < 775))
		{
			System.out.println("Clicked in cell (" + (x-25)/75 + ", " + (y-25)/75 + ")");
			
		}
		else
		{
			System.out.println("Clicked outside.");
		}
	
		return null;
	}
	
	
	
	
	
}
