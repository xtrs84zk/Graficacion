package Unidad_1_y_2.act_2;

import javax.swing.*;
import java.awt.*;

public class TableView {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Table test");
        f.setSize(500, 150);
        f.getContentPane().setLayout(new FlowLayout());
        Object[][] datos =
                {
                        {"Nombre1", "Apellido1", new Integer(911234567)},
                        {"Nombre2", "Apellido2", new Integer(917463527)},
                        {"Nombre3", "Apellido3", new Integer(912494735)},
                        {"Nombre4", "Apellido4", new Integer(912387448)},
                };
        String[] columnas = {"First Name", "Last Name", "Phone"};
        JTable t = new JTable(datos, columnas);
        JScrollPane sp = new JScrollPane(t);
        f.getContentPane().add(sp);
        f.setVisible(true);
    }
}
