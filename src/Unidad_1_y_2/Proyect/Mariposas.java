package Unidad_1_y_2.Proyect;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

public class Mariposas extends Application {
    public static GraphicsContext dibujarCiervo(Group root) {
        //Contorno
        Canvas canvas = new Canvas(900, 700);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(223, 145, 159));
        gc.beginPath();
        gc.appendSVGPath("M 789 455 Q 840 460 856 401 Q 804 402 788 434"
                + " L 785 440 L 788 434 L 790 405 Q 801 369 787 353 Q 764 375 766 398"
                + " L 757 416 Q 715 408 707 453 Q 700 447 691 445 Q 694 497 732 506"
                + " Q 741 514 733 533 Q 727 541 729 553 L 756 586 L 835 570 L 843 554"
                + " Q 847 536 831 530 Q 816 523 797 531 Q 776 542 768 531"
                + " Q 761 520 767 508 Q 795 490 789 455");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //Oreja
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(253, 210, 17));
        gc.beginPath();
        gc.appendSVGPath("M 853 407 Q 809 420 788 453 Q 835 457 853 407");
        gc.closePath();
        gc.fill();

        //Cara
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(248, 231, 205));
        gc.beginPath();
        gc.appendSVGPath("M 717 428 Q 714 446 757 431 Q 756 451 772 457 Q 775 497 733 506"
                + " Q 686 493 690 448 Q 701 447 707 454 Q 700 436 717 428");
        gc.closePath();
        gc.fill();

        gc.setLineWidth(3.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(223, 145, 159));
        gc.beginPath();
        gc.appendSVGPath("M 789 455 Q 840 460 856 401 Q 804 402 788 434"
                + " L 785 440 M 788 434 L 790 405 Q 801 369 787 353 Q 764 375 766 398"
                + " L 757 416 Q 715 408 707 453 Q 700 447 691 445 Q 694 497 732 506"
                + " Q 741 514 733 533 Q 727 541 729 553 L 756 586 L 835 570 L 843 554"
                + " Q 847 536 831 530 Q 816 523 797 531 Q 776 542 768 531"
                + " Q 761 520 767 508 Q 795 490 789 455");
        gc.closePath();
        gc.stroke();

        //FLOR
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(253, 210, 17));
        gc.beginPath();
        gc.appendSVGPath("M 768 421 Q 751 416 753 400 Q 769 392 773 410 L 771 403"
                + " Q 768 392 778 385 Q 794 393 785 411 Q 791 398 804 406 Q 801 418 791 418"
                + " Q 796 417 798 420 Q 789 425 788 433 Q 783 433 780 426 Q 783 439 772 443"
                + " Q 758 435 768 421");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //NARIZ
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 695 465 Q 700 462 702 452 Q 699 446 693 446 Q 688 454 695 465");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //BOCA
        gc.setLineWidth(2.0);
        gc.setStroke(Color.rgb(189, 145, 108));
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 711 493 Q 725 488 727 485 Q 725 488 711 493");
        gc.closePath();
        gc.stroke();

        //CEJA
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 754 467 Q 740 478 729 468 L 725 467 L 729 464 Q 741 475 754 467");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //COLA
        gc.setLineWidth(2.0);
        gc.setFill(Color.rgb(223, 145, 159));
        gc.setStroke(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 843 546 Q 838 538 835 531 Q 827 493 861 472 Q 880 509 847 538"
                + " Q 855 533 867 540 Q 856 553 843 546");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //PARTE DE ABAJO
        gc.setLineWidth(2.0);
        gc.setFill(Color.rgb(249, 232, 202));
        gc.setStroke(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 729 566 Q 727 584 737 589 Q 749 609 741 652 Q 746 655 754 651\n" +
                "Q 761 639 760 627 L 760 603 Q 751 606 745 595 Q 751 606 765 602\n" +
                "Q 760 598 762 593 Q 760 598 765 602 Q 771 613 769 620 L 769 647\n" +
                "Q 770 653 767 656 Q 773 662 784 657 Q 790 650 788 639 L 788 599\n" +
                "Q 791 592 790 587 Q 791 587 788 599 Q 799 589 815 593\n" +
                "Q 816 586 810 582 Q 816 586 815 593 Q 815 606 824 618\n" +
                "Q 832 619 833 627 Q 835 643 831 654 Q 836 658 845 655\n" +
                "Q 859 637 851 615 Q 849 603 842 599 Q 840 588 845 580\n" +
                "Q 847 568 844 560 Q 832 563 825 552 Q 818 580 791 573\n" +
                "Q 754 596 737 546 Q 731 554 729 566");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //Linea Amarilla
        gc.setLineWidth(1.5);
        gc.setFill(Color.rgb(247, 205, 43));
        gc.setStroke(Color.rgb(162, 80, 33));
        gc.beginPath();
        gc.appendSVGPath("M 844 560 Q 832 563 825 552 Q 818 580 791 573 Q 754 596 737 546 \n" +
                "Q 731 554 729 566 Q 726 562 728 556 Q 731 544 739 537\n" +
                "Q 761 587 789 566 Q 816 573 823 544 Q 831 556 844 553\n" +
                "Q 846 556 844 560");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //Circulos
        gc.setLineWidth(1.5);
        gc.setFill(Color.rgb(247, 205, 43));
        gc.setStroke(Color.rgb(162, 80, 33));
        gc.beginPath();
        gc.appendSVGPath("M 786 556 Q 789 564 781 565 Q 777 558 786 556");
        gc.closePath();
        gc.fill();
        gc.stroke();

        gc.setLineWidth(1.5);
        gc.setFill(Color.rgb(247, 205, 43));
        gc.setStroke(Color.rgb(162, 80, 33));
        gc.beginPath();
        gc.appendSVGPath("M 809 558 Q 814 557 813 552 Q 806 551 809 558");
        gc.closePath();
        gc.fill();
        gc.stroke();

        gc.setLineWidth(1.5);
        gc.setFill(Color.rgb(247, 205, 43));
        gc.setStroke(Color.rgb(162, 80, 33));
        gc.beginPath();
        gc.appendSVGPath("M 812 547 Q 822 545 817 536 Q 807 543 812 547");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //Pata Atras
        gc.setLineWidth(1.5);
        gc.setFill(Color.rgb(232, 191, 171));
        gc.setStroke(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 794 597 Q 801 589 814 591 Q 816 610 824 618 Q 827 638 822 649\n" +
                "Q 814 651 808 648 Q 812 633 808 622 Q 796 614 794 597");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //Parte abajo Patas
        gc.setLineWidth(2.0);
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 741 652 Q 747 655 756 650 Q 755 659 750 662 Q 744 665 738 662\n" +
                "Q 742 657 741 652");
        gc.closePath();
        gc.fill();
        gc.stroke();

        gc.setLineWidth(2.0);
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 766 658 Q 774 662 785 656 Q 784 666 778 670 Q 771 673 764 668\n" +
                "Q 766 664 766 658");
        gc.closePath();
        gc.fill();
        gc.stroke();

        gc.setLineWidth(2.0);
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 807 647 Q 814 651 822 647 Q 821 656 817 659 Q 810 662 804 657\n" +
                "Q 808 653 807 647");
        gc.closePath();
        gc.fill();
        gc.stroke();

        gc.setLineWidth(2.0);
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 830 654 Q 836 659 845 655 Q 845 664 841 667 Q 834 670 828 666\n" +
                "Q 831 661  830 654");
        gc.closePath();
        gc.fill();
        gc.stroke();
        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Y_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(500);
        rotate.setDuration(Duration.millis(2000));
        rotate.setAutoReverse(true);
        rotate.setNode(gc.getCanvas());
        rotate.play();
        return gc;
    }

    public static void eventoUno(GraphicsContext gc, Color color) {
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(color);
        gc.beginPath();
        gc.appendSVGPath("M 768 421 Q 751 416 753 400 Q 769 392 773 410 L 771 403"
                + " Q 768 392 778 385 Q 794 393 785 411 Q 791 398 804 406 Q 801 418 791 418"
                + " Q 796 417 798 420 Q 789 425 788 433 Q 783 433 780 426 Q 783 439 772 443"
                + " Q 758 435 768 421");
        gc.closePath();
        gc.fill();
        gc.stroke();

        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(color);
        gc.beginPath();
        gc.appendSVGPath("M 853 407 Q 809 420 788 453 Q 835 457 853 407");
        gc.closePath();
        gc.fill();

        gc.setLineWidth(1.5);
        gc.setFill(color);
        gc.setStroke(Color.rgb(162, 80, 33));
        gc.beginPath();
        gc.appendSVGPath("M 844 560 Q 832 563 825 552 Q 818 580 791 573 Q 754 596 737 546 \n" +
                "Q 731 554 729 566 Q 726 562 728 556 Q 731 544 739 537\n" +
                "Q 761 587 789 566 Q 816 573 823 544 Q 831 556 844 553\n" +
                "Q 846 556 844 560");
        gc.closePath();
        gc.fill();
        gc.stroke();

        gc.setLineWidth(1.5);
        gc.setFill(color);
        gc.setStroke(Color.rgb(162, 80, 33));
        gc.beginPath();
        gc.appendSVGPath("M 786 556 Q 789 564 781 565 Q 777 558 786 556");
        gc.closePath();
        gc.fill();
        gc.stroke();

        gc.setLineWidth(1.5);
        gc.setFill(color);
        gc.setStroke(Color.rgb(162, 80, 33));
        gc.beginPath();
        gc.appendSVGPath("M 809 558 Q 814 557 813 552 Q 806 551 809 558");
        gc.closePath();
        gc.fill();
        gc.stroke();

        gc.setLineWidth(1.5);
        gc.setFill(color);
        gc.setStroke(Color.rgb(162, 80, 33));
        gc.beginPath();
        gc.appendSVGPath("M 812 547 Q 822 545 817 536 Q 807 543 812 547");
        gc.closePath();
        gc.fill();
        gc.stroke();

    }

    public static void drawSol(Group root) {
        FadeTransition fadeTransition;
        fadeTransition = new FadeTransition(Duration.millis(1000));
        Canvas canvas2 = new Canvas(900, 700);
        GraphicsContext g = canvas2.getGraphicsContext2D();
        root.getChildren().add(canvas2);
        //Base
        g.setStroke(Color.rgb(74, 38, 4));
        g.setFill(Color.rgb(74, 38, 4));
        g.beginPath();
        g.setLineWidth(2);
        g.appendSVGPath("M 201 11 L 232 56 L 264 38 L 270 69 L 331 54 L 311 100 L 353 104 L 327 128 L 387 150 L 326 172 L 352 197 L 312 200 L 333 247 L 270 232 L 263 263 L 231 244 L 201 288 L 170 244 L 138 262 L 134 233 L 70 247 L 91 200 L 50 197 L 75 173 L 15 150 L 75 129 L 50 104 L 90 101 L 70 53 L 133 68 L 138 38 L 171 56 L 201 11");
        g.closePath();
        g.stroke();
        g.fill();

        //Puntas
        g.setStroke(Color.rgb(255, 198, 64));
        g.setFill(Color.rgb(255, 198, 64));
        g.beginPath();
        g.setLineWidth(2);
        g.appendSVGPath("M 201 22 L 222 53 Q 202 51 181 53 L 201 22");
        g.appendSVGPath("M 259 46 L 262 62 Q 252 59 242 56 L 259 46");
        g.appendSVGPath("M 325 58 L 309 92 Q 297 81 279 70 L 325 58");
        g.appendSVGPath("M 343 107 L 327 120 Q 324 112 319 105 L 343 107");
        g.appendSVGPath("M 375 150 L 332 166 Q 334 151 332 135 L 375 150");
        g.appendSVGPath("M 342 193 L 319 195 Q 323 188 327 180 L 342 193");
        g.appendSVGPath("M 325 242 L 279 230 Q 297 219 308 208 L 325 242");
        g.appendSVGPath("M 259 256 L 242 244 Q 253 241 262 238 L 259 256");
        g.appendSVGPath("M 201 279 L 180 248 Q 201 249 223 247 L 201 279");
        g.appendSVGPath("M 143 254 L 139 238 Q 149 241 161 243 L 143 254");
        g.appendSVGPath("M 77 241 L 93 209 Q 105 220 123 231 L 77 241");
        g.appendSVGPath("M 59 193 L 74 181 Q 77 189 84 195 L 59 193");
        g.appendSVGPath("M 27 150 L 70 135 Q 68 150 71 166 L 27 150");
        g.appendSVGPath("M 60 107 L 84 105 Q 78 112 74 120 L 60 107");
        g.appendSVGPath("M 78 59 L 123 71 Q 106 80 93 92 L 78 59");
        g.appendSVGPath("M 142 45 L 160 56 Q 149 58 140 63 L 142 45");
        g.closePath();
        g.stroke();
        g.fill();

        //Circulo
        g.setStroke(Color.rgb(255, 198, 64));
        g.setFill(Color.rgb(255, 198, 64));
        g.beginPath();
        g.setLineWidth(2);
        g.fillOval(75, 55, 250, 190);
        g.closePath();
        g.stroke();
        g.fill();

        //Cara
        g.setStroke(Color.rgb(74, 38, 4));
        g.beginPath();
        g.setLineWidth(3);
        g.appendSVGPath("M 125 134 Q 138 130 151 134 Q 138 130 125 134");
        g.appendSVGPath("M 248 134 Q 262 129 275 134 Q 262 129 248 134");
        g.appendSVGPath("M 118 115 Q 128 110 140 108 Q 128 110 118 115");
        g.appendSVGPath("M 282 115 Q 273 110 260 108 Q 273 110 282 115");
        g.appendSVGPath("M 235 167 Q 201 179 165 168 Q 201 179 235 167");
        g.closePath();
        g.stroke();
        g.fill();

        //Mejilla
        g.setStroke(Color.rgb(238, 137, 0));
        g.setFill(Color.rgb(238, 137, 0));
        g.beginPath();
        g.setLineWidth(2);
        g.fillOval(120, 150, 25, 15);
        g.fillOval(255, 150, 25, 15);
        g.closePath();
        g.stroke();
        g.fill();

        fadeTransition.setNode(g.getCanvas());
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.0);
        fadeTransition.setCycleCount(500);
        fadeTransition.play();
    }

    public static void moverAYosho(Canvas canvas) {
        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setDuration(Duration.millis(4500));
        translateTransition.setNode(canvas);
        translateTransition.setByX(250); // distancia que recorrera
        translateTransition.setCycleCount(25);  // numero de veces en que hara las transiciones
        translateTransition.setAutoReverse(true); // transicion en reversa
        translateTransition.play();
    }

    public static Canvas dibujarAlHomoYosho(Group root) {
        Canvas canvas = new Canvas(900, 700);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);

        //Brazo Visto A Mi Derecha
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(62, 172, 37)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M266, 585 Q 278, 582, 293, 584 Q 294, 594, 290, 598 Q 287, 601, 280, 598 Q 273, 604, 260, 597 L266, 563 M275, 563 Q284, 562, 288, 568 Q291, 574, 285, 582 Q278, 586, 266, 585 L275, 563");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //CUERPO
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(62, 172, 37)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M267, 521 Q 277, 534, 276, 543 Q279, 555, 277, 565 Q274, 587, 260, 601 Q245, 614, 219, 618 Q190, 621, 167, 607 Q155, 597, 154, 581 Q148, 543, 158, 539 Q169, 542, 174, 550 Q203, 557, 221, 549 Q228, 546, 231, 541 Q238, 532, 237, 509 Q256, 515, 267, 521");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //PANNZITA
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(62, 172, 37)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M154, 581 Q165, 587, 173, 595 Q199, 601, 223, 594  Q238, 583, 245, 571  Q251, 562, 252, 548  Q254, 533, 248, 514 L267, 521 M154, 581 Q165, 587, 173, 595 Q199, 601, 223, 594  Q238, 583, 245, 571  Q251, 562, 252, 548  Q254, 533, 248, 514 L267, 521 Q279, 555, 277, 565 Q274, 587, 260, 601 Q245, 614, 219, 618 Q190, 621, 167, 607 Q155, 597, 154, 581");

        gc.fill();
        gc.stroke();

         /*//Panzita
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(245, 245, 245)); //rellenar
        gc.beginPath();
            gc.appendSVGPath("M 154, 581 Q165, 587, 173, 595  Q238, 583, 245, 571Q251, 562, 252, 548 Q254, 533, 248, 514 L267, 521 M267, 521, Q277, 534, 276, 543 Q279, 555, 277, 565 Q274, 587, 260, 601 Q245, 614, 219, 618 Q190, 621, 167, 607  Q155, 597, 214 ");

        gc.fill();
        gc.stroke();**/

        //Pierna
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(62, 172, 37)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M174, 595 Q173, 608, 179, 613 Q178, 618, 188, 625 L215, 619 Q217, 616, 218, 614 Q224, 610, 222, 604 Q221, 597, 213, 591   ");
        gc.fill();
        gc.stroke();

        //SUELA visto a mi izquierda.
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(217, 210, 120)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M245, 656 Q 260, 660, 275, 658 Q283, 652, 280, 642 Q272, 649, 246, 648   ");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //Zapato visto a mi izquierda
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(216, 68, 68)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M246, 647  Q266, 650, 281, 641 Q289, 611, 247, 617 Q252, 610, 257, 604 Q237, 615, 219, 618 L246, 647  ");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //SUELA visto a mi derecha
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(217, 210, 120)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M180, 645, Q179, 657 ,180,661 Q188, 663, 194, 663 Q225, 672, 236, 670 Q246, 664, 242, 656 Q220, 662, 197, 658 Q186, 658, 180, 653");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //zapato visto a mi derecha
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(216, 68, 68)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M209, 628, Q212, 623, 219, 622 Q234, 620 ,249, 633 Q256, 648 ,238, 658 Q238, 660, 230, 660 Q207, 661, 185, 656 Q170, 643, 185, 631 Q177, 622, 181, 618 Q199, 611, 219, 617 Q215, 624, 209, 628");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //conchita blanca
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(245, 245, 245)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M179, 547 Q165, 555, 168, 571 Q180, 585, 198, 578 Q205, 575, 210, 568 Q218, 561, 219, 548 Q219, 541, 213, 541 Q207, 535, 197, 538 Q185, 541, 179, 547");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //Concha Roja
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(216, 68, 68)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M179, 547  Q174, 556, 176, 564 Q183, 573, 191, 568 Q206, 559, 213, 541 Q207, 535, 197, 538 Q185, 541, 179, 547");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //triangulitos
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(216, 68, 68)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M231, 513 Q 221, 518, 212, 514 Q209, 505, 217, 499 Q225, 502, 231, 513 M234, 531 Q223, 529, 218, 519 Q225, 513, 237, 511 Q240, 522, 234, 531 M219, 549 Q211, 539, 215, 529 Q226, 526, 235, 533 Q232, 545, 219, 549");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //Brazos
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(62, 172, 37)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M234, 544 Q214, 561, 220, 583 Q214, 561, 220, 583 Q214, 586, 217, 591 Q218, 601, 227, 606 Q235, 610, 242, 605 Q256, 608, 253, 592 Q259, 588, 258, 581 Q253, 571, 239, 571 Q237, 557, 247, 548");
        gc.closePath();
        gc.fill();
        gc.stroke();


        //CABEZA
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(62, 172, 37)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M241 512 Q198 503 205 472 Q 205 451 223 445 Q 225 416 248 401"
                + "Q255 398 273 411 Q273 405 268 404 Q282 398 291 406"
                + "Q300 416 302 442 L241 513");
        gc.closePath();
        gc.fill();
        gc.stroke();


        //OJOS
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(245, 245, 245)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M 302 442 Q295 417 288 410 Q 278 406 272 413"
                + "Q255 407 250 414 Q239 445 249 456 Q254 464 270 460 Q282 456 298 459"
                + "Q298 451 302 442 ");
        gc.closePath();
        gc.fill();
        gc.stroke();

        //Nariz
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(62, 172, 37)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M 270 460 Q298 438 328 453 Q343 477 333 502"
                + "Q311 523 267 511 Q256 505 255 497 " //FIN
                + "M248 500 Q255 497 256 474" //HOLLUELOS
                + "M304 459 Q 310 460 310 465 M 320 465 Q320 460 324 459");//FOSAS NASALES
        gc.fill();
        gc.stroke();

        //Cachetes blancos
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(245, 245, 245)); //rellenar
        gc.beginPath();
        gc.appendSVGPath("M295 519 Q 282 528 270 523 Q249 525 241 512 Q198 503 205 472"
                + "Q231 451 256 479 Q261 491 255 497 Q267 512 295 519");
        gc.fill();
        gc.stroke();

        //OJOS
        gc.setLineWidth(3.0); // grosor
        gc.setStroke(Color.BLACK); //color de la linea
        gc.setFill(Color.rgb(0, 0, 0)); //rellenar
        gc.beginPath();
        gc.fillOval(260, 422, 13, 23);
        gc.fillOval(278, 420, 11, 23);
        gc.fill();
        gc.stroke();
        return canvas;
    }

    public static void dibujarMariposas(Group root2) {
        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setDuration(Duration.millis(5000));
        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        Canvas canvas2 = new Canvas(500, 500);
        Canvas canvas3 = new Canvas(500, 500);
        Canvas canvas4 = new Canvas(500, 500);
        Canvas canvas5 = new Canvas(500, 500);
        Canvas canvas6 = new Canvas(500, 500);
        Canvas canvas7 = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        GraphicsContext dc = canvas2.getGraphicsContext2D();
        GraphicsContext qc = canvas3.getGraphicsContext2D();
        GraphicsContext ac = canvas4.getGraphicsContext2D();
        GraphicsContext pc = canvas5.getGraphicsContext2D();
        GraphicsContext wc = canvas6.getGraphicsContext2D();
        root.getChildren().add(canvas);
        root.getChildren().add(canvas2);
        root.getChildren().add(canvas3);
        root.getChildren().add(canvas4);
        root.getChildren().add(canvas5);
        root.getChildren().add(canvas6);

        gc.setLineWidth(2);
        gc.beginPath();


        //Mariposa uno
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.YELLOWGREEN);
       /* gc.appendSVGPath("M 31 17 Q 60 22 81 39 Q 100 61 117 87 Q 133 116 146 145"
                + "Q 155 165 162 194  Q 179 177 182 200 Q 208 183 242 167 Q 277 155 321 142"
                + "Q 351 142 398 158 Q 382 182 356 201 Q 338 224 324 249 Q 319 259 310 260 Q 296 262 280 259"
                + "Q 291 273 295 293 Q 291 315 280 334 Q 267 344 251 354 Q 231 359 219 364 Q 212 360 195 357 Q 178 348 172 330 "
                + "Q 167 310 160 288 Q 153 265 150 273 Q 147 278 142 290 Q 136 306 128 311 Q 127 304 131 292 Q 136 279 141 266"
                + "Q 139 259 131 262 Q 122 269 110 280 Q 95 284 69 305 Q 50 302 37 292 Q 25 288 18 271"
                + "Q 12 273 11 265 Q 1 231 5 201 Q 22 180 47 169 Q 34 161 24 144 Q 23 131 28 119 Q 30 105 31 87 Q  29 65 27 51 Q 26 38 30 31 Q 27 24 31 17 " );*/
        gc.appendSVGPath("M 15 8 Q 40 17 50 27 Q 58 38 64 50 Q 72 64 76 72 Q 81 87 83 81"
                + "Q 88 78 89 84 Q 90 90 102 82 Q 110 77 120 74 Q 134 70 147 66 Q 169 64 173 63 Q 184 64 189 66 Q 195 70 194 74"
                + "Q 188 81 182 85 Q 175 91 166 100 Q 162 106 159 113 Q 155 115 151 116 Q 145 116 138 115 Q 143 120 145 128 Q 145 133 143 140 Q 139 147 132 153 Q 124 156 115 159"
                + "Q 107 160 97 159 Q 88 155 85 148 Q 82 137 79 128 Q 76 116 79 119 Q 72 124 70 129 Q 66 135 63 138 "
                + "Q 63 132  66 125 Q 69 118 69 114 Q 62 119  55 122 Q 49 127 42 130 Q 33 135 29 136 Q 19 132 11 125 Q 6 118 2 110"
                + "Q 1 100 2 91 Q 9 81 17 76 Q 25 76 17 72 Q 11 65 10 62 Q 13 58 15 48 Q 16 39 16 29 Q 14 22 13 15 Q 13 15 15 8");
        gc.fill();
        gc.stroke();
        gc.closePath();

        //mariposa dos
        qc.setStroke(Color.BLACK);
        qc.setFill(Color.DARKCYAN);
        qc.appendSVGPath(" M 142 67 Q 142 62 143 57 Q 141 56 139 59 Q 138 62 136 65 Q 134 66 134 62 Q 136 59 138 57"
                + "Q 138 54 133 57 Q 127 60 123 62 Q 119 63 114 60 Q 111 57 108 51 Q 107 43 110 37 Q 115 35 121 34 Q 117 31 114 27"
                + "Q 118 24 119 16 Q 118 8 118 2 Q 123 2 128 4 Q 139 9 136 15 Q 140 23 143 30 Q 145 36 146 42 Q 150 37 150 44 Q 158 40 166 38"
                + "Q 175 37 185 35 Q 191 36 197 37 Q 200 40  199 43 Q 195 46 188 49 Q 184 54 181 57 Q 179 60  170 60"
                + "Q 174 64 167 63 Q 158 64  149 64 Q 146 65 142 67");
        qc.fill();
        qc.stroke();
        qc.closePath();

//mariposa-tres
        ac.setStroke(Color.BLACK);
        ac.setFill(Color.CHARTREUSE);
        ac.appendSVGPath("M 167 127 Q 175 120 184 118 Q 177 127 180 134 Q 174 139 167 133 Q 161 138 164 131 Q 161 128 153 118 Q 162 121 167 127  ");
        ac.fill();
        ac.stroke();
        ac.closePath();

        //mariposa- cuatr
        pc.setStroke(Color.BLACK);
        pc.setFill(Color.DARKORANGE);
        pc.appendSVGPath("M  202 146 Q 203 141 206 138 Q 206 132  202 135 Q 200 138 199 140 Q 197 139 192 139 Q 192 143 194 146 Q 197 147 194 150 Q 195 154 200 154 Q 204 154 207 154 Q 212 154 210 150 Q 206 148 202 146");
        pc.fill();
        pc.stroke();
        pc.closePath();

        //mariposa- cinco
        wc.setStroke(Color.BLACK);
        wc.setFill(Color.YELLOW);
        wc.appendSVGPath("M 215 62 Q 217 59 219 57 Q 220 53 222 49 Q 221 44 219 42"
                + "Q 216 43 214 47 Q 212 48 209 48 Q 209 53 205 51 Q 201 52 199 54 Q 198 57 198 61 "
                + "Q 203 63 208 64 Q 206 66 204 70 Q 207 73 204 77 Q 207 78 212 79 Q 215 77 217 74 "
                + "Q 221 77 225 77 Q  232 77 232 74 Q 291 71 226 68 Q 222 66 217 65 Q 221 65 222 65 Q 230 65 230 63"
                + "Q 228 62 225 62 Q 223 62 220 60 Q 217 62  215 62");
        wc.fill();
        wc.stroke();
        wc.closePath();

        //mariposa- seis ala chica
        dc.setStroke(Color.BLACK);
        dc.setFill(Color.BLUEVIOLET);
        dc.appendSVGPath("M 252 117 Q 247 117 244 117 Q 241 116 239 113 Q 236 110 236 107 Q 236 103 237 102 Q 239 98 242 96 Q 245 96 248 96 Q 248 99 251 101"
                + "Q 251 104 252 108 Q 252 111 252 117"
                + "M 256 112 Q 258 113 260 111 Q 262 109 265 105 Q 266 102 268 102 Q 269 100 270 96 Q 270 91 272 87 Q 271 84 270 80"
                + "Q 268 77 264 77 Q 260 77 256 80 Q 254 84 252 87 Q 251 90 251 95 Q 251 97 253 102 Q 254 107 254 109 Q 255 113 258 113 Q 254 111 256 112 "
                + "M 245 125 Q 247 122 250 119 Q 252 118 253 117 Q 256 116 259 115 Q 261 115 264 115 Q 264 116 262 117 Q 260 118 259 119 Q 258 120 256 122 Q 253 122 250 122 Q 248 123 245 125"
                + "M 268 112 Q 265 113 265 115");

        dc.fill();
        dc.stroke();
        dc.closePath();


        //root.getTransforms().addAll(rotate);
        translateTransition.setNode(root);
        translateTransition.setByX(700); // distancia que recorrera
        translateTransition.setCycleCount(50);  // numero de veces en que hara las transiciones
        translateTransition.setAutoReverse(true); // transicion en reversa
        translateTransition.play();

        root2.getChildren().add(root);

    }

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        Group root = new Group();
        Canvas canvas = new Canvas(900, 700);
        HBox hb = new HBox();
        StackPane sp = new StackPane();
        sp.setMinWidth(500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 900, 700, Color.SKYBLUE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Primavera");
        primaryStage.show();
        //Cesped
        gc.setLineWidth(2.0);
        gc.setFill(Color.CHARTREUSE);
        gc.setStroke(Color.DARKGREEN);
        gc.beginPath();
        gc.appendSVGPath("M 1 612 L 899 612 L 899 699 L 1 699 L 1 612");
        gc.closePath();
        gc.fill();
        gc.stroke();
        GraphicsContext tmp = dibujarCiervo(root);
        Canvas tmp2 = dibujarAlHomoYosho(root);
        dibujarMariposas(root);

        //Eventos
        Button btn = new Button();
        btn.setText("Evento 1");
        btn.setOnAction((ActionEvent event) -> {
            Random rnd = new Random();
            int n1 = rnd.nextInt(255);
            int n2 = rnd.nextInt(255);
            int n3 = rnd.nextInt(255);
            eventoUno(tmp, Color.rgb(n1, n2, n3));
        });
        root.getChildren().add(btn);

        Button btn2 = new Button();
        btn2.setLayoutX(100);
        btn2.setText("Evento 2");
        btn2.setOnAction((ActionEvent event) -> {
            drawSol(root);
        });
        root.getChildren().add(btn2);

        Button btn3 = new Button();
        btn3.setLayoutX(300);
        btn3.setText("Evento 3");
        btn3.setOnAction((ActionEvent event) -> {
            moverAYosho(tmp2);
        });
        root.getChildren().add(btn3);
    }
}