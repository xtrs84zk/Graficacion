package Unidad_1_y_2.actividades;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class a19
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setTitle("JFileChooserTest");
        f.setSize(200,150);
        f.setVisible(true);

        JFileChooser fc = new JFileChooser();
        int op = fc.showOpenDialog(f);
        if(op == JFileChooser.APPROVE_OPTION) System.out.println(fc.getSelectedFile());
    }
}
