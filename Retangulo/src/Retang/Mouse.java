package Retang;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;





public class Mouse extends MouseAdapter{
	int x1,x2,x3,x4,y1,y2,y3,y4,count=0,r1,r2,hx,hy,wx,wy,height,width;
	

	

	private PainelRetang painel;
	
	 public Mouse(PainelRetang painel) {
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
			 
			hx = x3-x1;
			hy = y3-y1;
			
			wx = x2-x1;
			wy = y2-y1;
			
			height = hx+hy;
			width = wx+wy;
			 
			 
			x4 = wx;	
			y4 = hy;
			
			
			
			 float perimetro=(float) 2*height+2*width;
			 
			 if (perimetro<0) {
				 perimetro-=2*perimetro;
			 }
			 
			 System.out.print("PSE:"+x2+","+y2+"\nPerimetro:"+perimetro+"\n"+"PID:"+x4+","+y4+"\n\n");
			 
			 
			 painel.addRetang(new Retangulo(x1,y1,width,height,Color.BLACK));
			 
			 count=0;
		 }
	 }
		 
		
		 
	 
	

}


