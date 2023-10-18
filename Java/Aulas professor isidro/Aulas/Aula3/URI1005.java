
import java.util.Scanner;
public class URI1005 {
    public static void main(String args[]){
        float a,b, media;
        float c,d,media2;

        Scanner input = new Scanner(System.in);

        System.out.println("----------------Primeiro Aluno-------------------");
        System.out.println("Informe a primeiro nota do primeiro aluno: ");
        a = input.nextFloat();
        System.out.println("Informe a segunda nota do primeiro aluno: ");
        b = input.nextFloat();
        media = (a+b)/2;
        System.out.println("-----------------Segundo Aluno-------------------");
        System.out.println("Informe a primeira nota do segundo aluno: ");
        c = input.nextFloat();
        System.out.println("Informe a segunda nota do segundo aluno: ");
        d = input.nextFloat();
        media2 = (c+d)/2;

        System.out.println("A media do primeiro aluno: "+media);
        System.out.println("A media do segundo aluno "+media2);



        
    }
}
