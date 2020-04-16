
package exercicio1012;
import java.lang.Math;
public class Circulo {
    private double raio;
    final static double PI=3.14159;
    public Circulo(){
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double areaCirculo(){
        double area;
        area= PI* Math.pow(raio,2);
        return area;
    }
            
 }