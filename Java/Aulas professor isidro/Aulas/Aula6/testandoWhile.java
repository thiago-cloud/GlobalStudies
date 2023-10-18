

import java.util.Scanner;

public class testandoWhile{
    public static void main(String args[]){
        
        int valor;
        int contador = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = input.nextInt();

        while(contador<= valor){
            System.out.println(contador);
            contador++;
        }

        







    }
}