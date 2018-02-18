package Unidad_1_y_2;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class curvas extends JApplet{

    public void paint(Graphics g) {
        QuadCurve2D shape = new QuadCurve2D.Double();
        shape.setCurve(250, 100, 350, 150, 250, 250);
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(shape);

        Font font = new Font("Serif",Font.PLAIN,24);
        g2.setFont(font);
        g2.drawString("Ejemplo de",20,30);
        g2.drawString("QuadCurve2D.Curve",20,70);
    }
}
