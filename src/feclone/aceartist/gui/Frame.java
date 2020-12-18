package feclone.aceartist.gui;
import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Frame extends Canvas {
	
	public Frame() {
		JFrame frame = new JFrame("Fire Emblem Clone");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1500, 900);
		frame.add(this);
		addMouseListener(new Controller());
		
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		int x = 25, y = 25;
		int width = 75, height = 75;
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				g.drawRect(x, y, width, height);
				x+=75;
			}
			y+=75;
			x=25;
		}
		
	}
}
