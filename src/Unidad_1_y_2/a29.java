package Unidad_1_y_2;
import java.awt.*;
import javax.swing.*;

public class a29
{
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("JToolBarTest");
        f.setSize(200, 150);
        JToolBar tb = new JToolBar();
        JButton b = new JButton(new ImageIcon("New24.gif"));
        tb.add(b);
        b = new JButton(new ImageIcon("Open24.gif"));
        tb.add(b);
        b = new JButton(new ImageIcon("Save24.gif"));
        tb.add(b);
        b = new JButton(new ImageIcon("Print24.gif"));
        tb.add(b);
        f.getContentPane().add(tb, BorderLayout.NORTH);
        f.setVisible(true);
    }
}