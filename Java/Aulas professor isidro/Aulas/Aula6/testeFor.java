

import java.util.Scanner;
public class testeFor {
    public static void main(String args[]){
        int valor;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = input.nextInt();

        for(int i = 1; i<=valor; i++){
            System.out.println(i);
        }
    }
}
