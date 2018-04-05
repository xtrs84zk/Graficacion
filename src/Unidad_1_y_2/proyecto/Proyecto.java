package Unidad_1_y_2.proyecto;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.*;

public class Proyecto extends JApplet implements ActionListener, MouseInputListener, Runnable{
    JButton t, r, e ,s;
    private int seleccion = 0;
    private Barco barco;
    private Carro carro;
    private Sol sol;
    private Pajaritos pajaritos;
    private Fondo fondo;
    private Palmera palmera;
    private Color color;

    public void paint(Graphics g){

        Container c = getContentPane();
        JPanel panelDeBotones = new JPanel();

        this.setSize(1000,700);

        Container c2 = getContentPane();
        fondo = new Fondo(100,0,252);
        fondo.paint(g);
        //c2.add(fondo);

        carro = new Carro(100,51,244);
        carro.paint(g);
        //c.add(carro);

        barco = new Barco(100,157,198);
        barco.paint(g);
        //c.add(barco);

        pajaritos = new Pajaritos(100,230,44);
        pajaritos.paint(g);
        //c.add(pajaritos);


        sol = new Sol();
        sol.paint(g);
        c.add(sol);

//        palmera = new Palmera(100,800,500);
//        palmera.paint(g);
//        c.add(palmera);

        new Thread().start();

        this.addMouseListener(this);
    }

    public void init(){
        Container c = getContentPane();
        JPanel panelDeBotones = new JPanel();

        t = new JButton("Trasladar");
        panelDeBotones.add(t);
        t.addActionListener(this);

        r = new JButton("Rotar");
        panelDeBotones.add(r);
        r.addActionListener(this);

        e = new JButton("Escalar");
        panelDeBotones.add(e);
        e.addActionListener(this);

        s = new JButton("Sesgar");
        panelDeBotones.add(s);
        s.addActionListener(this);

        c.add(panelDeBotones, BorderLayout.NORTH);

//        sol = new Sol();
//        c.add(sol);

        this.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == t){
            sol.trasladar(5);
        }
        if (event.getSource() == r){
            sol.rotar(5);
        }
        if (event.getSource() == e){
            sol.escalar(0.9);
        }
        if (event.getSource() == s){
            sol.sesgar(0.5);
        }
        sol.mostrar();
    }

    public void mouseClicked(MouseEvent mouse) {
        color = Color.red;
        sol.cambiarColor(color);
        sol.mostrar();

    }

    public void mouseEntered(MouseEvent arg0) {
        color = Color.yellow;
        sol.cambiarColor(color);
        sol.mostrar();
    }

    public void mouseExited(MouseEvent mouse) {
        color = Color.blue;
        sol.cambiarColor(color);
        sol.mostrar();
    }


    public void mousePressed(MouseEvent arg0) {
        color = Color.black;
        sol.cambiarColor(color);
        sol.mostrar();
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        color = Color.magenta;
        sol.cambiarColor(color);
        sol.mostrar();
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        color = Color.gray;
        sol.cambiarColor(color);
        sol.mostrar();
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
        color = Color.white;
        sol.cambiarColor(color);
        sol.mostrar();
    }

    @Override
    public void run() {

            Container c = getContentPane();
            JPanel panelDeBotones = new JPanel();

            t = new JButton("Trasladar");
            panelDeBotones.add(t);
            t.addActionListener(this);

            r = new JButton("Rotar");
            panelDeBotones.add(r);
            r.addActionListener(this);

            e = new JButton("Escalar");
            panelDeBotones.add(e);
            e.addActionListener(this);

            s = new JButton("Sesgar");
            panelDeBotones.add(s);
            s.addActionListener(this);

            c.add(panelDeBotones, BorderLayout.NORTH);

            this.addMouseListener(this);

    }
}
