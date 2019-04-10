package Unidad_1_y_2.act_2;

import java.util.Scanner;

public class CrecimientoPoblacional {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double f;
        double t = s.nextDouble();
        do {
            t = t + 0.00000000000001;
            f = 5 * t + 2 * (Math.pow(Math.E, 0.1 * t));
            System.out.println(f);
            if (f == 1000) {
                System.out.println("*** Solucion encontrada ***");
                System.out.println("f(" + t + ") = " + f);
                System.out.println("***************************");
            }
        } while (f <= 1000);
        System.out.println("*** Solucion no encontrada ***");
        System.out.println("f(t) = " + f);
        System.out.println("t = " + t);
        System.out.println("******************************");
    }
}
