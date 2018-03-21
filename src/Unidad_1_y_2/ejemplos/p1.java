package Unidad_1_y_2.ejemplos;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class p1 extends JApplet{
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.red);
        g2.draw(new Line2D.Double(0,0,100,100));
    }
}
