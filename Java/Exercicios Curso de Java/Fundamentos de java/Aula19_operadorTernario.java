
import java.util.Scanner;


public class Aula19_operadorTernario {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.println("Informe a sua idade: ");
        idade = input.nextInt();

        String indicacao = (idade >= 18) ? "Você é de maior" : "Você é de menor"; 

        System.out.println(indicacao);

    }
}
