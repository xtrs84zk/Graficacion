package Unidad_1_y_2.act_2;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Circulos extends Application {
    public void start(Stage primaryStage) {
        Group root = new Group();

        Canvas canvas = new Canvas(600, 400);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 600, 400, Color.LIGHTGRAY);

        primaryStage.setScene(scene);

        primaryStage.setTitle("Dibujo de círculo");

        primaryStage.show();

        gc.strokeOval(220,100,100,100);
        gc.setFill(Color.BROWN);
        gc.fillOval(100,100,100,100);
    }

    public static void main(String[] args) {
        launch(args);
    }
}