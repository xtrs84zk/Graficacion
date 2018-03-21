package Unidad_1_y_2.actividades;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class a27
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame(); f.setTitle("JTabbedPaneTest"); f.setSize(200,150);
        JTabbedPane tabbedPane = new JTabbedPane(); JPanel panel1 = new JPanel(); tabbedPane.addTab("Pestaña 1", panel1);
        JPanel panel2 = new JPanel(); tabbedPane.addTab("Pestaña 2", panel2); f.getContentPane().add(tabbedPane); f.setVisible(true);
    }
}
