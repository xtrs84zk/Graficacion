package Unidad_1_y_2.paws;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Marshall extends JApplet{
    public Marshall(){
        JFrame frame = new JFrame();
        frame.setSize(500,500);
    }
    public void paint(Graphics g) {
        //ojo izquierdo
        //g.drawOval(216,155,15,20);

        //nariz
        QuadCurve2D n1 = new QuadCurve2D.Double();
        n1.setCurve(172,197,183,181,171,173);
        Graphics2D nariz = (Graphics2D) g;
        nariz.draw(n1);
        QuadCurve2D n2 = new QuadCurve2D.Double();
        n2.setCurve(171,173,161,178,160,188);
        nariz.draw(n2);
    }
}
