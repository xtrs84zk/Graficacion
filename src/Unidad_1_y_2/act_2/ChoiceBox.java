package Unidad_1_y_2.act_2;

import javax.swing.*;
import java.awt.*;

public class ChoiceBox {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("JComboBoxTest");
        f.setSize(200, 150);
        f.getContentPane().setLayout(new FlowLayout());
        String[] list = {"Rojo", "Amarillo", "Blanco"};
        JComboBox c = new JComboBox(list);
        f.getContentPane().add(c);
        f.setVisible(true);
    }
}
