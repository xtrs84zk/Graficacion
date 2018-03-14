package Unidad_1_y_2.transformaciones;

import javax.swing.*;
import java.awt.*;

public class IFPaws extends JApplet{
    Skye skye;
    Marshall marshall;
    EverestPP everestPP;
    Chase chase;
    RubblePP rubblePP;
    public void init()
    {
        Container c = getContentPane();

        marshall = new Marshall(100,50,50);
        JInternalFrame f2 = new JInternalFrame("Marshall");
        f2.setBounds(10,10,250,250);
        f2.setVisible(true);
        f2.add(marshall);
        c.add(f2);

        everestPP = new EverestPP(100,50,50);
        JInternalFrame f3 = new JInternalFrame("Everest");
        f3.setBounds(10,10,250,250);
        f3.setVisible(true);
        f3.add(everestPP);
        c.add(f3);

        chase = new Chase(100,50,50);
        JInternalFrame f4 = new JInternalFrame("Chase");
        f4.setBounds(10,10,250,250);
        f4.setVisible(true);
        f4.add(chase);
        c.add(f4);

        rubblePP = new RubblePP(100,50,50);
        JInternalFrame f5 = new JInternalFrame("Rubble");
        f5.setBounds(10,10,250,250);
        f5.setVisible(true);
        f5.add(rubblePP);
        c.add(f5);

        skye = new Skye(100,50,50);
        JInternalFrame f1 = new JInternalFrame("Skye");
        f1.setBounds(10,10,150,100);
        f1.setVisible(true);
        f1.add(skye);
        c.add(f1);

        c.setVisible(true);
    }

}
