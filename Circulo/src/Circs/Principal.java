

package Circs;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Principal {
	
	public static void main(String[] args) {
	
		 JFrame frame = new JFrame("Chat Frame");
	     PainelCirc painel = new PainelCirc();
	     
	     JPanel panel = new JPanel(); // the panel is not visible in output
	     
	     JButton button = new JButton("LIMPAR");
	   
	    
	     frame.getContentPane().add(BorderLayout.SOUTH, panel);
	     frame.getContentPane().add(BorderLayout.CENTER, painel);

	     
	  
	     
	     frame.setSize(1050, 1050);
	     frame.addMouseListener(new Mouse(painel));
	     
	     
	     
	    
	     
	     frame.setVisible(true);
	     
		
		
		
		
		
		
	}

}
