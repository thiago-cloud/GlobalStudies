
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class URI1035 {
    public static void main(String args[]){
        //b > c && d>a && c+d > a+b && c >0 && d > 0 && a % 2 = 0 

        int a,b,c,d;
        Scanner input = new Scanner(System.in);



        System.out.println("Informe o valor de a: ");
        a = input.nextInt();
        System.out.println("Informe o valor de b: ");
        b = input.nextInt();
        System.out.println("informe o valor de c: ");
        c = input.nextInt();
        System.out.println("Informe o valor de d: ");
        d = input.nextInt();


        if(b > c && c+d > a+b && c >0 && d >0 && a % 2 == 0){
            System.out.println("Valores aceitos ");
        }else{
            System.out.println("Valores não aceitos");
        }



    }
}
