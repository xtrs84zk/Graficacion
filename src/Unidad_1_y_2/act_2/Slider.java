package Unidad_1_y_2.act_2;


import javax.swing.*;
import java.awt.*;

public class Slider {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("JSliderTest");
        f.setSize(200, 150);
        f.getContentPane().setLayout(new FlowLayout());
        JSlider s = new JSlider(JSlider.HORIZONTAL, 0, 30, 15);
        s.setMajorTickSpacing(10);
        s.setMinorTickSpacing(1);
        s.setPaintTicks(true);
        s.setPaintLabels(true);
        f.getContentPane().add(s);
        f.setVisible(true);
    }
}
