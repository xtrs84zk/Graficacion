package Unidad_1_y_2.proyecto;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class Pajaritos extends JApplet  {
	public void paint(Graphics g){
		Graphics2D g2=(Graphics2D)g;
		//Pajarito 1
		g2.setColor(Color.black);
		 g2.setStroke(new BasicStroke(2.5f));
		GeneralPath p12 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		 p12.moveTo(230,66);
        p12.curveTo(242,66,243,66,254,72);
        p12.curveTo(254,72,257,68,268,50);
        p12.curveTo(268,50,254,52,250,63);
        p12.curveTo(250,63,239,57,230,66);
        g2.draw(p12);
        p12.closePath();  
		
        //PAJARITO 2 
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(2.5f));
		GeneralPath p1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		 p1.moveTo(255,165);
        p1.curveTo(255,165,261,158,274,162);
        p1.curveTo(274,162,275,148,284,145);
        p1.curveTo(284,145,271,141,269,155);
        p1.curveTo(269,155,258,155,255,165);
        g2.draw(p1);
        p1.closePath();  
        
        //pajartio 3
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(2.5f));
		GeneralPath p2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		 p2.moveTo(329,91);
        p2.curveTo(329,91,341,97,345,109);
        p2.curveTo(345,109,360,106,367,113 );
        p2.curveTo(367,113,364,98,350,101);
        p2.curveTo(350,101,344,89,331,90);
        g2.draw(p2);
        p2.closePath();  
        
        //pajarito 4
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(2.5f));
		GeneralPath p3 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		 p3.moveTo(404,43);
        p3.curveTo(404,43,414,51,417,63);
        p3.curveTo(417,63,430,53,444,50);
        p3.curveTo(444,50,432,45,419,56);
        p3.curveTo(419,56,415,47,405,44);
        g2.draw(p3);
        p3.closePath();  
        
 }
}
