package Unidad_1_y_2.act_2;

import javax.swing.*;
import java.awt.*;

public class ColorChooser {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("JColorChooserTest");
        f.setSize(200, 150);
        f.setVisible(true);

        Color c = JColorChooser.showDialog(f, "Seleccione un color", Color.RED);
        System.out.println("El color seleccionado es: " + c);
    }
}
