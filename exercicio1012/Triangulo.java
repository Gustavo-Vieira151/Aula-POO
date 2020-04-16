
package exercicio1012;
import java.lang.Math;
public class Triangulo {
    private double base;
    private double altura;
    double hipotenusa;

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
    public Triangulo(){
    }

    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double areaTriangulo(){
        double area;
        area=(this.base*this.altura)/2;
        return area;
}
    public double calcularHipotenusa(){
        double hipot;
        hipot= Math.sqrt(Math.pow(altura,2)+ Math.pow(altura,2));
        return hipot;
    }
    
    
}