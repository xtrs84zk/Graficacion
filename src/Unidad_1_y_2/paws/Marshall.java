package Unidad_1_y_2.paws;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Marshall extends JApplet{
    public void init(){
        //initialize drawing colors
        this.setMinimumSize(new Dimension(500, 500));
        this.setMaximumSize(new Dimension(500, 500));
        this.setSize(500,500);
    }
    public void paint(Graphics g) {
        //ojo izquierdo
        g.drawOval(200,130,33,42);
        Graphics2D ojo = (Graphics2D) g;
        ojo.setColor(Color.cyan);
        ojo.fillOval(208,140,21,28);
        ojo.setColor(Color.black);
        g.fillOval(211,146,15,18);
        ojo.setColor(Color.white);
        g.fillOval(218,150,4,5);
        //ceja  izquierda
        Graphics2D ceja = (Graphics2D) g;
        ceja.setColor(Color.black);
        ceja.draw(new Line2D.Double(203,127,222,127));
        QuadCurve2D c1 = new QuadCurve2D.Double();
        c1.setCurve(203,127,211,118,222,127);
        ceja.draw(c1);
        ceja.fill(c1);
        //boca
        Graphics2D hocico = (Graphics2D) g;
        hocico.setColor(Color.RED);
        Polygon boca1 = new Polygon();
        boca1.addPoint(178,210);
        boca1.addPoint(190,210);
        boca1.addPoint(190,211);
        boca1.addPoint(189,213);
        boca1.addPoint(188,216);
        boca1.addPoint(187,219);
        boca1.addPoint(186,223);
        boca1.addPoint(182,223);
        boca1.addPoint(180,220);
        boca1.addPoint(178,217);
        boca1.addPoint(178,211);
        hocico.fillPolygon(boca1);
        hocico.setColor(Color.pink);
        Polygon lengua = new Polygon();
        lengua.addPoint(182,223);
        lengua.addPoint(185,219);
        lengua.addPoint(186,216);
        lengua.addPoint(188,214);
        lengua.addPoint(190,210);
        lengua.addPoint(192,209);
        lengua.addPoint(196,209);
        lengua.addPoint(198,208);
        lengua.addPoint(202,207);
        lengua.addPoint(204,209);
        lengua.addPoint(209,209);
        lengua.addPoint(212,205);
        lengua.addPoint(213,198);
        lengua.addPoint(221,194);
        lengua.addPoint(221,197);
        lengua.addPoint(217,203);
        lengua.addPoint(212,209);
        lengua.addPoint(207,214);
        lengua.addPoint(203,217);
        lengua.addPoint(198,220);
        lengua.addPoint(193,223);
        lengua.addPoint(190,224);
        lengua.addPoint(185,223);
        hocico.fillPolygon(lengua);
        hocico.setColor(Color.black);
        QuadCurve2D h8 = new QuadCurve2D.Double();
        h8.setCurve (184,223,186,215,191,209);
        hocico.draw(h8);
        //hocico
        QuadCurve2D h1 = new QuadCurve2D.Double();
        h1.setCurve(196,169,176,169,173,173);
        hocico.draw(h1);
        QuadCurve2D h2 = new QuadCurve2D.Double();
        h2.setCurve(173,197,174,202,178,209);
        hocico.draw(h2);
        QuadCurve2D h3 = new QuadCurve2D.Double();
        h3.setCurve(161,185,162,200,171,209);
        hocico.draw(h3);
        hocico.draw(new Line2D.Double(171,209,190,209));
        QuadCurve2D h4 = new QuadCurve2D.Double();
        h4.setCurve(177,209,176,217,182,223);
        hocico.draw(h4);
        QuadCurve2D h5 = new QuadCurve2D.Double();
        h5.setCurve(182,223,197,223,204,218);
        hocico.draw(h5);
        QuadCurve2D h6 = new QuadCurve2D.Double();
        h6.setCurve(204,218,212,212,222,193);
        hocico.draw(h6);
        QuadCurve2D h7 = new QuadCurve2D.Double();
        h7.setCurve (222,193,208,203,190,209);
        hocico.draw(h7);
        QuadCurve2D h9 = new QuadCurve2D.Double();
        h9.setCurve (195,208,215,210,212,199);
        hocico.draw(h9);
        //nariz
        Graphics2D nariz = (Graphics2D) g;
        nariz.setPaint(Color.black);
        QuadCurve2D n1 = new QuadCurve2D.Double();
        n1.setCurve(173,196,184,182,184,175);
        nariz.draw(n1);
        QuadCurve2D n2 = new QuadCurve2D.Double();
        n2.setCurve(184,175,173,172,163,175);
        nariz.draw(n2);
        QuadCurve2D n3 = new QuadCurve2D.Double();
        n3.setCurve(163,175,161,181,163,189);
        nariz.draw(n3);
        QuadCurve2D n4 = new QuadCurve2D.Double();
        n4.setCurve(163,189,165,191,173,196);
        Polygon nariz1 = new Polygon();
        nariz1.addPoint(173,196);
        nariz1.addPoint(184,175);
        nariz1.addPoint(163,175);
        nariz1.addPoint(161,181);
        nariz1.addPoint(163,189);
        nariz1.addPoint(173,196);
        nariz1.addPoint(180,190);
        nariz1.addPoint(184,182);
        nariz1.addPoint(184,175);
        nariz.setPaint(Color.black);
        nariz.fillPolygon(nariz1);
        nariz.setPaint(Color.white);
        Polygon nariz2 = new Polygon();
        nariz2.addPoint(178,183);
        nariz2.addPoint(181,181);
        nariz2.addPoint(181,179);
        nariz2.addPoint(175,178);
        nariz2.addPoint(176,182);
        nariz2.addPoint(178,183);
        nariz.fillPolygon(nariz2);
        //ojo derecho
        Graphics2D ojo2 = (Graphics2D) g;
        ojo2.setColor(Color.black);
        QuadCurve2D o1 = new QuadCurve2D.Double();
        o1.setCurve(163,175,155,153,163,138);
        ojo2.draw(o1);
        QuadCurve2D o2 = new QuadCurve2D.Double();
        o2.setCurve(163,138,173,135,175,140);
        ojo2.draw(o2);
        QuadCurve2D o3 = new QuadCurve2D.Double();
        o3.setCurve(175,140,181,158,178,169);
        ojo2.draw(o3);
        ojo2.setColor(Color.cyan);
        ojo2.fillOval(165,146,14,27);
        ojo2.setColor(Color.black);
        ojo2.fillOval(168,150,12,19);
        ojo2.setColor(Color.white);
        ojo2.fillOval(174,154,4,7);
        //ceja derecha
        Graphics2D ceja2 = (Graphics2D) g;
        ceja2.setColor(Color.black);
        Polygon cejad = new Polygon();
        cejad.addPoint(160,138);
        cejad.addPoint(165,134);
        cejad.addPoint(173,134);
        cejad.addPoint(175,132);
        cejad.addPoint(171,127);
        cejad.addPoint(164,126);
        cejad.addPoint(160,130);
        cejad.addPoint(158,131);
        cejad.addPoint(157,138);
        cejad.addPoint(161,138);
        ceja2.fillPolygon(cejad);
        //vicera
        Graphics2D casco = (Graphics2D) g;
        Polygon vicera = new Polygon();
        casco.setColor(Color.red);
        vicera.addPoint(146,145);
        vicera.addPoint(136,145);
        vicera.addPoint(135,145);
        vicera.addPoint(126,145);
        vicera.addPoint(123,144);
        vicera.addPoint(122,142);
        vicera.addPoint(120,140);
        vicera.addPoint(117,138);
        vicera.addPoint(117,130);
        vicera.addPoint(118,128);
        vicera.addPoint(121,125);
        vicera.addPoint(123,124);
        vicera.addPoint(126,122);
        vicera.addPoint(128,121);
        vicera.addPoint(132,120);
        vicera.addPoint(138,117);
        vicera.addPoint(143,116);
        vicera.addPoint(149,114);
        vicera.addPoint(152,113);
        vicera.addPoint(152,107);
        vicera.addPoint(207,96);
        vicera.addPoint(272,107);
        vicera.addPoint(278,109);
        vicera.addPoint(284,112);
        vicera.addPoint(289,112);
        vicera.addPoint(297,119);
        vicera.addPoint(299,122);
        vicera.addPoint(298,128);
        vicera.addPoint(299,132);
        vicera.addPoint(294,134);
        vicera.addPoint(289,139);
        vicera.addPoint(273,122);
        vicera.addPoint(256,119);
        vicera.addPoint(211,119);
        vicera.addPoint(176,124);
        vicera.addPoint(154,127);
        vicera.addPoint(147,144);
        casco.fillPolygon(vicera);
        //casco
        ceja2.setColor(Color.black);
        QuadCurve2D c2 = new QuadCurve2D.Double();
        casco.setStroke(new BasicStroke(1.5f,BasicStroke.JOIN_ROUND, BasicStroke.CAP_ROUND, 1.5f));
        c2.setCurve(146,130,213,116,275,120);
        casco.draw(c2);
        QuadCurve2D c3 = new QuadCurve2D.Double();
        c3.setCurve(209,112,166,117,126,130);
        casco.draw(c3);
        QuadCurve2D c4 = new QuadCurve2D.Double();
        c4.setCurve(209,112,233,111,260,112);
        casco.draw(c4);
        QuadCurve2D c5 = new QuadCurve2D.Double();
        c5.setCurve(260,112,283,116,294,124);
        casco.draw(c5);
        QuadCurve2D c6 = new QuadCurve2D.Double();
        c6.setCurve(126,136,123,133,127,130);
        casco.draw(c6);
        QuadCurve2D c7 = new QuadCurve2D.Double();
        c7.setCurve(147,145,126,145,116,137);
        casco.draw(c7);
        QuadCurve2D c8 = new QuadCurve2D.Double();
        c8.setCurve(116,137,118,121,123,121);
        casco.draw(c8);
        QuadCurve2D c9 = new QuadCurve2D.Double();
        c9.setCurve(123,121,160,110,196,105);
        casco.draw(c9);
        QuadCurve2D c10 = new QuadCurve2D.Double();
        c10.setCurve(196,105,242,103,274,107);
        casco.draw(c10);
        QuadCurve2D c11 = new QuadCurve2D.Double();
        c11.setCurve(274,107,293,112,300,120);
        casco.draw(c11);
        QuadCurve2D c12 = new QuadCurve2D.Double();
        c12.setCurve(288,137,296,134,300,128);
        casco.draw(c12);
        QuadCurve2D c13 = new QuadCurve2D.Double();
        c13.setCurve(300,120,302,124,300,128);
        casco.draw(c13);
        casco.setStroke(new BasicStroke(1.0f));
        Polygon frenteCasco = new Polygon();
        casco.setColor(Color.red);
        frenteCasco.addPoint(152,112);
        frenteCasco.addPoint(145,96);
        frenteCasco.addPoint(157,84);
        frenteCasco.addPoint(154,68);
        frenteCasco.addPoint(162,53);
        frenteCasco.addPoint(188,49);
        frenteCasco.addPoint(198,63);
        frenteCasco.addPoint(198,79);
        frenteCasco.addPoint(208,86);
        frenteCasco.addPoint(205,104);
        frenteCasco.addPoint(179,106);
        frenteCasco.addPoint(152,112);
        casco.fillPolygon(frenteCasco);
        Polygon escudoCasco = new Polygon();
        casco.setColor(Color.lightGray);
        escudoCasco.addPoint(166,61);
        escudoCasco.addPoint(184,57);
        escudoCasco.addPoint(184,64);
        escudoCasco.addPoint(186,66);
        escudoCasco.addPoint(189,69);
        escudoCasco.addPoint(192,69);
        escudoCasco.addPoint(192,77);
        escudoCasco.addPoint(191,80);
        escudoCasco.addPoint(189,89);
        escudoCasco.addPoint(185,95);
        escudoCasco.addPoint(180,101);
        escudoCasco.addPoint(172,98);
        escudoCasco.addPoint(165,91);
        escudoCasco.addPoint(160,76);
        escudoCasco.addPoint(165,69);
        escudoCasco.addPoint(166,62);
        casco.fillPolygon(escudoCasco);
        Polygon dentroCasco = new Polygon();
        casco.setColor(Color.gray);
        dentroCasco.addPoint(169,65);
        dentroCasco.addPoint(181,63);
        dentroCasco.addPoint(184,69);
        dentroCasco.addPoint(188,72);
        dentroCasco.addPoint(188,80);
        dentroCasco.addPoint(184,90);
        dentroCasco.addPoint(178,96);;
        dentroCasco.addPoint(172,93);
        dentroCasco.addPoint(168,88);
        dentroCasco.addPoint(163,78);
        dentroCasco.addPoint(168,72);
        dentroCasco.addPoint(169,62);
        casco.fillPolygon(dentroCasco);
        casco.setColor(Color.lightGray);
        casco.fillOval(167,77,4,4);
        casco.fillOval(171,71,5,6);
        casco.fillOval(179,72,4,5);
        casco.fillOval(173,80,10,8);
        casco.fillOval(173,83,6,8);
        casco.setColor(Color.red);
        Polygon arribaCasco = new Polygon();
        arribaCasco.addPoint(172,51);
        arribaCasco.addPoint(173,28);
        arribaCasco.addPoint(183,28);
        arribaCasco.addPoint(183,34);
        arribaCasco.addPoint(186,49);
        casco.fillPolygon(arribaCasco);
        casco.setColor(Color.red);
        Polygon arribaCasco2 = new Polygon();
        arribaCasco2.addPoint(184,28);
        arribaCasco2.addPoint(196,34);
        arribaCasco2.addPoint(213,48);
        arribaCasco2.addPoint(187,48);
        arribaCasco2.addPoint(186,45);
        arribaCasco2.addPoint(185,39);
        arribaCasco2.addPoint(183,31);
        casco.fillPolygon(arribaCasco2);
        Polygon lateralCasco = new Polygon();
        casco.setColor(Color.red);
        lateralCasco.addPoint(188,49);
        lateralCasco.addPoint(198,63);
        lateralCasco.addPoint(198,79);
        lateralCasco.addPoint(208,86);
        lateralCasco.addPoint(205,104);
        lateralCasco.addPoint(207,104);
        lateralCasco.addPoint(210,95);
        lateralCasco.addPoint(237,96);
        lateralCasco.addPoint(238,87);
        lateralCasco.addPoint(240,82);
        lateralCasco.addPoint(244,79);
        lateralCasco.addPoint(250,79);
        lateralCasco.addPoint(249,76);
        lateralCasco.addPoint(235,61);
        lateralCasco.addPoint(226,55);
        lateralCasco.addPoint(222,54);
        lateralCasco.addPoint(215,50);
        lateralCasco.addPoint(191,50);
        casco.fillPolygon(lateralCasco);
        Polygon amarilloCasco = new Polygon();
        casco.setColor(Color.yellow);
        amarilloCasco.addPoint(207,104);
        amarilloCasco.addPoint(210,95);
        amarilloCasco.addPoint(237,96);
        amarilloCasco.addPoint(241,103);
        casco.fillPolygon(amarilloCasco);
        casco.setColor(Color.black);
        casco.fillOval(237,79,20,26);
        Polygon lampara = new Polygon();
        lampara.addPoint(255,83);
        lampara.addPoint(274,99);
        lampara.addPoint(274,108);
        lampara.addPoint(266,106);
        lampara.addPoint(254,105);
        lampara.addPoint(248,103);
        casco.fillPolygon(lampara);
        casco.setColor(Color.lightGray);
        casco.fillOval(241,83,11,18);
        casco.setColor(Color.black);
        casco.setStroke(new BasicStroke(1.5f));
        casco.draw(new Line2D.Double(205,104,207,104));
        casco.draw(new Line2D.Double(207,104,210,95));
        casco.draw(new Line2D.Double(210,95,237,96));
        casco.draw(new Line2D.Double(237,96,238,87));
        casco.draw(new Line2D.Double(238,87,240,82));
        casco.draw(new Line2D.Double(240,82,244,79));
        casco.draw(new Line2D.Double(244,79,250,79));
        casco.draw(new Line2D.Double(250,79,249,76));
        casco.draw(new Line2D.Double(249,76,235,61));
        casco.draw(new Line2D.Double(235,61,226,55));
        casco.draw(new Line2D.Double(226,55,222,54));
        casco.draw(new Line2D.Double(222,54,215,50));
        casco.draw(new Line2D.Double(215,50,191,50));
        casco.setColor(Color.black);
        casco.draw(new Line2D.Double(184,28,196,34));
        casco.draw(new Line2D.Double(196,34,213,48));
        casco.draw(new Line2D.Double(213,48,187,48));
        casco.setColor(Color.black);
        casco.draw(new Line2D.Double(152,112,145,96));
        casco.draw(new Line2D.Double(145,96,157,84));
        casco.draw(new Line2D.Double(157,84,154,68));
        casco.draw(new Line2D.Double(154,68,162,53));
        casco.draw(new Line2D.Double(162,53,188,49));
        casco.draw(new Line2D.Double(188,49,198,63));
        casco.draw(new Line2D.Double(198,63,198,79));
        casco.draw(new Line2D.Double(198,79,208,86));
        casco.draw(new Line2D.Double(208,86,205,104));
        casco.setColor(Color.black);
        casco.draw(new Line2D.Double(172,51,173,28));
        casco.draw(new Line2D.Double(173,28,183,28));
        casco.draw(new Line2D.Double(183,28,183,34));
        casco.draw(new Line2D.Double(183,34,186,49));
        casco.draw(new Line2D.Double(210,96,214,83));
        casco.draw(new Line2D.Double(214,83,202,76));
        casco.draw(new Line2D.Double(202,76,202,61));
        casco.draw(new Line2D.Double(202,61,193,49));
        casco.setStroke(new BasicStroke(1.2f));
        QuadCurve2D cc1 = new QuadCurve2D.Double();
        cc1.setCurve(213,57,222,71,222,96);
        casco.draw(cc1);
        QuadCurve2D cc2 = new QuadCurve2D.Double();
        cc2.setCurve(219,51,229,62,232,96);
        casco.draw(cc2);
        QuadCurve2D cc3 = new QuadCurve2D.Double();
        cc3.setCurve(230,56,237,66,239,83);
        casco.draw(cc3);
        casco.setStroke(new BasicStroke(1.0f));
        //oreja izquierda
        Graphics2D orejaIzquierda = (Graphics2D) g;
        QuadCurve2D oi1 = new QuadCurve2D.Double();
        oi1.setCurve(243,119,256,154,256,181);
        orejaIzquierda.draw(oi1);
        QuadCurve2D oi2 = new QuadCurve2D.Double();
        oi2.setCurve(256,181,257,193,263,208);
        orejaIzquierda.draw(oi2);
        QuadCurve2D oi3 = new QuadCurve2D.Double();
        oi3.setCurve(263,208,267,212,271,208);
        orejaIzquierda.draw(oi3);
        QuadCurve2D oi4 = new QuadCurve2D.Double();
        oi4.setCurve(271,208,291,188,304,169);
        orejaIzquierda.draw(oi4);
        QuadCurve2D oi5 = new QuadCurve2D.Double();
        oi5.setCurve(304,169,305,165,300,154);
        orejaIzquierda.draw(oi5);
        QuadCurve2D oi6 = new QuadCurve2D.Double();
        oi6.setCurve(300,154,295,144,270,120);
        orejaIzquierda.draw(oi6);
        orejaIzquierda.fillOval(283,157,10,12);
        orejaIzquierda.fillOval(288,163,10,12);
        orejaIzquierda.fillOval(290,157,11,9);
        orejaIzquierda.fillOval(290,155,5,4);
        QuadCurve2D oi7 = new QuadCurve2D.Double();
        oi7.setCurve(269,120,266,136,284,135);
        orejaIzquierda.draw(oi7);
        orejaIzquierda.fill(oi7);
        orejaIzquierda.fillOval(269,132,15,15);
        orejaIzquierda.fillOval(262,121,13,15);
        //oreja derecha
        Graphics2D orejaDerecha = (Graphics2D) g;
        QuadCurve2D od1 = new QuadCurve2D.Double();
        od1.setCurve(157,128,155,164,154,175);
        orejaDerecha.draw(od1);
        //lado del cachete
        QuadCurve2D od2 = new QuadCurve2D.Double();
        od2.setCurve(154,175,152,183,152,192);
        orejaDerecha.draw(od2);
        QuadCurve2D od3 = new QuadCurve2D.Double();
        od3.setCurve(153,129,146,145,142,190);
        orejaDerecha.draw(od3);
        QuadCurve2D od4 = new QuadCurve2D.Double();
        od4.setCurve(142,190,143,198,149,214);
        orejaDerecha.draw(od4);
        QuadCurve2D od5 = new QuadCurve2D.Double();
        od5.setCurve(149,214,151,217,156,213);
        orejaDerecha.draw(od5);
        QuadCurve2D od6 = new QuadCurve2D.Double();
        od6.setCurve(156,213,157,213,160,205);
        orejaDerecha.draw(od6);
        QuadCurve2D od7 = new QuadCurve2D.Double();
        od7.setCurve(143,175,152,160,150,141);
        orejaDerecha.draw(od7);
        orejaDerecha.fill(od7);
        orejaDerecha.fillOval(148,160,5,10);
        //resto cara
        Graphics2D cara = (Graphics2D) g;
        QuadCurve2D c14 = new QuadCurve2D.Double();
        c14.setCurve(152,192,165,212,171,222);
        cara.draw(c14);
        QuadCurve2D c15 = new QuadCurve2D.Double();
        c15.setCurve(171,222,184,241,196,243);
        cara.draw(c15);
        QuadCurve2D c16 = new QuadCurve2D.Double();
        c16.setCurve(196,243,211,241,224,231);
        cara.draw(c16);
        cara.draw(new Line2D.Double(193,242,193,253));
        QuadCurve2D c17 = new QuadCurve2D.Double();
        c17.setCurve(192,253,223,254,238,244);
        cara.draw(c17);
        cara.draw(new Line2D.Double(238,244,239,223));
        QuadCurve2D c18 = new QuadCurve2D.Double();
        c18.setCurve(239,223,251,215,260,196);
        cara.draw(c18);
        cara.fillOval(232,170,9,12);
        cara.fillOval(239,169,9,12);
        cara.fillOval(236,178,9,12);
        //chaleco
        Graphics2D cuerpo = (Graphics2D) g;
        cuerpo.setColor(Color.red);
        Polygon rojoChaleco = new Polygon();
        rojoChaleco.addPoint(191,272);
        rojoChaleco.addPoint(189,272);
        rojoChaleco.addPoint(184,279);
        rojoChaleco.addPoint(182,286);
        rojoChaleco.addPoint(181,291);
        rojoChaleco.addPoint(179,299);
        rojoChaleco.addPoint(179,310);
        rojoChaleco.addPoint(179,313);
        rojoChaleco.addPoint(180,317);
        rojoChaleco.addPoint(182,321);
        rojoChaleco.addPoint(184,327);
        rojoChaleco.addPoint(185,330);
        rojoChaleco.addPoint(189,336);
        rojoChaleco.addPoint(193,341);
        rojoChaleco.addPoint(196,345);
        rojoChaleco.addPoint(199,345);
        rojoChaleco.addPoint(202,348);
        rojoChaleco.addPoint(205,350);
        rojoChaleco.addPoint(210,352);
        rojoChaleco.addPoint(212,353);
        rojoChaleco.addPoint(212,350);
        rojoChaleco.addPoint(208,349);
        rojoChaleco.addPoint(204,345);
        rojoChaleco.addPoint(203,341);
        rojoChaleco.addPoint(200,341);
        rojoChaleco.addPoint(199,337);
        rojoChaleco.addPoint(196,331);
        rojoChaleco.addPoint(195,324);
        rojoChaleco.addPoint(197,324);
        rojoChaleco.addPoint(201,333);
        rojoChaleco.addPoint(206,339);
        rojoChaleco.addPoint(209,343);
        rojoChaleco.addPoint(210,348);
        rojoChaleco.addPoint(212,348);
        rojoChaleco.addPoint(216,353);
        rojoChaleco.addPoint(218,353);
        rojoChaleco.addPoint(218,339);
        rojoChaleco.addPoint(238,321);
        rojoChaleco.addPoint(247,322);
        rojoChaleco.addPoint(254,330);
        rojoChaleco.addPoint(253,346);
        rojoChaleco.addPoint(262,344);
        rojoChaleco.addPoint(275,333);
        rojoChaleco.addPoint(281,333);
        rojoChaleco.addPoint(286,329);
        rojoChaleco.addPoint(290,322);
        rojoChaleco.addPoint(289,321);
        rojoChaleco.addPoint(291,316);
        rojoChaleco.addPoint(291,291);
        rojoChaleco.addPoint(289,287);
        rojoChaleco.addPoint(283,285);
        rojoChaleco.addPoint(275,282);
        rojoChaleco.addPoint(268,280);
        rojoChaleco.addPoint(263,274);
        rojoChaleco.addPoint(258,271);
        rojoChaleco.addPoint(251,269);
        rojoChaleco.addPoint(243,262);
        rojoChaleco.addPoint(191,270);
        cuerpo.fillPolygon(rojoChaleco);
        cuerpo.setColor(Color.black);
        cuerpo.setStroke(new BasicStroke(1.5f));
        QuadCurve2D c31 = new QuadCurve2D.Double();
        c31.setCurve(189,270,170,302,189,334);
        cuerpo.draw(c31);
        QuadCurve2D c32 = new QuadCurve2D.Double();
        c32.setCurve(189,334,198,349,219,352);
        cuerpo.draw(c32);
        QuadCurve2D c33 = new QuadCurve2D.Double();
        c33.setCurve(219,352,215,350,214,347);
        cuerpo.draw(c33);
        QuadCurve2D c34 = new QuadCurve2D.Double();
        c34.setCurve(215,351,200,350,195,323);
        cuerpo.draw(c34);
        QuadCurve2D c35 = new QuadCurve2D.Double();
        c35.setCurve(214,347,204,337,197,323);
        cuerpo.draw(c35);
        cuerpo.draw(new Line2D.Double(219,352,219,336));
        QuadCurve2D c36 = new QuadCurve2D.Double();
        c36.setCurve(219,337,228,324,247,320);
        cuerpo.draw(c36);
        QuadCurve2D c37 = new QuadCurve2D.Double();
        c37.setCurve(247,320,251,322,253,328);
        cuerpo.draw(c37);
        QuadCurve2D c38 = new QuadCurve2D.Double();
        c38.setCurve(215,352,213,333,218,327);
        cuerpo.draw(c38);
        QuadCurve2D c39 = new QuadCurve2D.Double();
        c39.setCurve(218,327,224,317,235,311);
        cuerpo.draw(c39);
        cuerpo.draw(new Line2D.Double(235,311,248,311));
        QuadCurve2D c310 = new QuadCurve2D.Double();
        c310.setCurve(248,311,257,316,258,322);
        cuerpo.draw(c310);
        cuerpo.draw(new Line2D.Double(258,322,258,331));
        QuadCurve2D c311 = new QuadCurve2D.Double();
        c311.setCurve(258,331,259,334,254,339);
        cuerpo.draw(c311);
        QuadCurve2D c312 = new QuadCurve2D.Double();
        c312.setCurve(254,346,276,340,287,315);
        cuerpo.draw(c312);
        cuerpo.draw(new Line2D.Double(287,315,287,291));
        QuadCurve2D c313 = new QuadCurve2D.Double();
        c313.setCurve(287,291,286,286,283,281);
        cuerpo.draw(c313);
        cuerpo.draw(new Line2D.Double(276,332,283,332));
        QuadCurve2D c314 = new QuadCurve2D.Double();
        c314.setCurve(283,332,298,319,288,283);
        cuerpo.draw(c314);
        QuadCurve2D c315 = new QuadCurve2D.Double();
        c315.setCurve(265,324,276,321,283,312);
        cuerpo.draw(c315);
        cuerpo.draw(new Line2D.Double(283,312,283,299));
        cuerpo.draw(new Line2D.Double(282,296,261,298));
        cuerpo.fillOval(270,301,5,5);
        QuadCurve2D c316 = new QuadCurve2D.Double();
        c316.setCurve(282,296,274,322,261,298);
        cuerpo.draw(c316);
        //mochila
        Graphics2D mochila = (Graphics2D) g;
        mochila.setColor(Color.red);
        Polygon extintor = new Polygon();
        extintor.addPoint(290,282);
        extintor.addPoint(297,284);
        extintor.addPoint(302,285);
        extintor.addPoint(306,286);
        extintor.addPoint(313,286);
        extintor.addPoint(316,285);
        extintor.addPoint(317,282);
        extintor.addPoint(320,279);
        extintor.addPoint(322,275);
        extintor.addPoint(324,271);
        extintor.addPoint(324,263);
        extintor.addPoint(322,262);
        extintor.addPoint(321,258);
        extintor.addPoint(320,257);
        extintor.addPoint(317,254);
        extintor.addPoint(314,252);
        extintor.addPoint(313,243);
        extintor.addPoint(311,242);
        extintor.addPoint(308,240);
        extintor.addPoint(307,238);
        extintor.addPoint(303,238);
        extintor.addPoint(300,237);
        extintor.addPoint(298,235);
        extintor.addPoint(295,234);
        extintor.addPoint(292,232);
        extintor.addPoint(286,231);
        extintor.addPoint(281,229);
        extintor.addPoint(273,229);
        extintor.addPoint(273,227);
        extintor.addPoint(272,225);
        extintor.addPoint(265,225);
        extintor.addPoint(262,227);
        extintor.addPoint(256,227);
        extintor.addPoint(253,231);
        extintor.addPoint(252,233);
        extintor.addPoint(249,234);
        extintor.addPoint(240,235);
        extintor.addPoint(240,240);
        extintor.addPoint(242,241);
        extintor.addPoint(243,244);
        extintor.addPoint(244,247);
        extintor.addPoint(245,249);
        extintor.addPoint(245,257);
        extintor.addPoint(244,258);
        extintor.addPoint(241,262);
        extintor.addPoint(240,262);
        extintor.addPoint(246,278);
        extintor.addPoint(290,288);
        mochila.fillPolygon(extintor);
        mochila.setColor(Color.black);
        mochila.draw(new Line2D.Double(288,282,296,283));
        QuadCurve2D m1 = new QuadCurve2D.Double();
        m1.setCurve(296,283,309,292,313,298);
        mochila.draw(m1);
        QuadCurve2D m2 = new QuadCurve2D.Double();
        m2.setCurve(288,283,290,286,292,291);
        mochila.draw(m2);
        mochila.draw(new Line2D.Double(289,283,277,281));
        QuadCurve2D m3 = new QuadCurve2D.Double();
        m3.setCurve(278,280,285,285,286,290);
        mochila.draw(m3);
        QuadCurve2D m4 = new QuadCurve2D.Double();
        m4.setCurve(277,279,300,263,282,239);
        mochila.draw(m4);
        mochila.draw(new Line2D.Double(282,239,319,254));
        QuadCurve2D m5 = new QuadCurve2D.Double();
        m5.setCurve(317,254,332,276,312,287);
        mochila.draw(m5);
        mochila.draw(new Line2D.Double(312,287,290,283));
        mochila.draw(new Line2D.Double(314,251,314,243));
        mochila.draw(new Line2D.Double(314,243,282,229));
        mochila.draw(new Line2D.Double(282,229,276,228));
        mochila.draw(new Line2D.Double(276,228,276,238));
        mochila.draw(new Line2D.Double(276,228,249,233));
        mochila.draw(new Line2D.Double(249,233,240,234));
        mochila.draw(new Line2D.Double(274,228,272,224));
        mochila.draw(new Line2D.Double(272,224,254,228));
        mochila.draw(new Line2D.Double(254,228,249,234));
        QuadCurve2D m6 = new QuadCurve2D.Double();
        m6.setCurve(277,280,264,276,261,263);
        mochila.draw(m6);
        QuadCurve2D m7 = new QuadCurve2D.Double();
        m7.setCurve(243,259,250,267,264,271);
        mochila.draw(m7);
        QuadCurve2D m8 = new QuadCurve2D.Double();
        m8.setCurve(263,249,265,241,276,238);
        mochila.draw(m8);
        mochila.draw(new Line2D.Double(276,238,282,240));
        QuadCurve2D m9 = new QuadCurve2D.Double();
        m9.setCurve(266,243,263,235,249,234);
        mochila.draw(m9);
        //manguera gris
        mochila.draw(new Line2D.Double(250,250,265,250));
        mochila.draw(new Line2D.Double(250,261,260,262));
        QuadCurve2D m10 = new QuadCurve2D.Double();
        m10.setCurve(249,261,247,256,250,251);
        mochila.draw(m10);
        QuadCurve2D m11 = new QuadCurve2D.Double();
        m11.setCurve(269,252,272,257,268,265);
        mochila.draw(m11);
        Polygon gris = new Polygon();
        mochila.setColor(Color.lightGray);
        gris.addPoint(267,265);
        gris.addPoint(269,265);
        gris.addPoint(270,260);
        gris.addPoint(270,254);
        gris.addPoint(269,253);
        gris.addPoint(264,250);
        gris.addPoint(250,250);
        gris.addPoint(249,253);
        gris.addPoint(249,259);
        gris.addPoint(250,261);
        gris.addPoint(260,261);
        gris.addPoint(260,263);
        gris.addPoint(266,263);
        gris.addPoint(266,265);
        mochila.fillPolygon(gris);
        //patas
        cuerpo.setStroke(new BasicStroke(2f));
        cuerpo.setColor(Color.black);
        cuerpo.draw(new Line2D.Double(253,328,254,359));
        cuerpo.draw(new Line2D.Double(254,359,261,419));
        QuadCurve2D c41 = new QuadCurve2D.Double();
        c41.setCurve(220,353,224,356,225,370);
        cuerpo.draw(c41);
        cuerpo.draw(new Line2D.Double(225,370,225,423));
        QuadCurve2D c42 = new QuadCurve2D.Double();
        c42.setCurve(225,423,210,454,226,474);
        cuerpo.draw(c42);
        cuerpo.draw(new Line2D.Double(226,474,234,474));
        QuadCurve2D c43 = new QuadCurve2D.Double();
        c43.setCurve(236,429,230,447,236,474);
        cuerpo.draw(c43);
        QuadCurve2D c44 = new QuadCurve2D.Double();
        c44.setCurve(254,427,259,450,256,471);
        cuerpo.draw(c44);
        QuadCurve2D c45 = new QuadCurve2D.Double();
        c45.setCurve(256,471,245,478,236,471);
        cuerpo.draw(c45);
        QuadCurve2D c46 = new QuadCurve2D.Double();
        c46.setCurve(257,471,267,475,272,465);
        cuerpo.draw(c46);
        cuerpo.draw(new Line2D.Double(272,465,272,438));
        QuadCurve2D c47 = new QuadCurve2D.Double();
        c47.setCurve(272,438,269,426,260,419);
        cuerpo.draw(c47);
        QuadCurve2D c48 = new QuadCurve2D.Double();
        c48.setCurve(230,421,243,416,257,420);
        cuerpo.draw(c48);
        //pata 2
        cuerpo.draw(new Line2D.Double(212,354,210,448));
        QuadCurve2D c49 = new QuadCurve2D.Double();
        c49.setCurve(210,448,196,456,169,457);
        cuerpo.draw(c49);
        QuadCurve2D c410 = new QuadCurve2D.Double();
        c410.setCurve(169,457,164,436,171,415);
        cuerpo.draw(c410);
        cuerpo.draw(new Line2D.Double(167,455,161,454));
        QuadCurve2D c411 = new QuadCurve2D.Double();
        c411.setCurve(161,454,157,432,168,408);
        cuerpo.draw(c411);
        QuadCurve2D c412 = new QuadCurve2D.Double();
        c412.setCurve(161,411,169,404,187,411);
        cuerpo.draw(c412);
        QuadCurve2D c413 = new QuadCurve2D.Double();
        c413.setCurve(161,411,148,434,159,449);
        cuerpo.draw(c413);
        cuerpo.draw(new Line2D.Double(184,326,180,408));
        //pata 3
        cuerpo.draw(new Line2D.Double(269,339,266,395));
        QuadCurve2D c414 = new QuadCurve2D.Double();
        c414.setCurve(273,397,264,394,258,396);
        cuerpo.draw(c414);
        cuerpo.draw(new Line2D.Double(289,402,288,355));
        QuadCurve2D c415 = new QuadCurve2D.Double();
        c415.setCurve(288,355,287,336,282,333);
        cuerpo.draw(c415);
        //pata 4
        cuerpo.draw(new Line2D.Double(306,291,323,440));
        cuerpo.draw(new Line2D.Double(323,440,300,452));
        QuadCurve2D c416 = new QuadCurve2D.Double();
        c416.setCurve(300,452,289,453,289,452);
        cuerpo.draw(c416);
        QuadCurve2D c417 = new QuadCurve2D.Double();
        c417.setCurve(297,405,275,399,266,424);
        cuerpo.draw(c417);
        QuadCurve2D c418 = new QuadCurve2D.Double();
        c418.setCurve(289,452,282,429,289,414);
        cuerpo.draw(c418);
        QuadCurve2D c419 = new QuadCurve2D.Double();
        c419.setCurve(280,414,274,430,276,449);
        cuerpo.draw(c419);
        QuadCurve2D c420 = new QuadCurve2D.Double();
        c420.setCurve(276,449,281,455,287,451);
        cuerpo.draw(c420);
        cuerpo.draw(new Line2D.Double(275,450,271,450));
        //cola
        QuadCurve2D c421 = new QuadCurve2D.Double();
        c421.setCurve(306,290,315,298,318,312);
        cuerpo.draw(c421);
        QuadCurve2D c422 = new QuadCurve2D.Double();
        c422.setCurve(318,312,324,324,337,333);
        cuerpo.draw(c422);
        QuadCurve2D c423 = new QuadCurve2D.Double();
        c423.setCurve(337,333,340,337,337,340);
        cuerpo.draw(c423);
        QuadCurve2D c424 = new QuadCurve2D.Double();
        c424.setCurve(337,340,321,337,311,323);
        cuerpo.draw(c424);
        //manchas de las patas
        cuerpo.fillOval(300,395,10,10);
        cuerpo.fillOval(305,391,6,10);

        cuerpo.fillOval(294,365,10,13);
        cuerpo.fillOval(295,375,10,13);
        cuerpo.fillOval(303,371,8,13);
        cuerpo.fillOval(300,361,10,17);

        cuerpo.fillOval(294,334,10,10);
        cuerpo.fillOval(300,326,10,16);
        cuerpo.fillOval(304,339,10,10);

        cuerpo.fillOval(233,354,14,24);
        cuerpo.fillOval(228,366,25,12);
        cuerpo.fillOval(239,370,10,10);

        cuerpo.fillOval(235,393,6,10);
        cuerpo.fillOval(237,402,6,10);
        cuerpo.fillOval(237,398,10,10);
        cuerpo.fillOval(242,404,10,8);

        cuerpo.fillOval(182,354,12,22);
        cuerpo.fillOval(189,348,6,15);
        cuerpo.fillOval(190,360,6,8);

        cuerpo.fillOval(188,386,8,10);
        cuerpo.fillOval(186,394,6,12);
        cuerpo.fillOval(183,390,10,12);

        cuerpo.fillOval(315,312,4,10);
        cuerpo.fillOval(318,317,6,12);
        //collar
        Graphics2D collar = (Graphics2D) g;
        collar.setStroke(new BasicStroke(1.0f));
        Polygon collarAmarillo = new Polygon();
        collar.setColor(Color.yellow);
        collarAmarillo.addPoint(203,255);
        collarAmarillo.addPoint(203,270);
        collarAmarillo.addPoint(221,270);
        collarAmarillo.addPoint(226,268);
        collarAmarillo.addPoint(232,265);
        collarAmarillo.addPoint(239,261);
        collarAmarillo.addPoint(243,259);
        collarAmarillo.addPoint(243,248);
        collarAmarillo.addPoint(242,244);
        collarAmarillo.addPoint(239,242);
        collarAmarillo.addPoint(239,245);
        collarAmarillo.addPoint(236,246);
        collarAmarillo.addPoint(232,248);
        collarAmarillo.addPoint(228,251);
        collarAmarillo.addPoint(223,253);
        collarAmarillo.addPoint(217,254);
        collarAmarillo.addPoint(206,255);
        collar.fillPolygon(collarAmarillo);
        collar.setColor(Color.black);
        QuadCurve2D cr1 = new QuadCurve2D.Double();
        cr1.setCurve(213,271,230,269,244,257);
        collar.draw(cr1);
        QuadCurve2D cr2 = new QuadCurve2D.Double();
        cr2.setCurve(244,257,244,249,241,240);
        collar.draw(cr2);
        collar.draw(new Line2D.Double(241,240,238,240));
        //placa collar
        Polygon placa = new Polygon();
        collar.setColor(Color.lightGray);
        placa.addPoint(197,254);
        placa.addPoint(202,254);
        placa.addPoint(202,264);
        placa.addPoint(197,264);
        collar.fillPolygon(placa);
        collar.setColor(Color.black);
        collar.setStroke(new BasicStroke(2f));
        collar.draw(new Line2D.Double(203,254,203,265));
        collar.draw(new Line2D.Double(196,254,196,265));
        collar.setStroke(new BasicStroke(1.0f));
        Polygon placaGris = new Polygon();
        collar.setColor(Color.lightGray);
        placaGris.addPoint(193,265);
        placaGris.addPoint(206,265);
        placaGris.addPoint(206,272);
        placaGris.addPoint(208,276);
        placaGris.addPoint(211,280);
        placaGris.addPoint(211,287);
        placaGris.addPoint(207,295);
        placaGris.addPoint(204,301);
        placaGris.addPoint(199,307);
        placaGris.addPoint(192,300);
        placaGris.addPoint(187,290);
        placaGris.addPoint(186,279);
        placaGris.addPoint(192,272);
        placaGris.addPoint(193,266);
        collar.fillPolygon(placaGris);
        Polygon bordePlaca = new Polygon();
        bordePlaca.addPoint(207,268);
        bordePlaca.addPoint(211,269);
        bordePlaca.addPoint(212,275);
        bordePlaca.addPoint(215,280);
        bordePlaca.addPoint(215,289);
        bordePlaca.addPoint(212,298);
        bordePlaca.addPoint(205,306);
        bordePlaca.addPoint(201,306);
        collar.fillPolygon(bordePlaca);
        collar.setColor(Color.black);
        //frontal placa
        collar.draw(new Line2D.Double(193,265,206,265));
        collar.draw(new Line2D.Double(206,265,206,272));
        collar.draw(new Line2D.Double(206,272,208,276));
        collar.draw(new Line2D.Double(208,276,211,280));
        collar.draw(new Line2D.Double(211,280,207,295));
        collar.draw(new Line2D.Double(207,295,204,301));
        collar.draw(new Line2D.Double(204,301,199,307));
        collar.draw(new Line2D.Double(199,307,192,300));
        collar.draw(new Line2D.Double(192,300,187,290));
        collar.draw(new Line2D.Double(187,290,186,279));
        collar.draw(new Line2D.Double(186,279,192,272));
        collar.draw(new Line2D.Double(192,272,193,266));
        //borde placa
        collar.draw(new Line2D.Double(207,268,211,269));
        collar.draw(new Line2D.Double(211,269,212,275));
        collar.draw(new Line2D.Double(212,275,215,280));
        collar.draw(new Line2D.Double(215,280,212,298));
        collar.draw(new Line2D.Double(212,298,205,306));
        collar.draw(new Line2D.Double(205,306,201,306));
        //interior de la placa
        Polygon placaRoja = new Polygon();
        collar.setColor(Color.red);
        placaRoja.addPoint(195,269);
        placaRoja.addPoint(202,269);
        placaRoja.addPoint(202,276);
        placaRoja.addPoint(204,280);
        placaRoja.addPoint(207,280);
        placaRoja.addPoint(207,288);
        placaRoja.addPoint(203,296);
        placaRoja.addPoint(200,300);
        placaRoja.addPoint(198,301);
        placaRoja.addPoint(193,296);
        placaRoja.addPoint(189,287);
        placaRoja.addPoint(189,280);
        placaRoja.addPoint(194,276);
        placaRoja.addPoint(195,269);
        collar.fillPolygon(placaRoja);
        //llama de la placa
        Polygon llama = new Polygon();
        collar.setColor(Color.yellow);
        llama.addPoint(193,286);
        llama.addPoint(196,284);
        llama.addPoint(195,280);
        llama.addPoint(197,278);
        llama.addPoint(199,284);
        llama.addPoint(202,283);
        llama.addPoint(202,285);
        llama.addPoint(201,288);
        llama.addPoint(204,287);
        llama.addPoint(202,294);
        llama.addPoint(197,296);
        llama.addPoint(194,291);
        llama.addPoint(194,286);
        collar.fillPolygon(llama);
        Polygon collar2 = new Polygon();
        collar2.addPoint(194,267);
        collar2.addPoint(191,267);
        collar2.addPoint(191,270);
        collar2.addPoint(189,270);
        collar2.addPoint(189,253);
        collar2.addPoint(191,250);
        collar2.addPoint(191,256);
        collar2.addPoint(194,256);
        collar2.addPoint(194,266);
        collar.fillPolygon(collar2);
        collar.setColor(Color.black);
        collar.draw(new Line2D.Double(191,271,187,270));
        QuadCurve2D c21 = new QuadCurve2D.Double();
        c21.setCurve(188,270,187,260,192,249);
        collar.draw(c21);

    }
}
