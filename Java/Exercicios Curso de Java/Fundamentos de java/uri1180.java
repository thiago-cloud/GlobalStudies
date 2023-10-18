

import java.util.Scanner;

public class uri1180 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int n,maior,menor,posMaior, posMenor;
        n = 0;
        
        

        System.out.println("Informe a quantidade de valores: ");
        n = entrada.nextInt();
        int vetor1[] = new int[n];
        for(int pos = 0; pos < vetor1.length; pos++){
                vetor1[pos] = entrada.nextInt();
              }

        maior = vetor1[0];
        posMaior = vetor1[0];
        for(int pos = 0; pos < vetor1.length ; pos++){
            if(vetor1[pos] > maior){
                maior = vetor1[pos];
                posMaior = pos;
            }
        }

        menor = vetor1[0];
        posMenor = vetor1[0];
        for(int pos = 0; pos < vetor1.length ; pos++){
            if(vetor1[pos] < menor){
                menor = vetor1[pos];
                posMenor = pos;
                
            }
        } 
        System.out.println("O maior valor do vetor é: "+maior);
        System.out.println("A posição do  maior é: "+posMaior);
        System.out.println("================================");
        System.out.println("O menor valor do vetor é: "+menor);
        System.out.println("A posição do  menor é: "+posMenor);
    }
        
}

