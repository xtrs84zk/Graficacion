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

        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath c = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        Color colorcarne = new Color (255,204,153);
        Color colornegro= new Color(0,0,0);
        Color verde= new Color(0,153,0);
        //monita
        g.setColor(colornegro);
        g.drawOval(639,509,48,45);
        g.setColor(colorcarne);
        g.fillOval(639,509,48,45);

        //ojos derecho
        g2.setStroke(new BasicStroke(3.0f));
        g2.setColor(Color.black);
        GeneralPath o = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        o.moveTo(648,528);
        o.curveTo(648,528,653,531,654,529);
        g2.draw(o);
        o.closePath();
        //ojos izquierdo
        g2.setStroke(new BasicStroke(3.0f));
        g2.setColor(Color.black);
        GeneralPath o1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        o1.moveTo(663,528);
        o1.curveTo(663,528,663,531,669,529);
        g2.draw(o1);
        o1.closePath();

        //Nariz
        g2.setStroke(new BasicStroke(1.9f));
        g2.setColor(Color.black);
        GeneralPath n = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        n.moveTo(659, 528);
        n.curveTo(659, 528, 650, 530, 651, 534);
        n.curveTo(651, 534, 653, 535, 657, 533);
        g2.draw(n);
        n.closePath();


        //boca
        g2.setStroke(new BasicStroke(1.9f));
        g2.setColor(Color.black);
        GeneralPath b = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        b.moveTo(649, 543);
        b.curveTo(649, 543, 660, 549, 671, 544);
        g2.draw(b);
        b.closePath();

        //
        g.setColor(verde);
        g.fillOval(650,554,28,35);

        //Cuerpo
        g2.setStroke(new BasicStroke(4.0f));
        g2.setColor(verde);
        GeneralPath cu= new GeneralPath(GeneralPath.WIND_NON_ZERO);
        cu.moveTo(660, 554);
        cu.curveTo(660, 554, 644, 562, 654, 576);
        cu.lineTo(654,576);
        cu.lineTo(660, 576);
        cu.lineTo(660, 554);
        cu.lineTo(660, 554);
        g2.fill(cu);
        cu.closePath();

        //
        g2.setStroke(new BasicStroke(4.0f));
        g2.setColor(verde);
        GeneralPath cu1= new GeneralPath(GeneralPath.WIND_NON_ZERO);
        cu1.moveTo(670, 554);
        cu1.curveTo(670, 554, 674, 562, 684, 574);
        cu1.lineTo(684,574);
        cu1.lineTo(670, 574);
        cu1.lineTo(670, 550);
        cu1.lineTo(670, 550);
        g2.fill(cu1);
        cu1.closePath();
        //Brazos
        g2.setStroke(new BasicStroke(1.9f));
        g2.setColor(Color.black);
        GeneralPath B = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        B.moveTo(669, 563);
        B.curveTo(669, 563,664,560,633,568);
        g2.draw(B);
        B.closePath();
        /////////////////////////////
        Color turqueza = new Color (0,102,102);
        Color morado= new Color(102,0,102);


        //tabla
        g.setColor(morado);
        g.fillOval(472,406,407,60);
        //Mochilas
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath c8 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        c8.moveTo(581, 449);
        c8.lineTo(583, 487);
        c8.lineTo(558, 485);
        c8.lineTo(737, 487);
        c8.lineTo(736, 449);
        c8.lineTo(661, 448);
        c8.lineTo(581, 449);
        g2.draw(c8);
        c8.closePath();

        //
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.BLUE);
        GeneralPath c1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        c1.moveTo(581, 449);
        c1.lineTo(583, 487);
        c1.lineTo(558, 485);
        c1.lineTo(737, 487);
        c1.lineTo(736, 449);
        c1.lineTo(661, 448);
        c1.lineTo(581, 449);
        g2.fill(c1);
        c1.closePath();
        //
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath j = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        j.moveTo(638, 464);
        j.lineTo(640, 472);
        j.lineTo(661, 473);
        j.lineTo(682, 471);
        j.lineTo(682, 463);
        j.lineTo(659, 464);
        j.lineTo(638, 464);
        g2.fill(j);
        j.closePath();
        //maleta 2

        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.YELLOW);
        GeneralPath c11 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        c11.moveTo(579,396);
        c11.lineTo(579,447);
        c11.lineTo(601,446);
        c11.lineTo(626,447);
        c11.lineTo(622,425);
        c11.lineTo(623,398);
        c11.lineTo(600,393);
        c11.lineTo(579,396);
        g2.fill(c11);
        c11.closePath();
        //
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath f = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        f.moveTo(616, 415);
        f.lineTo(614, 434);
        g2.draw(f);
        f.closePath();
        //pelota
        g.setColor(turqueza);
        g.fillOval(648,379,116,100);
        ////////////////////////////////////////////////////////////////////////
        //defensa
        g2.setPaint(Color.WHITE);
        g2.fill(new RoundRectangle2D.Double(553,571,26,30,20,20));
        g2.setPaint(Color.BLACK);
        g2.draw(new RoundRectangle2D.Double(553,571,26,30,20,20));
        //carro
        g2.draw(new RoundRectangle2D.Double(561,557,205,53,30,30));
        g2.draw(new RoundRectangle2D.Double(755,582,35,25,10,10));
        g2.setPaint(Color.RED);
        g2.fill(new RoundRectangle2D.Double(561,557,205,53,30,30));
        g2.fill(new RoundRectangle2D.Double(755,582,35,25,10,10));
        //puertas
        g2.setPaint(Color.BLACK);
        g2.drawLine(609,557,609,580);
        g2.drawLine(669, 560, 669, 609);
        g2.drawLine(737, 560, 738, 577);
        g2.drawLine(650, 568, 660, 568);
        g2.drawLine(681, 568, 691, 568);
        //ventanas
        g2.drawLine(671, 481, 671, 559);
        g2.setPaint(Color.RED);
        int x[]={766,764,749,737,627,617,588,617,628,735,749,735,748,751};
        int y[]={565,531,491,472,474,485,557,485,481,480,491,480,523,557};
        g.fillPolygon(x,y,x.length);
        g2.setPaint(Color.BLACK);
        g.drawPolygon(x,y,x.length);
        //llantas
        g2.fill(new Ellipse2D.Double(576,579,58,60));
        g2.fill(new Ellipse2D.Double(704,576,58,60));
        g2.setPaint(Color.DARK_GRAY);
        g2.fill(new Ellipse2D.Double(595,600,20,18));
        g2.fill(new Ellipse2D.Double(724,597,20,18));
    }
}
