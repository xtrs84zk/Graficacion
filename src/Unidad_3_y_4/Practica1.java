import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
public class Practica1 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //Circunferencia
        Sphere sp = new Sphere(100);
        sp.setTranslateX(120);
        sp.setTranslateY(120);
        sp.setTranslateZ(100);
        //Cilindro
        Cylinder cl = new Cylinder(30, 200, 100);
        cl.setTranslateX(280);
        cl.setTranslateY(120);
        cl.setTranslateZ(100);
        //cubo
        Box box = new Box(200, 200, 300);
        box.setTranslateX(500);
        box.setTranslateY(120);
        box.setTranslateZ(100);

        Group root = new Group(sp, cl, box);

        Scene scene = new Scene(root, 700, 250);

        primaryStage.setTitle("Practica 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
