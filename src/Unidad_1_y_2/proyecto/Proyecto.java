package Unidad_1_y_2.proyecto;

import Unidad_1_y_2.transformaciones.Skye;

import javax.swing.*;
import javax.xml.bind.JAXB;
import java.awt.*;

public class Proyecto extends JApplet {
    private Barco barco;
    private Carro carro;
    private ImageIcon imagen;

    public void init(){
        Container c = getContentPane();

        //imagen = new ImageIcon("fondo.jpeg");

        carro = new Carro(100,51,244);
        barco = new Barco(100,253,175);

        c.add(carro);
        c.add(barco);
    }
    /**
    public void paint(Graphics g){
        imagen.paintIcon(this,g, 180, 0);
    }
     **/
}
