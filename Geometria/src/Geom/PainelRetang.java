package Geom;

import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JPanel;



public class PainelRetang extends JPanel {
	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LinkedList<Retangulo> retangulos = new LinkedList<Retangulo>();

	public void clearRetang() {
		retangulos.clear();
	}
	
	
	public void addRetang(Retangulo retangulo) {
		retangulos.add(retangulo);
		this.repaint();
	}
	
	public void paint(Graphics g) {
		for (Retangulo r : retangulos) {
			r.draw(g);
		}
	}

}
