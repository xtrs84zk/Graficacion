package Unidad_1_y_2.act_2;

import javax.swing.*;
import java.awt.*;

public class CheckBox
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setTitle("JCheckBoxTest");
        f.setSize(200,150);
        f.getContentPane().setLayout(new FlowLayout());
        JCheckBox c = new JCheckBox("Mayor de 18 años");
        f.getContentPane().add(c);
        f.setVisible(true);
    }
}
