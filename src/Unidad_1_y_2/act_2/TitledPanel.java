package Unidad_1_y_2.act_2;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

public class TitledPanel extends Application {
    public static void main(String[] args) {

        //using a two-parameter constructor
        TitledPane tp = new TitledPane("My Titled Pane", new Button("Button"));

    }


    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
