
package exercicio1012;
import java.lang.Math;
public class Quadrado {
    private double lado;
    
    public Quadrado(){
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double areaQuadrado(){
        double area;
        area= Math.pow(this.lado,2);
        return area;
    }
    
}

