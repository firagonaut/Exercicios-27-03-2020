package Geom;

import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JPanel;



public class PainelCirc extends JPanel{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  LinkedList<Circulo> circulos = new LinkedList<Circulo>();

	
	
	public void clearCirc() {
	   circulos.clear();
	}

	public void addCirc(Circulo circulo) {
		circulos.add(circulo);
		this.repaint();
	}
	
	public void paint(Graphics g) {
		for (Circulo c : circulos) {
			c.draw(g);
		
			
		}
	}

}
