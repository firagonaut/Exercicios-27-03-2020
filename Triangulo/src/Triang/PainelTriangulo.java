package Triang;

import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JPanel;



public class PainelTriangulo extends JPanel {
	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LinkedList<Triangulo> triangulos = new LinkedList<Triangulo>();

	public void addTri(Triangulo triangulo) {
		triangulos.add(triangulo);
		this.repaint();
	}
	
	public void paint(Graphics g) {
		for (Triangulo t : triangulos) {
			t.draw(g);
		}
	}

}
