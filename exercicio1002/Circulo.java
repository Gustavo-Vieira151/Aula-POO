
package exercicio1002;

public class Circulo {
    private double raio;
    final double n=3.14159;
    
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
        area=this.n * this.raio;
        return area;
    }
}
