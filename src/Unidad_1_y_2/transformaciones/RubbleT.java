package Unidad_1_y_2.transformaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

public class RubbleT extends JApplet implements ActionListener{
    JCheckBox t,r,e,s;
    RubblePP skye;
    public void init(){
        this.setMinimumSize(new Dimension(900, 900));
        this.setMaximumSize(new Dimension(900, 900));
        this.setSize(500,500);

        t = new JCheckBox("Trasladar");
        t.addActionListener(this);

        r = new JCheckBox("Rotar");
        r.addActionListener(this);

        e = new JCheckBox("Escalar");
        e.addActionListener(this);

        s = new JCheckBox("Sesgar");
        s.addActionListener(this);

        skye = new RubblePP(100,50,50);

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
