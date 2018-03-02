package Unidad_1_y_2.paws;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;

public class Everest extends JApplet{
    public void init(){
        //initialize drawing colors
        this.setMinimumSize(new Dimension(500, 500));
        this.setMaximumSize(new Dimension(500, 500));
        this.setSize(500,500);
    }
    public void paint(Graphics g) {
        //ojo derecho
        Graphics2D ojos = (Graphics2D) g;
        //pupila
        ojos.setColor(Color.lightGray);
        ojos.fillOval(197,134,24,29);
        ojos.setColor(Color.black);
        ojos.fillOval(202,141,15,20);
        ojos.setColor(Color.white);
        ojos.fillOval(203,139,7,7);
        ojos.setColor(Color.black);
        //ojo
        QuadCurve2D o1 = new QuadCurve2D.Double();
        o1.setCurve(191,147,197,158,210,165);
        ojos.draw(o1);
        ojos.draw(new Line2D.Double(210,165,223,165));
        QuadCurve2D o2 = new QuadCurve2D.Double();
        o2.setCurve(223,165,227,160,228,156);
        ojos.draw(o2);
        ojos.draw(new Line2D.Double(228,156,228,138));
        QuadCurve2D o3 = new QuadCurve2D.Double();
        o3.setCurve(228,138,223,127,217,122);
        ojos.draw(o3);
        ojos.draw(new Line2D.Double(217,122,204,122));
        QuadCurve2D o4 = new QuadCurve2D.Double();
        o4.setCurve(204,122,197,127,192,137);
        ojos.draw(o4);
        ojos.draw(new Line2D.Double(192,137,191,147));
        //pesta;as
        //arriba derecha
        Polygon pestaña = new Polygon();
        pestaña.addPoint(228,134);
        pestaña.addPoint(232,134);
        pestaña.addPoint(232,132);
        pestaña.addPoint(234,132);
        pestaña.addPoint(236,129);
        pestaña.addPoint(236,133);
        pestaña.addPoint(235,133);
        pestaña.addPoint(235,135);
        pestaña.addPoint(234,136);
        pestaña.addPoint(232,136);
        pestaña.addPoint(232,138);
        pestaña.addPoint(230,138);
        pestaña.addPoint(230,141);
        pestaña.addPoint(239,141);
        pestaña.addPoint(239,142);
        pestaña.addPoint(236,142);
        pestaña.addPoint(236,144);
        pestaña.addPoint(230,144);
        pestaña.addPoint(231,148);
        pestaña.addPoint(234,148);
        pestaña.addPoint(236,150);
        pestaña.addPoint(228,150);
        pestaña.addPoint(228,134);
        ojos.fillPolygon(pestaña);
        //abajo derecha
        Polygon pestaña2 = new Polygon();
        pestaña2.addPoint(220,165);
        pestaña2.addPoint(221,167);
        pestaña2.addPoint(222,168);
        pestaña2.addPoint(222,169);
        pestaña2.addPoint(223,169);
        pestaña2.addPoint(224,170);
        pestaña2.addPoint(224,168);
        pestaña2.addPoint(223,168);
        pestaña2.addPoint(223,165);
        pestaña2.addPoint(224,165);
        pestaña2.addPoint(225,167);
        pestaña2.addPoint(228,168);
        pestaña2.addPoint(227,166);
        pestaña2.addPoint(225,164);
        ojos.fillPolygon(pestaña2);
        //hocico
        Graphics2D hocico = (Graphics2D) g;
        QuadCurve2D h1 = new QuadCurve2D.Double();
        h1.setCurve(191,161,179,148,167,144);
        hocico.draw(h1);
        hocico.draw(new Line2D.Double(167,144,161,144));
        //nariz
        Polygon nariz = new Polygon();
        hocico.setColor(Color.gray);
        nariz.addPoint(160,144);
        nariz.addPoint(146,144);
        nariz.addPoint(145,145);
        nariz.addPoint(144,146);
        nariz.addPoint(143,148);
        nariz.addPoint(143,151);
        nariz.addPoint(142,151);
        nariz.addPoint(142,156);
        nariz.addPoint(143,156);
        nariz.addPoint(143,161);
        nariz.addPoint(145,161);
        nariz.addPoint(145,167);
        nariz.addPoint(148,167);
        nariz.addPoint(148,169);
        nariz.addPoint(149,169);
        nariz.addPoint(149,170);
        nariz.addPoint(152,170);
        nariz.addPoint(152,171);
        nariz.addPoint(159,171);
        nariz.addPoint(160,170);
        nariz.addPoint(163,170);
        nariz.addPoint(164,169);
        nariz.addPoint(166,168);
        nariz.addPoint(172,162);
        nariz.addPoint(172,155);
        nariz.addPoint(171,154);
        nariz.addPoint(169,151);
        nariz.addPoint(167,151);
        nariz.addPoint(167,150);
        nariz.addPoint(166,149);
        nariz.addPoint(163,145);
        nariz.addPoint(160,145);
        nariz.addPoint(160,145);
        hocico.fillPolygon(nariz);
        //boca
        hocico.setColor(Color.black);
        hocico.setStroke(new BasicStroke(1.2f));
        hocico.draw(new Line2D.Double(162,143,146,143));
        QuadCurve2D h2 = new QuadCurve2D.Double();
        h2.setCurve(146,143,143,145, 141,151);
        hocico.draw(h2);
        hocico.draw(new Line2D.Double(141,151,141,156));
        QuadCurve2D h3 = new QuadCurve2D.Double();
        h3.setCurve(141,156,145,167,152,171);
        hocico.draw(h3);
        hocico.draw(new Line2D.Double(152,171,160,171));
        QuadCurve2D h4 = new QuadCurve2D.Double();
        h4.setCurve(160,171,167,167,171,161);
        hocico.draw(h4);
        hocico.draw(new Line2D.Double(171,161,171,155));
        QuadCurve2D h5 = new QuadCurve2D.Double();
        h5.setCurve(171,155,169,151,160,144);
        hocico.draw(h5);
        hocico.setStroke(new BasicStroke(1.0f));
        //hocico.draw(new Line2D.Double(141,155,139,155));
        //hocico.draw(new Line2D.Double(139,155,139,183));
        QuadCurve2D h8 = new QuadCurve2D.Double();
        h8.setCurve(141,154,137,169,139,183);
        hocico.draw(h8);
        QuadCurve2D h6 = new QuadCurve2D.Double();
        h6.setCurve(139,183,143,195,149,200);
        hocico.draw(h6);
        hocico.draw(new Line2D.Double(149,200,154,200));
        hocico.draw(new Line2D.Double(151,171,151,191));
        QuadCurve2D h7 = new QuadCurve2D.Double();
        h7.setCurve(151,191,154,201,163,206);
        hocico.draw(h7);
        hocico.draw(new Line2D.Double(163,206,179,206));
        QuadCurve2D h9 = new QuadCurve2D.Double();
        h9.setCurve(179,205,198,199,206,187);
        hocico.draw(h9);
        QuadCurve2D h10 = new QuadCurve2D.Double();
        h10.setCurve(203,186,208,188,210,191);
        hocico.draw(h10);
        //puntos
        hocico.setColor(Color.lightGray);
        hocico.fillOval(178,169,2,2);
        hocico.fillOval(185,174,2,2);
        hocico.fillOval(181,180,2,2);
        //ojo izquierdo
        ojos.setColor(Color.lightGray);
        Polygon gray = new Polygon();
        gray.addPoint(159,138);
        gray.addPoint(159,128);
        gray.addPoint(169,125);
        gray.addPoint(170,117);
        gray.addPoint(168,115);
        gray.addPoint(160,115);
        gray.addPoint(159,117);
        gray.addPoint(157,117);
        gray.addPoint(157,120);
        gray.addPoint(156,120);
        gray.addPoint(156,122);
        gray.addPoint(154,122);
        gray.addPoint(154,125);
        gray.addPoint(153,125);
        gray.addPoint(153,136);
        gray.addPoint(154,137);
        gray.addPoint(156,139);
        ojos.fillPolygon(gray);
        ojos.setColor(Color.black);
        Polygon negro = new Polygon();
        negro.addPoint(164,140);
        negro.addPoint(160,140);
        negro.addPoint(160,138);
        negro.addPoint(159,138);
        negro.addPoint(157,136);
        negro.addPoint(157,125);
        negro.addPoint(163,125);
        negro.addPoint(163,118);
        negro.addPoint(163,120);
        negro.addPoint(165,120);
        negro.addPoint(166,121);
        negro.addPoint(167,122);
        negro.addPoint(170,130);
        negro.addPoint(169,130);
        negro.addPoint(169,133);
        negro.addPoint(167,133);
        negro.addPoint(167,135);
        negro.addPoint(163,140);
        ojos.fillPolygon(negro);
        ojos.setColor(Color.white);
        ojos.fillOval(157,118,6,10);
        ojos.setColor(Color.black);
        QuadCurve2D o5 = new QuadCurve2D.Double();
        o5.setCurve(148,133,152,138,161,141);
        ojos.draw(o5);
        QuadCurve2D o6 = new QuadCurve2D.Double();
        o6.setCurve(161,141,167,136,170,126);
        ojos.draw(o6);
        ojos.draw(new Line2D.Double(170,126,170,117));
        QuadCurve2D o7 = new QuadCurve2D.Double();
        o7.setCurve(170,127,172,113,170,101);
        ojos.draw(o7);
        QuadCurve2D o8 = new QuadCurve2D.Double();
        o8.setCurve(170,117,167,108,164,105);
        ojos.draw(o8);
        ojos.draw(new Line2D.Double(164,105,159,105));
        QuadCurve2D o9 = new QuadCurve2D.Double();
        o9.setCurve(159,105,152,109,149,116);
        ojos.draw(o9);
        ojos.draw(new Line2D.Double(149,117,149,123));
        ojos.draw(new Line2D.Double(148,122,148,133));
        //pesta;as
        //arriba
        Polygon pestana = new Polygon();
        pestana.addPoint(157,106);
        pestana.addPoint(155,106);
        pestana.addPoint(153,103);
        pestana.addPoint(152,98);
        pestana.addPoint(151,103);
        pestana.addPoint(152,109);
        pestana.addPoint(150,109);
        pestana.addPoint(148,106);
        pestana.addPoint(148,108);
        pestana.addPoint(149,110);
        pestana.addPoint(150,111);
        pestana.addPoint(150,113);
        pestana.addPoint(149,113);
        pestana.addPoint(147,112);
        pestana.addPoint(148,114);
        pestana.addPoint(149,116);
        pestana.addPoint(151,116);
        pestana.addPoint(152,114);
        pestana.addPoint(153,112);
        pestana.addPoint(153,109);
        pestana.addPoint(155,108);
        pestana.addPoint(156,107);
        ojos.fillPolygon(pestana);
        Polygon pestanaAbajo = new Polygon();
        pestanaAbajo.addPoint(148,131);
        pestanaAbajo.addPoint(145,131);
        pestanaAbajo.addPoint(146,132);
        pestanaAbajo.addPoint(146,134);
        pestanaAbajo.addPoint(145,135);
        pestanaAbajo.addPoint(149,135);
        ojos.fillPolygon(pestanaAbajo);
        //cara
        Graphics2D cara =  (Graphics2D) g;
        cara.draw(new Line2D.Double(145,108,145,115));
        QuadCurve2D c1 = new QuadCurve2D.Double();
        c1.setCurve(145,115,143,123,137,127);
        cara.draw(c1);
        cara.draw(new Line2D.Double(136,128,130,128));
        QuadCurve2D c2 = new QuadCurve2D.Double();
        c2.setCurve(130,128,132,131,136,133);
        cara.draw(c2);
        QuadCurve2D c3 = new QuadCurve2D.Double();
        c3.setCurve(136,133,131,132,127,128);
        cara.draw(c3);
        QuadCurve2D c4 = new QuadCurve2D.Double();
        c4.setCurve(127,128,127,141,130,149);
        cara.draw(c4);
        QuadCurve2D c5 = new QuadCurve2D.Double();
        c5.setCurve(130,149,128,147,126,143);
        cara.draw(c5);
        QuadCurve2D c6 = new QuadCurve2D.Double();
        c6.setCurve(126,143,125,169,147,208);
        cara.draw(c6);
        QuadCurve2D c7 = new QuadCurve2D.Double();
        c7.setCurve(148,208,152,223,175,234);
        cara.draw(c7);
        QuadCurve2D c8 = new QuadCurve2D.Double();
        c8.setCurve(176,235,204,237,235,233);
        cara.draw(c8);
        QuadCurve2D c9 = new QuadCurve2D.Double();
        c9.setCurve(235,234,252,227,268,212);
        cara.draw(c9);
        QuadCurve2D c10 = new QuadCurve2D.Double();
        c10.setCurve(268,212,261,208,255,204);
        cara.draw(c10);
        QuadCurve2D c11 = new QuadCurve2D.Double();
        c11.setCurve(255,203,258,203,260,202);
        cara.draw(c11);
        QuadCurve2D c12 = new QuadCurve2D.Double();
        c12.setCurve(260,202,255,199,252,195);
        cara.draw(c12);
        QuadCurve2D c13 = new QuadCurve2D.Double();
        c13.setCurve(253,196,259,199,268,199);
        cara.draw(c13);
        QuadCurve2D c14 = new QuadCurve2D.Double();
        c14.setCurve(268,199,261,191,254,181);
        cara.draw(c14);
        QuadCurve2D c15 = new QuadCurve2D.Double();
        c15.setCurve(253,177,258,184,265,186);
        cara.draw(c15);
        QuadCurve2D c16 = new QuadCurve2D.Double();
        c16.setCurve(265,186,259,179,255,172);
        cara.draw(c16);
        QuadCurve2D c17 = new QuadCurve2D.Double();
        c17.setCurve(255,172,254,168,254,164);
        cara.draw(c17);
        QuadCurve2D c18 = new QuadCurve2D.Double();
        c18.setCurve(254,164,256,167,258,167);
        cara.draw(c18);
        QuadCurve2D c19 = new QuadCurve2D.Double();
        c19.setCurve(258,167,255,161,255,157);
        cara.draw(c19);
        cara.draw(new Line2D.Double(254,156,254,143));
        //lineas negras del morado
        cara.draw(new Line2D.Double(209,235,257,235));
        QuadCurve2D c20 = new QuadCurve2D.Double();
        c20.setCurve(257,234,268,234,275,229);
        cara.draw(c20);
        QuadCurve2D c21 = new QuadCurve2D.Double();
        c21.setCurve(275,229,270,229,264,228);
        cara.draw(c21);
        QuadCurve2D c22 = new QuadCurve2D.Double();
        c22.setCurve(268,228,281,222,286,212);
        cara.draw(c22);
        QuadCurve2D c23 = new QuadCurve2D.Double();
        c23.setCurve(286,212,280,218,274,220);
        cara.draw(c23);
        QuadCurve2D c24 = new QuadCurve2D.Double();
        c24.setCurve(286,212,280,218,274,220);
        cara.draw(c24);
        QuadCurve2D c25 = new QuadCurve2D.Double();
        c25.setCurve(274,219,280,216,284,211);
        cara.draw(c25);
        cara.draw(new Line2D.Double(284,211,279,211));
        QuadCurve2D c26 = new QuadCurve2D.Double();
        c26.setCurve(279,210,276,209,272,206);
        cara.draw(c26);
        cara.draw(new Line2D.Double(276,205,284,205));
        QuadCurve2D c27 = new QuadCurve2D.Double();
        c27.setCurve(284,205,290,202,293,197);
        cara.draw(c27);
        QuadCurve2D c28 = new QuadCurve2D.Double();
        c28.setCurve(293,197,286,193,280,185);
        cara.draw(c28);
        cara.draw(new Line2D.Double(279,183,279,178));
        //gorro
        Graphics2D gorro = (Graphics2D) g;
        QuadCurve2D c29 = new QuadCurve2D.Double();
        c29.setCurve(284,179,276,174,271,171);
        gorro.draw(c29);
        QuadCurve2D c30 = new QuadCurve2D.Double();
        c30.setCurve(284,189,289,184,292,179);
        gorro.draw(c30);
        gorro.draw(new Line2D.Double(293,177,293,170));

    }
}