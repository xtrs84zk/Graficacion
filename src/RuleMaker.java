import javax.swing.*;
import java.util.Scanner;

public class RuleMaker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String conclusion = "";
        String con;
        String premisas = "";
        String reglas = "";
        String prem1, prem2;
        int continuar = 1;
        int i = 1;
        int j;
        while (true) {
            con = JOptionPane.showInputDialog(null, "¿Cual es la solucion?");
            conclusion += "conclusion(" + i + ",'" + con + "').\n";
            j = 1;
            while (continuar == 1) {
                prem1 = JOptionPane.showInputDialog(null, "(" + i + ")[ ");
                if (prem1.equals("1")) {
                    break;
                }
                prem2 = JOptionPane.showInputDialog(null, "(" + i + ") ] ");
                premisas += "premisa(" + i + "," + j + "," + "[" + prem1 + "," + prem2 + "]" + ",'t').\n";
                j++;
            }
            reglas += "regla(" + i + "," + (j - 1) + ").\n";
            i++;
            System.out.println(conclusion + premisas + reglas);
        }
    }
}
