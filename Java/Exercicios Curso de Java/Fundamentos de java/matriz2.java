

import java.util.Scanner;

public class matriz2 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        String matriz[][];
        matriz = new String[3][3];

        System.out.println("Informe os nomes na matriz: ");

        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 3 ;coluna++){
                
                matriz[linha][coluna]= entrada.nextLine();
            }
        }

        System.out.println("==============================================");

        for(int l = 0; l <3 ; l++){
            for(int c = 0; c<3; c++){
                
                System.out.println(matriz[l][c]);
            }
        }
        
        





    }
    
}
