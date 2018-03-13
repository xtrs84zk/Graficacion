package Unidad_1_y_2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rect extends JPanel
{
    private Color colorRect;

    public  Rect(Color color){
        colorRect = Color.green;
    }

    public void cambiarColor(Color color){
        colorRect = color;
    }

    public  void paint(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(colorRect);
        g2.fill(new Rectangle2D.Double(60,30,100,80));
    }


    public void mostrar() {
        repaint();
    }
}
