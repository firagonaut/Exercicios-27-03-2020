package MouseTrat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Reta {
	private int X1;
	private int Y1;
	private int X2;
	private int Y2;
	private Color color;
	
public Reta(int x1, int y1, int x2, int y2,Color color) {
	super();
	this.setX1(x1);
	this.setY1(y1);
	this.setX2(x2);
	this.setY2(y2);
	this.color=color;
	
			
}



public Color getColor() {
	return color;
}

public void draw(Graphics g) {
		g.setColor(color);
		g.drawLine(X1, Y1, X2, Y2);
}
	


public int getX1() {
	return X1;
}



public void setX1(int x1) {
	X1 = x1;
}



public int getY1() {
	return Y1;
}



public void setY1(int y1) {
	Y1 = y1;
}



public int getX2() {
	return X2;
}



public void setX2(int x2) {
	X2 = x2;
}



public int getY2() {
	return Y2;
}



public void setY2(int y2) {
	Y2 = y2;
}

}

