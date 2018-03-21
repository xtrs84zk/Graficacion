package Unidad_1_y_2.ejemplos;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
public class estrella extends JApplet{
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.RED);
        g2.setStroke(new BasicStroke(70.0f));
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(200,50);
        path.lineTo(270,300);
        path.lineTo(100,120);
        path.lineTo(300,120);
        path.lineTo(130,300);
        path.closePath();
        g2.draw(path);
    }
}
