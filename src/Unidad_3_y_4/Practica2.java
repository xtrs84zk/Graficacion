package Unidad_3_y_4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Practica2 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //cubo1
        PhongMaterial m1 = new PhongMaterial();
        m1.setDiffuseColor(Color.DARKRED);
        m1.setSpecularColor(Color.rgb(0, 0, 0));

        Box cubo = new Box(200, 200, 300);
        cubo.setMaterial(m1);
        cubo.setTranslateX(130);
        cubo.setTranslateY(120);
        //cubo2
        PhongMaterial m2 = new PhongMaterial();
        m2.setDiffuseColor(Color.GOLD);
        m2.setSpecularColor(Color.rgb(0, 0, 0));

        Box cubo2 = new Box(200, 200, 300);
        cubo2.setMaterial(m2);
        cubo2.setTranslateX(350);
        cubo2.setTranslateY(120);

        //cubo3
        Image image_diffuse = new Image(getClass().getResource("2.jpg").toExternalForm());
        Color color_luz = null;
        PhongMaterial m3 = new PhongMaterial();
        m3.setSpecularColor(color_luz);
        m3.setSpecularPower(64);
        m3.setDiffuseMap(image_diffuse);

        Box cubo3 = new Box(200, 200, 300);
        cubo3.setMaterial(m3);
        cubo3.setTranslateX(580);
        cubo3.setTranslateY(120);
        cubo3.setDrawMode(DrawMode.FILL);
        cubo3.setCullFace(CullFace.BACK);

        //esfera1
        PhongMaterial m4 = new PhongMaterial();
        m4.setDiffuseColor(Color.DARKGREEN);
        m4.setSpecularColor(Color.rgb(0, 0, 0));

        Sphere sp = new Sphere(100);
        sp.setMaterial(m4);
        sp.setTranslateX(130);
        sp.setTranslateY(350);

        //esfera2
        PhongMaterial m5 = new PhongMaterial();
        m5.setDiffuseColor(Color.ORANGERED);
        m5.setSpecularColor(Color.rgb(0, 0, 0));

        Sphere sp2 = new Sphere(100);
        sp2.setMaterial(m5);
        sp2.setTranslateX(350);
        sp2.setTranslateY(350);
        //esfera3

        Image image_diffuse2 = new Image(getClass().getResource("f1.jpg").toExternalForm());
        Color colorLuz = null;
        PhongMaterial m6 = new PhongMaterial();
        m6.setSpecularColor(colorLuz);
        m6.setSpecularPower(64);
        m6.setDiffuseMap(image_diffuse2);

        Sphere sp3 = new Sphere(100);
        sp3.setMaterial(m6);
        sp3.setTranslateX(580);
        sp3.setTranslateY(350);
        sp3.setDrawMode(DrawMode.FILL);
        sp3.setCullFace(CullFace.BACK);

        //Cilindro1
        PhongMaterial m7 = new PhongMaterial();
        m7.setDiffuseColor(Color.DARKVIOLET);
        m7.setSpecularColor(Color.rgb(0, 0, 0));
        Cylinder c1 = new Cylinder(30, 200, 100);
        c1.setMaterial(m7);
        c1.setTranslateX(130);
        c1.setTranslateY(580);
        //Cilindro2
        PhongMaterial m8 = new PhongMaterial();
        m8.setDiffuseColor(Color.DARKBLUE);
        m8.setSpecularColor(Color.rgb(0, 0, 0));
        Cylinder c2 = new Cylinder(30, 200, 100);
        c2.setMaterial(m8);
        c2.setTranslateX(350);
        c2.setTranslateY(580);

        //cilindro3
        Image image_diffuse3 = new Image(getClass().getResource("casa.jpeg").toExternalForm());
        Color colorluz = null;
        PhongMaterial m10 = new PhongMaterial();
        m10.setSpecularColor(colorluz);
        m10.setSpecularPower(64);
        m10.setDiffuseMap(image_diffuse3);

        Cylinder c3 = new Cylinder(30, 200, 100);
        c3.setMaterial(m10);
        c3.setTranslateX(580);
        c3.setTranslateY(580);
        c3.setDrawMode(DrawMode.FILL);
        c3.setCullFace(CullFace.BACK);

        Group root = new Group(cubo, cubo2, cubo3, sp, sp2, sp3, c1, c2, c3);
        Scene scene = new Scene(root, 900, 900);

        primaryStage.setTitle("Practica2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

