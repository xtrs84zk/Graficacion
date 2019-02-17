import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Computadora extends linea{
    public void start(Stage primaryStage) {
        Group root = new Group();
        Canvas canvas = new Canvas(600, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 500, 500, Color.LIGHTGRAY);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dibujo de computadora");
        primaryStage.show();

        gc.strokeRect(90,20,260,260);
        gc.strokeRect(110,40,220,210);
        gc.strokeRect(110,280,220,30);
        gc.strokeRect(60,310,320,90);
        gc.strokeRect(240,320,100,10);
    }

    public static void main (String[]args) {
        launch(args);
    }
}
