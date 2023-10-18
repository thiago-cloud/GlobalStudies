

import java.util.Scanner;
public class formasDeFor {
    public static void main(String args[]){

        int valor1,valor2,valor3;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        valor1 = input.nextInt();

        for(int i = 0 ; i<= valor1 ; i++){
            System.out.println(i);
        }
    System.out.println("----------------------------------");

    System.out.println("Informe o segundo valor: ");
    valor2 = input.nextInt();

    for(int j = 1; j<= valor2 ; j++){
        if(j == 5){
            continue;//O continue e a mesma coisa de ignorar ou seja ele ta ignorando o 5 aki
        }
        System.out.println(j);
    }

    System.out.println("Informe o terceiro valor: ");
    valor3 = input.nextInt();


    for(int z = 1 ; z <= valor3 ; z++){
        if(z == 6){
            break;//O break tem a função de interroper a contagem
        }
        System.out.println(z);
    }





    }
        






    }

