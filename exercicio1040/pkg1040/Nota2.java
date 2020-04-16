
package exerciciio.pkg1040;

public class Nota2 {
    private double nota;
    
    
    public Nota2(){
    }

   

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public double calculaPeso(){
        double peso;
        peso= this.nota*3;
        return peso;
    }
}
