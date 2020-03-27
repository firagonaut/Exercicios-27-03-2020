package Geom;

import java.awt.Color;
import java.awt.Graphics;

public class Retangulo {
	private int width;
	private int height;
	private int x;
	private int y;
	private Color color;
	
	
	public Retangulo(int x, int y,int height, int width,Color color) {
        this.height=height;
        this.width=width;
		this.x=x;
		this.y=y;
		this.color=color;
	}
	

	
	public Color getColor() {
		return color;
	}

	public void draw(Graphics g) {
			g.setColor(color);
			g.fillRect(x, y, height, width);
		
	}
		
	
}
