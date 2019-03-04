package Unidad_1_y_2.act_2;

import javax.swing.*;
import java.awt.*;

public class ListView
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setTitle("JListTest");
        f.setSize(200,150);
        f.getContentPane().setLayout(new FlowLayout());
        String[] list = {"Primero","Segundo","Tercero","Cuarto"};
        JList l = new JList(list);
        f.getContentPane().add(l); f.setVisible(true);
    }
}
