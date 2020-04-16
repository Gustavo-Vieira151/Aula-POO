
package exercicio1051;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner top= new Scanner(System.in);
    double salario;
    OitoPorcento por8 = new OitoPorcento();
    DezoitoPorcento por18 = new DezoitoPorcento();
    Porcento28 por28 = new Porcento28();
    int x;
    do{
    System.out.println("Escolha as opções a baixo: ");
    System.out.println("1- Salario entre R$ 0 a 2000.00 reais");
    System.out.println("2- Salario entre R$ 2000.01 a 3000.00 reais");
    System.out.println("3- Salario entre R$3001.01 a 4500.00 reais");
    System.out.println("4- Salario a mais que R$4500.00 reais");
    int opcao= top.nextInt();
    switch(opcao){
        case 1:
       System.out.println("Informe o valor salario: ");
       salario= top.nextDouble();
       while(salario>2000){
           System.out.println("Valor incorreto pela opção selecionada: ");
           salario= top.nextDouble();
       }
       
       System.out.println("Imposto Isento");        
       break;
       
        case 2: 
       System.out.println("Informe o valor salario: ");
       por8.setSalario(top.nextDouble());
        if(por8.getSalario()>2000){
            System.out.println("Imposto valor: " +  por8.calculoImposto());
        }
        while(por8.getSalario()>3000 || por8.getSalario()<=2000){
            System.out.println("Valor incorreto pela opção selecionada: ");
            por8.setSalario(top.nextDouble());
        }
        break;
        
        case 3: 
        System.out.println("Informe o valor salario: ");
        por18.setSalario(top.nextDouble());
        if(por18.getSalario()>3000){
            System.out.println("Imposto valor: "+ por18.calculoImposto());
        }
        while(por18.getSalario()>4500 || por18.getSalario()<=3000){
            System.out.println("Valor incorreto pela opção selecionada. ");
            por18.setSalario(top.nextDouble());
        }
        break;
        case 4:
        System.out.println("Informe o valor salario: ");
        por28.setSalario(top.nextDouble());
        if(por28.getSalario()>4500){
            System.out.println("Imposto valor: " + por28.calculoImposto());
        }
        while(por28.getSalario()<=4500){
            System.out.println("Valor incorreto pela opção selecionada. Informe novamente: ");
            por28.setSalario(top.nextDouble());
        }
        break;
        default:
            System.out.println("Opção digitada incorreta!!");
    }
            System.out.println("Deseja realizar outra consulta? Digite [1]sim [2]nao");
            x=top.nextInt();
    }while(x==1);
    
}
}