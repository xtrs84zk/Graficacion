package Unidad_1_y_2.actividades;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class a1
{
    public static void main(String[] args)
    {
        Frame f = new Frame();
        f.setTitle("Test de migración");
        f.setSize(200,150);
        f.setLayout(new FlowLayout());
        Button b = new Button("Ok");
        f.add(b);
        f.setVisible(true);
    }
}
