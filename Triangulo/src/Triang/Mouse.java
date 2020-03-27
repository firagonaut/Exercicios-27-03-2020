package Triang;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Quad.Quadrado;
import Retang.Retangulo;





public class Mouse extends MouseAdapter{
	int x1,x2,x3,x4,y1,y2,y3,y4,count=0;
	

	

	private PainelTriangulo painel;
	
	 public Mouse(PainelTriangulo painel) {
		 super();
		 this.painel=painel;
	 }
	
	

public void mousePressed(MouseEvent e) {
		 
		 x1 = e.getX();
		 y1 = e.getY();
		 
		 
		 
		 System.out.print(x1+" "+y1+"\n");
		 
		 
	 }
	 
	 public void mouseReleased(MouseEvent e) {
		 
		 if(count==0) {
			 x2 = e.getX();
			 y2 = e.getY();
			 count++;
			 System.out.print(x2+" "+y2+"\n");
		 }
		 else {
			 
			x3 = e.getX();
			y3 = e.getY();
			 
			
			 
	
			
			
			 System.out.print("PSE:"+x2+","+y2+"\nPerimetro:"+"\n"+"PID:"+x4+","+y4+"\n\n");
			 
			 
			 painel.addTri(new Triangulo(x1,y1,x2,y2,x3,y3,Color.GREEN));
			 count=0;
		 }
	 }
}
	 
		
		 
	 
	




