package Unidad_1_y_2.act_2;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Arcos extends Application {
    public void start(Stage primaryStage) {
        Group root = new Group();

        Canvas canvas = new Canvas(600, 400);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 600, 400, Color.LIGHTGRAY);

        primaryStage.setScene(scene);

        primaryStage.setTitle("Dibujo de arcos");

        primaryStage.show();

        gc.strokeArc(50,50,100,100,40,40, ArcType.OPEN);
        gc.setFill(Color.BROWN);
        gc.fillArc(120,50,100,100,40,50, ArcType.OPEN);
    }
    public static void main (String[]args) {
        launch(args);
    }
}
