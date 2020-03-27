package Geom;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;





public class MouseQuad extends MouseAdapter{
	int x1,x2,x3,x4,y1,y2,y3,y4,count=0,r1,r2,hx,hy,wx,wy,height,width;
	

	

	private PainelQuad painel;
	
	 public MouseQuad(PainelQuad painel) {
		 super();
		 this.painel=painel;
	 }
	
	
public void mousePressed(MouseEvent e) {
		 
		 x1 = e.getX();
		 y1 = e.getY();
		 
		 
		 
		 System.out.print(x1+" "+y1+"\n");
		 
		 
	 }
	 
	 public void mouseReleased(MouseEvent e) {
		 
			 x2 = e.getX();
			 y2 = e.getY();
		
			 System.out.print(x2+" "+y2+"\n");
	
	
			
			wx = x2-x1;
			wy = y2-y1;
			
			height = wx+wy;
			width = height;
			 
			 
			x4 = wx;
			y4 = hy;
			
			
			
			 float perimetro=(float) 4*height;
			 
			 if (perimetro<0) {
				 perimetro-=2*perimetro;
			 }
			 
			 System.out.print("PSE:"+x2+","+y2+"\nPerimetro:"+perimetro+"\n"+"PID:"+x4+","+y4+"\n\n");
			 
			 
			 painel.addQuad(new Quadrado(x1,y1,width,height,Color.BLACK));
			 
			 count=0;
		 }
	 }
		 
		
		 
	 
	




