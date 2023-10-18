

import java.util.Scanner;
public class switchCase {
    public static void main(String args[]){
        int valor;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor de 1 a 3: ");
        valor = input.nextInt();

        switch (valor){
            case 1:
            System.out.println("valor digitado 1");
            break;
            case 2:
            System.out.println("valor digitado 2");
            break;
            case 3:
            System.out.println("Valor digitado 3");
            break;
        }
    }
    
}
