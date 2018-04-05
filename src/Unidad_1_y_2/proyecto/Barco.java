package Unidad_1_y_2.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.QuadCurve2D;

public class Barco extends JPanel {
    AffineTransform at = new AffineTransform();
    private int altoyancho;
    private int xCoord, yCoord;

    public Barco(){}

    public Barco(int aa, int xIncial, int yInicial){
        altoyancho = aa;
        xCoord = xIncial;
        yCoord = yInicial;
    }

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

    public void paint(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setTransform(at);
        g2.setColor(Color.BLUE);
        g2.drawLine(50,243,91,243);
        g2.drawLine(50,243,50,249);
        g2.drawLine(91,243,84,249);
        g2.drawLine(73,242,73,209);
       g2.drawLine(74,242,74,209);
        g2.drawLine(73,209,66,211);
        g2.drawLine(66,211,73,214);
        QuadCurve2D izquierda = new QuadCurve2D.Double();
        izquierda.setCurve(75,216,79,230,75,242);
        g2.draw(izquierda);
        QuadCurve2D izquierda2 = new QuadCurve2D.Double();
        izquierda2.setCurve(75,216,100,231,75,242);
        g2.draw(izquierda2);
        QuadCurve2D derecha = new QuadCurve2D.Double();
        derecha.setCurve(73,217,55,231,72,241);
        g2.draw(derecha);
        QuadCurve2D derecha2 = new QuadCurve2D.Double();
        derecha2.setCurve(73,217,71,230,72,241);
        g2.draw(derecha2);
        QuadCurve2D atras = new QuadCurve2D.Double();
        atras.setCurve(51,243,57,235,64,243);
        g2.draw(atras);
    }
}
