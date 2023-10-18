import java.util.Scanner;

public class DadosDeEntrada{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
                String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
            int idade = entrada.nextInt();
        System.out.println("Digite seu peso: ");
            float peso = entrada.nextFloat();
        System.out.println("Digite sua altura: ");
            float altura = entrada.nextFloat();
            double imc = peso/(altura*altura);
        System.out.println("O IMC de "+nome+" é igual: "+imc);
    }
}