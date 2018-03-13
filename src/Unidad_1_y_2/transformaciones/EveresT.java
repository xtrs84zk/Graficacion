package Unidad_1_y_2.transformaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EveresT extends JApplet implements ActionListener {
    JMenuItem t, r, e ,s;
    private EverestPP skye;

    public void init(){
        this.setMinimumSize(new Dimension(900, 900));
        this.setMaximumSize(new Dimension(900, 900));
        this.setSize(500,500);
        Container c = getContentPane();

        t = new JMenuItem("Trasladar");
        t.addActionListener( this);

        r = new JMenuItem("Rotar");
        r.addActionListener(this);

        e = new JMenuItem("Escalar");
        e.addActionListener(this);

        s = new JMenuItem("Sesgar");
        s.addActionListener(this);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Menu");
        m1.add(t);
        m1.add(r);
        m1.add(e);
        m1.add(s);
        mb.add(m1);
        this.setJMenuBar(mb);
        this.setVisible(true);

        c.add(mb,BorderLayout.NORTH);
        skye = new EverestPP(100,50,50);
        c.add(skye,BorderLayout.CENTER);
    }
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == t){
            skye.trasladar(5);
        }
        if (event.getSource() == r){
            skye.rotar(5);
        }
        if (event.getSource() == e){
            skye.escalar(0.9);
        }
        if (event.getSource() == s){
            skye.sesgar(0.5);
        }
        skye.mostrar();
    }
}
