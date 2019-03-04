package Unidad_1_y_2.act_2;

import javax.swing.*;
import java.awt.*;

public class Label
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
