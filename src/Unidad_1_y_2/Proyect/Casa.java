package Unidad_1_y_2.Proyect;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Casa extends JApplet {
    AffineTransform at = new AffineTransform();

    public static void main(String[] args) {
        int altoyancho;
        int xCoord, yCoord;
    }

    public void trasladar(int x) {
        at.translate(x, 0);
    }

    public void rotar(int x) {
        at.rotate(Math.toRadians(x), 180, 180);
    }

    public void escalar(double x) {
        at.scale(x, x);
    }

    public void sesgar(double x) {
        at.shear(x, 0.0);
    }

    public void mostrar() {
        repaint();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //Exterior

    }
}
