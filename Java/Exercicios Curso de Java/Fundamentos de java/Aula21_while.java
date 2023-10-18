import java.util.Scanner;


public class Aula21_while{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int valorInicial,valorFinal;

        valorInicial = 0;
        valorFinal = 0;
        
        System.out.println("Informe o valor inicial: ");
        valorInicial = entrada.nextInt();

        System.out.println("Informe o valor final: ");
        valorFinal = entrada.nextInt();

        while(valorInicial<= valorFinal){
            System.out.println(valorInicial);
            valorInicial++;
        }

    
    }
}
