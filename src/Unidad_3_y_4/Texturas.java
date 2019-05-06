package Unidad_3_y_4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.*;
import javafx.stage.*;
import javafx.animation.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Box;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;
import javafx.util.*;


/**
 *
 * @author Martha
 */

public class Texturas extends Application {

    @Override public void start(Stage stage) {

        Image image_diffuse = new Image(getClass().getResource("f1.jpg").toExternalForm());
        //Image image_normal = new Image(getClass().getResource("f1.jpg").toExternalForm());

        PhongMaterial mat = new PhongMaterial();
        Color color_luz = null;
        mat.setSpecularColor(color_luz);
        mat.setSpecularPower(64);
        mat.setDiffuseMap(image_diffuse);
        //mat.setBumpMap(image_normal);



        //PhongMaterial mat = new PhongMaterial(Color.RED);
        //mat.setSpecularColor(Color.BLUE);
        //mat.setSpecularPower(128);

        // crear un cubo 3D, anchura, altura y profundidad
        Box cubo = new Box(300, 300, 400);
        cubo.setTranslateX(300);
        cubo.setTranslateY(300);
        cubo.setTranslateZ(0);
        cubo.setRotate(80);
        cubo.setDrawMode(DrawMode.FILL);
        cubo.setCullFace(CullFace.BACK);
        cubo.setMaterial(mat);

        Group root = new Group(cubo);

        // crear la escena, true para activar el buffer de profindidad
        Scene scene = new Scene(root, 800, 800, true,
                SceneAntialiasing.BALANCED);

        stage.setTitle("JavaFX Graficos 3D");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
