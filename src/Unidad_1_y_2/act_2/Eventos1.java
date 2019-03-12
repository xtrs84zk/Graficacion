package Unidad_1_y_2.act_2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Eventos1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage theStage) throws Exception {
        VBox root = new VBox();
        HBox hb = new HBox();

        StackPane sp = new StackPane();
        sp.setMinWidth(500);
        sp.setMinHeight(500);

        Canvas canvas = new Canvas(500, 500);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();
        Button btn = new Button();
        btn.setText("Azul");
        btn.setOnAction((ActionEvent) -> drawRectangulo(gc, Color.BLUE));

        Button btn2 = new Button();
        btn2.setText("Rojo");
        btn2.setOnAction((ActionEvent) -> drawRectangulo(gc, Color.RED));

        Button btn3 = new Button();
        btn.setText("Verde");
        btn.setOnAction((ActionEvent) -> drawRectangulo(gc, Color.GREEN));

        hb.getChildren().addAll(btn, btn2, btn3);

        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        Scene scene = new Scene(root, 600, 600, Color.LIGHTGRAY);

        theStage.setScene(scene);
        theStage.setTitle("Eventos");
        theStage.show();

    }

    /**
     * Draws a rectangle.
     *
     * @param gc
     * @param color
     */
    private void drawRectangulo(GraphicsContext gc, Color color) {
        gc.setFill(color);
        gc.fillRoundRect(110, 100, 150, 100, 10, 10);
    }
}
