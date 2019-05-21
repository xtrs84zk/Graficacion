package Unidad_1_y_2.act_2;

import javax.swing.*;
import java.awt.*;

public class ToggleButton {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("JToggleButtonTest");
        f.setSize(150, 70);
        f.getContentPane().setLayout(new FlowLayout());
        ButtonGroup bg = new ButtonGroup();
        JToggleButton b1 = new JToggleButton("Si", true);
        bg.add(b1);
        JToggleButton b2 = new JToggleButton("No", false);
        bg.add(b2);
        f.getContentPane().add(b1);
        f.getContentPane().add(b2);
        f.setVisible(true);
    }
}
