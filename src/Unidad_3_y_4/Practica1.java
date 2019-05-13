package Unidad_3_y_4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.*;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.stage.*;
import javafx.animation.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Box;
import javafx.util.*;
/**
 *
 * @author Martha
 */

public class Practica1 extends Application {

    @Override public void start(Stage stage) {

        // crear un cubo 3D, anchura, altura y profundidad
        Box box = new Box(100, 100, 100);
        Sphere box2 = new Sphere(50);
        Cylinder box3 = new Cylinder(50, 100);

        box2.setTranslateX(250);
        box3.setTranslateX(450);


        // crear una luz puntual
        PointLight light = new PointLight();
        light.setTranslateX(-350);
        light.setTranslateY(-180);
        light.setTranslateZ(-500);

        Group root = new Group(box, box2, box3, light);

        // crear la escena, true para activar el buffer de profindidad
        Scene scene = new Scene(root, 1280, 768, true,
                SceneAntialiasing.BALANCED);

        // crear una camara en perspectiva
        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateX(scene.getWidth() / -2.0);
        camera.setTranslateY(100);//(scene.getHeight() / -2.0)- 150);

        scene.setCamera(camera);
        stage.setTitle("JavaFX Graficos 3D");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
