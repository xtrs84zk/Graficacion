package Unidad_1_y_2.act_2;

import javax.swing.*;
import java.awt.*;

public class PasswordTest
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setTitle("JPasswordFieldTest");
        f.setSize(200,150);
        f.getContentPane().setLayout(new FlowLayout());
        JPasswordField pf = new JPasswordField("psw");
        f.getContentPane().add(pf);
        f.setVisible(true);
    }
}
