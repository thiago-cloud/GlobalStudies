

import java.util.Scanner;

public class exercicio2 {
    public static void main(String args[]){
    int valor;
    int contador;
    
    
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um valor: ");
    valor = entrada.nextInt();

    contador =1 ;
    do{
        System.out.println("contador = "+contador);
        contador ++;
    }while(contador<= valor);
    

    }
}
