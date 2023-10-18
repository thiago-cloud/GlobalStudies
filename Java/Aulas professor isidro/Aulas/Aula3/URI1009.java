

import java.util.Scanner;
public class URI1009 {
    //Leia nome do vendedor
    //O salario fixo
    //total de vendas em um mes
    //recebe 15% sobre tudo que vende

    public static void main(String args[]){
        int totalDeVendas,qtd;
        String nome;
        float salarioFixo;
        float Total;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        nome = input.nextLine();
        
        System.out.println("Informe seu salario fixo: ");
        salarioFixo = input.nextFloat();
        
        System.out.println("Informe o quantos produtos voce vendeu: ");
        qtd = input.nextInt();

        totalDeVendas = qtd * 15/100;
        Total = totalDeVendas + salarioFixo;

        System.out.println("Total = R$ "+Total);




    }
}
