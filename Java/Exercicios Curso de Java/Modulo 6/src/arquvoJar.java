
import java.text.ParseException;
import java.util.Scanner;

public class arquvoJar {
     public static void main(String[] args) {

         double IMC;


        Scanner entrada = new Scanner(System.in);

         System.out.println("Calculo do \"IMC\"");
         System.out.println("Por favor Digite seu nome: ");
         String nome = entrada.nextLine();
         System.out.println("Digite seu peso: ");
         double peso = entrada.nextDouble();
         System.out.println("Digite sua altura: ");
         double altura = entrada.nextDouble();

         IMC = peso/(altura*altura);

         System.out.println("Seu imc é igual a: "+IMC);




    }
}
