package Unidad_1_y_2.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.QuadCurve2D;

public class Fondo extends JApplet{
    private int altoyancho;
    private int xCoord, yCoord;

    public Fondo(){}

    public Fondo(int aa, int xIncial, int yInicial){
        altoyancho = aa;
        xCoord = xIncial;
        yCoord = yInicial;
    }
    public void mostrar(){
        repaint();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.cyan);
        QuadCurve2D m1 = new QuadCurve2D.Double();
        m1.setCurve(0,252,26,246,50,250);
        g2.draw(m1);

        QuadCurve2D m2 = new QuadCurve2D.Double();
        m2.setCurve(50,250,65,253,90,247);
        g2.draw(m2);

        QuadCurve2D m3 = new QuadCurve2D.Double();
        m3.setCurve(90,247,112,252,133,247);
        g2.draw(m3);

        QuadCurve2D m4 = new QuadCurve2D.Double();
        m4.setCurve(133,247,165,257,174,253);
        g2.draw(m4);

        QuadCurve2D m5 = new QuadCurve2D.Double();
        m5.setCurve(174,253,212,246,252,253);
        g2.draw(m5);

        QuadCurve2D m6 = new QuadCurve2D.Double();
        m6.setCurve(252,253,297,247,349,254);
        g2.draw(m6);

        QuadCurve2D m7 = new QuadCurve2D.Double();
        m7.setCurve(349,254,392,259,447,251);
        g2.draw(m7);

        QuadCurve2D m8 = new QuadCurve2D.Double();
        m8.setCurve(447,251,515,244,539,253);
        g2.draw(m8);

        QuadCurve2D m9 = new QuadCurve2D.Double();
        m9.setCurve(539,253,650,251,1000,250);
        g2.draw(m9);

        g2.fill(m1);
        g2.fill(m2);
        //g2.fill(m3);
        g2.fill(m4);
        g2.fill(m5);
        g2.fill(m6);
       // g2.fill(m7);
        g2.fill(m8);
        g2.fill(m9);

        g2.fillRect(0,257,1000,80);


        Color arena = new Color (255,244,134);
        g2.setColor(arena);

        QuadCurve2D a1 = new QuadCurve2D.Double();
        a1.setCurve(0,316,145,312,285,325);
        g2.draw(a1);
        g2.fill(a1);

        QuadCurve2D a2 = new QuadCurve2D.Double();
        a2.setCurve(285,325,333,317,516,322);
        g2.draw(a2);
        g2.fill(a2);

        QuadCurve2D a3 = new QuadCurve2D.Double();
        a3.setCurve(516,322,650,324,1000,322);
        g2.draw(a3);
        g2.fill(a3);

        g2.fillRect(0,322,1000,575);
        g2.fillRect(0,317,160,50);

        g2.drawLine(0,368,1000,368);

        g2.setColor(Color.lightGray);
        g2.fillRect(0,575,1000,300);
    }
}
