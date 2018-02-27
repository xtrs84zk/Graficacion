package Unidad_1_y_2;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class a28
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setTitle("ImageIconTest");
        f.setSize(200,150);
        f.getContentPane().setLayout(new FlowLayout());
        JLabel l = new JLabel();
        l.setIcon(new ImageIcon("true.gif"));
        // Soporta formatos GIF, JPG y PNG. f.getContentPane().add(l);
        f.setVisible(true);
    }
}
