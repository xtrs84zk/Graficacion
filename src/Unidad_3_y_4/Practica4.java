package Unidad_3_y_4;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Practica4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        //color luna
        PhongMaterial color = new PhongMaterial(Color.YELLOW);
        color.setSpecularPower(128);

        PhongMaterial color2 = new PhongMaterial(Color.CYAN);
        color.setSpecularPower(128);

        PhongMaterial color3 = new PhongMaterial(Color.WHITE);
        color.setSpecularPower(128);
        PhongMaterial color4 = new PhongMaterial(Color.PURPLE);
        color.setSpecularPower(128);
        PhongMaterial color5 = new PhongMaterial(Color.PINK);
        color.setSpecularPower(128);
        PhongMaterial color6 = new PhongMaterial(Color.ORANGE);
        color.setSpecularPower(128);
        PhongMaterial color7 = new PhongMaterial(Color.RED);
        color.setSpecularPower(128);


        PhongMaterial mat = new PhongMaterial();
        Image diffuseMap = new Image(this.getClass().getResourceAsStream("planisferio.jpg"));
        Image normalMap = new Image(this.getClass().getResourceAsStream("planisferio.jpg"));
        mat.setDiffuseMap(diffuseMap);

        //Fucking lots of stars
        Image img = new Image(this.getClass().getResourceAsStream("background.jpg"));
        ImagePattern pattern = new ImagePattern(img);


        //tierra
        Sphere tierra = new Sphere();
        tierra.setRadius(100.0);
        tierra.setTranslateX(250);
        tierra.setTranslateY(200);
        tierra.setMaterial(mat);

        //luna
        Sphere luna = new Sphere();
        luna.setRadius(50.0);
        luna.setTranslateX(450);
        luna.setTranslateY(100);
        luna.setMaterial(color3);

        //estrellas
        Sphere estrella1 = new Sphere();
        estrella1.setRadius(5.0);
        estrella1.setTranslateX(150);
        estrella1.setTranslateY(300);
        estrella1.setMaterial(color2);

        Sphere estrella2 = new Sphere();
        estrella2.setRadius(10.0);
        estrella2.setTranslateX(400);
        estrella2.setTranslateY(200);
        estrella2.setMaterial(color2);

        Sphere estrella3 = new Sphere();
        estrella3.setRadius(5.0);
        estrella3.setTranslateX(450);
        estrella3.setTranslateY(350);
        estrella3.setMaterial(color4);

        Sphere estrella4 = new Sphere();
        estrella4.setRadius(10.0);
        estrella4.setTranslateX(200);
        estrella4.setTranslateY(50);
        estrella4.setMaterial(color4);

        Sphere estrella5 = new Sphere();
        estrella5.setRadius(5.0);
        estrella5.setTranslateX(75);
        estrella5.setTranslateY(200);
        estrella5.setMaterial(color5);

        Sphere estrella6 = new Sphere();
        estrella6.setRadius(10.0);
        estrella6.setTranslateX(550);
        estrella6.setTranslateY(100);
        estrella6.setMaterial(color5);

        Sphere estrella7 = new Sphere();
        estrella7.setRadius(5.0);
        estrella7.setTranslateX(525);
        estrella7.setTranslateY(250);
        estrella7.setMaterial(color6);

        Sphere estrella8 = new Sphere();
        estrella8.setRadius(5.0);
        estrella8.setTranslateX(45);
        estrella8.setTranslateY(350);
        estrella8.setMaterial(color6);

        Sphere estrella9 = new Sphere();
        estrella9.setRadius(10.0);
        estrella9.setTranslateX(275);
        estrella9.setTranslateY(340);
        estrella9.setMaterial(color7);

        Sphere estrella10 = new Sphere();
        estrella10.setRadius(5.0);
        estrella10.setTranslateX(325);
        estrella10.setTranslateY(100);
        estrella10.setMaterial(color7);

        Group root = new Group(luna, estrella1, estrella2, estrella3, estrella4, estrella5, estrella6, estrella7, estrella8, estrella9, estrella10, tierra);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 400);
        //rotateAroundYAxis(root).play();
        //Setting camera
        PerspectiveCamera camera = new PerspectiveCamera(false);
        camera.setTranslateX(0);
        camera.setTranslateY(0);
        camera.setTranslateZ(-10);
        scene.setCamera(camera);
        scene.setFill(pattern);

        //Setting title to the Stage
        stage.setTitle("Planeta Tierra");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();


    }
}
   // private RotateTransition rotateAroundYAxis(Node node) {
     //   RotateTransition rotat