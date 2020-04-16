
package exercicio1051;

public class OitoPorcento {
    private double salario;
    
    public OitoPorcento(){
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calculoImposto(){
        double imposto=0;
        double diferenca;
        diferenca= this.salario- 2000;
        imposto+=diferenca *0.8;
        return imposto;
    }
}
