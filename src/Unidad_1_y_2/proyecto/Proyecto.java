package Unidad_1_y_2.proyecto;

import Unidad_1_y_2.transformaciones.Skye;

import javax.swing.*;
import javax.xml.bind.JAXB;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Proyecto extends JApplet implements ActionListener{
    JMenuItem t, r, e ,s;
    private Barco barco;
    private Carro carro;
    private Sol sol;
    private ImageIcon imagen;

    public void init(){
        Container c = getContentPane();

        this.setSize(540,369);
        t = new JMenuItem("Trasladar");
        t.addActionListener(this);

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
        c.add(mb,BorderLayout.NORTH);
        c.setVisible(true);

        carro = new Carro(100,51,244);
        c.add(carro);

        barco = new Barco(100,253,175);
        c.add(barco);

        barco.mostrar();
        carro.mostrar();

        //imagen = new ImageIcon("fondo.jpeg");

        //carro = new Carro(100,51,244);
        //barco = new Barco(100,253,175);


        //this.add(carro);
        //this.add(barco);


        //carro.setVisible(true);


        //c.add(barco);
        //c.add(carro);
      //  barco.setVisible(true);

    }
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == t){
            barco.trasladar(5);
        }
        if (event.getSource() == r){
            barco.rotar(5);
        }
        if (event.getSource() == e){
            barco.escalar(0.9);
        }
        if (event.getSource() == s){
            barco.sesgar(0.5);
        }
        barco.mostrar();
    }
    /**
    public void paint(Graphics g){
        imagen.paintIcon(this,g, 180, 0);
    }
     **/
}
