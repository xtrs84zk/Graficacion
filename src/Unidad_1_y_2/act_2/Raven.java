package Unidad_1_y_2.act_2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Raven extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        /* CREACIÓN DE LA VENTANA Y DE LOS CONTENEDORES PRINCIPALES */
        // Contenedor principal donde se alojarán todos los elementos
        Group root = new Group();
        // Creación de una zona de dibujo (canvas) de 200 x 150 puntos
        Canvas canvas = new Canvas(600, 600);
        // Obtención del contexto gráfico del canvas anterior que permitirá
        //  realizar posteriormente los dibujos
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // Se añade el canvas al contenedor principal (root)
        root.getChildren().add(canvas);
        // Creación del área (scene) correspondiente al contenido que tendrá la
        //  ventana, de 600 x 400 puntos, con color gris claro, indicando que el
        //  elemento root va a ser el contenedor principal de este espacio
        Scene scene = new Scene(root, 600, 600, Color.LIGHTGRAY);
        // Se asocia la ventana (scene) al parámetro primaryStage (escenario
        //  principal). El parámetro primaryStage se recibe en este método start
        primaryStage.setScene(scene);
        // Título que se aparecerá en la ventana
        primaryStage.setTitle("Dibujo de Raven");
        // Orden para que se muestre la ventana
        primaryStage.show();
        gc.setLineWidth(5.0);
        gc.setStroke(Color.BLUE);
        gc.setFill(Color.RED);
        gc.beginPath();
        gc.appendSVGPath("c -32.4-14.4-73.7,0-88.1,30.6"); //"M 220 40 C 220,40 310,60 ");
        gc.closePath();
        gc.fill();
        gc.stroke();
    }
}
