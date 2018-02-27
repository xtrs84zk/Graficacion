package Unidad_1_y_2;

import java.awt.Container;
import javax.swing.*;

public class a32
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame(); f.setTitle("SpringLayoutTest");
        Container container = f.getContentPane(); SpringLayout layout = new SpringLayout(); container.setLayout(layout);
        JLabel label = new JLabel("Nombre: "); JTextField text = new JTextField(15); f.getContentPane().add(label); f.getContentPane().add(text);
        layout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, container); layout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, container); layout.putConstraint(SpringLayout.WEST, text, 5, SpringLayout.EAST, label); layout.putConstraint(SpringLayout.NORTH, text, 5, SpringLayout.NORTH, container); layout.putConstraint(SpringLayout.EAST, container, 5, SpringLayout.EAST, text); layout.putConstraint(SpringLayout.SOUTH, container, 5, SpringLayout.SOUTH, text); f.pack();
        f.setVisible(true);
    }
}
