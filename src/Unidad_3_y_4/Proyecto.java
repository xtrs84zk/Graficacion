package Unidad_3_y_4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class Proyecto extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        //color del sol
        PhongMaterial color = new PhongMaterial(Color.YELLOW);
        color.setSpecularPower(128);

        PhongMaterial mat = new PhongMaterial();
        Image diffuseMap = new Image(this.getClass().getResourceAsStream("2.jpg"));
        mat.setDiffuseMap(diffuseMap);
        mat.setSpecularColor(Color.YELLOW);

        //Cargando el fondo, yeah
        Image img = new Image(this.getClass().getResourceAsStream("maxresdefault.jpg"));
        ImagePattern pattern = new ImagePattern(img);


        //sol, i guess
        Sphere sun = new Sphere();
        sun.setRadius(50.0);
        sun.setTranslateX(150);
        sun.setTranslateY(100);
        sun.setMaterial(color);


        Group root = new Group(sun);

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