package Unidad_1_y_2.proyecto;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class Palmera extends JApplet {
	AffineTransform at = new AffineTransform();
	private int altoyancho;
	private int xCoord, yCoord;

	public Palmera(){}

	public Palmera(int aa, int xIncial, int yInicial){
		altoyancho = aa;
		xCoord = xIncial;
		yCoord = yInicial;
	}
	public void  trasladar(int x){
		at.translate(x,0);
	}
	public void rotar(int x){
		at.rotate(Math.toRadians(x),180,180);
	}

	public void escalar(double x){
		at.scale(x,x);
	}

	public void sesgar(double x){
		at.shear(x,0.0);
	}

	public void mostrar(){
		repaint();
	}
	public void paint(Graphics g){
		Graphics2D g2=(Graphics2D)g;
	   //tronco
		g.setColor(new Color(199,125,40));
		 int x[]={59,124,116,96,59};
	     int y[]={219,222,94,94,219};
	     g.drawPolygon(x,y,x.length);
	     g.fillPolygon(x,y,x.length);
	   //hoja 1 
	     g.setColor(new Color(0,204,0));
	     int x1[]={113,144,147,149,167,171,180,186,176,155,124,113};
	     int y1[]={93,123,106,127,143,129,154,141,111,85,85,93};
	     g.drawPolygon(x1,y1,x1.length);
	     g.fillPolygon(x1,y1,x1.length);
	   //hoja 2
	     int x2[]={113,164,189,216,223,197,206,183,165,175,125};
	     int y2[]={93,59,58,67,78,70,80,84,73,83,87};
	     g.drawPolygon(x2,y2,x2.length);
	     g.fillPolygon(x2,y2,x2.length);
	   //hoja 3
	     int x3[]={125,166,159,178,191,183,214,199,168,125,114};
	     int y3[]={87,58,52,51,45,34,37,22,22,42,91};
	     g.drawPolygon(x3,y3,x3.length);
	     g.fillPolygon(x3,y3,x3.length);
	   //hoja 4
	     int x4[]={125,118,110,112,103,99,96,87,86,80,70,67,74,64,65,82,68,113};
	     int y4[]={42,30,36,25,12,19,8,3,7,2,0,9,19,15,27,42,36,92};
	     g.drawPolygon(x4,y4,x4.length);
	     g.fillPolygon(x4,y4,x4.length);
	   //hoja 5
	     int x5[]={77,42,12,1,28,15,40,61,46,63,104,113,77};
	     int y5[]={47,35,38,46,46,54,64,58,66,76,93,93,47};
	     g.drawPolygon(x5,y5,x5.length);
	     g.fillPolygon(x5,y5,x5.length); 
	   //hoja 6
	     int x6[]={113,59,35,14,9,32,26,51,64,58,113};
	     int y6[]={93,74,83,100,112,97,110,104,88,103,93};
	     g.drawPolygon(x6,y6,x6.length);
	     g.fillPolygon(x6,y6,x6.length);  
	   //cocos
	     g2.setColor(new Color(199,125,40));
	     g2.draw(new Ellipse2D.Double(90,66,30,24));
	     g2.draw(new Ellipse2D.Double(79,84,31,27));
	     g2.draw(new Ellipse2D.Double(102,84,30,29));
	     g2.setPaint(new Color(153,102,0));
	     g2.fill(new Ellipse2D.Double(90,66,30,24));
	     g2.fill(new Ellipse2D.Double(79,84,31,27));
	     g2.fill(new Ellipse2D.Double(102,84,30,29));
	}
}