package Unidad_1_y_2.transformaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChaseT extends JApplet implements ActionListener{
    Chase skye;
    JRadioButton t, r, e ,s;
    public void init(){
        this.setMinimumSize(new Dimension(900, 900));
        this.setMaximumSize(new Dimension(900, 900));
        this.setSize(500,500);
        Container c = getContentPane();

        t = new JRadioButton("Trasladar");
        t.addActionListener( this);

        r = new JRadioButton("Rotar");
        r.addActionListener(this);

        e = new JRadioButton("Escalar");
        e.addActionListener(this);

        s = new JRadioButton("Sesgar");
        s.addActionListener(this);

        skye = new Chase(100,50,50);
        ButtonGroup bg = new ButtonGroup();
        bg.add(t);
        bg.add(r);
        bg.add(e);
        bg.add(s);
        this.setVisible(true);

        this.add(t,BorderLayout.NORTH);
        this.add(r,BorderLayout.EAST);
        this.add(e,BorderLayout.SOUTH);
        this.add(s,BorderLayout.WEST);
        this.add(skye,BorderLayout.CENTER);
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
