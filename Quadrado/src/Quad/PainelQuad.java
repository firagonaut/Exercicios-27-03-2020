package Quad;

import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JPanel;



public class PainelQuad extends JPanel {
	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LinkedList<Quadrado> quadrados = new LinkedList<Quadrado>();

	public void addQuad(Quadrado quadrado) {
		quadrados.add(quadrado);
		this.repaint();
	}
	
	public void paint(Graphics g) {
		for (Quadrado q : quadrados) {
			q.draw(g);
		}
	}

}
