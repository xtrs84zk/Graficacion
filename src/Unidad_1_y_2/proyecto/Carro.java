package Unidad_1_y_2.proyecto;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.RoundRectangle2D;

public class Carro extends JApplet {
    private int altoyancho;
    private int xCoord, yCoord;

    public Carro(){}

    public Carro(int aa, int xIncial, int yInicial){
        altoyancho = aa;
        xCoord = xIncial;
        yCoord = yInicial;
    }
    public void mostrar(){
        repaint();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Color turqueza = new Color (0,102,102);
        Color morado= new Color(102,0,102);

        //tabla
        g.setColor(morado);
        g.fillOval(172,106,407,60);
        //Mochilas
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath c = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        c.moveTo(281, 149);
        c.lineTo(283, 187);
        c.lineTo(358,185);
        c.lineTo(437,187);
        c.lineTo(436,149);
        c.lineTo(361,148);
        c.lineTo(281,149);
        g2.draw(c);
        c.closePath();
        //
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.BLUE);
        GeneralPath c1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        c1.moveTo(281, 149);
        c1.lineTo(283, 187);
        c1.lineTo(358,185);
        c1.lineTo(437,187);
        c1.lineTo(436,149);
        c1.lineTo(361,148);
        c1.lineTo(281,149);
        g2.fill(c1);
        c1.closePath();
        //
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath j = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        j.moveTo(338, 164);
        j.lineTo(340,172);
        j.lineTo(361,173);
        j.lineTo(382, 171);
        j.lineTo(382,163);
        j.lineTo(359,164);
        j.lineTo(338,164);
        g2.fill(j);
        j.closePath();
        //maleta 2

        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.YELLOW);
        GeneralPath c11 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        c11.moveTo(279,96);
        c11.lineTo(279,147);
        c11.lineTo(301,146);
        c11.lineTo(326,147);
        c11.lineTo(322,125);
        c11.lineTo(323,98);
        c11.lineTo(300,93);
        c11.lineTo(279,96);
        g2.fill(c11);
        c11.closePath();
        //
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath f = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        f.moveTo(316, 115);
        f.lineTo(314,134);
        g2.draw(f);
        f.closePath();
        //pelota
        g.setColor(turqueza);
        g.fillOval(348,79,116,100);
        ///////////////////////////////////////////
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath c3 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        Color colorcarne = new Color (255,204,153);
        Color colornegro= new Color(0,0,0);
        Color verde= new Color(0,153,0);

        //monita
        g.setColor(colornegro);
        g.drawOval(339,209,48,45);
        g.setColor(colorcarne);
        g.fillOval(339,209,48,45);

        //ojos derecho
        g2.setStroke(new BasicStroke(3.0f));
        g2.setColor(Color.black);
        GeneralPath o = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        o.moveTo(348,228);
        o.curveTo(348,228,353,231,354,229);
        g2.draw(o);
        o.closePath();

        //ojos izquierdo
        g2.setStroke(new BasicStroke(3.0f));
        g2.setColor(Color.black);
        GeneralPath o1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        o1.moveTo(363,228);
        o1.curveTo(363,228,363,231,369,229);
        g2.draw(o1);
        o1.closePath();

        //Nariz
        g2.setStroke(new BasicStroke(1.9f));
        g2.setColor(Color.black);
        GeneralPath n = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        n.moveTo(359, 228);
        n.curveTo(359, 228, 350, 230, 351, 234);
        n.curveTo(351, 234, 353, 235, 357, 233);
        g2.draw(n);
        n.closePath();


        //boca
        g2.setStroke(new BasicStroke(1.9f));
        g2.setColor(Color.black);
        GeneralPath b = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        b.moveTo(349, 243);
        b.curveTo(349, 243, 360, 249, 371, 244);
        g2.draw(b);
        b.closePath();

        //
        g.setColor(verde);
        g.fillOval(350,254,28,35);

        //Cuerpo
        g2.setStroke(new BasicStroke(4.0f));
        g2.setColor(verde);
        GeneralPath cu= new GeneralPath(GeneralPath.WIND_NON_ZERO);
        cu.moveTo(360, 254);
        cu.curveTo(360, 254, 344, 262, 354, 276);
        cu.lineTo(354,276);
        cu.lineTo(360, 276);
        cu.lineTo(360, 254);
        cu.lineTo(360, 254);
        g2.fill(cu);
        cu.closePath();

        //
        g2.setStroke(new BasicStroke(4.0f));
        g2.setColor(verde);
        GeneralPath cu1= new GeneralPath(GeneralPath.WIND_NON_ZERO);
        cu1.moveTo(370, 254);
        cu1.curveTo(370, 254, 374, 262, 384, 274);
        cu1.lineTo(384,274);
        cu1.lineTo(370, 274);
        cu1.lineTo(370, 250);
        cu1.lineTo(370, 250);
        g2.fill(cu1);
        cu1.closePath();

        //Brazos
        g2.setStroke(new BasicStroke(1.9f));
        g2.setColor(Color.black);
        GeneralPath B = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        B.moveTo(369, 263);
        B.curveTo(369, 263,364,260,333,268);
        g2.draw(B);
        B.closePath();


        ////////////////////////////////////////////////////////////
        //defensa
        g2.setPaint(Color.WHITE);
        g2.fill(new RoundRectangle2D.Double(253,271,26,30,20,20));
        g2.setPaint(Color.BLACK);
        g2.draw(new RoundRectangle2D.Double(253,271,26,30,20,20));

        //carro
        g2.draw(new RoundRectangle2D.Double(261,257,205,53,30,30));
        g2.draw(new RoundRectangle2D.Double(455,282,35,25,10,10));
        g2.setPaint(Color.RED);
        g2.fill(new RoundRectangle2D.Double(261,257,205,53,30,30));
        g2.fill(new RoundRectangle2D.Double(455,282,35,25,10,10));
        //puertas
        g2.setPaint(Color.BLACK);
        g2.drawLine(309,257,309,280);
        g2.drawLine(369, 260, 369, 309);
        g2.drawLine(437, 260, 438, 277);
        g2.drawLine(350, 268, 360, 268);
        g2.drawLine(381, 268, 391, 268);
        //ventanas
        g2.drawLine(371, 181, 371, 259);
        g2.setPaint(Color.RED);
        int x[]={466,464,449,437,327,317,288,317,328,435,449,435,448,451};
        int y[]={265,231,191,172,174,185,257,185,181,180,191,180,223,257};
        g.fillPolygon(x,y,x.length);
        g2.setPaint(Color.BLACK);
        g.drawPolygon(x,y,x.length);
        //llantas
        g2.fill(new Ellipse2D.Double(276,279,58,60));
        g2.fill(new Ellipse2D.Double(404,276,58,60));
        g2.setPaint(Color.DARK_GRAY);
        g2.fill(new Ellipse2D.Double(295,300,20,18));
        g2.fill(new Ellipse2D.Double(424,297,20,18));

    }
}
