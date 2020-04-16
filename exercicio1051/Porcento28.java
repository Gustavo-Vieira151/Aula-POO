
package exercicio1051;

public class Porcento28 {
    private double salario;
    
    public Porcento28(){  
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
        imposto= 1000*0.08 + 1500 * 0.18;
        diferenca= this.salario- 4500;
        imposto+=diferenca *0.28;
        return imposto;
    }
}
