package Unidad_1_y_2.act_2;

import javax.swing.*;

public class FileChooser {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("JFileChooserTest");
        f.setSize(200, 150);
        f.setVisible(true);

        JFileChooser fc = new JFileChooser();
        int op = fc.showOpenDialog(f);
        if (op == JFileChooser.APPROVE_OPTION) System.out.println(fc.getSelectedFile());
    }
}
