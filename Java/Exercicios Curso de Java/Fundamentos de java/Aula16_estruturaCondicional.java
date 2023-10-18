
import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class Aula16_estruturaCondicional {
    public static void main(String args[]){
        //imc
        /*
         * Menor do que 18.5 Abaixo do peso
         * 18,5 - 24,9 Peso Normal;
         * 25,0 -29,9 Excesso de peso;
         * 30,0 34,9 Obesidade classe I;
         * 35,0 - 39,9 Obesidade Classe II;
         * Maior ou igual a 40,0 Obesidade classe III;
         *
         */
     Scanner entrada = new Scanner(System.in);
     String nome;
     float altura,peso,imc;
     peso = 0f;
     altura = 0f;

     System.out.println("Informe o seu nome: ");
     nome = entrada.nextLine();
     System.out.println("Informe seu peso: ");
     peso = entrada.nextFloat();
     System.out.println("Informe sua altura: ");
     altura = entrada.nextFloat();

     imc = peso / (altura*altura);
         
    System.out.println("O seu imc é igual: "+imc);

    if(imc < 18.5 && imc > 0){
        System.out.println("Abaixo do peso");
    }else if(imc>= 18.5 && imc <= 24.9){
        System.out.println("Peso Normal");
    }else if(imc>=25 && imc<=29.9){
        System.out.println("Excesso de peso");
    }else if(imc>= 30 && imc <34.9){
        System.out.println("Obesidade classe I");
    }else if(imc>= 35 && imc<=39.9){
        System.out.println("Obesidade Classe II");
    }else if(imc >= 40 ){
        System.out.println("Obesidade classe III");
    }else{
        System.out.println("Valor desconhecido!");
    }


    }
}
