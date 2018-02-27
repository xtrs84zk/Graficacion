package Unidad_1_y_2;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class a25
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame(); f.setTitle("JFrameTest"); f.setSize(200,150); f.setVisible(true);

        JDialog d = new JDialog(f); d.setTitle("JDialogTest"); d.setBounds(50,50,70,50); d.setVisible(true);
    }
}
