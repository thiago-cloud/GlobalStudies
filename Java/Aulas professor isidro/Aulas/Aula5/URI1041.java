

import java.util.Scanner;
public class URI1041 {
    public static void main(String args[]){


    Scanner input = new Scanner(System.in);
    double x,y;

    System.out.println("------------------Coordenadas de Pontos------------------");

    System.out.println("Infrome o valor de x: ");
    x = input.nextDouble();

    System.out.println("Informe o valor y: "); 
    y = input.nextDouble();

    if(x >=0 && y>=0 ){
    System.out.println("Q1");
    }else if(x< 0 && y>= 0){
        System.out.println("Q2");
    }else if(x < 0 && y < 0){
        System.out.println("Q3");
    }else if(x >= 0 && y < 0){
        System.out.println("Q4");
    }else{
        System.out.println("Erro valor digitado desconhecido!");
    }



    }
}
