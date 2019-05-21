package Unidad_3_y_4;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Practica3 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        PhongMaterial m1 = new PhongMaterial();
        m1.setDiffuseColor(Color.DARKBLUE);
        m1.setSpecularColor(Color.rgb(0, 0, 0));
        Box b1 = new Box(100, 100, 100);
        b1.setMaterial(m1);
        b1.setTranslateX(250);
        b1.setTranslateY(100);
        b1.setTranslateZ(200);

        //
        Image image_diffuse3 = new Image(getClass().getResource("casa.jpeg").toExternalForm());
        Color colorluz = null;
        PhongMaterial m10 = new PhongMaterial();
        m10.setSpecularColor(colorluz);
        m10.setSpecularPower(64);
        m10.setDiffuseMap(image_diffuse3);

        Cylinder c3 = new Cylinder(15, 100, 100);
        c3.setMaterial(m10);
        c3.setTranslateX(250);
        c3.setTranslateY(-110);
        c3.setTranslateZ(200);
        c3.setDrawMode(DrawMode.FILL);
        c3.setCullFace(CullFace.BACK);

        Image image_diffuse2 = new Image(getClass().getResource("f1.jpg").toExternalForm());
        Color colorLuz = null;
        PhongMaterial m6 = new PhongMaterial();
        m6.setSpecularColor(colorLuz);
        m6.setSpecularPower(64);
        m6.setDiffuseMap(image_diffuse2);

        Sphere sp3 = new Sphere(50);
        sp3.setMaterial(m6);
        sp3.setTranslateX(250);
        sp3.setTranslateY(300);
        sp3.setTranslateZ(200);
        sp3.setDrawMode(DrawMode.FILL);
        sp3.setCullFace(CullFace.BACK);

        //create a camara to view the 3D shapes
        PerspectiveCamera camera = new PerspectiveCamera(false);
        camera.setTranslateX(100);
        camera.setTranslateY(-125);

        RotateTransition rotation = new RotateTransition
                (Duration.seconds(2), camera);
        rotation.setCycleCount(Animation.INDEFINITE);

        rotation.setFromAngle(0);
        rotation.setToAngle(90);
        rotation.setAutoReverse(true);
        rotation.setAxis(Rotate.X_AXIS);
        rotation.play();
        Group root = new Group(b1, c3, sp3);
        root.setRotationAxis(Rotate.X_AXIS);
        //root.setRotate(-5);
        Scene scene = new Scene(root, 300, 800);
        scene.setCamera(camera);
        primaryStage.setTitle("Practica3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}