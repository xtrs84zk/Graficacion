package Unidad_1_y_2.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.QuadCurve2D;

public class sol extends JApplet{
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.gray);
        g2.fillOval(50,50,81,81);
        g2.setColor(Color.yellow);
        g2.fillOval(50,50,80,80);
        g2.setColor(Color.gray);
        g2.fillOval(95,90,8,8);
        g2.setColor(Color.gray);
        g2.fillOval(80,90,8,8);
        QuadCurve2D sonrisa = new QuadCurve2D.Double();
        sonrisa.setCurve(60,90,70,115,90,115);
        g2.draw(sonrisa);
        QuadCurve2D sonrisa2 = new QuadCurve2D.Double();
        sonrisa2.setCurve(90,115,115,115,120,90);
        g2.draw(sonrisa2);
        QuadCurve2D rayo1 = new QuadCurve2D.Double();
        rayo1.setCurve(70,48,70,38,75,30);
        g2.draw(rayo1);
        QuadCurve2D rayo2 = new QuadCurve2D.Double();
        rayo2.setCurve(80,48,80,38,90,30);
        g2.draw(rayo2);
        QuadCurve2D rayo3 = new QuadCurve2D.Double();
        rayo3.setCurve(100,48,100,38,105,30);
        g2.draw(rayo3);
    }
}
