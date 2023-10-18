import java.util.Scanner;

public class Aula14_recebendoEntradaDeDados {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        idade = 0;
        float peso,altura,imc;
        peso = 0f;
        altura = 0f;



        System.out.println("Informe seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Informe sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Informe seu peso: ");
        peso = entrada.nextFloat();
        System.out.println("Informe sua altura: ");
        altura = entrada.nextFloat();
        imc = peso/(altura*altura);

        System.out.println("O seu imc é igual a: "+imc);
        


    }
    
}
