package Unidad_1_y_2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class a5 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("JButtonTest");
        f.setSize(200, 150);
        f.getContentPane().setLayout(new FlowLayout());
        JButton b = new JButton("Ok");
        f.getContentPane().add(b);
        f.setVisible(true);
    }
}
