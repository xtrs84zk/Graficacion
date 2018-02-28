package Unidad_1_y_2.paws;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Skye extends JApplet{

    public void init() {

    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        QuadCurve2D shape = new QuadCurve2D.Double();
        g2.setStroke(new BasicStroke(1.5f));
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);

        GeneralPath path_a = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path_a.moveTo(124, 120);
        path_a.curveTo(124, 120, 97, 128, 87, 159);
        path_a.curveTo(87, 159, 70, 190, 80, 214);
        path_a.curveTo(80, 214, 83, 237, 113, 247);
        path_a.lineTo(136, 247);
        path_a.lineTo(137, 168);
        path_a.lineTo(124, 120);
        path_a.closePath();
        g2.setPaint(new Color(199,134,66));
        g2.fill(path_a);


        //Oreja derecha
        path_a.moveTo(294, 238);
        path_a.curveTo(294, 238, 282, 239, 273, 221);
        path_a.curveTo(273, 221, 256, 186, 265, 148);
        path_a.curveTo(265, 148, 268, 123, 286, 120);
        path_a.curveTo(286, 120, 328, 119, 348, 150);
        path_a.curveTo(348, 150, 368, 169, 370, 210);
        path_a.curveTo(370, 210, 372, 229, 362, 230);
        path_a.curveTo(362, 230, 365, 253, 347, 265);
        path_a.curveTo(347, 265, 325, 276, 309, 261);
        path_a.curveTo(309, 261, 296, 253, 294, 238);
        path_a.closePath();
        g2.fill(path_a);

        path_a.moveTo(269, 132);
        path_a.lineTo(280, 135);
        path_a.lineTo(277, 125);
        path_a.lineTo(267, 115);
        path_a.lineTo(264, 122);
        path_a.lineTo(269, 132);
        path_a.closePath();
        g2.fill(path_a);

        //Flequillo
        path_a.moveTo(211, 96);
        path_a.lineTo(194, 85);
        path_a.curveTo(194, 85, 187, 72, 184, 67);
        path_a.curveTo(184, 67, 182, 59, 177, 60);
        path_a.curveTo(177, 60, 171, 63, 173, 72);
        path_a.curveTo(173, 72, 155, 59, 143, 66);
        path_a.curveTo(143, 66, 133, 72, 147, 80);
        path_a.curveTo(147, 80, 127, 82, 121, 98);
        path_a.curveTo(121, 98, 119, 110, 130, 106);
        path_a.curveTo(130, 106, 151, 101, 150, 101);
        path_a.lineTo(141, 104);
        path_a.lineTo(132, 133);
        path_a.lineTo(190, 136);
        path_a.lineTo(211, 96);
        path_a.closePath();
        g2.fill(path_a);

        path_a.moveTo(320, 285);
        path_a.curveTo(320, 285, 334, 289, 339, 307);
        path_a.curveTo(339, 307, 341, 318, 337, 338);
        path_a.curveTo(337, 338, 333, 344, 342, 344);
        path_a.curveTo(342, 344, 339, 352, 328, 353);
        path_a.curveTo(328, 353, 319, 353, 316, 344);
        path_a.lineTo(288, 347);
        path_a.lineTo(286, 316);
        path_a.closePath();
        g2.fill(path_a);

        //collar
        GeneralPath path_c = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path_c.moveTo(223, 280);
        path_c.curveTo(223, 280, 227, 278, 236, 293);
        path_c.curveTo(236, 293, 200, 310, 154, 313);
        path_c.curveTo(154, 313, 147, 306, 154, 295);
        path_c.closePath();
        g2.setPaint(new Color(205,168,199));
        g2.fill(path_c);

        //Mochila
        path_c.moveTo(291, 324);
        path_c.lineTo(293, 311);
        path_c.lineTo(305, 313);
        path_c.curveTo(305, 313, 314, 315, 319, 305);
        path_c.lineTo(320, 287);
        path_c.curveTo(320, 287, 319, 274, 307, 271);
        path_c.lineTo(282, 265);
        path_c.curveTo(282, 265, 275, 260, 268, 262);
        path_c.lineTo(211, 264);
        path_c.lineTo(219, 323);
        path_c.closePath();
        g2.fill(path_c);

        //Medalla
        GeneralPath path_d = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path_d.moveTo(155,293);
        path_d.curveTo(155, 298, 149, 299, 150, 309);
        path_d.curveTo(150, 309, 157, 326, 143, 351);
        path_d.curveTo(143, 351, 135, 356, 130, 351);
        path_d.curveTo(130, 351, 125, 331, 128, 315);
        path_d.curveTo(128, 315, 132, 303, 145, 306);
        path_d.curveTo(145, 306, 145, 294, 155, 293);
        path_d.closePath();
        g2.setPaint(new Color(194,194,194));
        g2.fill(path_d);

        //Patas
        GeneralPath path_f = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        GeneralPath path_g = new GeneralPath(GeneralPath.WIND_NON_ZERO);

        path_g.moveTo(177, 400);
        path_g.curveTo(179, 416, 179, 417, 172, 430);
        path_g.curveTo(172, 430, 155, 429, 150, 438);
        path_g.curveTo(150, 438, 149, 458, 160, 463);
        path_g.curveTo(160, 463, 165, 464, 167, 460);
        path_g.curveTo(167, 460, 168, 464, 184, 464);
        path_g.curveTo(184, 464, 199, 462, 203, 454);
        path_g.lineTo(222, 449);
        path_g.lineTo(225, 394);
        path_g.lineTo(180, 382);
        path_g.closePath();
        g2.setPaint(new Color(229,203,176));
        g2.fill(path_g);

        path_g.moveTo(241, 400);
        path_g.lineTo(246, 412);
        path_g.curveTo(246, 412, 237, 417, 238, 426);
        path_g.curveTo(238, 426, 241, 437, 250, 440);
        path_g.curveTo(250, 440, 257, 443, 267, 437);
        path_g.curveTo(267, 437, 275, 428, 281, 421);
        path_g.curveTo(281, 421, 281, 404, 274, 393);
        path_g.lineTo(250, 383);
        path_g.closePath();
        g2.fill(path_g);

        path_g.moveTo(294, 412);
        path_g.lineTo(296, 421);
        path_g.curveTo(296, 421, 285, 422, 284, 446);
        path_g.curveTo(284, 446, 293, 454, 326, 442);
        path_g.curveTo(326, 442, 329, 417, 326, 394);
        path_g.closePath();
        g2.fill(path_g);

        //Primera
        path_f.moveTo(177, 387);
        path_f.curveTo(177, 387, 181, 390, 178, 399);
        path_f.curveTo(178, 399, 186, 393, 197, 400);
        path_f.curveTo(197, 400, 207, 403, 216, 418);
        path_f.lineTo(231, 382);
        path_f.lineTo(245, 381);
        path_f.lineTo(246, 339);
        path_f.lineTo(170, 333);
        path_f.lineTo(170, 367);
        path_f.lineTo(177, 387);
        path_f.closePath();
        g2.setPaint(new Color(208,162,112));
        g2.fill(path_f);

        //Tercera
        path_f.moveTo(237, 394);
        path_f.lineTo(242, 401);
        path_f.curveTo(242, 401, 253, 403, 262, 395);
        path_f.lineTo(263, 386);
        path_f.closePath();
        g2.fill(path_f);

        //Cuarta
        path_f.moveTo(293, 316);
        path_f.curveTo(293, 316, 310, 320, 317, 341);
        path_f.curveTo(317, 340, 325, 355, 326, 393);
        path_f.curveTo(326, 393, 315, 412, 295, 412);
        path_f.curveTo(295, 412, 294, 397, 286, 386);
        path_f.lineTo(272, 334);
        path_f.closePath();
        g2.fill(path_f);

        //Interior
        GeneralPath path_e = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path_e.moveTo(144, 314);
        path_e.curveTo(144, 314, 146, 335, 132, 347);
        path_e.curveTo(132, 347, 128, 329, 131, 318);
        path_e.curveTo(131, 318, 132, 311, 137, 310);
        path_e.curveTo(137, 310, 142, 310, 144, 314);
        path_e.closePath();
        g2.setPaint(new Color(175,80,127));
        g2.fill(path_e);

        //Traje
        path_e.moveTo(153, 313);
        path_e.curveTo(153, 313, 152, 337, 146, 344);
        path_e.curveTo(146, 344, 145, 365, 155, 371);
        path_e.curveTo(155, 371, 161, 384, 178, 388);
        path_e.curveTo(178, 388, 181, 378, 176, 366);
        path_e.curveTo(176, 366, 181, 351, 198, 344);
        path_e.curveTo(198, 344, 213, 339, 229, 347);
        path_e.curveTo(229, 347, 240, 354, 240, 362);
        path_e.curveTo(240, 362, 242, 375, 231, 381);
        path_e.lineTo(226, 395);
        path_e.curveTo(226, 395, 242, 396, 255, 394);
        path_e.curveTo(255, 394, 264, 398, 276, 394);
        path_e.curveTo(276, 394, 289, 390, 293, 381);
        path_e.curveTo(293, 381, 300, 357, 296, 339);
        path_e.curveTo(296, 339, 292, 321, 281, 314);
        path_e.curveTo(281, 314, 273, 311, 271, 317);
        path_e.curveTo(271, 317, 262, 309, 248, 303);
        path_e.curveTo(248, 303, 239, 302, 236, 293);
        path_e.curveTo(236, 293, 200, 310, 153, 313);
        path_e.closePath();
        g2.fill(path_e);

        g2.setPaint(Color.white);
        g2.fillOval(137, 316, 3, 7);
        g2.fillOval(140, 321, 4, 4);
        g2.fillOval(132, 319, 3, 3);
        g2.fillOval(130, 327, 4, 7);
        g2.fillOval(137, 329, 3, 5);
        g2.fillOval(135, 325, 2, 4);

        //Lentes
        GeneralPath path_b = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path_b.moveTo(131, 104);
        path_b.curveTo(131, 104, 119, 119, 114, 151);
        path_b.lineTo(118, 155);
        path_b.lineTo(128, 151);
        path_b.lineTo(139, 107);
        path_b.closePath();
        g2.setPaint(new Color(205,122,155));
        g2.fill(path_b);

        path_b.moveTo(260, 194);
        path_b.lineTo(255, 239);
        path_b.curveTo(255, 239, 249, 271, 250, 327);
        path_b.lineTo(256, 333);
        path_b.lineTo(266, 333);
        path_b.lineTo(267, 258);
        path_b.curveTo(267, 258, 278, 256, 282, 232);
        path_b.curveTo(282, 232, 268, 220, 265, 195);
        path_b.curveTo(265, 195, 259, 154, 268, 135);
        path_b.curveTo(268, 135, 268, 127, 264, 122);
        path_b.curveTo(264, 122, 269, 124, 276, 120);
        path_b.curveTo(276, 120, 281, 113, 276, 108);
        path_b.lineTo(276, 102);
        path_b.lineTo(222, 71);
        path_b.lineTo(217, 76);
        path_b.curveTo(217, 76, 209, 73, 207, 81);
        path_b.curveTo(207, 81, 201, 74, 189, 73);
        path_b.curveTo(189, 73, 188, 87, 210, 95);
        path_b.lineTo(186, 225);
        path_b.closePath();
        g2.fill(path_b);


        //Cara
        GeneralPath path0 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path0.moveTo(153, 280);
        path0.lineTo(153, 295);
        path0.lineTo(223, 281);
        path0.lineTo(223, 275);
        path0.curveTo(223, 275, 244, 270, 254, 261);
        path0.lineTo(260,191);
        path0.curveTo(260, 191, 247, 132, 224, 103);
        path0.curveTo(224, 103, 211, 91, 199, 99);
        path0.curveTo(199, 99, 183, 113, 164, 120);
        path0.curveTo(164, 120, 156, 125, 155, 119);
        path0.curveTo(155, 119, 150, 119, 145, 122);
        path0.curveTo(145, 122, 138, 124, 140, 113);
        path0.curveTo(140, 113, 142, 106, 150, 101);
        path0.curveTo(150, 101, 143, 98, 136, 106);
        path0.curveTo(136, 106, 131, 113, 127, 123);
        path0.curveTo(127, 123, 131, 120, 135, 124);
        path0.curveTo(135, 124, 142, 130, 142, 190);
        path0.curveTo(142, 190, 133, 208, 109, 201);
        path0.curveTo(109, 200, 104, 210, 104, 223);
        path0.curveTo(104, 223, 105, 236, 123, 257);
        path0.closePath();
        g2.setPaint(new Color(208,162,112));
        g2.fill(path0);


        //Manchas Ojos
        GeneralPath path_ = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path_.moveTo(141, 194);
        path_.lineTo(141, 151);
        path_.curveTo(141, 151, 143, 131, 136, 126);
        path_.curveTo(136, 126, 132, 119, 126, 124);
        path_.curveTo(126, 124, 122, 131, 121, 147);
        path_.curveTo(121, 147, 117, 172, 109, 196);
        path_.curveTo(109, 196, 108, 203, 114, 204);
        path_.closePath();
        g2.setPaint(new Color(169,113,56));
        g2.fill(path_);

        GeneralPath path$ = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path$.moveTo(244, 139);
        path$.curveTo(244, 139, 234, 123, 225, 122);
        path$.curveTo(225, 122, 213, 118, 196, 124);
        path$.curveTo(196, 124, 181, 132, 175, 146);
        path$.curveTo(175, 146, 170, 165, 173, 183);
        path$.curveTo(173, 183, 176, 199, 192, 210);
        path$.curveTo(192, 210, 211, 218, 230, 212);
        path$.curveTo(230, 212, 244, 207, 248, 196);
        path$.curveTo(248, 196, 254, 186, 253, 162);
        path$.closePath();
        g2.setPaint(new Color(199,134,66));
        g2.fill(path$);



        //hocico
        path.moveTo(153, 167);
        path.curveTo(153, 167, 154, 182, 165, 190);
        path.curveTo(165, 190, 174, 200, 186, 211);
        path.curveTo(186, 211, 210, 225, 208, 246);
        path.curveTo(208, 246, 206, 267, 188, 275);
        path.curveTo(188, 275, 169, 281, 153, 280);
        path.curveTo(153, 280, 115, 257, 118, 238);
        path.curveTo(118, 238, 106, 215, 119, 196);
        path.curveTo(119, 196, 134, 193, 140,195);
        path.curveTo(140, 195, 149, 183, 153, 167);
        path.closePath();
        g2.setPaint(new Color(228,203,177));
        g2.fill(path);

        //Nariz
        GeneralPath path1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path1.moveTo(114, 210);
        path1.curveTo(114, 210, 116, 217, 125, 220);
        path1.curveTo(125, 220, 138, 218, 141, 208);
        path1.curveTo(141, 208, 143, 199, 135, 195);
        path1.curveTo(135, 195, 127, 193, 119,194);
        path1.curveTo(119, 194, 113, 200, 114, 210);
        path1.closePath();
        g2.setPaint(Color.DARK_GRAY);
        g2.fill(path1);

        //boca
        GeneralPath path2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path2.moveTo(134, 248);
        path2.curveTo(134, 248, 154, 258, 197, 233);
        path2.curveTo(197, 233, 175, 256, 157, 259);
        path2.curveTo(157, 259, 142, 255, 134, 248);
        path2.closePath();
        g2.setPaint(new Color(242,153,119));
        g2.fill(path2);

        GeneralPath path3 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path3.moveTo(134, 248);
        path3.curveTo(134, 248, 146, 251, 152, 249);
        path3.curveTo(152, 249, 145, 251, 146, 256);
        path3.curveTo(146, 256, 139, 254, 134, 248);
        path3.closePath();
        g2.setPaint(new Color(129,18,26));
        g2.fill(path3);

        //Ojo Derecho
        //Parte blanca
        GeneralPath path4 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path4.moveTo(217, 205);
        path4.curveTo(217, 205, 229, 202, 231, 196);
        path4.curveTo(231, 196, 233, 186, 230, 178);
        path4.curveTo(230, 178, 225, 164, 214, 162);
        path4.curveTo(214, 162, 207, 159, 196, 162);
        path4.curveTo(196, 162, 187, 166, 183, 174);
        path4.curveTo(183, 174, 179, 187, 183, 195);
        path4.curveTo(183, 195, 184, 199, 192, 202);
        path4.curveTo(192, 202, 205, 206, 217, 205);
        path4.closePath();
        g2.setPaint(Color.white);
        g2.fill(path4);

        //Parte rosa
        g2.setPaint(new Color(221,135,170));
        g2.fillOval(191, 170, 36, 35);

        //Parte negra
        g2.setPaint(Color.black);
        g2.fillOval(196, 175, 26, 26);

        //Brillo
        g2.setPaint(Color.white);
        g2.fillOval(209, 181, 7, 7);

        //Ojo izquierdo
        g2.fillArc(116, 159, 26, 72, 0, 183);

        //Parte rosa
        GeneralPath path5 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        g2.setPaint(new Color(221,135,170));
        path5.moveTo(138, 171);
        path5.curveTo(138, 171, 135, 167, 137, 165);
        path5.curveTo(137, 165, 128, 162, 124, 175);
        path5.curveTo(124, 175, 122, 184, 126, 194);
        path5.lineTo(134, 194);
        path5.closePath();
        g2.fill(path5);

        //parte negra
        GeneralPath path6 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path6.moveTo(140, 171);
        path6.curveTo(140, 171, 136, 169, 130, 173);
        path6.curveTo(130, 173, 126, 177, 126, 182);
        path6.curveTo(126, 182, 126, 190, 131, 194);
        path6.lineTo(141, 193);
        path6.lineTo(140, 186);
        path6.closePath();
        g2.setPaint(Color.black);
        g2.fill(path6);

        //parte blanca
        g2.setColor(Color.WHITE);
        g2.fillOval(138, 176, 3, 7);



        //Hocico
        g2.setPaint(Color.black);
        shape.setCurve(153, 167, 154, 182, 165, 190);
        g2.draw(shape);
        shape.setCurve(165, 190, 174, 200, 186, 211);
        g2.draw(shape);
        shape.setCurve(186, 211, 210, 225, 208, 246);
        g2.draw(shape);
        shape.setCurve(208, 246, 206, 267, 188, 275);
        g2.draw(shape);
        shape.setCurve(188, 275, 169, 281, 153, 280);
        g2.draw(shape);
        shape.setCurve(153, 280, 115, 257, 118, 238);
        g2.draw(shape);
        shape.setCurve(118, 238, 106, 215, 119, 196);
        g2.draw(shape);
        shape.setCurve(119, 196, 134, 193, 155, 195);
        g2.draw(shape);
        shape.setCurve(140, 195, 149, 183, 153, 167);
        g2.draw(shape);

        //nariz
        shape.setCurve(114, 210, 116, 217, 125, 220);
        g2.draw(shape);
        shape.setCurve(125, 220, 138, 218, 141, 208);
        g2.draw(shape);
        shape.setCurve(141, 208, 143, 199, 135, 195);
        g2.draw(shape);

        //Traje
        shape.setCurve(146, 344, 145, 365, 155, 371);
        g2.draw(shape);
        shape.setCurve(155, 371, 161, 384, 178, 388);
        g2.draw(shape);
        shape.setCurve(178, 388, 181, 378, 176, 366);
        g2.draw(shape);
        shape.setCurve(176, 366, 181, 351, 198, 344);
        g2.draw(shape);
        shape.setCurve(198, 344, 213, 339, 229, 347);
        g2.draw(shape);
        shape.setCurve(229, 347, 240, 354, 240, 362);
        g2.draw(shape);
        shape.setCurve(240, 362, 242, 375, 231, 381);
        g2.draw(shape);
        g2.drawLine(231,381,226, 395);
        shape.setCurve(226, 395, 242, 396, 255, 394);
        g2.draw(shape);
        shape.setCurve(255, 394, 264, 398, 276, 394);
        g2.draw(shape);
        shape.setCurve(276, 394, 289, 390, 293, 381);
        g2.draw(shape);
        shape.setCurve(293, 381, 300, 357, 296, 339);
        g2.draw(shape);
        shape.setCurve(296, 339, 292, 321, 281, 314);
        g2.draw(shape);
        shape.setCurve(281, 314, 273, 311, 271, 317);
        g2.draw(shape);
        shape.setCurve(248, 303, 239, 302, 236, 293);
        g2.draw(shape);

        //boca
        shape.setCurve(118, 238, 125, 247, 134, 248);
        g2.draw(shape);
        shape.setCurve(134, 248, 154, 258, 197, 233);
        g2.draw(shape);
        shape.setCurve(197, 233, 175, 256, 157, 259);
        g2.draw(shape);
        shape.setCurve(157, 259, 142, 255, 134, 248);
        g2.draw(shape);

        g2.fillOval(150, 209, 2, 2);
        g2.fillOval(162, 213, 3, 3);
        g2.fillOval(153, 219, 4, 4);

        //Manchas ojos
        shape.setCurve(126, 124, 122, 131, 121, 147);
        g2.draw(shape);
        shape.setCurve(121, 147, 117, 172, 109, 196);
        g2.draw(shape);
        shape.setCurve(109, 196, 108, 203, 114, 204);
        g2.draw(shape);

        shape.setCurve(244, 139, 234, 123, 225, 122);
        g2.draw(shape);
        shape.setCurve(225, 122, 213, 118, 196, 124);
        g2.draw(shape);
        shape.setCurve(196, 124, 181, 132, 175, 146);
        g2.draw(shape);
        shape.setCurve(175, 146, 170, 165, 173, 183);
        g2.draw(shape);
        shape.setCurve(173, 183, 176, 199, 192, 210);
        g2.draw(shape);
        shape.setCurve(192, 210, 211, 218, 230, 212);
        g2.draw(shape);
        shape.setCurve(230, 212, 244, 207, 248, 196);
        g2.draw(shape);
        shape.setCurve(248, 196, 254, 186, 253, 162);
        g2.draw(shape);

        //Ojo derecho
        shape.setCurve(217, 205, 229, 202, 231, 196);
        g2.draw(shape);
        shape.setCurve(231, 196, 233, 186, 230, 178);
        g2.draw(shape);
        shape.setCurve(230, 178, 225, 164, 214, 162);
        g2.setStroke(new BasicStroke(2.0f));
        g2.draw(shape);
        shape.setCurve(214, 162, 207, 159, 196, 162);
        g2.draw(shape);
        shape.setCurve(196, 162, 187, 166, 183, 174);
        g2.draw(shape);
        g2.setStroke(new BasicStroke(1.5f));
        shape.setCurve(183, 174, 179, 187, 183, 195);
        g2.draw(shape);
        shape.setCurve(183, 195, 184, 199, 192, 202);
        g2.draw(shape);
        shape.setCurve(192, 202, 205, 206, 217, 205);
        g2.draw(shape);

        //Ojo izquierdo
        g2.drawArc(116, 159, 26, 72, 0, 183);

        shape.setCurve(138, 171, 135, 167, 137, 165);
        g2.draw(shape);
        shape.setCurve(137, 165, 128, 162, 124, 175);
        g2.draw(shape);
        shape.setCurve(124, 175, 122, 184, 126, 194);
        g2.draw(shape);

        //Cara
        g2.drawLine(153, 280, 153, 295);
        g2.drawLine(153,295,223, 281);
        g2.drawLine(223,281,223, 275);
        shape.setCurve(219, 275, 244, 270, 254, 261);
        g2.draw(shape);
        g2.drawLine(254,261,260,191);
        shape.setCurve(260, 191, 247, 132, 224, 103);
        g2.draw(shape);
        shape.setCurve(224, 103, 211, 91, 199, 99);
        g2.draw(shape);
        shape.setCurve(199, 99, 183, 113, 164, 120);
        g2.draw(shape);
        shape.setCurve(164, 120, 156, 125, 155, 119);
        g2.draw(shape);
        shape.setCurve(155, 119, 150, 119, 145, 122);
        g2.draw(shape);
        shape.setCurve(145, 122, 138, 124, 140, 113);
        g2.draw(shape);
        shape.setCurve(140, 113, 142, 106, 150, 101);
        g2.draw(shape);
        shape.setCurve(150, 101, 143, 98, 136, 106);
        g2.draw(shape);
        shape.setCurve(136, 106, 131, 113, 127, 123);
        g2.draw(shape);
        shape.setCurve(127, 123, 131, 120, 135, 124);
        g2.draw(shape);
        shape.setCurve(135, 124, 142, 130, 142, 190);
        g2.draw(shape);
        shape.setCurve(109, 200, 104, 210, 104, 223);
        g2.draw(shape);
        shape.setCurve(104, 223, 105, 236, 123, 257);
        g2.draw(shape);

        //Oreja izquierda
        shape.setCurve(124, 120, 97, 128, 87, 159);
        g2.draw(shape);
        shape.setCurve(87, 159, 70, 190, 80, 214);
        g2.draw(shape);
        shape.setCurve(80, 214, 83, 237, 113, 247);
        g2.draw(shape);
        shape.setCurve(103, 227, 85, 225, 83, 205);
        g2.draw(shape);

        //Oreja derecha
        shape.setCurve(294, 238, 282, 239, 273, 221);
        g2.draw(shape);
        shape.setCurve(273, 221, 256, 186, 265, 148);
        g2.draw(shape);
        shape.setCurve(265, 148, 268, 123, 286, 120);
        g2.draw(shape);
        shape.setCurve(286, 120, 328, 119, 348, 150);
        g2.draw(shape);
        shape.setCurve(348, 150, 368, 169, 370, 210);
        g2.draw(shape);
        shape.setCurve(370, 210, 372, 229, 362, 230);
        g2.draw(shape);
        shape.setCurve(362, 230, 365, 253, 347, 265);
        g2.draw(shape);
        shape.setCurve(347, 265, 325, 276, 309, 261);
        g2.draw(shape);
        shape.setCurve(309, 261, 296, 253, 294, 238);
        g2.draw(shape);
        shape.setCurve(296, 237, 313, 231, 312, 205);
        g2.draw(shape);
        shape.setCurve(361, 228, 360, 205, 352, 191);
        g2.draw(shape);

        //Flequillo

        g2.drawLine(211, 96, 194, 85);
        shape.setCurve(194, 85, 187, 72, 184, 67);
        g2.draw(shape);
        shape.setCurve(184, 67, 182, 59, 177, 60);
        g2.draw(shape);
        shape.setCurve(177, 60, 171, 63, 173, 72);
        g2.draw(shape);
        shape.setCurve(173, 72, 155, 59, 143, 66);
        g2.draw(shape);
        shape.setCurve(143, 66, 133, 72, 147, 80);
        g2.draw(shape);
        shape.setCurve(147, 80, 127, 82, 121, 98);
        g2.draw(shape);
        shape.setCurve(121, 98, 119, 110, 130, 106);
        g2.draw(shape);
        shape.setCurve(130, 106, 151, 101, 133, 105);
        g2.draw(shape);
        shape.setCurve(173, 72, 177, 73, 179, 74);
        g2.draw(shape);
        shape.setCurve(147, 80, 158, 79, 170, 83);
        g2.draw(shape);
        shape.setCurve(150, 101, 163, 96, 173, 102);
        g2.draw(shape);

        //Lentes
        shape.setCurve(131, 104, 119, 119, 114, 151);
        g2.draw(shape);
        g2.drawLine(114,151,118, 155);

        shape.setCurve(255, 260, 249, 271, 250, 327);
        g2.draw(shape);
        g2.drawLine(250,327,256, 333);
        g2.drawLine(256,333,266, 333);
        g2.drawLine(266,333,267, 258);
        shape.setCurve(267, 258, 278, 256, 282, 232);
        g2.draw(shape);
        shape.setCurve(282, 232, 268, 220, 265, 195);
        g2.draw(shape);
        shape.setCurve(265, 195, 259, 154, 268, 135);
        g2.draw(shape);
        shape.setCurve(268, 135, 268, 127, 264, 122);
        g2.draw(shape);
        shape.setCurve(264, 122, 269, 124, 276, 120);
        g2.draw(shape);
        shape.setCurve(276, 120, 281, 113, 276, 108);
        g2.draw(shape);
        g2.drawLine(276,108,276, 102);
        g2.drawLine(276,102,222, 71);
        g2.drawLine(222,71,217, 76);
        shape.setCurve(217, 76, 209, 73, 207, 81);
        g2.draw(shape);
        shape.setCurve(207, 81, 201, 74, 189, 73);
        g2.draw(shape);

        g2.drawLine(277, 125, 271, 122);

        g2.drawLine(275, 108, 219, 77);
        shape.setCurve(264, 121, 232, 111, 208, 83);
        g2.draw(shape);
        shape.setCurve(264, 157, 261, 131, 251, 116);
        g2.draw(shape);
        shape.setCurve(263, 193, 251, 130, 225, 99);
        g2.draw(shape);
        shape.setCurve(263, 193, 255, 263, 257, 334);
        g2.draw(shape);
        g2.drawLine(267, 259, 271, 215);

        //Collar
        shape.setCurve(223, 280, 227, 278, 236, 293);
        g2.draw(shape);
        shape.setCurve(236, 293, 200, 310, 154, 313);
        g2.draw(shape);
        shape.setCurve(154, 313, 147, 306, 154, 295);
        g2.draw(shape);

        //Medalla
        shape.setCurve(155, 293, 149, 299, 150, 309);
        g2.draw(shape);
        shape.setCurve(150, 309, 157, 326, 143, 351);
        g2.draw(shape);
        shape.setCurve(143, 351, 135, 356, 130, 351);
        g2.draw(shape);
        shape.setCurve(130, 351, 125, 331, 128, 315);
        g2.draw(shape);
        shape.setCurve(128, 315, 132, 303, 145, 306);
        g2.draw(shape);
        shape.setCurve(145, 306, 145, 294, 155, 293);
        g2.draw(shape);
        shape.setCurve(151, 312, 149, 307, 145, 306);
        g2.draw(shape);
        shape.setCurve(145, 306, 148, 331, 133, 352);
        g2.draw(shape);

        //Interior
        shape.setCurve(144, 314, 146, 335, 132, 347);
        g2.draw(shape);
        shape.setCurve(132, 347, 128, 329, 131, 318);
        g2.draw(shape);
        shape.setCurve(131, 318, 132, 311, 137, 310);
        g2.draw(shape);
        shape.setCurve(137, 310, 142, 310, 144, 314);
        g2.draw(shape);

        //Mochila
        g2.drawLine(291, 324, 293, 311);
        g2.drawLine(293,311,305, 313);
        shape.setCurve(305, 313, 314, 315, 319, 305);
        g2.draw(shape);
        g2.drawLine(319,305,320, 287);
        shape.setCurve(320, 287, 319, 274, 307, 271);
        g2.draw(shape);
        g2.drawLine(307,271,282, 265);
        shape.setCurve(282, 265, 275, 260, 268, 262);
        g2.draw(shape);

        //Patas
        shape.setCurve(177, 387, 181, 390, 178, 399);
        g2.draw(shape);
        shape.setCurve(178, 399, 186, 393, 197, 400);
        g2.draw(shape);
        shape.setCurve(197, 400, 207, 403, 216, 418);
        g2.draw(shape);

        g2.drawLine(237, 394, 242, 401);
        shape.setCurve(242, 401, 253, 403, 262, 395);
        g2.draw(shape);

        shape.setCurve(293, 316, 310, 320, 317, 341);
        g2.draw(shape);
        shape.setCurve(317, 340, 325, 355, 326, 393);
        g2.draw(shape);
        shape.setCurve(326, 393, 315, 412, 295, 412);
        g2.draw(shape);
        shape.setCurve(295, 412, 294, 397, 286, 386);
        g2.draw(shape);

        shape.setCurve(179, 400, 178, 407, 179, 416);
        g2.draw(shape);
        shape.setCurve(179, 416, 179, 417, 172, 430);
        g2.draw(shape);
        shape.setCurve(172, 430, 155, 429, 150, 438);
        g2.draw(shape);
        shape.setCurve(150, 438, 149, 458, 160, 463);
        g2.draw(shape);
        shape.setCurve(160, 463, 165, 464, 167, 460);
        g2.draw(shape);
        shape.setCurve(167, 460, 168, 464, 184, 464);
        g2.draw(shape);
        shape.setCurve(184, 464, 199, 462, 203, 454);
        g2.draw(shape);
        g2.drawLine(203,454,222, 449);
        g2.drawLine(222,449,225, 394);
        g2.drawLine(203, 454, 225, 395);

        g2.drawLine(241, 400, 246, 412);
        shape.setCurve(246, 412, 237, 417, 238, 426);
        g2.draw(shape);
        shape.setCurve(238, 426, 241, 437, 250, 440);
        g2.draw(shape);
        shape.setCurve(250, 440, 257, 443, 267, 437);
        g2.draw(shape);
        shape.setCurve(267, 437, 275, 428, 281, 421);
        g2.draw(shape);
        shape.setCurve(281, 421, 281, 404, 274, 393);
        g2.draw(shape);

        g2.drawLine(294, 412, 296, 421);
        shape.setCurve(296, 421, 285, 422, 284, 446);
        g2.draw(shape);
        shape.setCurve(284, 446, 293, 454, 326, 442);
        g2.draw(shape);
        shape.setCurve(326, 442, 329, 417, 326, 394);
        g2.draw(shape);

        shape.setCurve(171, 430, 181, 429, 189, 435);
        g2.draw(shape);
        shape.setCurve(157, 460, 155, 451, 156, 443);
        g2.draw(shape);
        shape.setCurve(169, 462, 164, 452, 166, 441);
        g2.draw(shape);

        shape.setCurve(249, 413, 253, 410, 259, 413);
        g2.draw(shape);
        shape.setCurve(253, 440, 246, 433, 248, 423);
        g2.draw(shape);
        shape.setCurve(298, 423, 305, 422, 314, 426);
        g2.draw(shape);
        shape.setCurve(293, 449, 287, 439, 289, 431);
        g2.draw(shape);
        shape.setCurve(298, 450, 294, 439, 299, 430);
        g2.draw(shape);

        shape.setCurve(320, 285, 334, 289, 339, 307);
        g2.draw(shape);
        shape.setCurve(339, 307, 341, 318, 337, 338);
        g2.draw(shape);
        shape.setCurve(337, 338, 333, 344, 342, 344);
        g2.draw(shape);
        shape.setCurve(342, 344, 339, 352, 328, 353);
        g2.draw(shape);
        shape.setCurve(328, 353, 319, 353, 316, 344);
        g2.draw(shape);

        g2.drawOval(191, 170, 36, 35);
    }


}
