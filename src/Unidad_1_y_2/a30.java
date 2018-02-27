package Unidad_1_y_2;

import java.awt.Dimension;
import javax.swing.*;

public class a30
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame(); f.setTitle("JSplitPaneTest"); f.setSize(275,252);
        JLabel l1 = new JLabel(new ImageIcon("argh.jpg")); l1.setMinimumSize(new Dimension(20, 20));
        JLabel l2 = new JLabel(new ImageIcon("comic.jpg")); l2.setMinimumSize(new Dimension(20, 20));
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,l1,l2); sp.setContinuousLayout(true);
        sp.setOneTouchExpandable(true); sp.setDividerLocation(100); f.getContentPane().add(sp); f.setVisible(true);
    }
}
