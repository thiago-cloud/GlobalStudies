import java.util.Scanner;

public class While{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o numero incial: ");
        int numInicial = entrada.nextInt();
        System.out.println("Informe o numero Final: ");
        int numFinal = entrada.nextInt();

        int numAtual = numInicial;
        while (numAtual<=numFinal){
            System.out.println(numAtual);
            numAtual++;
        }

    }
}