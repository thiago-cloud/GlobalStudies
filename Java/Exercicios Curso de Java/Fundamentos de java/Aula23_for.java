

import java.util.Scanner;



public class Aula23_for {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int ultimoValor;
        ultimoValor = 0;

        System.out.println("Informe o Ultimo valor: ");
        ultimoValor = entrada.nextInt();

        for(int j = 0; j<= ultimoValor ; j++){
            System.out.println(j);
        }

    }
}
