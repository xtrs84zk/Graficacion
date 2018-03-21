package Unidad_1_y_2.actividades;

import java.awt.FlowLayout;
import javax.swing.*;

public class a22
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame(); f.setTitle("JTableTest"); f.setSize(200,150);
        f.getContentPane().setLayout(new FlowLayout()); Object[][] datos =
            {
                    { "Nombre1", "Apellido1", new Integer(911234567) },
                    { "Nombre2", "Apellido2", new Integer(917463527) },
                    { "Nombre3", "Apellido3", new Integer(912494735) },
                    { "Nombre4", "Apellido4", new Integer(912387448) },
            };
        String[] columnas = {"Nombre", "Apellidos", "Tfno"}; JTable t = new JTable(datos, columnas); JScrollPane sp= new JScrollPane(t); f.getContentPane().add(sp);
        f.setVisible(true);
    }
}
