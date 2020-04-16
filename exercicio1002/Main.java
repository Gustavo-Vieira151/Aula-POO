
package exercicio1002;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner top= new Scanner(System.in);
        Circulo cir= new Circulo();
        DecimalFormat form= new DecimalFormat("0.0000");
        System.out.println("Informe qual o valor do raio:");
        cir.setRaio(top.nextDouble());
        System.out.println("Valor do raio: " + form.format(cir.areaCirculo()));
    }
    
}
