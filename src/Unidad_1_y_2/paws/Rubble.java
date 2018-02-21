package Unidad_1_y_2.paws;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.QuadCurve2D;

public class Rubble extends JApplet{
    public void paint(Graphics g) {
        //curva del g1 al g3 del gorro
        QuadCurve2D g1g3 = new QuadCurve2D.Double();
        g1g3.setCurve(230, 116, 111, 70, 72, 73);
        Graphics2D g1 = (Graphics2D) g;
        g1.draw(g1g3);
        //curva del g4 al g6 del gorro
        QuadCurve2D g4g6 = new QuadCurve2D.Double();
        g4g6.setCurve(187, 89,85, 60,72,73);
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(g4g6);
    }
}
