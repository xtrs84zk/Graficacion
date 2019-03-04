package Unidad_1_y_2.act_2;

import javax.swing.*;
import java.awt.*;

public class RadioButton
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setTitle("JRadioButtonTest");
        f.setSize(200,150);
        f.getContentPane().setLayout(new FlowLayout());
        ButtonGroup bg = new ButtonGroup();
        JRadioButton c1 = new JRadioButton("Si", true);
        bg.add(c1);
        JRadioButton c2 = new JRadioButton("No", false);
        bg.add(c2);
        f.getContentPane().add(c1);
        f.getContentPane().add(c2);
        f.setVisible(true);
    }
}
