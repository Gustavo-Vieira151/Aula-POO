
package exercicio1012;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

    public static void main(String[] args) {
        Triangulo usu01= new Triangulo();
        Circulo usu02= new Circulo();
        Retangulo usu03= new Retangulo(); 
        Trapezio usu04= new Trapezio(); 
        Quadrado usu05= new Quadrado(); 
        Scanner top= new Scanner(System.in);
        DecimalFormat form= new DecimalFormat("0.000");
        int resposta=1;
        while(resposta == 1){
            int opcao;
            System.out.println("Escolha uma opção a baixo: ");
            System.out.println("1- Triangulo");
            System.out.println("2- Circulo");
            System.out.println("3- Trapezio");
            System.out.println("4- Quadrado");
            System.out.println("5- Retangulo");
            opcao= top.nextInt();
            
        switch(opcao){
            case 1:
         System.out.println("Base A do triangulO:");
         usu01.setBase(top.nextDouble());
         System.out.println("Altura C do triangulo");
         usu01.setAltura(top.nextDouble());
         System.out.println("TRIANGULO " + form.format(usu01.areaTriangulo()));
            break;
            
            case 2:
         System.out.println("Escreva o valor do raio do círculo");
         usu02.setRaio(top.nextDouble());
         System.out.println("CIRCULO " + form.format(usu02.areaCirculo()));
            break;
            
            case 3:
         System.out.println("Escreva a base maior trapézio:");
         usu04.setBaseA(top.nextDouble());
         System.out.println("Escreva a base meno trapézio:");
         usu04.setBaseB(top.nextDouble());
         System.out.println("Escreva a altura do trapezio: ");
         usu04.setAltura1(top.nextDouble());
         System.out.println("TRAPEZIO " + form.format(usu04.areaTrapezio()));
            break;
            
            case 4:
         System.out.println("Escreva o lado do quadrado: ");
         usu05.setLado(top.nextDouble());
         System.out.println("QUADRADO "+ form.format(usu05.areaQuadrado()));
            break;
            
            case 5:
         System.out.println("Escreva a base A do retangulo: ");
         usu03.setLado1(top.nextDouble());
         System.out.println("Escreva a altura do retangulo B: ");
         usu03.setLado2(top.nextDouble());
         System.out.println("RETANGULO " + form.format(usu03.areaRetangulo()));
            break;
            default:
            System.out.println("Digitou opção inválida");
            break;
        }
         System.out.println("Deseja realizar outra consulta? Digite [1]sim [2]nao");
         opcao=top.nextInt();
         if(opcao!=1){
             System.out.println("FINALIZADO!!!");
             break;
         }
        
   }
 }
}
