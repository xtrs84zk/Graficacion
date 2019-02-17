import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class linea extends Application {
    public void start(Stage primaryStage) {
        Group root = new Group();

        Canvas canvas = new Canvas(600,400);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        root.getChildren().add(canvas);

        Scene scene = new Scene(root,600,400,Color.LIGHTGRAY);

        primaryStage.setScene(scene);

        primaryStage.setTitle("Dibujo de linea");

        primaryStage.show();

        gc.setStroke(Color.BLUE);

        gc.setLineWidth(5);

        gc.strokeLine(0, 0, 100, 100);
    }

    public static void main (String[]args) {
        launch(args);
    }
}

