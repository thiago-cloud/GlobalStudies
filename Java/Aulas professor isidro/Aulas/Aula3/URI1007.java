
import java.util.Scanner;

public class URI1007 {
    public static void main(String args[]){

        float a,b,c,d,resultado;
        Scanner input = new Scanner(System.in);



        System.out.println("Informe o primeiro valor: ");
        a = input.nextFloat();


        System.out.println("Informe o segundo valor: ");
        b= input.nextFloat();

        System.out.println("Informe o terceiro valor: ");
        c = input.nextFloat();

        System.out.println("Informe o quarto valor: ");
        d = input.nextFloat();

        resultado = (a*b)-(c*d);


        System.out.println("Diferença: "+resultado);









    }
}
