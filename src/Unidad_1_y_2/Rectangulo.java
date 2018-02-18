package Unidad_1_y_2;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Rectangulo extends  JApplet{
    public void init(){
        //initialize drawing colors
    }

    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.red);
        g2.draw(new Rectangle2D.Double(30,30,100,80));

        g2.setPaint(Color.black);
        g2.fill(new Rectangle2D.Double(30,150,100,80));

        g2.setPaint(Color.red);
        g2.draw(new RoundRectangle2D.Double(250,30,100,80,30,30));

        g2.setPaint(Color.black);
        g2.draw(new RoundRectangle2D.Double(250,150,100,80,30,30));

        //Recorta la figura
        g2.setPaint(Color.green);
        g2.setClip(250,300,50,50);
        g2.fill(new RoundRectangle2D.Double(250,300,100,80,30,30));

        g2.setClip(30,300,50,50);
        g2.fill(new Rectangle2D.Double(30,300,100,80));
    }
}
