package Unidad_1_y_2.paws;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Marshall extends JApplet{
    public Marshall(){
        JFrame frame = new JFrame();
        frame.setSize(500,500);
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
        //casco
        Graphics2D casco = (Graphics2D) g;
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
        //placa collar
        Graphics2D collar = (Graphics2D) g;
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
        Polygon collarAmarillo = new Polygon();
        collar.setColor(Color.yellow);
        collarAmarillo.addPoint(205,255);
        collarAmarillo.addPoint(205,264);
        collarAmarillo.addPoint(213,266);
        collarAmarillo.addPoint(213,270);
        collarAmarillo.addPoint(223,268);
        collarAmarillo.addPoint(231,265);
        collarAmarillo.addPoint(244,257);
        collarAmarillo.addPoint(243,246);
        collarAmarillo.addPoint(241,242);
        collarAmarillo.addPoint(239,241);
        collarAmarillo.addPoint(239,245);
        collarAmarillo.addPoint(236,246);
        collarAmarillo.addPoint(234,249);
        collarAmarillo.addPoint(225,251);
        collarAmarillo.addPoint(223,254);
        collarAmarillo.addPoint(206,254);
        collar.fillPolygon(collarAmarillo);
        collar.setColor(Color.black);
        QuadCurve2D cr1 = new QuadCurve2D.Double();
        cr1.setCurve(213,271,230,269,244,257);
        collar.draw(cr1);
        QuadCurve2D cr2 = new QuadCurve2D.Double();
        cr2.setCurve(244,257,244,249,241,240);
        collar.draw(cr2);
        collar.draw(new Line2D.Double(241,240,238,240));
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
    }
}
