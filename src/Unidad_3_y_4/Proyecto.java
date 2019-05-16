package Unidad_3_y_4;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Proyecto extends Application {
    public static void main(String[] args) {
        try {
            launch(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void start(Stage stage) {
        //abeja
        PhongMaterial materialBee1 = new PhongMaterial(Color.WHITESMOKE);
        PhongMaterial materialBee0 = new PhongMaterial(Color.YELLOW);
        PhongMaterial materialBee2 = new PhongMaterial(Color.BLACK);

        Sphere spherAbeja = new Sphere();
        spherAbeja.setRadius(60);
        spherAbeja.setTranslateX(200);
        spherAbeja.setTranslateY(300);
        spherAbeja.setTranslateZ(300);
        spherAbeja.setMaterial(materialBee0);

        Cylinder latAbeja1 = new Cylinder();
        latAbeja1.setRadius(60);
        latAbeja1.setHeight(15);
        latAbeja1.setTranslateX(200);
        latAbeja1.setTranslateY(280);
        latAbeja1.setTranslateZ(90);
        latAbeja1.setMaterial(materialBee2);

        Cylinder latAbeja2 = new Cylinder();
        latAbeja2.setRadius(60);
        latAbeja2.setHeight(15);
        latAbeja2.setTranslateX(200);
        latAbeja2.setTranslateY(315);
        latAbeja2.setTranslateZ(90);
        latAbeja2.setMaterial(materialBee2);

        Sphere spherAbeja2 = new Sphere();
        spherAbeja2.setRadius(40);
        spherAbeja2.setTranslateX(290);
        spherAbeja2.setTranslateY(300);
        spherAbeja2.setTranslateZ(300);
        spherAbeja2.setMaterial(materialBee1);

        Sphere spherAbeja3 = new Sphere();
        spherAbeja3.setRadius(40);
        spherAbeja3.setTranslateX(110);
        spherAbeja3.setTranslateY(300);
        spherAbeja3.setTranslateZ(300);
        spherAbeja3.setMaterial(materialBee1);

        Sphere spherAbeja4 = new Sphere();
        spherAbeja4.setRadius(40);
        spherAbeja4.setTranslateX(200);
        spherAbeja4.setTranslateY(220);
        spherAbeja4.setTranslateZ(300);
        spherAbeja4.setMaterial(materialBee2);

        Cylinder latAbeja3 = new Cylinder();
        latAbeja3.setRadius(5);
        latAbeja3.setHeight(30);
        latAbeja3.setTranslateX(180);
        latAbeja3.setTranslateY(180);
        latAbeja3.setTranslateZ(90);
        latAbeja3.setMaterial(materialBee2);

        Cylinder latAbeja4 = new Cylinder();
        latAbeja4.setRadius(5);
        latAbeja4.setHeight(30);
        latAbeja4.setTranslateX(220);
        latAbeja4.setTranslateY(180);
        latAbeja4.setTranslateZ(90);
        latAbeja4.setMaterial(materialBee2);

        Sphere spherAbeja5 = new Sphere();
        spherAbeja5.setRadius(10);
        spherAbeja5.setTranslateX(200);
        spherAbeja5.setTranslateY(230);
        spherAbeja5.setTranslateZ(300);
        spherAbeja5.setMaterial(materialBee1);

        Sphere spherAbeja6 = new Sphere();
        spherAbeja6.setRadius(6);
        spherAbeja6.setTranslateX(190);
        spherAbeja6.setTranslateY(200);
        spherAbeja6.setTranslateZ(300);
        spherAbeja6.setMaterial(materialBee1);

        Sphere spherAbeja7 = new Sphere();
        spherAbeja7.setRadius(6);
        spherAbeja7.setTranslateX(215);
        spherAbeja7.setTranslateY(200);
        spherAbeja7.setTranslateZ(300);
        spherAbeja7.setMaterial(materialBee1);

        //Creando un grupo aparte para redimensionar a la abeja
        Group root2 = new Group(spherAbeja, latAbeja1, latAbeja2, spherAbeja2, spherAbeja3, spherAbeja4, latAbeja3, latAbeja4, spherAbeja5
                , spherAbeja6, spherAbeja7);
        root2.setTranslateX(950);
        root2.setTranslateY(-200);
        root2.setScaleX(0.6);
        root2.setScaleY(0.6);
        root2.setScaleZ(0.6);

        //casa
        Image imageDiffuse1 = new Image(getClass().getResource("techo.jpeg").toExternalForm());
        PhongMaterial mat1 = new PhongMaterial();
        Color colorLuz1 = null;
        mat1.setSpecularColor(colorLuz1);
        mat1.setSpecularPower(64);
        mat1.setDiffuseMap(imageDiffuse1);

        Image imageDiffuse2 = new Image(getClass().getResource("2.jpg").toExternalForm());
        PhongMaterial mat2 = new PhongMaterial();
        Color colorLuz2 = null;
        mat2.setSpecularColor(colorLuz2);
        mat2.setSpecularPower(64);
        mat2.setDiffuseMap(imageDiffuse2);

        Image imageDiffuse3 = new Image(getClass().getResource("ventana.jpeg").toExternalForm());
        PhongMaterial mat3 = new PhongMaterial();
        Color colorLuz3 = null;
        mat3.setSpecularColor(colorLuz3);
        mat3.setSpecularPower(64);
        mat3.setDiffuseMap(imageDiffuse3);

        Image imageDiffuse4 = new Image(getClass().getResource("casa.jpeg").toExternalForm());
        PhongMaterial mat4 = new PhongMaterial();
        Color colorLuz4 = null;
        mat4.setSpecularColor(colorLuz4);
        mat4.setSpecularPower(64);
        mat4.setDiffuseMap(imageDiffuse4);


        Box techo = new Box(490, 40, 285);
        techo.setTranslateX(840);
        techo.setTranslateY(250);
        techo.setTranslateZ(100);
        techo.setDrawMode(DrawMode.FILL);
        techo.setCullFace(CullFace.BACK);
        techo.setMaterial(mat1);

        Box puerta = new Box(114, 171, 270);
        puerta.setTranslateX(900);
        puerta.setTranslateY(450);
        puerta.setTranslateZ(150);
        puerta.setDrawMode(DrawMode.FILL);
        puerta.setCullFace(CullFace.BACK);
        puerta.setMaterial(mat2);

        Box ventana = new Box(114, 70, 285);
        ventana.setTranslateX(730);
        ventana.setTranslateY(420);
        ventana.setTranslateZ(150);
        ventana.setDrawMode(DrawMode.FILL);
        ventana.setCullFace(CullFace.BACK);
        ventana.setMaterial(mat3);

        Box casa = new Box(400, 285, 285);
        casa.setTranslateX(830);
        casa.setTranslateY(400);
        casa.setTranslateZ(200);
        casa.setDrawMode(DrawMode.FILL);
        casa.setCullFace(CullFace.BACK);
        casa.setMaterial(mat4);

        TranslateTransition rotation2 = new TranslateTransition(Duration.seconds(2), casa);
        rotation2.setCycleCount(Animation.INDEFINITE);
        rotation2.setByX(-1000f);
        rotation2.setAutoReverse(true);
        rotation2.play();

        TranslateTransition rotation3 = new TranslateTransition(Duration.seconds(2), ventana);
        rotation3.setCycleCount(Animation.INDEFINITE);
        rotation3.setByX(-1000f);
        rotation3.setAutoReverse(true);
        rotation3.play();

        TranslateTransition rotation4 = new TranslateTransition(Duration.seconds(2), puerta);
        rotation4.setCycleCount(Animation.INDEFINITE);
        rotation4.setByX(-1000f);
        rotation4.setAutoReverse(true);
        rotation4.play();

        TranslateTransition rotation5 = new TranslateTransition(Duration.seconds(2), techo);
        rotation5.setCycleCount(Animation.INDEFINITE);
        rotation5.setByX(-1000f);
        rotation5.setAutoReverse(true);
        rotation5.play();

        //#########################################################################################################
        PhongMaterial mat = new PhongMaterial();
        Color color_luz = Color.BROWN;
        mat.setSpecularColor(color_luz);
        mat.setSpecularPower(100);
        mat.setDiffuseColor(Color.BROWN);

        //Color del pino
        PhongMaterial mat5 = new PhongMaterial();
        mat5.setSpecularColor(color_luz);
        mat5.setSpecularPower(100);
        mat5.setDiffuseColor(Color.GREEN);
        PhongMaterial ot1 = new PhongMaterial(Color.WHITESMOKE);
        PhongMaterial ot = new PhongMaterial(Color.LIGHTBLUE);
        PhongMaterial ot2 = new PhongMaterial(Color.BLACK);
        //Pino de navidad
        Box cubo1 = new Box();
        cubo1.setWidth(192);
        cubo1.setHeight(99);
        cubo1.setDepth(99);
        cubo1.setTranslateX(1000);
        cubo1.setTranslateY(480);
        cubo1.setTranslateZ(430);
        cubo1.setMaterial(mat5);
        cubo1.setRotationAxis(Rotate.Y_AXIS);

        RotateTransition rt = new RotateTransition();
        rt.setDuration(Duration.millis(1000));
        rt.setNode(cubo1);
        rt.setAxis(Rotate.Y_AXIS);
        rt.setByAngle(360);
        rt.setCycleCount(50);
        rt.setAutoReverse(true);
        rt.play();


        Box cubo2 = new Box();
        cubo2.setWidth(172);
        cubo2.setHeight(89);
        cubo2.setDepth(89);
        cubo2.setTranslateX(1000);
        cubo2.setTranslateY(480);
        cubo2.setTranslateZ(380);
        cubo2.setMaterial(mat5);
        cubo2.setRotationAxis(Rotate.Y_AXIS);

        RotateTransition rt1 = new RotateTransition();
        rt1.setDuration(Duration.millis(2500));
        rt1.setNode(cubo2);
        rt1.setAxis(Rotate.Y_AXIS);
        rt1.setByAngle(360);
        rt1.setCycleCount(50);
        rt1.setAutoReverse(false);
        rt1.play();

        Box cubo3 = new Box();
        cubo3.setWidth(52);
        cubo3.setHeight(79);
        cubo3.setDepth(79);
        cubo3.setTranslateX(1000);
        cubo3.setTranslateY(390);
        cubo3.setTranslateZ(280);
        cubo3.setMaterial(mat5);
        cubo3.setRotationAxis(Rotate.Y_AXIS);

        RotateTransition rt2 = new RotateTransition();
        rt2.setDuration(Duration.millis(2500));
        rt2.setNode(cubo3);
        rt2.setAxis(Rotate.Y_AXIS);
        rt2.setByAngle(360);
        rt2.setCycleCount(50);
        rt2.setAutoReverse(false);
        rt2.play();

        Box cubo4 = new Box();
        cubo4.setWidth(130);
        cubo4.setHeight(120);
        cubo4.setDepth(59);
        cubo4.setTranslateX(1000);
        cubo4.setTranslateY(360);
        cubo4.setTranslateZ(250);
        cubo4.setMaterial(mat5);
        cubo4.setRotationAxis(Rotate.Y_AXIS);

        RotateTransition rt3 = new RotateTransition();
        rt3.setDuration(Duration.millis(2500));
        rt3.setNode(cubo4);
        rt3.setAxis(Rotate.Y_AXIS);
        rt3.setByAngle(360);
        rt3.setCycleCount(50);
        rt3.setAutoReverse(false);
        rt3.play();

        Box cubo5 = new Box();
        cubo5.setWidth(120);
        cubo5.setHeight(120);
        cubo5.setDepth(89);
        cubo5.setTranslateX(1000);
        cubo5.setTranslateY(300);
        cubo5.setTranslateZ(350);
        cubo5.setMaterial(mat5);
        cubo5.setRotationAxis(Rotate.Y_AXIS);

        RotateTransition rt4 = new RotateTransition();
        rt4.setDuration(Duration.millis(2500));
        rt4.setNode(cubo5);
        rt4.setAxis(Rotate.Y_AXIS);
        rt4.setByAngle(360);
        rt4.setCycleCount(50);
        rt4.setAutoReverse(false);
        rt4.play();
        //Tronco
        Cylinder lata = new Cylinder();
        lata.setRadius(20);
        lata.setHeight(90);
        lata.setTranslateX(930);
        lata.setTranslateY(480);
        //lata.setTranslateZ(500);
        lata.setMaterial(mat);
        //lata.setRotationAxis(Rotate.Y_AXIS);
        //lata.setRotate(20);
        RotateTransition rt5 = new RotateTransition();
        rt5.setDuration(Duration.millis(2500));
        rt5.setNode(lata);
        rt5.setAxis(Rotate.Y_AXIS);
        rt5.setByAngle(360);
        rt5.setCycleCount(50);
        rt5.setAutoReverse(false);
        rt5.play();

        Sphere gc1 = new Sphere(60);

        gc1.setTranslateX(1000);
        gc1.setTranslateY(460);
        gc1.setTranslateZ(90);
        gc1.setMaterial(ot1);

        Sphere gc2 = new Sphere(45);

        gc2.setTranslateX(1000);
        gc2.setTranslateY(380);
        gc2.setTranslateZ(90);
        gc2.setMaterial(ot1);

        Sphere gc3 = new Sphere(20);

        gc3.setTranslateX(1000);
        gc3.setTranslateY(520);
        gc3.setTranslateZ(90);
        gc3.setMaterial(ot1);

        Sphere gc4 = new Sphere(20);

        gc4.setTranslateX(1000);
        gc4.setTranslateY(520);
        gc4.setTranslateZ(90);
        gc4.setMaterial(ot1);

        Cylinder lata11 = new Cylinder();
        lata11.setRadius(50);
        lata11.setHeight(13);
        lata11.setTranslateX(1000);
        lata11.setTranslateY(445);
        lata11.setTranslateZ(90);
        lata11.setMaterial(ot);

        Cylinder lata12 = new Cylinder();
        lata12.setRadius(35);
        lata12.setHeight(45);
        lata12.setTranslateX(1000);
        lata12.setTranslateY(420);
        lata12.setTranslateZ(90);
        lata12.setMaterial(ot);

        Cylinder lata13 = new Cylinder();
        lata13.setRadius(35);
        lata13.setHeight(15);
        lata13.setTranslateX(1000);
        lata13.setTranslateY(435);
        lata13.setTranslateZ(90);
        lata13.setMaterial(ot2);
        /////////////////////////////
        Sphere gc5 = new Sphere(60);

        gc5.setTranslateX(1000);
        gc5.setTranslateY(560);
        gc5.setTranslateZ(90);
        gc5.setMaterial(ot1);

        Sphere gc6 = new Sphere(45);

        gc6.setTranslateX(1000);
        gc6.setTranslateY(480);
        gc6.setTranslateZ(90);
        gc6.setMaterial(ot1);

        Sphere gc7 = new Sphere(20);

        gc7.setTranslateX(1000);
        gc7.setTranslateY(520);
        gc7.setTranslateZ(90);
        gc7.setMaterial(ot1);

        Sphere gc8 = new Sphere(20);

        gc8.setTranslateX(1000);
        gc8.setTranslateY(520);
        gc8.setTranslateZ(90);
        gc8.setMaterial(ot1);

        Cylinder lata16 = new Cylinder();
        lata16.setRadius(50);
        lata16.setHeight(13);
        lata16.setTranslateX(1000);
        lata16.setTranslateY(445);
        lata16.setTranslateZ(90);
        lata16.setMaterial(ot);

        Cylinder lata14 = new Cylinder();
        lata14.setRadius(35);
        lata14.setHeight(45);
        lata14.setTranslateX(1000);
        lata14.setTranslateY(420);
        lata14.setTranslateZ(90);
        lata14.setMaterial(ot);

        Cylinder lata15 = new Cylinder();
        lata15.setRadius(35);
        lata15.setHeight(15);
        lata15.setTranslateX(1000);
        lata15.setTranslateY(435);
        lata15.setTranslateZ(90);
        lata15.setMaterial(ot2);
        ScaleTransition st5 = new ScaleTransition(Duration.millis(2000), gc1);
        st5.setByX(1.5f);
        st5.setByY(1.5f);
        st5.setCycleCount(4);
        st5.setAutoReverse(true);
        //st5.play();

        ScaleTransition st6 = new ScaleTransition(Duration.millis(2000), gc2); //Escalar falso
        st6.setByX(1.5f);
        st6.setByZ(1.5f);
        st6.setCycleCount(4);
        st6.setAutoReverse(true);

        ScaleTransition st7 = new ScaleTransition(Duration.millis(2000), gc5);
        st7.setByX(1.5f);
        st7.setByY(1.5f);
        st7.setCycleCount(4);
        st7.setAutoReverse(true);
        //st5.play();

        ScaleTransition st8 = new ScaleTransition(Duration.millis(2000), gc6); //Escalar falso
        st8.setByX(1.5f);
        st8.setByZ(1.5f);
        st8.setCycleCount(4);
        st8.setAutoReverse(true);

        SequentialTransition sq = new SequentialTransition();
        sq.getChildren().addAll(st5, st6);
        sq.play();
        sq.setOnFinished((ev) -> sq.play());

        SequentialTransition sq2 = new SequentialTransition();
        sq2.getChildren().addAll(st7, st8);
        sq2.play();
        sq2.setOnFinished((ev) -> sq2.play());
        //#######################################################
        //color luna
        PhongMaterial color = new PhongMaterial(Color.YELLOW);
        color.setSpecularPower(128);

        PhongMaterial mat10 = new PhongMaterial();
        Image diffuseMap = new Image(this.getClass().getResourceAsStream("2.jpg"));
        mat10.setDiffuseMap(diffuseMap);
        mat10.setSpecularColor(Color.YELLOW);
        //Cargando el fondo, yeah
        Image img = new Image(this.getClass().getResourceAsStream("maxresdefault.jpg"));
        ImagePattern pattern = new ImagePattern(img);

        //tierra
        Sphere tierra = new Sphere();
        tierra.setRadius(50.0);
        tierra.setTranslateX(150);
        tierra.setTranslateY(100);
        tierra.setMaterial(color);

        //carraso
        PhongMaterial m2 = new PhongMaterial();
        m2.setDiffuseColor(Color.DARKRED);
        m2.setSpecularColor(Color.DARKRED);
        Box c = new Box(490, 200, 200);
        c.setTranslateX(500);
        c.setTranslateY(480);
        c.setMaterial(m2);
        //ventanas
        PhongMaterial m5 = new PhongMaterial();
        m5.setDiffuseColor(Color.GRAY);
        m5.setSpecularColor(Color.GRAY);
        Box v = new Box(320, 60, 120);
        v.setTranslateX(420);
        v.setTranslateY(440);
        v.setMaterial(m5);
        //puerta
        Box p = new Box(50, 150, 120);
        p.setTranslateX(700);
        p.setTranslateY(480);
        p.setMaterial(m5);
        PhongMaterial m3 = new PhongMaterial();
        m3.setDiffuseColor(Color.BLACK);
        m3.setSpecularColor(Color.BLACK);
        //mofle
        Cylinder m = new Cylinder(5, 200);
        PhongMaterial m7 = new PhongMaterial();
        m7.setDiffuseColor(Color.GRAY);
        m7.setSpecularColor(Color.GRAY);
        m.setMaterial(m7);
        m.setTranslateX(220);
        m.setTranslateY(470);
        //rotate transition

        //llanta izquierda
        Sphere s1 = new Sphere(45);
        s1.setMaterial(m3);
        s1.setTranslateX(320);
        s1.setTranslateY(600);
        //llanta derecha
        Sphere s2 = new Sphere(45);
        s2.setMaterial(m3);
        s2.setTranslateX(650);
        s2.setTranslateY(600);

        //virlos
        PhongMaterial m4 = new PhongMaterial();
        m4.setDiffuseColor(Color.DARKRED);
        m4.setSpecularColor(Color.DARKRED);
        Sphere s3 = new Sphere(5);
        s3.setMaterial(m4);
        s3.setTranslateX(320);
        s3.setTranslateY(600);
        Sphere s4 = new Sphere(5);
        s4.setMaterial(m4);
        s4.setTranslateX(650);
        s4.setTranslateY(600);
        Sphere s6 = new Sphere(5);
        s6.setMaterial(m4);
        s6.setTranslateX(650);
        s6.setTranslateY(600);
        //faro
        PhongMaterial m8 = new PhongMaterial();
        m8.setDiffuseColor(Color.GOLD);
        m8.setSpecularColor(Color.GOLD);
        Sphere s5 = new Sphere(10);
        s5.setTranslateX(750);
        s5.setTranslateY(580);
        s5.setMaterial(m8);

        // ##############################################################


        Group root = new Group(techo, puerta, ventana, casa, tierra, c, s1, s2, s3, s4, s5, v, p, m, lata,
                cubo1, cubo2, cubo3, cubo4, cubo5);

        //agregando abeja
        //let's try
        root.getChildren().addAll(root2);

        //Creating a scene object
        Scene scene = new Scene(root, 1280, 768);
        //rotateAroundYAxis(root).play();
        //Setting camera
        PerspectiveCamera camera = new PerspectiveCamera(false);
        camera.setTranslateX(0);
        camera.setTranslateY(0);
        camera.setTranslateZ(-10);
        scene.setCamera(camera);
        scene.setFill(pattern);

        //Setting title to the Stage
        stage.setTitle("Proyecto 3D");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
}