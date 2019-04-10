package Unidad_1_y_2.act_2;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RotarRectangulo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Rectangle rect = new Rectangle(100, 100, 50, 50);
        rect.setFill(Color.LIMEGREEN);
        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Y_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(500);
        rotate.setDuration(Duration.millis(2000));
        rotate.setAutoReverse(true);
        rotate.setNode(rect);
        rotate.play();

        Rectangle rect2 = new Rectangle(300, 100, 50, 50);
        rect2.setFill(Color.WHITE);
        RotateTransition rotate2 = new RotateTransition();
        rotate2.setAxis(Rotate.X_AXIS);
        rotate2.setByAngle(360);
        rotate2.setCycleCount(500);
        rotate2.setDuration(Duration.millis(2000));
        rotate2.setAutoReverse(true);
        rotate2.setNode(rect2);
        rotate2.play();

        Group root = new Group();
        root.getChildren().add(rect);
        root.getChildren().add(rect2);
        Scene scene = new Scene(root, 500, 500, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ejemplo de rotacion con animacion.");
        primaryStage.show();
    }
}
