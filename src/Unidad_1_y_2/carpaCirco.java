package Unidad_1_y_2;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class carpaCirco extends JApplet{
    public void init(){
        //initialize drawing colors
    }
    public void paint(Graphics g){

        /**L1.setPaint(Color.black);
         L1.draw(new Line2D.Double(100, 200, 250, 90));

         Graphics2D L2 = (Graphics2D) g;
         L2.setPaint(Color.black);
         L2.draw(new Line2D.Double(250, 90, 400, 200));

         Graphics2D L3 = (Graphics2D) g;
         L3.setPaint(Color.black);
         L3.draw(new Line2D.Double(100, 200, 400, 200));**/

        Graphics2D L1 = (Graphics2D) g;
        Polygon polygon = new Polygon();
        polygon.addPoint(100,200);
        polygon.addPoint(250,90);
        polygon.addPoint(250,90);
        polygon.addPoint(400,200);
        polygon.addPoint(100,200);
        polygon.addPoint(400,200);
        L1.setPaint(Color.yellow);
        L1.fillPolygon(polygon);

        Graphics2D R1 = (Graphics2D) g;
        R1.setPaint(Color.magenta);
        R1.fill(new Rectangle2D.Double(100,200,50,200));

        Graphics2D R2 = (Graphics2D) g;
        R2.setPaint(Color.yellow);
        R2.fill(new Rectangle2D.Double(150,200,50,200));

        Graphics2D R3 = (Graphics2D) g;
        R3.setPaint(Color.green);
        R3.fill(new Rectangle2D.Double(200,200,50,100));

        Graphics2D R4 = (Graphics2D) g;
        R4.setPaint(Color.red);
        R4.fill(new Rectangle2D.Double(250,200,50,100));

        Graphics2D R5 = (Graphics2D) g;
        R5.setPaint(Color.cyan);
        R5.fill(new Rectangle2D.Double(300,200,50,200));

        Graphics2D R6 = (Graphics2D) g;
        R6.setPaint(Color.pink);
        R6.fill(new Rectangle2D.Double(350,200,50,200));

        Graphics2D R7 = (Graphics2D) g;
        R7.setPaint(Color.white);
        R7.fill(new Rectangle2D.Double(200,300,100,100));
    }

}
