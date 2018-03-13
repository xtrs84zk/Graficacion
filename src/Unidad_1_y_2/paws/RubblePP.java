package Unidad_1_y_2.paws;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JApplet;

public class RubblePP extends JApplet {
    private static final long serialVersionUID = 1L;
    public void init(){
        //initialize drawing colors
        this.setMinimumSize(new Dimension(500, 500));
        this.setMaximumSize(new Dimension(500, 500));
        this.setSize(500,500);
    }
    public void paint(Graphics g) {
        Graphics2D rubble = (Graphics2D) g;

        GeneralPath triangulo = new GeneralPath();
        triangulo.moveTo(470, 361);
        triangulo.lineTo(521, 371);
        triangulo.lineTo(493, 381);
        triangulo.lineTo(468, 431);
        triangulo.lineTo(470, 361);
        rubble.setColor(new Color(183, 165, 27));
        rubble.fill(triangulo);

        GeneralPath trianguloL = new GeneralPath();
        trianguloL.moveTo(470, 361);
        trianguloL.lineTo(521, 371);
        trianguloL.lineTo(493, 381);
        trianguloL.lineTo(468, 431);
        trianguloL.lineTo(470, 361);
        rubble.setColor(Color.BLACK);
        rubble.setStroke(new BasicStroke(2));
        rubble.draw(new QuadCurve2D.Double(470, 375, 483, 377, 493, 380));
        rubble.draw(trianguloL);

        GeneralPath mochila = new GeneralPath();
        mochila.moveTo(431, 493);
        mochila.curveTo(431, 493, 475, 364, 522, 373);
        mochila.curveTo(525, 373, 521, 400, 576, 417);
        mochila.curveTo(576, 417, 668, 434, 641, 508);
        mochila.curveTo(641, 508, 455, 611, 431, 493);
        rubble.setColor(new Color(240, 212, 6));
        rubble.setStroke(new BasicStroke(2));
        rubble.fill(mochila);

        GeneralPath mochilaL = new GeneralPath();
        mochilaL.moveTo(431, 493);
        mochilaL.curveTo(431, 493, 475, 364, 522, 373);
        mochilaL.curveTo(525, 373, 521, 400, 576, 417);
        mochilaL.curveTo(576, 417, 668, 434, 641, 508);
        mochilaL.curveTo(641, 508, 455, 611, 431, 493);
        rubble.setColor(Color.BLACK);
        rubble.setStroke(new BasicStroke(2));
        rubble.draw(mochilaL);

        GeneralPath mochilaCh = new GeneralPath();
        mochilaCh.moveTo(455, 511);
        mochilaCh.curveTo(455, 511, 453, 490, 473, 459);
        mochilaCh.curveTo(473, 459, 492, 412, 524, 425);
        mochilaCh.curveTo(524, 425, 597, 472, 656, 516);
        mochilaCh.curveTo(656, 516, 604, 625, 580, 615);
        mochilaCh.curveTo(580, 615, 516, 570, 455, 511);
        rubble.setColor(new Color(126, 74, 61));
        rubble.fill(mochilaCh);

        GeneralPath mochilaChL = new GeneralPath();
        mochilaChL.moveTo(455, 511);
        mochilaChL.curveTo(455, 511, 453, 490, 473, 459);
        mochilaChL.curveTo(473, 459, 492, 412, 524, 425);
        mochilaChL.curveTo(524, 425, 597, 472, 656, 516);
        mochilaChL.curveTo(656, 516, 604, 625, 580, 615);
        mochilaChL.curveTo(580, 615, 516, 570, 455, 511);
        rubble.setColor(Color.black);
        rubble.draw(mochilaChL);

        GeneralPath cuerpecito = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        cuerpecito.moveTo(130, 515);
        cuerpecito.lineTo(133, 543);
        cuerpecito.lineTo(136, 546);
        cuerpecito.curveTo(136, 546, 76, 625, 123, 677);
        cuerpecito.curveTo(123, 677, 189, 795, 224, 786);
        cuerpecito.curveTo(334, 786, 410, 789, 480, 778);
        cuerpecito.curveTo(480, 778, 561, 749, 571, 607);
        cuerpecito.curveTo(571, 607, 517, 553, 432, 492);
        cuerpecito.lineTo(130, 515);
        rubble.setColor(new Color(248, 213, 1));
        rubble.fill(cuerpecito);

        GeneralPath collar = new GeneralPath();
        collar.moveTo(130, 516);
        collar.lineTo(132, 542);
        collar.curveTo(132, 542, 211, 580, 306, 518);
        collar.lineTo(259, 509);
        collar.lineTo(130, 515);
        rubble.setColor(new Color(72, 70, 71));
        rubble.fill(collar);

        GeneralPath collarL = new GeneralPath();
        collarL.moveTo(130, 516);
        collarL.lineTo(132, 542);
        collarL.curveTo(132, 542, 211, 580, 306, 518);
        collarL.lineTo(259, 509);
        collarL.lineTo(130, 515);
        rubble.setColor(Color.black);
        rubble.setStroke(new BasicStroke(2));
        rubble.draw(collarL);

        GeneralPath cuerpecitoL = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        cuerpecitoL.moveTo(130, 515);
        cuerpecitoL.lineTo(133, 543);
        cuerpecitoL.lineTo(136, 546);
        cuerpecitoL.curveTo(136, 546, 76, 625, 123, 677);
        cuerpecitoL.curveTo(123, 677, 189, 795, 224, 786);
        cuerpecitoL.curveTo(334, 786, 410, 789, 480, 778);
        cuerpecitoL.curveTo(480, 778, 561, 749, 571, 607);
        cuerpecitoL.curveTo(571, 607, 521, 556, 432, 492);
        cuerpecitoL.lineTo(130, 515);
        rubble.setStroke(new BasicStroke(3f));
        rubble.setColor(Color.black);
        rubble.draw(cuerpecitoL);

        GeneralPath dije = new GeneralPath();
        dije.moveTo(149, 553);
        dije.curveTo(148, 553, 173, 550, 197, 555);
        dije.curveTo(197, 555, 198, 570, 215, 576);
        dije.curveTo(215, 576, 212, 623, 184, 641);
        dije.lineTo(159, 640);
        dije.curveTo(159, 640, 132, 624, 131, 576);
        dije.curveTo(131, 576, 148, 572, 149, 553);
        rubble.setColor(new Color(195, 195, 195));
        rubble.fill(dije);

        GeneralPath dijeCh = new GeneralPath();
        dijeCh.moveTo(156, 560);
        dijeCh.lineTo(181, 560);
        dijeCh.curveTo(181, 560, 180, 579, 195, 584);
        dijeCh.curveTo(195, 584, 191, 621, 167, 634);
        dijeCh.curveTo(167, 634, 142, 619, 138, 580);
        dijeCh.curveTo(138, 580, 153, 577, 156, 560);
        rubble.setColor(new Color(248, 213, 1));
        rubble.setStroke(new BasicStroke(1.3f));
        rubble.fill(dijeCh);

        GeneralPath dijeChCh = new GeneralPath();
        dijeChCh.moveTo(161, 575);
        dijeChCh.curveTo(161, 575, 137, 587, 159, 602);
        dijeChCh.lineTo(160, 627);
        dijeChCh.lineTo(167, 634);
        dijeChCh.lineTo(175, 628);
        dijeChCh.lineTo(172, 602);
        dijeChCh.curveTo(172, 602, 194, 593, 170, 575);
        dijeChCh.curveTo(170, 575, 172, 595, 167, 592);
        dijeChCh.curveTo(167, 592, 160, 594, 161, 576);
        rubble.setColor(new Color(222, 224, 221));
        rubble.setStroke(new BasicStroke(1.3f));
        rubble.fill(dijeChCh);

        GeneralPath dijeL = new GeneralPath();
        dijeL.moveTo(149, 553);
        dijeL.curveTo(148, 553, 173, 550, 197, 555);
        dijeL.curveTo(197, 555, 198, 570, 215, 576);
        dijeL.curveTo(215, 576, 212, 623, 184, 641);
        dijeL.lineTo(159, 640);
        dijeL.curveTo(159, 640, 132, 624, 131, 576);
        dijeL.curveTo(131, 576, 148, 572, 149, 553);
        rubble.setColor(Color.black);
        rubble.draw(dijeL);

        GeneralPath dijeChL = new GeneralPath();
        dijeChL.moveTo(156, 560);
        dijeChL.lineTo(181, 560);
        dijeChL.curveTo(181, 560, 180, 579, 195, 584);
        dijeChL.curveTo(195, 584, 191, 621, 167, 634);
        dijeChL.curveTo(167, 634, 142, 619, 138, 580);
        dijeChL.curveTo(138, 580, 153, 577, 156, 560);

        rubble.setStroke(new BasicStroke(1.3f));
        rubble.draw(dijeChL);

        GeneralPath dijeChChL = new GeneralPath();
        dijeChChL.moveTo(161, 575);
        dijeChChL.curveTo(161, 575, 137, 587, 159, 602);
        dijeChChL.lineTo(160, 627);
        dijeChChL.lineTo(167, 634);
        dijeChChL.lineTo(175, 628);
        dijeChChL.lineTo(172, 602);
        dijeChChL.curveTo(172, 602, 194, 593, 170, 575);
        dijeChChL.curveTo(170, 575, 172, 595, 167, 592);
        dijeChChL.curveTo(167, 592, 160, 594, 161, 576);

        rubble.setStroke(new BasicStroke(1.3f));
        rubble.draw(dijeChChL);
        rubble.draw(new QuadCurve2D.Double(189, 552, 190, 578, 206, 580));
        rubble.draw(new QuadCurve2D.Double(206, 580, 194, 631, 174, 640));

        GeneralPath cosita = new GeneralPath();
        cosita.moveTo(158, 524);
        cosita.curveTo(158, 524, 150, 539, 160, 552);
        cosita.lineTo(179, 552);
        cosita.curveTo(179, 552, 170, 542, 178, 527);
        cosita.curveTo(178, 527, 169, 529, 158, 524);
        rubble.setColor(new Color(212, 213, 213));
        rubble.fill(cosita);

        GeneralPath cositaL = new GeneralPath();
        cositaL.moveTo(158, 524);
        cositaL.curveTo(158, 524, 150, 539, 160, 552);
        cositaL.lineTo(179, 552);
        cositaL.curveTo(179, 552, 170, 542, 178, 527);
        cositaL.curveTo(178, 527, 169, 529, 158, 524);
        rubble.setColor(Color.BLACK);
        rubble.setStroke(new BasicStroke(2f));
        rubble.draw(cositaL);

        rubble.draw(new QuadCurve2D.Double(160, 640, 189, 742, 293, 784));
        rubble.draw(new QuadCurve2D.Double(325, 771, 261, 760, 246, 686));
        rubble.draw(new QuadCurve2D.Double(246, 686, 239, 639, 263, 610));
        rubble.draw(new QuadCurve2D.Double(262, 610, 302, 545, 377, 535));
        rubble.draw(new QuadCurve2D.Double(377, 535, 397, 535, 412, 539));
        rubble.draw(new QuadCurve2D.Double(412, 539, 492, 553, 453, 662));

        GeneralPath pataIzq = new GeneralPath();
        pataIzq.moveTo(318, 729);
        pataIzq.curveTo(318, 727, 226, 714, 275, 632);
        pataIzq.curveTo(275, 632, 329, 542, 386, 550);
        pataIzq.curveTo(386, 550, 488, 544, 448, 644);
        pataIzq.curveTo(448, 644, 485, 763, 483, 829);
        pataIzq.curveTo(383, 829, 458, 854, 409, 818);
        pataIzq.curveTo(409, 818, 354, 765, 343, 803);
        pataIzq.curveTo(343, 803, 331, 783, 318, 727);
        rubble.setColor(new Color(169, 99, 39));
        rubble.fill(pataIzq);

        GeneralPath pataIzqL = new GeneralPath();
        pataIzqL.moveTo(318, 729);
        pataIzqL.curveTo(318, 727, 226, 714, 275, 632);
        pataIzqL.curveTo(275, 632, 329, 542, 386, 550);
        pataIzqL.curveTo(386, 550, 488, 544, 448, 644);
        pataIzqL.curveTo(448, 644, 485, 763, 483, 829);
        pataIzqL.curveTo(383, 829, 458, 854, 409, 818);
        pataIzqL.curveTo(409, 818, 354, 765, 343, 803);
        pataIzqL.curveTo(343, 803, 331, 783, 318, 727);
        rubble.setColor(Color.black);
        rubble.setStroke(new BasicStroke(4));
        rubble.draw(new QuadCurve2D.Double(448, 644, 446, 635, 440, 626));
        rubble.draw(pataIzqL);

        GeneralPath llaveMochila = new GeneralPath();
        llaveMochila.moveTo(488, 487);
        llaveMochila.curveTo(488, 487, 489, 542, 531, 521);
        llaveMochila.curveTo(531, 521, 618, 582, 620, 564);
        llaveMochila.curveTo(620, 564, 635, 554, 545, 498);
        llaveMochila.curveTo(545, 497, 557, 455, 500, 469);
        llaveMochila.curveTo(500, 469, 525, 489, 522, 498);
        llaveMochila.curveTo(522, 498, 509, 507, 488, 487);
        rubble.setStroke(new BasicStroke(1.5f));
        rubble.setColor(new Color(160, 155, 161));
        rubble.fill(llaveMochila);

        GeneralPath llaveMochilaL = new GeneralPath();
        llaveMochilaL.moveTo(488, 487);
        llaveMochilaL.curveTo(488, 487, 489, 542, 531, 521);
        llaveMochilaL.curveTo(531, 521, 618, 582, 620, 564);
        llaveMochilaL.curveTo(620, 564, 635, 554, 545, 498);
        llaveMochilaL.curveTo(545, 497, 557, 455, 500, 469);
        llaveMochilaL.curveTo(500, 469, 525, 489, 522, 498);
        llaveMochilaL.curveTo(522, 498, 509, 507, 488, 487);
        rubble.setColor(Color.BLACK);
        rubble.draw(llaveMochilaL);

        GeneralPath broche = new GeneralPath();
        broche.moveTo(557, 550);
        broche.curveTo(557, 550, 572, 542, 573, 508);
        broche.lineTo(585, 519);
        broche.curveTo(585, 519, 583, 552, 568, 558);
        broche.lineTo(557, 550);
        rubble.setColor(new Color(160, 155, 161));
        rubble.fill(broche);

        GeneralPath brocheL = new GeneralPath();
        brocheL.moveTo(557, 550);
        brocheL.curveTo(557, 550, 572, 542, 573, 508);
        brocheL.lineTo(585, 519);
        brocheL.curveTo(585, 519, 583, 552, 568, 558);
        brocheL.lineTo(557, 550);
        rubble.setColor(Color.BLACK);
        rubble.draw(brocheL);

        GeneralPath cabeza = new GeneralPath();
        cabeza.moveTo(88, 324);
        cabeza.curveTo(88, 324, 1, 332, 70, 444);
        cabeza.curveTo(70, 444, 72, 511, 147, 520);
        cabeza.curveTo(147, 520, 216, 545, 265, 510);
        cabeza.curveTo(265, 510, 500, 575, 470, 334);
        cabeza.curveTo(460, 334, 449, 1, 163, 149);
        cabeza.curveTo(163, 149, 141, 199, 88, 324);
        rubble.setColor(new Color(229, 213, 198));
        rubble.setStroke(new BasicStroke(2.5f));
        rubble.fill(cabeza);

        GeneralPath cabezaL = new GeneralPath();
        cabezaL.moveTo(88, 324);
        cabezaL.curveTo(88, 324, 1, 332, 70, 444);
        cabezaL.curveTo(70, 444, 72, 511, 147, 520);
        cabezaL.curveTo(147, 520, 216, 545, 265, 510);
        cabezaL.curveTo(265, 510, 500, 575, 470, 334);
        cabezaL.curveTo(470, 334, 449, 1, 163, 149);
        cabezaL.curveTo(163, 149, 141, 199, 88, 324);
        rubble.setColor(Color.black);
        rubble.draw(new QuadCurve2D.Double(265, 510, 274, 507, 282, 502));
        rubble.setStroke(new BasicStroke(2.5f));
        rubble.draw(cabezaL);

        GeneralPath manchaIz = new GeneralPath();
        manchaIz.moveTo(249, 179);
        manchaIz.curveTo(249, 179, 208, 199, 227, 326);
        manchaIz.curveTo(227, 326, 366, 402, 470, 334);
        manchaIz.curveTo(470, 334, 457, 280, 485, 258);
        manchaIz.curveTo(485, 258, 535, 53, 249, 179);
        rubble.setColor(new Color(169, 99, 39));
        rubble.fill(manchaIz);

        GeneralPath manchaIzL = new GeneralPath();
        manchaIzL.moveTo(249, 179);
        manchaIzL.curveTo(249, 179, 208, 199, 227, 326);
        manchaIzL.curveTo(227, 326, 366, 402, 470, 334);
        manchaIzL.curveTo(470, 334, 457, 280, 485, 258);
        manchaIzL.curveTo(485, 258, 369, 175, 249, 179);
        rubble.setColor(Color.BLACK);
        rubble.draw(manchaIzL);

        GeneralPath manchaDer = new GeneralPath();
        manchaDer.moveTo(102, 206);
        manchaDer.curveTo(102, 206, 49, 238, 101, 275);
        manchaDer.curveTo(101, 275, 99, 304, 89, 324);
        manchaDer.curveTo(89, 324, 159, 342, 166, 271);
        manchaDer.curveTo(166, 271, 166, 201, 181, 177);
        manchaDer.curveTo(181, 177, 136, 179, 102, 206);
        rubble.setColor(new Color(169, 99, 39));
        rubble.fill(manchaDer);

        GeneralPath manchaDerL = new GeneralPath();
        manchaDerL.moveTo(102, 206);
        manchaDerL.curveTo(102, 206, 49, 238, 101, 275);
        manchaDerL.curveTo(101, 275, 99, 304, 89, 324);
        manchaDerL.curveTo(89, 324, 159, 342, 166, 271);
        manchaDerL.curveTo(166, 271, 166, 201, 181, 177);
        manchaDerL.curveTo(181, 177, 136, 179, 102, 206);
        rubble.setColor(Color.black);
        rubble.draw(new QuadCurve2D.Double(101, 275, 102, 238, 118, 202));
        rubble.draw(manchaDerL);

        GeneralPath oreja = new GeneralPath();
        oreja.moveTo(423, 212);
        oreja.lineTo(421, 281);
        oreja.lineTo(495, 259);
        oreja.curveTo(495, 259, 480, 328, 536, 345);
        oreja.curveTo(536, 345, 598, 295, 540, 233);
        oreja.curveTo(540, 233, 520, 214, 483, 225);
        oreja.closePath();
        rubble.setColor(new Color(169, 99, 39));
        rubble.fill(oreja);
        rubble.setColor(Color.black);
        rubble.setStroke(new BasicStroke(3));

        rubble.draw(new QuadCurve2D.Double(457, 231, 517, 215, 540, 233));
        rubble.draw(new QuadCurve2D.Double(540, 233, 594, 295, 536, 345));
        rubble.draw(new QuadCurve2D.Double(536, 345, 475, 314, 502, 241));
        rubble.draw(new QuadCurve2D.Double(477, 263, 486, 258, 495, 258));

        GeneralPath cascoColor = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        cascoColor.moveTo(116, 210);
        cascoColor.curveTo(116, 210, 63, 201, 67, 176);
        cascoColor.curveTo(67, 176, 67, 129, 124, 135);
        cascoColor.curveTo(124, 135, 119, 87, 168, 85);
        cascoColor.curveTo(162, 141, 169, 43, 191, 43);
        cascoColor.curveTo(191, 43, 350, -13, 404, 93);
        cascoColor.curveTo(404, 93, 437, 110, 467, 137);
        cascoColor.curveTo(467, 137, 504, 171, 485, 227);
        cascoColor.curveTo(485, 227, 481, 224, 478, 225);
        cascoColor.curveTo(478, 225, 465, 195, 437, 245);
        cascoColor.curveTo(347, 245, 350, 214, 265, 186);
        cascoColor.curveTo(265, 186, 162, 178, 124, 195);
        cascoColor.curveTo(124, 195, 118, 203, 116, 210);
        rubble.setColor(new Color(248, 213, 1));
        rubble.fill(cascoColor);

        rubble.setStroke(new BasicStroke(2));
        GeneralPath cascoLineas = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        cascoLineas.moveTo(116, 210);
        cascoLineas.curveTo(116, 210, 63, 201, 67, 176);
        cascoLineas.curveTo(67, 176, 67, 129, 124, 135);
        cascoLineas.curveTo(124, 135, 119, 87, 168, 85);
        cascoLineas.curveTo(160, 141, 169, 43, 191, 43);
        cascoLineas.curveTo(191, 43, 350, -13, 404, 93);
        cascoLineas.curveTo(404, 93, 437, 110, 467, 137);
        cascoLineas.curveTo(467, 137, 504, 171, 485, 227);
        cascoLineas.curveTo(485, 227, 481, 224, 478, 225);
        cascoLineas.curveTo(478, 225, 465, 195, 437, 245);
        cascoLineas.curveTo(347, 245, 350, 214, 265, 186);
        cascoLineas.curveTo(265, 186, 162, 178, 124, 195);
        cascoLineas.curveTo(124, 195, 118, 203, 116, 210);
        rubble.setColor(Color.BLACK);
        rubble.draw(cascoLineas);

        rubble.draw(new QuadCurve2D.Double(69, 163, 92, 135, 265, 186));
        rubble.draw(new QuadCurve2D.Double(124, 135, 223, 152, 336, 198));
        rubble.draw(new QuadCurve2D.Double(242, 163, 267, 35, 317, 33));
        rubble.draw(new QuadCurve2D.Double(253, 167, 299, 72, 317, 71));
        rubble.draw(new QuadCurve2D.Double(317, 71, 336, 64, 403, 93));
        rubble.draw(new QuadCurve2D.Double(162, 141, 160, 112, 168, 85));

        GeneralPath escudoCasco = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        escudoCasco.moveTo(200, 52);
        escudoCasco.curveTo(200, 53, 217, 50, 237, 56);
        escudoCasco.curveTo(237, 56, 235, 73, 251, 75);
        escudoCasco.curveTo(251, 75, 239, 121, 203, 135);
        escudoCasco.curveTo(203, 135, 178, 120, 181, 67);
        escudoCasco.curveTo(181, 67, 197, 67, 200, 53);
        rubble.setColor(new Color(160, 154, 164));
        rubble.fill(escudoCasco);

        GeneralPath escudoCascoL = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        escudoCascoL.moveTo(200, 52);
        escudoCascoL.curveTo(200, 53, 217, 50, 237, 56);
        escudoCascoL.curveTo(237, 56, 235, 73, 251, 75);
        escudoCascoL.curveTo(251, 75, 239, 121, 203, 135);
        escudoCascoL.curveTo(203, 135, 178, 120, 181, 67);
        escudoCascoL.curveTo(181, 67, 197, 67, 200, 53);
        rubble.setColor(Color.black);
        rubble.setStroke(new BasicStroke(1.5f));
        rubble.draw(escudoCascoL);

        GeneralPath escudoCascoCh = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        escudoCascoCh.moveTo(203, 59);
        escudoCascoCh.curveTo(203, 59, 217, 58, 231, 63);
        escudoCascoCh.curveTo(231, 63, 230, 76, 242, 80);
        escudoCascoCh.curveTo(242, 80, 233, 112, 203, 126);
        escudoCascoCh.curveTo(203, 126, 183, 110, 187, 71);
        escudoCascoCh.curveTo(187, 71, 200, 71, 203, 59);
        rubble.setColor(new Color(109, 110, 102));
        rubble.fill(escudoCascoCh);

        GeneralPath escudoCascoChL = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        escudoCascoChL.moveTo(203, 59);
        escudoCascoChL.curveTo(203, 59, 217, 58, 231, 63);
        escudoCascoChL.curveTo(231, 63, 230, 76, 242, 80);
        escudoCascoChL.curveTo(242, 80, 233, 112, 203, 126);
        escudoCascoChL.curveTo(203, 126, 183, 110, 187, 71);
        escudoCascoChL.curveTo(187, 71, 200, 71, 203, 59);
        rubble.setColor(Color.BLACK);
        rubble.draw(escudoCascoChL);

        GeneralPath pataEscudo = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        pataEscudo.moveTo(194, 98);
        pataEscudo.curveTo(195, 98, 197, 89, 206, 87);
        pataEscudo.curveTo(206, 86, 217, 87, 221, 92);
        pataEscudo.curveTo(221, 92, 226, 95, 226, 101);
        pataEscudo.curveTo(226, 101, 222, 115, 215, 105);
        pataEscudo.curveTo(215, 105, 211, 102, 209, 106);
        pataEscudo.curveTo(209, 106, 213, 115, 196, 106);
        pataEscudo.curveTo(196, 107, 192, 102, 195, 98);
        rubble.setColor(new Color(195, 188, 206));
        rubble.fill(pataEscudo);

        GeneralPath pataEscudoL = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        pataEscudoL.moveTo(194, 98);
        pataEscudoL.curveTo(195, 98, 197, 89, 206, 87);
        pataEscudoL.curveTo(206, 86, 217, 87, 221, 92);
        pataEscudoL.curveTo(221, 92, 226, 95, 226, 101);
        pataEscudoL.curveTo(226, 101, 222, 115, 215, 105);
        pataEscudoL.curveTo(215, 105, 211, 102, 209, 106);
        pataEscudoL.curveTo(209, 106, 213, 115, 196, 106);
        pataEscudoL.curveTo(196, 107, 192, 102, 195, 98);
        rubble.setColor(Color.BLACK);
        rubble.setStroke(new BasicStroke(1.3f));
        rubble.draw(pataEscudoL);

        rubble.setColor(new Color(195, 188, 206));
        rubble.fill(new RoundRectangle2D.Double(193, 77, 11, 10, 10, 10));
        rubble.fill(new RoundRectangle2D.Double(207, 73, 11, 10, 10, 10));
        rubble.fill(new RoundRectangle2D.Double(221, 80, 11, 10, 10, 10));
        rubble.setColor(Color.BLACK);
        rubble.draw(new RoundRectangle2D.Double(193, 77, 11, 10, 10, 10));
        rubble.draw(new RoundRectangle2D.Double(207, 73, 11, 10, 10, 10));
        rubble.draw(new RoundRectangle2D.Double(221, 80, 11, 10, 10, 10));

        GeneralPath ojoD = new GeneralPath();
        ojoD.moveTo(103, 310);
        ojoD.curveTo(103, 310, 119, 310, 150, 310);
        ojoD.curveTo(150, 310, 166, 246, 136, 248);
        ojoD.curveTo(136, 248, 108, 242, 103, 310);
        rubble.setColor(new Color(255, 231, 227));
        rubble.fill(ojoD);

        GeneralPath ojoDL = new GeneralPath();
        ojoDL.moveTo(103, 310);
        ojoDL.curveTo(103, 310, 119, 310, 150, 310);
        ojoDL.curveTo(150, 310, 166, 246, 136, 248);
        ojoDL.curveTo(136, 248, 108, 242, 103, 310);
        rubble.setColor(Color.black);
        rubble.draw(ojoDL);

        GeneralPath ojoDCh = new GeneralPath();
        ojoDCh.moveTo(150, 310);
        ojoDCh.curveTo(150, 310, 115, 302, 122, 279);
        ojoDCh.curveTo(122, 279, 125, 256, 150, 256);
        ojoDCh.curveTo(150, 256, 157, 265, 150, 310);
        rubble.setColor(new Color(161, 78, 74));
        rubble.fill(ojoDCh);

        GeneralPath ojoDChL = new GeneralPath();
        ojoDChL.moveTo(150, 310);
        ojoDChL.curveTo(150, 310, 115, 302, 122, 279);
        ojoDChL.curveTo(122, 279, 125, 256, 150, 256);
        ojoDChL.curveTo(150, 256, 157, 265, 150, 310);
        rubble.setColor(Color.black);
        rubble.draw(ojoDChL);

        GeneralPath ojoDChP = new GeneralPath();
        ojoDChP.moveTo(150, 310);
        ojoDChP.curveTo(150, 310, 127, 299, 130, 281);
        ojoDChP.curveTo(130, 281, 131, 259, 150, 263);
        ojoDChP.curveTo(155, 264, 156, 270, 150, 310);
        rubble.fill(ojoDChP);

        GeneralPath bolita = new GeneralPath();
        bolita.moveTo(153, 290);
        bolita.curveTo(153, 290, 141, 280, 153, 276);
        bolita.curveTo(153, 276, 155, 280, 153, 290);
        rubble.setColor(Color.WHITE);
        rubble.fill(bolita);

        GeneralPath nariz = new GeneralPath();
        nariz.moveTo(123, 341);
        nariz.curveTo(123, 342, 86, 298, 133, 290);
        nariz.curveTo(133, 290, 169, 290, 171, 316);
        nariz.curveTo(171, 316, 174, 335, 123, 341);
        rubble.setColor(new Color(72, 68, 69));
        rubble.fill(nariz);

        GeneralPath narizL = new GeneralPath();
        narizL.moveTo(123, 341);
        narizL.curveTo(123, 342, 86, 298, 133, 290);
        narizL.curveTo(133, 290, 169, 290, 171, 316);
        narizL.curveTo(171, 316, 174, 335, 123, 341);
        rubble.setStroke(new BasicStroke(1.8f));
        rubble.setColor(Color.black);
        rubble.draw(narizL);
        rubble.setStroke(new BasicStroke(2.3f));

        rubble.setColor(Color.white);
        rubble.fill(new QuadCurve2D.Double(205, 385, 218, 341, 235, 371));
        rubble.setColor(Color.black);

        rubble.draw(new QuadCurve2D.Double(123, 341, 114, 356, 129, 384));
        rubble.draw(new QuadCurve2D.Double(111, 322, 93, 370, 129, 384));
        rubble.draw(new QuadCurve2D.Double(129, 384, 165, 411, 246, 363));

        GeneralPath brilloNariz = new GeneralPath();
        brilloNariz.moveTo(148, 322);
        brilloNariz.curveTo(148, 322, 149, 314, 141, 305);
        brilloNariz.curveTo(141, 305, 171, 311, 148, 322);
        rubble.setColor(Color.WHITE);
        rubble.fill(brilloNariz);

        GeneralPath brilloNarizL = new GeneralPath();
        brilloNarizL.moveTo(148, 322);
        brilloNarizL.curveTo(148, 322, 149, 314, 141, 305);
        brilloNarizL.curveTo(141, 305, 171, 311, 148, 322);
        rubble.setStroke(new BasicStroke(1.7f));
        rubble.setColor(Color.black);
        rubble.draw(brilloNarizL);

        rubble.draw(new QuadCurve2D.Double(205, 385, 218, 341, 235, 369));
        rubble.draw(new QuadCurve2D.Double(106, 362, 75, 359, 70, 400));
        rubble.draw(new QuadCurve2D.Double(70, 400, 66, 423, 70, 445));

        GeneralPath ojoIzqL = new GeneralPath();
        ojoIzqL.moveTo(249, 325);
        ojoIzqL.curveTo(249, 325, 290, 339, 336, 333);
        ojoIzqL.curveTo(336, 333, 352, 264, 309, 256);
        ojoIzqL.curveTo(309, 256, 235, 241, 249, 325);
        rubble.setColor(new Color(255, 231, 227));
        rubble.fill(ojoIzqL);

        rubble.setColor(new Color(161, 78, 74));
        rubble.fill(new Ellipse2D.Double(265, 270, 69, 65));
        rubble.setColor(Color.black);
        rubble.draw(new Ellipse2D.Double(265, 270, 69, 65));
        rubble.fill(new Ellipse2D.Double(271, 275, 56, 56));
        rubble.setColor(Color.WHITE);
        rubble.fill(new Ellipse2D.Double(298, 290, 16, 16));

        GeneralPath ojoIzq = new GeneralPath();
        ojoIzq.moveTo(249, 325);
        ojoIzq.curveTo(249, 325, 290, 339, 336, 333);
        ojoIzq.curveTo(336, 333, 352, 264, 309, 256);
        ojoIzq.curveTo(309, 256, 235, 241, 249, 325);
        rubble.setColor(Color.black);
        rubble.draw(ojoIzq);

        GeneralPath ceja = new GeneralPath();
        ceja.moveTo(317, 231);
        ceja.curveTo(317, 231, 306, 206, 270, 205);
        ceja.curveTo(270, 205, 237, 210, 267, 219);
        ceja.curveTo(267, 219, 300, 220, 317, 231);
        rubble.fill(ceja);

        GeneralPath ceja2 = new GeneralPath();
        ceja2.moveTo(111, 227);
        ceja2.curveTo(111, 227, 118, 199, 138, 203);
        ceja2.curveTo(138, 203, 151, 209, 137, 216);
        ceja2.curveTo(137, 216, 122, 213, 111, 227);
        rubble.fill(ceja2);
    }
}
