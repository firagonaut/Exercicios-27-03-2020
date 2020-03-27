package Circs;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo {
	private int raio;
	private float circ;
	private int x;
	private int y;
	private Color color;
	
	
	
	public Circulo(int raio, float circ,int x,int y,Color color) {
		super();
		this.raio=raio;
		this.circ=circ;
		this.y=y;
		this.x=x;
		this.color=color;
	}
	


	public float getCirc() {
		return circ;
	}
	public void setCirc(int raio) {
		this.circ = (float) (2*raio*raio*Math.PI);
	}
	
	public int getRaio() {
		return raio;
	}
	public void setRaio(int raio) {
		this.raio = raio;
	}
	

public Color getColor() {
	return color;
}

public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, 2*raio, 2*raio);
}
	

}
