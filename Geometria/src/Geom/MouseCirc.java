package Geom;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;




public class MouseCirc extends MouseAdapter{
	int x1,x2,y1,y2,count=0,r1,r2,rMain;
	

	

	private PainelCirc painel;
	
	 public MouseCirc(PainelCirc painel) {
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
		 
		 r1 = x2-x1;
		 r2 = y2-y1;
		 
		 rMain = r1+r2;
		 float Circunf=(float) (2*rMain*rMain*Math.PI);
		 
		 System.out.print("Raio:"+rMain+"\nCircunferencia:"+Circunf+"\n"+"Centro:"+x1+","+y1+"\n\n");
		 
		 
		 painel.addCirc(new Circulo(rMain,Circunf,x1-12,y1-12,Color.BLACK));
		 
	 }
	 
	
	
	




public void saySomething() {
	
	
}






}