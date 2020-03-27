package MouseTrat;

import java.awt.BorderLayout;
import java.awt.Paint;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import java.awt.MouseInfo;



public class IH extends JFrame {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public static void main(String[] args) {

	 JFrame frame = new JFrame("Chat Frame");
     PainelReta painel = new PainelReta();
     
     JPanel panel = new JPanel(); // the panel is not visible in output
     
     
   
    
     frame.getContentPane().add(BorderLayout.SOUTH, panel);
     frame.getContentPane().add(BorderLayout.CENTER, painel);
     
   
     
  
     
     frame.setSize(550, 550);
     frame.addMouseListener(new Mouse(painel));
     
     
     
    
     
     frame.setVisible(true);
     
     
     
}
}


