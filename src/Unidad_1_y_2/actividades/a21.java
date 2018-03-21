package Unidad_1_y_2.actividades;


import java.awt.FlowLayout;
import javax.swing.*;

    public class a21
    {
        public static void main(String[] args)
        {
            JFrame f = new JFrame();
            f.setTitle("JSpinnerTest");
            f.setSize(200,150);
            f.getContentPane().setLayout(new FlowLayout());
            String[] dias = { "L","M","X","J","V","S","D" };
                SpinnerListModel modelo = new SpinnerListModel(dias);
                JSpinner s = new JSpinner(modelo);
                f.getContentPane().add(s);
            f.setVisible(true);
        }
    }

