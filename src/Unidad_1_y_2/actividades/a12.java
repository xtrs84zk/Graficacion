package Unidad_1_y_2.actividades;

import javax.swing.*;

public class a12 {
    public static void main(String[] args)
    {
        JFrame f = new JFrame("JMenuBarTest");
        f.setSize(200,150);
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Menu 1");
        m1.add(new JMenuItem("Opción 1"));
        m1.add(new JMenuItem("Opción 2"));
        JMenu m2 = new JMenu("Menu 2");
        m2.add(new JCheckBoxMenuItem("Opción 1"));
        m2.add(new JCheckBoxMenuItem("Opción 2", true));
        m2.addSeparator();
        m2.add(new JRadioButtonMenuItem("Opción 3", true));
        mb.add(m1);
        mb.add(m2);
        f.setJMenuBar(mb);
        f.setVisible(true);
    }
}
