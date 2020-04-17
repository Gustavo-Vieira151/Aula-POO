
package exercicio1117;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

    public static void main(String[] args) {
        Scanner top= new Scanner(System.in);
        DecimalFormat form= new DecimalFormat("0.0");
        Nota1 n1= new Nota1();
        Nota2 n2= new Nota2();
        int x=0;
        double soma=0.0;
        while(x<1){
            System.out.println("Informe a primeira nota do aluno na primeira avaliação");
            n1.setNota(top.nextDouble());
            System.out.println("Informe a segunda nota do aluno seugnda avaliação: ");
            n2.setNota(top.nextDouble());
            if(n1.getNota() >= 0 && n2.getNota() >= 0 && n1.getNota() <= 10 && n2.getNota()<=10){
                x++;
                soma+= n1.getNota()+n2.getNota();
            }else {
                System.out.println("Nota invalida");
            }
        }
        System.out.println("MÉDIA: " +form.format(soma/2));
        
        
    }
    
}
