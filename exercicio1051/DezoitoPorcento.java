
package exercicio1051;

public class DezoitoPorcento {
    private double salario;
    
    public DezoitoPorcento(){
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calculoImposto(){
        double imposto;
        double diferenca;
        imposto= 1000*0.08;
        diferenca= this.salario- 3000;
        imposto+=diferenca * 0.18;
        return imposto;
    }
    
}
