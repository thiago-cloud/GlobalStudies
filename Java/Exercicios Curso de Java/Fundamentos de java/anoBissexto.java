import java.util.Scanner;


public class anoBissexto {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int ano;
        ano = 0;

        System.out.println("Informe o ano: ");
        ano = entrada.nextInt();

        if(ano % 400 == 0){
            System.out.println("O ano "+ano+" é um ano bissexto!");
        }else if(ano % 4 == 0 && ano % 100 != 0){
            System.out.println("O ano "+ano+" é um ano bissexto");
        }else{
            System.out.println("O ano "+ano+" não é um ano bissexto");
        }


    }
}
