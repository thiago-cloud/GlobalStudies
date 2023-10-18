

import java.util.Scanner;

public class testeFor {
    



    public static void main(String args[]){
        int valor;
        int contador;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        valor = entrada.nextInt();

        for(contador = 1 ; contador <= valor ; contador ++){
            System.out.println(contador);
        }
        
    }
    
}
