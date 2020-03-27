package MouseTrat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Mouse extends MouseAdapter{
	int x1,x2,y1,y2,count=0;
	

	

	private PainelReta painel;
	
	 public Mouse(PainelReta painel) {
		 super();
		 this.painel=painel;
	 }
	
	
	@Override
    public void mouseClicked(MouseEvent e) {
	
		
		if (count == 0) {
			
		
		x1 = e.getX();
		y1 = e.getY();
		
		System.out.print(x1+" "+y1+"\n");
		
		
		count++;
		}
		else {
			x2 = x1;
			y2 = y1;
			
			x1 = e.getX();
			y1 = e.getY();
			
			count++;
			
			System.out.print(x2+" "+y2+"\n");
			
			
			
			
			
			painel.addReta(new Reta(x1-12,y1-12,x2-12,y2-12,Color.RED));
			
		}
		
		
       
	}
	




public void saySomething() {
	
	
}






}

