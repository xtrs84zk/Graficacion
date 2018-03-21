package Unidad_1_y_2.ejemplos;
import java.applet.Applet;
import java.awt.*;
public class FractalKoch  extends Applet
{
    double xp1=300;
    double yp1=300;
    double xp2=10;
    double yp2=300;
    double sin60=Math.sin(3.14/3.);
    int nivel_de_recursividad=10;

    public void paint(Graphics g){
        paintRecursivo(g,nivel_de_recursividad,xp1,yp1,xp2,yp2);
    }

    public void paintRecursivo(Graphics g, int i, double xp12, double  yp12, double xp22, double yp22){
        double dx=(xp22-xp12)/3.;
        double dy=(yp22-yp12)/3.;
        double xx=xp12+3*dx/2.-dy*sin60;
        double yy=yp12+3*dx/2.+dx*sin60;

        if(i<=0){
            g.drawLine((int)xp12,(int)yp12,(int)xp22,(int)yp22);
        }
        else {
            paintRecursivo(g,i-1,xp12,yp12,dx,yp12+dy);
            paintRecursivo(g,i-1,xp12+dx,yp12+dy,xx,yy);
            paintRecursivo(g,i-1,xx,yy,xp22-dx,yp22-dy);
            paintRecursivo(g,i-1,xp22-dx,yp22-dy,xp22,yp22);
        }
    }

}
