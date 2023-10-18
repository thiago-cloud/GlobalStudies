
import java.util.Scanner;


public class exercicio1 {
    public static void main(String args[]){
        //O parserFloat serve para converter valores de string em numeros de ponto flutuante
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("O tamanho do vetor args "+args.length);

        System.out.println("Quais os valores: ");

        for(int i = 0; i < args.length ; i++){
            System.out.println(args[i]);
        }
   


    }
}
