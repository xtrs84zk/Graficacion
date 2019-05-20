
import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
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
        m1.setDiffuseColor(Color.DARKRED);
        m1.setSpecularColor(Color.rgb(0, 0, 0));
        Box b1 = new Box(100, 100, 100);
        b1.setMaterial(m1);
        b1.setTranslateX(250);
        b1.setTranslateY(100);
        b1.setTranslateZ(200);

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
        Group root = new Group(b1);
        root.setRotationAxis(Rotate.X_AXIS);
        //root.setRotate(-5);
        Scene scene = new Scene(root, 300, 800);
        scene.setCamera(camera);
        primaryStage.setTitle("Practica3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}