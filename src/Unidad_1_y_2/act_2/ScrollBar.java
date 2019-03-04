package Unidad_1_y_2.act_2;

import javax.swing.*;
import java.awt.*;

public class ScrollBar {
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setTitle("JScrollBarTest");
        f.setSize(200,150);
        f.getContentPane().setLayout(new FlowLayout());
        JScrollBar sb = new JScrollBar(JScrollBar.HORIZONTAL,0,5,-100,100);
        f.getContentPane().add(sb);
        f.setVisible(true);
    }

}
