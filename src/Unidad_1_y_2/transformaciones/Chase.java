package Unidad_1_y_2.transformaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

public class Chase extends JPanel {
    AffineTransform at = new AffineTransform();
    private int altoyancho;
    private int xCoord, yCoord;
    public void init(){
        //initialize drawing colors
        this.setMinimumSize(new Dimension(500, 500));
        this.setMaximumSize(new Dimension(500, 500));
        this.setSize(500,500);
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

    public Chase(int aa, int xIncial, int yInicial){
        altoyancho = aa;
        xCoord = xIncial;
        yCoord = yInicial;
    }
    public void paint(Graphics g) {
        //Color cafe de patitas
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setTransform(at);
        Color cafe = new Color(140, 92, 45);
        g2.setColor(cafe);
        g2.setStroke(new BasicStroke(4.0f));
        GeneralPath p = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        p.moveTo(283, 382);
        p.lineTo(283, 427);
        p.curveTo(283,427,267,432,270,462);
        p.curveTo(270, 462, 286, 462, 314, 459);
        p.lineTo(314, 459);
        p.lineTo(319, 433);
        p.lineTo(319, 396);
        g2.fill(p);
        p.closePath();
        //
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath pe = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        pe.moveTo(283, 382);
        pe.lineTo(283, 427);
        pe.curveTo(283,427,267,432,270,462);
        pe.curveTo(270, 462, 286, 462, 314, 459);
        pe.lineTo(314, 459);
        pe.lineTo(319, 433);
        pe.lineTo(319, 396);
        g2.draw(pe);
        pe.closePath();

        //2
        g2.setColor(cafe);
        g2.setStroke(new BasicStroke(4.0f));
        GeneralPath p1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        p1.moveTo(324, 389);
        p1.lineTo(334, 441);
        p1.curveTo(334, 441, 326, 458, 330, 473);
        p1.curveTo(330, 473, 353, 478, 379, 473);
        p1.lineTo(379, 473);
        p1.lineTo(377, 441);
        p1.lineTo(362, 376);
        g2.fill(p1);
        p1.closePath();
        //
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath p12 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        p12.moveTo(324, 389);
        p12.lineTo(334, 441);
        p12.curveTo(334, 441, 326, 458, 330, 473);
        p12.curveTo(330, 473, 353, 478, 379, 473);
        p12.lineTo(379, 473);
        p12.lineTo(377, 441);
        p12.lineTo(362, 376);
        g2.draw(p12);
        p12.closePath();

        //3
        g2.setColor(cafe);
        g2.setStroke(new BasicStroke(4.0f));
        GeneralPath p2=new GeneralPath(GeneralPath.WIND_NON_ZERO);
        p2.moveTo(389, 392);
        p2.lineTo(391, 420);
        p2.curveTo(391, 420	, 370, 423, 367, 448);
        p2.curveTo(367, 448, 391, 452, 414, 448);
        p2.lineTo(414, 448);
        p2.lineTo(417, 426);
        p2.lineTo(417,384);
        g2.fill(p2);
        p2.closePath();
        //
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath pw = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        pw.moveTo(389, 392);
        pw.lineTo(391, 420);
        pw.curveTo(391, 420	, 370, 423, 367, 448);
        pw.curveTo(367, 448, 391, 452, 414, 448);
        pw.lineTo(414, 448);
        pw.lineTo(417, 426);
        pw.lineTo(417,384);
        g2.draw(pw);
        pw.closePath();

        //4
        g2.setColor(cafe);
        g2.setStroke(new BasicStroke(4.0f));
        GeneralPath p3=new GeneralPath(GeneralPath.WIND_NON_ZERO);
        p3.moveTo(413, 380);
        p3.lineTo(423, 426);
        p3.curveTo(423,426,407,435,405,456);
        p3.curveTo(405, 456, 426, 457, 449, 454);
        p3.lineTo(449, 454);
        p3.lineTo(450, 417);
        p3.lineTo(433, 350);
        g2.fill(p3);
        p3.closePath();
        //
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath pq = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        pq.moveTo(413, 380);
        pq.lineTo(423, 426);
        pq.curveTo(423,426,407,435,405,456);
        pq.curveTo(405, 456, 426, 457, 449, 454);
        pq.lineTo(449, 454);
        pq.lineTo(450, 417);
        pq.lineTo(433, 350);
        g2.draw(pq);
        pq.closePath();

        //Colita
        g2.setColor(cafe);
        g2.setStroke(new BasicStroke(4.0f));
        GeneralPath c2=new GeneralPath(GeneralPath.WIND_NON_ZERO);
        c2.moveTo(432, 348);
        c2.lineTo(457, 333);
        c2.curveTo(457, 333, 477, 316, 478, 292);
        c2.curveTo(478, 292, 462, 299, 447, 319);
        c2.lineTo(447, 319);
        c2.lineTo(434, 319);
        g2.fill(c2);
        c2.closePath();
        //
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath c12 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        c12.moveTo(432, 348);
        c12.lineTo(457, 333);
        c12.curveTo(457, 333, 477, 316, 478, 292);
        c12.curveTo(478, 292, 462, 299, 447, 319);
        c12.lineTo(447, 319);
        c12.lineTo(434, 319);
        g2.draw(c12);
        c12.closePath();



        //Color azul y cuerpo
        Graphics2D g3 = (Graphics2D) g;
        Color Azul = new Color(0, 0, 112);
        g3.setColor(Azul);
        g3.setStroke(new BasicStroke(3.0f));
        GeneralPath c1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        c1.moveTo(283, 343);
        c1.lineTo(284, 389);
        c1.curveTo(284, 389, 305, 400, 331, 401);
        c1.curveTo(331, 401, 332, 379, 349, 378);
        c1.lineTo(367, 398);
        c1.lineTo(407, 391);
        c1.curveTo(407, 391, 434, 374, 431, 340);
        c1.lineTo(287, 321);
        c1.lineTo(285, 342);
        c1.lineTo(320, 346);
        c1.lineTo(376, 345);
        c1.lineTo(423, 345);
        c1.lineTo(421, 332);
        c1.lineTo(405, 332);
        c1.lineTo(373, 319);
        c1.lineTo(358, 312);
        c1.curveTo(358, 312, 323, 321, 286, 323);
        g3.fill(c1);
        c1.closePath();
        //
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath c13 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        c13.moveTo(283, 343);
        c13.lineTo(284, 389);
        c13.curveTo(284, 389, 305, 400, 331, 401);
        c13.curveTo(331, 401, 332, 379, 349, 378);
        c13.lineTo(367, 398);
        c13.lineTo(407, 391);
        c13.curveTo(407, 391, 434, 374, 431, 340);
        g3.draw(c13);
        c13.closePath();
        //mochila
        g3.setColor(Azul);
        g3.setStroke(new BasicStroke(4.0f));
        GeneralPath m=new GeneralPath(GeneralPath.WIND_NON_ZERO);
        m.moveTo(361, 260);
        m.lineTo(360, 322);
        m.lineTo(403,339);
        m.lineTo(439, 341);
        m.lineTo(447, 292);
        m.lineTo(413, 274);
        m.lineTo(374, 259);
        g3.fill(m);
        m.closePath();

        //linea
        Graphics2D g5 = (Graphics2D) g;
        g5.setStroke(new BasicStroke(4.0f));
        Color negro = new Color(0, 0, 0);
        GeneralPath l = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        g5.setColor(negro);
        l.moveTo(367, 316);
        l.lineTo(401, 329);
        l.lineTo(432, 341);
        g5.draw(l);
        l.closePath();

        //bolsa 2
        Graphics2D g9 = (Graphics2D) g;
        Color Negro1 = new Color(0, 0, 0);
        g9.setColor(Negro1);
        g9.setStroke(new BasicStroke(3.0f));
        GeneralPath b1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        b1.moveTo(421, 292);
        b1.lineTo(420, 317);
        b1.lineTo(440, 322);
        b1.lineTo(442, 330);
        b1.lineTo(425, 292);
        g9.fill(b1);
        b1.closePath();

        //Bolsita
        Graphics2D g8 = (Graphics2D) g;
        Color rojo = new Color(204, 0, 0);
        g8.setColor(rojo);
        g8.setStroke(new BasicStroke(3.0f));
        GeneralPath b = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        b.moveTo(390, 279);
        b.lineTo(384, 300);
        b.lineTo(398, 306);
        b.lineTo(410, 309);
        b.lineTo(414, 289);
        b.lineTo(403, 284);
        b.lineTo(391, 280);
        g8.fill(b);
        b.closePath();

        //Collar
        Graphics2D g4 = (Graphics2D) g;
        Color Negro = new Color(0, 0, 0);
        g4.setColor(Negro);
        g4.setStroke(new BasicStroke(3.0f));
        GeneralPath c3 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        c3.moveTo(288, 307);
        c3.lineTo(286, 322);
        c3.lineTo(319, 324);
        c3.lineTo(360, 313);
        c3.lineTo(361, 295);
        c3.lineTo(330, 299);
        c3.lineTo(289, 301);
        g4.fill(c3);
        c3.closePath();


        //cabeza
        Graphics2D g0 = (Graphics2D) g;
        Color cafe1 = new Color(140, 92, 45);
        g0.setColor(cafe1);
        g0.setStroke(new BasicStroke(14f));
        GeneralPath cabeza = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        cabeza.moveTo(254, 192);
        cabeza.lineTo(255, 240);
        cabeza.curveTo(255, 240, 235, 244, 233, 271);
        cabeza.curveTo(233, 271, 251, 275, 251, 286);
        cabeza.curveTo(251, 286, 267, 291, 270, 304);
        cabeza.lineTo(270, 304);
        cabeza.lineTo(321, 303);
        cabeza.lineTo(357, 295);
        cabeza.lineTo(355, 284);
        cabeza.lineTo(365, 271);
        cabeza.lineTo(378, 221);
        cabeza.lineTo(391, 200);
        cabeza.lineTo(396, 169);
        cabeza.lineTo(387, 130);
        cabeza.lineTo(358, 158);
        cabeza.lineTo(348, 180);
        cabeza.lineTo(310, 181);
        cabeza.lineTo(270, 178);

        g0.fill(cabeza);
        cabeza.closePath();

        //contorno cabeza
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath cabeza2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        cabeza2.moveTo(254, 192);
        cabeza2.lineTo(255, 240);
        cabeza2.curveTo(255, 240, 235, 244, 233, 271);
        cabeza2.curveTo(233, 271, 251, 275, 251, 286);
        cabeza2.curveTo(251, 286, 267, 291, 270, 304);
        cabeza2.lineTo(270, 304);
        cabeza2.lineTo(321, 303);
        cabeza2.lineTo(357, 295);
        cabeza2.lineTo(355, 284);
        cabeza2.lineTo(365, 271);
        cabeza2.lineTo(378, 221);
        cabeza2.lineTo(391, 200);
        cabeza2.lineTo(396, 169);
        cabeza2.lineTo(387, 130);
        cabeza2.lineTo(358, 158);
        cabeza2.lineTo(348, 180);
        cabeza2.lineTo(310, 181);
        cabeza2.lineTo(270, 178);
        g2.draw(cabeza2);
        cabeza2.closePath();
        // rostro
        g2.setColor(new Color(218, 165, 32));
        GeneralPath cara = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        cara.moveTo(254, 192);
        cara.lineTo(255, 240);
        cara.curveTo(255, 240, 235, 244, 233, 271);
        cara.curveTo(233, 271, 251, 275, 251, 286);
        cara.curveTo(251, 286, 267, 291, 270, 304);
        cara.lineTo(270, 304);
        cara.lineTo(321, 303);
        cara.lineTo(357, 295);
        cara.lineTo(340, 292);
        cara.curveTo(340, 292, 358,281,364,258);
        cara.curveTo(364, 258, 354, 244, 353, 207);
        cara.curveTo(353, 207, 335, 197, 311, 187);
        cara.curveTo(311, 187, 299, 193, 298, 237);
        cara.lineTo(298, 237);
        cara.lineTo(283, 237);
        cara.curveTo(283, 237, 283, 198, 267, 190);
        cara.lineTo(267, 190);
        cara.lineTo(255, 192);
        g2.fill(cara);
        cara.closePath();
        //contorno rostro
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath cara2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        cara2.moveTo(254, 192);
        cara2.lineTo(255, 240);
        cara2.curveTo(255, 240, 235, 244, 233, 271);
        cara2.curveTo(233, 271, 251, 275, 251, 286);
        cara2.curveTo(251, 286, 267, 291, 270, 304);
        cara2.lineTo(270, 304);
        cara2.lineTo(321, 303);
        cara2.lineTo(357, 295);
        cara2.lineTo(340, 292);
        cara2.curveTo(340, 292, 358,281,364,258);
        cara2.curveTo(364, 258, 354, 244, 353, 207);
        cara2.curveTo(353, 207, 335, 197, 311, 187);
        cara2.curveTo(311, 187, 299, 193, 298, 237);
        cara2.lineTo(298, 237);
        cara2.lineTo(283, 237);
        cara2.curveTo(283, 237, 283, 198, 267, 190);
        cara2.lineTo(267, 190);
        cara2.lineTo(255, 192);
        g2.draw(cara2);
        cara2.closePath();

        //parte de la oreja
        g2.setColor(new Color(220, 128, 114));
        GeneralPath coreja = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        coreja.moveTo(362, 193);
        coreja.lineTo(383, 208);
        coreja.lineTo(387, 172);
        coreja.lineTo(388, 141);
        coreja.lineTo(364, 167);
        coreja.lineTo(364, 193);
        g2.fill(coreja);
        coreja.closePath();
        //controno de la oreja
        g2.setStroke(new BasicStroke(2.5f));
        g2.setColor(Color.black);
        GeneralPath coreja2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        coreja2.moveTo(362, 193);
        coreja2.lineTo(383, 208);
        coreja2.lineTo(387, 172);
        coreja2.lineTo(388, 141);
        coreja2.lineTo(364, 167);
        coreja2.lineTo(364, 193);
        g2.draw(coreja2);
        coreja2.closePath();
        //ojo derecho
        g2.setColor(Color.white);
        g2.fillOval(310, 220, 30, 30);
        g2.setColor(new Color(238, 221, 130));
        g2.fillOval(315, 227, 20, 20);
        g2.setColor(Color.black);
        g2.fillOval(320, 234, 10, 10);
        g2.drawOval(315, 227, 20, 20);
        g2.drawOval(310,220,30,30);
        g2.setColor(Color.WHITE);
        g2.fillOval(325, 234, 3, 3);

        //ojo izquierdo
        g2.setColor(Color.white);
        g2.fillOval(256, 225, 28, 28);
        g2.setColor(new Color(238, 221, 130));
        g2.fillOval(260, 230, 20, 20);
        g2.setColor(Color.black);
        g2.fillOval(265, 236, 10, 10);
        g2.drawOval(256, 225, 28, 28);
        g2.drawOval(260, 230, 20, 20);
        g2.setColor(Color.WHITE);
        g2.fillOval(270, 237, 3, 3);

        //contorno nariz
        g2.setStroke(new BasicStroke(3.0f));
        g2.setColor(new Color(54, 54, 54));
        GeneralPath nariz2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        nariz2.moveTo(233, 250);
        nariz2.curveTo(233,250,230,272,244,274);
        nariz2.curveTo(244,274,257,274,265,267);
        nariz2.curveTo(265,267,262,253,253,249);
        nariz2.curveTo(253,249,237,248,237,259);
        g2.draw(nariz2);
        nariz2.closePath();
        g2.setStroke(new BasicStroke(3.0f));
        g2.setColor(new Color(54, 54, 54));
        GeneralPath nariz = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        nariz.moveTo(233, 250);
        nariz.curveTo(233,250,230,272,244,274);
        nariz.curveTo(244,274,257,274,265,267);
        nariz.curveTo(265,267,262,253,253,249);
        nariz.curveTo(253,249,237,248,233,250);
        g2.fill(nariz);
        nariz.closePath();

        // boca
        //Contorno de boca
        g2.setStroke(new BasicStroke(2.0f));
        g2.setColor(Color.black);
        GeneralPath orilla = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        orilla.moveTo(250, 280);
        orilla.lineTo(294, 274);
        g2.draw(orilla);
        orilla.closePath();


        //gorro

        g2.setStroke(new BasicStroke(2.0f));
        g2.setColor(Color.black);
        GeneralPath gorro= new GeneralPath(GeneralPath.WIND_NON_ZERO);
        gorro.moveTo(259, 144);
        gorro.curveTo(259, 144, 257, 176, 246, 192);
        gorro.lineTo(246, 192);
        gorro.lineTo(279, 189);
        gorro.lineTo(329, 191);
        gorro.lineTo(350, 182);
        gorro.lineTo(353, 162);
        g2.fill(gorro);
        gorro.closePath();


        // gorro2.1
        g2.setStroke(new BasicStroke(3.0f));
        g2.setColor(Color.black);
        GeneralPath gorro1= new GeneralPath(GeneralPath.WIND_NON_ZERO);
        gorro1.moveTo(259, 144);
        gorro1.lineTo(279, 182);
        gorro1.lineTo(329, 188);
        gorro1.lineTo(347, 183);
        gorro1.lineTo(303, 173);
        gorro1.lineTo(260, 176);
        gorro1.lineTo(247, 187);
        g2.fill(gorro1);
        gorro1.closePath();
        //
        g2.setStroke(new BasicStroke(5.0f));
        g2.setColor(Color.YELLOW);
        GeneralPath gorro2= new GeneralPath(GeneralPath.WIND_NON_ZERO);
        gorro2.moveTo(256, 175);
        gorro2.lineTo(349, 179);
        g2.draw(gorro2);
        gorro2.closePath();

        //
        g3.setColor(Azul);
        g3.setStroke(new BasicStroke(4.0f));
        GeneralPath gorro3=new GeneralPath(GeneralPath.WIND_NON_ZERO);
        gorro3.moveTo(260, 173);
        gorro3.lineTo(350, 176);
        gorro3.lineTo(353, 160);
        gorro3.curveTo(353, 160, 324, 140, 271, 131);
        gorro3.curveTo(271, 131, 257, 149, 259, 172);
        g3.fill(gorro3);
        gorro3.closePath();

    }
}
