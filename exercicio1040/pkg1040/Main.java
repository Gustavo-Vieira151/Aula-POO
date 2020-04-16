
package exerciciio.pkg1040;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner top= new Scanner(System.in);
        double media;
        double exame;
        Nota1 n1= new Nota1();
        Nota2 n2= new Nota2();
        Nota3 n3= new Nota3();
        Nota4 n4= new Nota4();
        System.out.println("Informe a nota 1: ");
        n1.setNota(top.nextDouble());
        System.out.println("Informe a nota 2: ");
        n2.setNota(top.nextDouble());
        System.out.println("Informe a nota 3: ");
        n3.setNota(top.nextDouble());
        System.out.println("Informe a nota 4: ");
        n4.setNota(top.nextDouble());
        media= (n1.calculaPeso()+n2.calculaPeso()+n3.calculaPeso()+n4.calculaPeso())/10;
        System.out.println("MEDIA: " + media);
        if(media>=7){
        System.out.println("Aluno aprovado");
    } else if(media<5){
        System.out.println("Aluno reprovado");
    } else if(media>=5 && media<=6.9){
        System.out.println("Aluno em exame");
        System.out.println("Nota do exame: ");
        exame= top.nextDouble();
        double mediaFinal= (exame+media)/2;
        if(mediaFinal>=5){
            System.out.println("Aluno aprovado");
            System.out.println("Media final: " + mediaFinal);
        }else{
            System.out.println("Aluno reprovado");
        }
    }
            
    
}
}
