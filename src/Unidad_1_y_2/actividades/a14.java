package Unidad_1_y_2.actividades;

import java.awt.FlowLayout; import javax.swing.JFrame; import javax.swing.JTextField;

public class a14
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setTitle("JTextFieldTest");
        f.setSize(200,150);
        f.getContentPane().setLayout(new FlowLayout());
        JTextField tf = new JTextField("Escribe aquí...");
        f.getContentPane().add(tf);
        f.setVisible(true);
    }
}
