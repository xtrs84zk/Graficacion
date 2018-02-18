package Unidad_1_y_2;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;

public class a11
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
