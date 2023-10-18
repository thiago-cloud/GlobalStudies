import java.util.Scanner;


public class OperadorTernario{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Você é adulto, adolecente ou criânça? ");
        System.out.println("Informe o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Informe a sua idade: ");
        int idade = entrada.nextInt();

        String informar = (idade>=18) ? "Adulto" : (idade<=12 ? "Criança" : "Adolecente");
        /*
                if(idade<10){
                    informar = "Você é uma criança!";
                }else if(idade>=10){
                    informar = "Você é um adolecente!";
                }else if (idade>=18){
                    informar = "Você é um adulto!";
                }*/
        System.out.println("resultado: "+informar);



    }
}