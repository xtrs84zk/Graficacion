package Unidad_1_y_2.proyecto;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.QuadCurve2D;

public class Sol extends JPanel {
    AffineTransform at = new AffineTransform();
//    private int altoyancho;
//    private int xCoord, yCoord;
JButton t, r, e ,s;
    private Color color = Color.yellow;

    public Sol(){
    }

    //    public Sol(int aa, int xIncial, int yInicial){
//        altoyancho = aa;
//        xCoord = xIncial;
//        yCoord = yInicial;
//    }

    public void mostrar(){
        repaint();
    }

    public void  trasladar(int x){
        at.translate(x,0);
    }

    public void rotar(int x){
        at.rotate(Math.toRadians(x),180,180);
    }

    public void escalar(double x){
        at.scale(x,x);
    }

    public void sesgar(double x){
        at.shear(x,0.0);
    }

    public void cambiarColor(Color color) {
        this.color = color;
    }

    public void paint(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setTransform(at);
        g2.setColor(Color.gray);
        g2.fillOval(67,71,78,74);
        //g2.setColor(Color.yellow);
        g2.setColor(color);
        g2.fillOval(68,72,76,72);
        g2.setColor(Color.gray);
        g2.fillOval(96,109,6,6);
        g2.setColor(Color.gray);
        g2.fillOval(109,104,6,6);
        QuadCurve2D sonrisa = new QuadCurve2D.Double();
        sonrisa.setCurve(80,116,94,130,105,129);
        g2.draw(sonrisa);
        QuadCurve2D sonrisa2 = new QuadCurve2D.Double();
        sonrisa2.setCurve(105,129,128,130,130,99);
        g2.draw(sonrisa2);
        g2.drawLine(144,109,157,109);
        QuadCurve2D brazoDerecho = new QuadCurve2D.Double();
        brazoDerecho.setCurve(157,109,168,102,176,89);
        g2.draw(brazoDerecho);
        QuadCurve2D brazoIzquierdo = new QuadCurve2D.Double();
        brazoIzquierdo.setCurve(73,130,64,137,51,140);
        g2.draw(brazoIzquierdo);
        QuadCurve2D brazoIzquierdo2 = new QuadCurve2D.Double();
        brazoIzquierdo2.setCurve(51,140,38,136,29,124);
        g2.draw(brazoIzquierdo2);
        //g2.setColor(Color.yellow);
        g2.setColor(color);
//        g2.fillOval(151,92,11,6);
//        g2.fillOval(144,84,11,6);
//        g2.fillOval(135,74,11,6);
//        g2.fillOval(127,63,11,6);

        g2.setColor(Color.gray);
        QuadCurve2D rayo1 = new QuadCurve2D.Double();
        rayo1.setCurve(89,68,86,64,86,60);
        g2.draw(rayo1);
        QuadCurve2D rayo2 = new QuadCurve2D.Double();
        rayo2.setCurve(101,64,98,60,98,56);
        g2.draw(rayo2);
        QuadCurve2D rayo3 = new QuadCurve2D.Double();
        rayo3.setCurve(117,64,117,59,118,55);
        g2.draw(rayo3);
        QuadCurve2D rayo4 = new QuadCurve2D.Double();
        rayo4.setCurve(128,68,130,64,133,61);
        g2.draw(rayo4);
        QuadCurve2D rayo5 = new QuadCurve2D.Double();
        rayo5.setCurve(137,78,140,75,144,73);
        g2.draw(rayo5);
        QuadCurve2D rayo6 = new QuadCurve2D.Double();
        rayo6.setCurve(146,87,148,85,151,84);
        g2.draw(rayo6);
        QuadCurve2D rayo7 = new QuadCurve2D.Double();
        rayo7.setCurve(71,78,68,75,66,71);
        g2.draw(rayo7);
        QuadCurve2D rayo8 = new QuadCurve2D.Double();
        rayo8.setCurve(65,87,60,83,57,79);
        g2.draw(rayo8);
        QuadCurve2D rayo9 = new QuadCurve2D.Double();
        rayo9.setCurve(58,101,55,100,50,100);
        g2.draw(rayo9);
        QuadCurve2D rayo10 = new QuadCurve2D.Double();
        rayo10.setCurve(55,113,52,114,48,114);
        g2.draw(rayo10);
        QuadCurve2D rayo11 = new QuadCurve2D.Double();
        rayo11.setCurve(57,123,54,126,52,128);
        g2.draw(rayo11);
        QuadCurve2D rayo12 = new QuadCurve2D.Double();
        rayo12.setCurve(69,141,65,144,61,147);
        g2.draw(rayo12);
        QuadCurve2D rayo13 = new QuadCurve2D.Double();
        rayo13.setCurve(81,151,78,155,74,160);
        g2.draw(rayo13);
        QuadCurve2D rayo14 = new QuadCurve2D.Double();
        rayo14.setCurve(99,154,98,159,96,164);
        g2.draw(rayo14);
        QuadCurve2D rayo15 = new QuadCurve2D.Double();
        rayo15.setCurve(120,154,120,159,120,164);
        g2.draw(rayo15);
        QuadCurve2D rayo16 = new QuadCurve2D.Double();
        rayo16.setCurve(143,134,148,136,152,141);
        g2.draw(rayo16);
        QuadCurve2D rayo17 = new QuadCurve2D.Double();
        rayo17.setCurve(152,122,156,122,159,123);
        g2.draw(rayo17);
    }
}