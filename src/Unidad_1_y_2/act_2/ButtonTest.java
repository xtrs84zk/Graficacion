package Unidad_1_y_2.act_2;

import javax.swing.*;
import java.awt.*;

public class ButtonTest
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setTitle("Test de migración");
        f.setSize(200,150);
        f.getContentPane().setLayout(new FlowLayout());
        JButton b= new JButton("Ok");
        f.getContentPane().add(b);
        f.setVisible(true);
    }
}
