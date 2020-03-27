package Geom;

import java.awt.Color;
import java.awt.Graphics;

public class Triangulo {
	private int a1;
	private int b1;
	private int c1;
	private int a2;
	private int b2;
	private int c2;
	private Color color;
	
	
	public Triangulo(int a1, int a2, int b1, int b2, int c1, int c2, Color color) {
        this.a1=a1;
        this.a2=a2;
        this.b1=b1;
        this.b2=b2;
        this.c1=c1;
        this.c2=c2;
        this.color=color;
	}
	

	
	public Color getColor() {
		return color;
	}

	public void draw(Graphics g) {
			g.setColor(color);
			g.drawPolygon(new int[] {a1,b1,c1}, new int[] {a2,b2,c2}, 3);
		
	}
		
	
}
