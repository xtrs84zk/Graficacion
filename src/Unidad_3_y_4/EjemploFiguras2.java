package Unidad_3_y_4;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 *
 * @author Martha
 */
public class EjemploFiguras2 extends Application {

    @Override public void start(Stage stage) {
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.BLUE);
        material.setSpecularColor(Color.rgb(0, 0, 0));

        // crear una luz puntual
        PointLight light = new PointLight();
        light.setTranslateX(-350);
        light.setTranslateY(-270);
        light.setTranslateZ(-500);

        Box cubo = new Box(250, 250, 250);
        cubo.setMaterial(material);
        cubo.setTranslateX(300);
        cubo.setTranslateY(300);
        cubo.setTranslateZ(10);
        cubo.setRotate(35);
        cubo.setDrawMode(DrawMode.FILL);
        cubo.setCullFace(CullFace.FRONT);


        PointLight pointLight = new PointLight(Color.ANTIQUEWHITE);
        pointLight.setTranslateX(800);
        pointLight.setTranslateY(-100);
        pointLight.setTranslateZ(-1000);

        Group root = new Group(cubo, light);
        root.getChildren().add(pointLight);

        Scene scene = new Scene(root, 800, 800, true);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}