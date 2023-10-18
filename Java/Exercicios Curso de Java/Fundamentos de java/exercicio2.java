import java.util.Scanner;


public class exercicio2 {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        int n;
        n = 0;
        int matriz[][];
        matriz = new int[n][n];

        System.out.println("Informe um numero 3 =< N <= 70: ");
        n = entrada.nextInt();

        for(int linha = 0; linha < n; linha++){
            for(int coluna = 0; coluna < n ; coluna++){
                matriz[linha][coluna] = entrada.nextInt();
            }
        }


        
    }
}
