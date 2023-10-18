

import java.util.Scanner;

public class URI1006 {
    public static void main(String args[]){
        float a,b,c,media;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a sua primeira nota: ");
        a = input.nextFloat();

        System.out.println("Informe a sua segunda nota: ");
        b = input.nextFloat();

        System.out.println("Informe a sua terceira nota: ");
        c = input.nextFloat();

        media = (a+b+c)/3;

        System.out.println("O resultado da media do aluno é: "+media);

    }
}
