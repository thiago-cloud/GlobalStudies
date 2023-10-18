

import java.util.Scanner;

public class Aula17_escopo {
    public static void main(String args[]){
        int idade = 0;
        String responsavel = "";
        Scanner entrada = new Scanner(System.in);



        System.out.println("Informe sua idade: ");
        idade = entrada.nextInt();

        boolean podeDirigir = idade>= 18 ;

        if(!podeDirigir){
            System.out.println("Voce não pode dirigir informe o nome de um responsavel: ");
            responsavel = entrada.nextLine();
        }else if(podeDirigir){
            System.out.println("Parabéns já é de maior pode dirigir!");
        }else{
            System.out.println("Valor");
        }

    }//Tudo que há dentro das chaves e escopo
}
//Ao declarar uma variavel dentro de um escopo ela so existira dentro de um escopo
