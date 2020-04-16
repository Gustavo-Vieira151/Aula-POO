
package exerciciio.pkg1040;

public class Nota4 {
    private double nota;
    
    public Nota4(){
        
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public double calculaPeso(){
        double peso;
        peso=this.nota * 1;
        return peso;
    }
}
