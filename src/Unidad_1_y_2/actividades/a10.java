package Unidad_1_y_2.actividades;

import java.awt.FlowLayout;
import javax.swing.*;

public class a10
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setTitle("JLabelTest");
        f.setSize(200,150);
        f.getContentPane().setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Una etiqueta");
        JLabel l2 = new JLabel();
        l2.setText("Otra etiqueta");
        f.getContentPane().add(l1);
        f.getContentPane().add(l2);
        f.setVisible(true);
    }
}
