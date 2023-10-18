

import java.util.Scanner;
public class   EstruturaDeDecisao{
   public static void main(String args[]){

    float a,b,c,d,media;


    Scanner input = new Scanner(System.in);


    System.out.println("------------------Media das Notas --------------");
    System.out.println("Informe a primeira nota: ");
    a = input.nextFloat();

    System.out.println("Informe a segunda nota: ");
    b = input.nextFloat();

    System.out.println("Informe a terceira nota: ");
    c = input.nextFloat();

    System.out.println("Informe a quarta nota: ");
    d = input.nextFloat();

    media = (a+b+c+d)/4;

    System.out.println("A sua media é: "+media);
    System.out.println(" ");
    if(media == 10 && media >=9){
        System.out.println("Execelente aluno aprovado");
    }else if(media<=8 && media >= 7 ){
        System.out.println("Aluno aprovado");
    }else if(media<7 && media >=5){
        System.out.println("Aluno em recuperação");
    }else if(media<5 && media >=0 ){
        System.out.println("Aluno reprovado!");
    }
    
   } 
}