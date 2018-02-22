package Unidad_1_y_2.paws;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Rubble extends JApplet{
    public void paint(Graphics g) {
        //curva del g4 al g5 del gorro
        QuadCurve2D c2 = new QuadCurve2D.Double();
        c2.setCurve(135,114,154,102,183,98);
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(c2);
        //curva del g4 al g5 del gorro
        QuadCurve2D c1 = new QuadCurve2D.Double();
        c1.setCurve(183,98,145,87,119,90);
        Graphics2D g1 = (Graphics2D) g;
        g1.draw(c1);
        //
        QuadCurve2D c3 = new QuadCurve2D.Double();
        c3.setCurve(183,98,202,105,258,131);
        Graphics2D g3 = (Graphics2D) g;
        g3.draw(c3);
        //
        QuadCurve2D c5 = new QuadCurve2D.Double();
        c5.setCurve(119,90,128,79,155,81);
        Graphics2D g5 = (Graphics2D) g;
        g5.draw(c5);
        //
        QuadCurve2D c7 = new QuadCurve2D.Double();
        c7.setCurve(155,81,180,86,222,106);
        Graphics2D g7 = (Graphics2D) g;
        g7.draw(c7);
        //curva del g4 al g5 del gorro
        QuadCurve2D c6 = new QuadCurve2D.Double();
        c6.setCurve(119,90,120,102,135,114);
        Graphics2D g6 = (Graphics2D) g;
        g6.draw(c6);
        //
        QuadCurve2D c8 = new QuadCurve2D.Double();
        c8.setCurve(258,131,268,118,276,122);
        Graphics2D g8 = (Graphics2D) g;
        g8.draw(c8);
        //
        QuadCurve2D c9 = new QuadCurve2D.Double();
        c9.setCurve(140,81,144,60,162,54);
        Graphics2D g9 = (Graphics2D) g;
        g9.draw(c9);
        //
        QuadCurve2D c10 = new QuadCurve2D.Double();
        c10.setCurve(155,81,165,35,180,26);
        Graphics2D g10 = (Graphics2D) g;
        g10.draw(c10);
        //
        QuadCurve2D c11 = new QuadCurve2D.Double();
        c11.setCurve(180,26,185,24,196,23);
        Graphics2D g11 = (Graphics2D) g;
        g11.draw(c11);
        //
        QuadCurve2D c12 = new QuadCurve2D.Double();
        c12.setCurve(196,23,213,26,232,37);
        Graphics2D g12 = (Graphics2D) g;
        g12.draw(c12);
        //
        QuadCurve2D c13 = new QuadCurve2D.Double();
        c13.setCurve(232,37,236,39,245,55);
        Graphics2D g13 = (Graphics2D) g;
        g13.draw(c13);
        //
        QuadCurve2D c14 = new QuadCurve2D.Double();
        c14.setCurve(186,90,197,41,222,30);
        Graphics2D g14 = (Graphics2D) g;
        g14.draw(c14);
        //
        Graphics2D c17 = (Graphics2D) g;
        CubicCurve2D g17 = new CubicCurve2D.Double();
        g17.setCurve(245,55,226,45,200,63,190,92);
        c17.draw(g17);
        //
        QuadCurve2D c18 = new QuadCurve2D.Double();
        c18.setCurve(245,55,260,65,278,83);
        Graphics2D g18 = (Graphics2D) g;
        g18.draw(c18);
        //
        QuadCurve2D c19 = new QuadCurve2D.Double();
        c19.setCurve(278,83,282,92,281,122);
        Graphics2D g19 = (Graphics2D) g;
        g19.draw(c19);
        //
        Graphics2D g20 = (Graphics2D) g;
        g20.draw(new Line2D.Double(276,122,281,122));
    }
}
