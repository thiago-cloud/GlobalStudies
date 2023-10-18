

import java.util.Scanner;

public class testandoDoWhile {
    public static void main(String args[]){
        int contador = 1;
        int valor;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = input.nextInt();

        do{
            System.out.println(contador);
            contador++;
        }while(contador<=valor);
    }
}
