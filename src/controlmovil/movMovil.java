/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlmovil;
import java.text.DecimalFormat;
/**
 *
 * @author jigoku
 */
public class movMovil {
double dt;
double va;
double da;
double vt;
/*
    public String soloDos(double x){
    DecimalFormat df = new DecimalFormat("##.##");
    return df.format(x);
    }
    public String soloDos(float x){
    DecimalFormat df = new DecimalFormat("##.##");
    return df.format(x);
    }
    public String soloDos(int x){
    DecimalFormat df = new DecimalFormat("##.##");
    return df.format(x);
    }*/


    public double distancia(double a,int t){
        a=da;
        t=(int) dt;
       double d =(double) da*dt*dt;
      System.out.println(d);
        return d;
    }


    public double velocidad(double a, int t){
        a=da;
        t=(int) dt;
       double v =(double) va*vt*vt;
       System.out.println(v);
        return v;
    }

    public String estadoMov(){
    String estado="Encendido";
    return estado;
    }
}
