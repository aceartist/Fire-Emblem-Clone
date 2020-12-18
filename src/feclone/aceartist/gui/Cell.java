package feclone.aceartist.gui;

import javax.swing.JButton;

public class Cell extends JButton {
	
	private int xCoord, yCoord;
	private boolean hasUnit;
	
	public Cell(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	
	
	public void setUnitStatus(boolean s) {
		hasUnit = s;
	}

}
