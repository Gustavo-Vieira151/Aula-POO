
package exerciciio.pkg1040;

public class Nota1 {
    private double nota;
    
    
    public Nota1(){
}

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public double calculaPeso(){
    double peso;
    peso=this.nota*2;
    return peso;
}
    
}
