package Unidad_3_y_4;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;
import javafx.stage.Stage;

public class Practica2 extends Application{

    public void start(Stage stage) {
        Box cubo1 = new Box(100, 100, 100);
        Box cubo2 = new Box(100, 100, 100);

        cubo2.setTranslateX(-150);

        //Creando un haz de luz
        PointLight light = new PointLight();
        light.setColor(Color.WHITE);

        //Creando un material
        final PhongMaterial redMaterial = new PhongMaterial();
        redMaterial.setDiffuseColor(Color.DARKRED);
        redMaterial.setSpecularColor(Color.RED);

        final PhongMaterial greenMaterial = new PhongMaterial();
        greenMaterial.setDiffuseColor(Color.DARKGREEN);
        greenMaterial.setSpecularColor(Color.GREEN);

        final PhongMaterial blueMaterial = new PhongMaterial();
        blueMaterial.setDiffuseColor(Color.DARKBLUE);
        blueMaterial.setSpecularColor(Color.BLUE);

        cubo1.setDrawMode(DrawMode.FILL);
        cubo1.setCullFace(CullFace.FRONT);
        cubo1.setRotate(80);
        cubo1.setMaterial(blueMaterial);

        cubo2.setDrawMode(DrawMode.FILL);
        cubo2.setCullFace(CullFace.FRONT);
        //cubo2.setRotationAxis();
        cubo2.setRotate(40);
        cubo2.setMaterial(blueMaterial);

        //Creando el grupo
        Group root = new Group(cubo1, cubo2, light);

        // crear la escena, true para activar el buffer de profindidad
        Scene scene = new Scene(root, 1280, 768, true,
                SceneAntialiasing.BALANCED);

        // crear una camara en perspectiva
        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateX(scene.getWidth() / -2.0);
        camera.setTranslateY((scene.getHeight() / -2.0)- 150);

        scene.setCamera(camera);
        stage.setTitle("JavaFX Graficos 3D");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
