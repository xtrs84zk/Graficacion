package Unidad_1_y_2.act_2;

import javax.swing.*;
import java.awt.*;

public class TextField
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setTitle("JTextAreaTest");
        f.setSize(200,150);
        f.getContentPane().setLayout(new FlowLayout());
        JTextArea ta= new JTextArea("Escribe aquí...",5,15);
        f.getContentPane().add(ta);
        f.setVisible(true);
    }
}
