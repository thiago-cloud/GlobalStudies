import java.io.IOException;
import java.util.Scanner;

/**
 *
 * Isso é um javadoc ou seja estamos atribuindo uma documentação a aplicação
 * Oimc é baseado no peso é altura da pessoa
 * @authon Thiago alves
 *
 */

public class arquivoJar {
            public static void main(String[] args) {
                /**
                 * Comentando o método main
                 *
                 *
                 */
                double IMC;


                Scanner entrada = new Scanner(System.in);

                System.out.println("Calculo do \"IMC\"");
                System.out.println("Por favor Digite seu nome: ");
                String nome = entrada.nextLine();

                System.out.println("Digite sua altura: ");
                double altura = entrada.nextDouble();

                IMC = peso/(altura*altura);

                System.out.println("Seu imc é igual a: "+IMC);


            }
}






