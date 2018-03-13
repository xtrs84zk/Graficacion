package Unidad_1_y_2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public class Rectang extends JPanel {
    private int altoyancho;
    private int xCoord, yCoord;
    AffineTransform at = new AffineTransform();

    public Rectang(int aa, int xIncial, int yInicial){
        altoyancho = aa;
        xCoord = xIncial;
        yCoord = yInicial;
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

    public void paint(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.red);
        g2.setTransform(at);
        g2.fill(new Rectangle2D.Double(xCoord,yCoord,altoyancho, altoyancho));
    }

    public void mostrar(){
        repaint();
    }
}
