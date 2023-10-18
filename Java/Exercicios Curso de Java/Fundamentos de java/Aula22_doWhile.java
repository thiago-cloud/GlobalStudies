import java.util.Scanner;

public class Aula22_doWhile{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int numero,soma;
        soma = 0;


        do{
            System.out.println("Digite um numero qualquer e 0 para sair: ");
            numero = entrada.nextInt();
            soma = soma + numero;
            System.out.println("Soma: "+soma);
        }while(numero != 0);
    }
}