

import java.util.Scanner;
public class URI1004 {
    public static void main(String args[]){
        int a,b,PROD;
       

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        a = input.nextInt();
        System.out.println("Informe o segundo numero: ");
        b = input.nextInt();
        PROD = a * b;

        System.out.println("PROD = "+PROD);
    
    }
    
}
