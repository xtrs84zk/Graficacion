package Unidad_1_y_2.actividades;

import javax.swing.Box; import javax.swing.BoxLayout; import javax.swing.JButton; import javax.swing.JFrame;

public class a31
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame(); f.setTitle("BoxLayoutTest"); f.setSize(300,150);
        f.getContentPane().setLayout(new BoxLayout(f.getContentPane(),BoxLayout.Y_AXIS)); f.getContentPane().add(new JButton("Aceptar")); f.getContentPane().add(Box.createVerticalStrut(25));
        f.getContentPane().add(new JButton("Si")); f.getContentPane().add(new JButton("No")); f.getContentPane().add(Box.createVerticalGlue()); f.getContentPane().add(new JButton("Cancelar")); f.setVisible(true);
    }
}
