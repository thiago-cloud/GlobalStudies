

import java.util.Scanner;

public class URI1037 {
    public static void main(String args[]){
       // [0,25] (25,50], (50,75], (75,100).
       //Leia um numero
       //verifique se o numero estar dentro desses intervalos
       Scanner input = new Scanner(System.in);
        int numero;

       System.out.println("Informe um numero inteiro: ");
       numero = input.nextInt();
       
       if(numero>=0 && numero<=25){
            System.out.println("O numero se encontra dentro do intervalo de 0 a 25");
       }else if(numero > 25 && numero<=50){
            System.out.println("O numero se encontra dentro do intervalo de 25 a 50");
       }else if(numero>50 && numero<=75){
            System.out.println("O numero se encontra dentro do intervalo de 50 a 75");
       }else if(numero > 75 && numero<=100){
            System.out.println("O numero se encontra dentro do intervalo de 75 a 100");
       }else{
        System.out.println("Numero se encontra fora do intervalo!");
       }
    }
}

