package Geom;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import MouseTrat.Mouse;

;

public class Principal extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public static void main(String[] args) {

	 JFrame frame = new JFrame("Plano de desenhos");
     PainelReta painelReta = new PainelReta();
     PainelTriangulo painelTriang = new PainelTriangulo();
     PainelCirc painelCirc = new PainelCirc();
     PainelRetang painelRetang = new PainelRetang();
     PainelQuad painelQuad = new PainelQuad();
     
     JPanel panel = new JPanel();
     
     
   
    
     frame.getContentPane().add(BorderLayout.SOUTH, panel);
    
     
     
   
     JButton retas = new JButton("Retas");
     JButton triangulos = new JButton("Triangulos");
     JButton quadrados = new JButton("Quadrados");
     JButton retangulos = new JButton("Retangulos");
     JButton circulos = new JButton("Circulos");
     JButton remove = new JButton("Limpar");
     
   
     panel.add(retas);
     panel.add(triangulos);
     panel.add(quadrados);
     panel.add(retangulos);
     panel.add(circulos);
     panel.add(remove);
     
     
     
     
     
     class ListenerReta implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			frame.getContentPane().remove(painelQuad);
			frame.getContentPane().remove(painelCirc);
			frame.getContentPane().remove(painelRetang);
			frame.getContentPane().remove(painelTriang);
		    frame.repaint();
			frame.getContentPane().add(BorderLayout.CENTER, painelReta);
			frame.addMouseListener(new MouseReta(painelReta));
			frame.removeMouseListener(new MouseReta(painelReta));
	
		}

		
			}
     	
     
     
     class ListenerQuad implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.removeMouseListener(new MouseTriang(painelTriang));
			frame.removeMouseListener(new MouseRetang(painelRetang));
			frame.removeMouseListener(new MouseReta(painelReta));
			frame.removeMouseListener(new MouseCirc(painelCirc));
			frame.getContentPane().remove(painelReta);
			frame.getContentPane().remove(painelCirc);
			frame.getContentPane().remove(painelRetang);
			frame.getContentPane().remove(painelTriang);
			  frame.repaint();
			frame.getContentPane().add(BorderLayout.CENTER, painelQuad);
			 frame.addMouseListener(new MouseQuad(painelQuad));
			
		}

			
				
     	
     }
     
class ListenerTriang implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.removeMouseListener(new MouseQuad(painelQuad));
		frame.removeMouseListener(new MouseRetang(painelRetang));
		frame.removeMouseListener(new MouseReta(painelReta));
		frame.removeMouseListener(new MouseCirc(painelCirc));
		frame.getContentPane().remove(painelReta);
		frame.getContentPane().remove(painelCirc);
		frame.getContentPane().remove(painelRetang);
		frame.getContentPane().remove(painelQuad);
		  frame.repaint();
		  frame.getContentPane().add(BorderLayout.CENTER, painelTriang);
		 frame.addMouseListener(new MouseTriang(painelTriang));
	}

	
	}
	


class ListenerRetang implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.removeMouseListener(new MouseCirc(painelCirc));
		frame.removeMouseListener(new MouseTriang(painelTriang));
		frame.removeMouseListener(new MouseReta(painelReta));
		frame.removeMouseListener(new MouseQuad(painelQuad));
		frame.getContentPane().remove(painelReta);
		frame.getContentPane().remove(painelCirc);
		frame.getContentPane().remove(painelTriang);
		frame.getContentPane().remove(painelQuad);
		  frame.repaint();
	     frame.getContentPane().add(BorderLayout.CENTER, painelRetang);
		 frame.addMouseListener(new MouseRetang(painelRetang));
		 frame.removeMouseListener(new MouseRetang(painelRetang));
		 
	}

		
	
}

  class ListenerCirc implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.removeMouseListener(new MouseQuad(painelQuad));
		frame.removeMouseListener(new MouseTriang(painelTriang));
		frame.removeMouseListener(new MouseReta(painelReta));
		frame.removeMouseListener(new MouseRetang(painelRetang));
		frame.getContentPane().remove(painelReta);
		frame.getContentPane().remove(painelRetang);
		frame.getContentPane().remove(painelTriang);
		frame.getContentPane().remove(painelQuad);
		  frame.repaint();
		   frame.getContentPane().add(BorderLayout.CENTER, painelCirc);
		 frame.addMouseListener(new MouseCirc(painelCirc));
		 frame.removeMouseListener(new MouseCirc(painelCirc));
	}

	
}
  
  class ListenerRemover implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.removeMouseListener(new MouseQuad(painelQuad));
			frame.removeMouseListener(new MouseTriang(painelTriang));
			frame.removeMouseListener(new MouseReta(painelReta));
			frame.removeMouseListener(new MouseRetang(painelRetang));
			frame.removeMouseListener(new MouseCirc(painelCirc));
			frame.getContentPane().remove(painelCirc);
			painelCirc.clearCirc();
			frame.getContentPane().remove(painelReta);
			painelReta.clearRetas();
			frame.getContentPane().remove(painelRetang);
			painelRetang.clearRetang();
			frame.getContentPane().remove(painelTriang);
			painelTriang.clearTriang();
			frame.getContentPane().remove(painelQuad);
			painelQuad.clearQuadrados();
			  frame.repaint();
			  
			
		}

		
	}


  retas.addActionListener(new ListenerReta());
  circulos.addActionListener(new ListenerCirc());
  quadrados.addActionListener(new ListenerQuad());
  retangulos.addActionListener(new ListenerRetang());
  triangulos.addActionListener(new ListenerTriang());
  remove.addActionListener(new ListenerRemover());

     
     frame.setSize(950, 950);
     
     
     
     
    
     
     frame.setVisible(true);
     
     
     
}
}


