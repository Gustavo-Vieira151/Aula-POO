
package exercicio1012;

public class Trapezio {
    private double baseA;
    private double baseB;
    private double altura;
            
    public Trapezio(){
    }

    public double getBaseA() {
        return baseA;
    }

    public void setBaseA(double baseA) {
        this.baseA = baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public void setBaseB(double baseB) {
        this.baseB = baseB;
    }

    public double getAltura1() {
        return altura;
    }

    public void setAltura1(double altura) {
        this.altura = altura;
    }
    
    public double areaTrapezio(){
        double area;
        area= ((this.baseA+this.baseB)/2)*this.altura;
        return area;
    }
}
