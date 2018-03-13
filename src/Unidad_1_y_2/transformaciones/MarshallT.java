package Unidad_1_y_2.transformaciones;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class MarshallT extends JApplet implements ListSelectionListener {
    JList t, r, e ,s;
    private Marshall skye;

    public void init(){
        this.setMinimumSize(new Dimension(900, 900));
        this.setMaximumSize(new Dimension(900, 900));
        this.setSize(500,500);
        Container c = getContentPane();

        String[] list = {"Escalar"};
        e = new JList(list);
        e.addListSelectionListener(this);
        this.getContentPane().add(e);



        c.add(e,BorderLayout.NORTH);
        skye = new Marshall(100,50,50);
        c.add(skye,BorderLayout.CENTER);
    }

    public void valueChanged(ListSelectionEvent event) {
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
