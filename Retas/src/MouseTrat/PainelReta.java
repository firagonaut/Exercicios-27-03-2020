package MouseTrat;

import java.awt.Graphics;
import java.awt.List;
import java.util.LinkedList;

import javax.swing.JPanel;

public class PainelReta extends JPanel {
	
	private LinkedList<Reta> retas = new LinkedList<Reta>();

	public void addReta(Reta reta) {
		retas.add(reta);
		this.repaint();
	}
	
	public void paint(Graphics g) {
		for (Reta r : retas) {
			r.draw(g);
		}
	}
}
