package Unidad_1_y_2.act_2;

import javafx.scene.Group;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Curvas2 extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Canvas canvas = new Canvas(600,600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 500, 500, Color.LIGHTGRAY);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dibujo de curvas 2");
        primaryStage.show();

        gc.setLineWidth(5.0);
        gc.setStroke(Color.BLUE);
        gc.quadraticCurveTo(125,25,75,25);
        gc.bezierCurveTo(150,20,150,150,75,150);
        gc.stroke();

        //Texto en JavaFX
        gc.setFont(Font.font("Arial",20));
        gc.setFill(Color.AQUAMARINE);
        gc.fillText("Curva Cuadrática",100,300);
        gc.setFill(Color.BROWN);
        gc.fillText("Curva cúbica",100,350);
    }
}
