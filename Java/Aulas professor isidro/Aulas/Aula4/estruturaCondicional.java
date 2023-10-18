

import java.util.Scanner;

public class estruturaCondicional{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Por favor digite um numero: ");
        numero = input.nextInt();

        if(numero >= 0){
            System.out.println("Valor positivo");
        }else{
            System.out.println("Valor negativo");
        }
     System.out.println("Fim do programa!");

    }
}