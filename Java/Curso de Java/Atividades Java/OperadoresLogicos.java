
import java.util.Scanner;


public class OperadoresLogicos{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculo de IMC");
        System.out.println("Informe o seu nome: ");
            String nome = entrada.nextLine();
        System.out.println("Informe sua idade: ");
            int idade = entrada.nextInt();
       System.out.println("Informe o seu peso: ");
            double peso = entrada.nextDouble();
       System.out.println("Informe a sua altura: ");
            double altura = entrada.nextDouble();
       System.out.println("Informe seu sexo Digite 1 para \"M\" é qualquer tecla para \"F\": ");
            char sexo = entrada.nextShort() == 1? 'M' : 'F';

       double imc = peso /(altura * altura);
               if(imc< 18.5){
                   System.out.println(nome+" do sexo "+sexo+" de "+idade+" anos de idade, estar como o IMC de "+imc+" é por isso estar abaixo do peso");
               }else if(imc>18.6 && imc<=24.9){
                   System.out.println(nome+" do sexo "+sexo+" de "+idade+" anos de idade, estar como o IMC de "+imc+" Devido a isso seu imc estar ideal (Parabèns!)");
               }else if(imc>=25 && imc<=29.9){
                   System.out.println(nome+" do sexo "+sexo+" de "+idade+" anos de idade, estar como o IMC de "+imc+" Levemente acima do peso");
               }else if(imc>=30 && imc<=34.9){
                   System.out.println(nome+" do sexo "+sexo+" de "+idade+" anos de idade, estar como o IMC de "+imc+" Obesidade grau I");
               }else if(imc>=35 && imc<=39.9){
                   System.out.println(nome + " do sexo " + sexo + " de " + idade + " anos de idade, estar como o IMC de " + imc + " Obesidade grau II");
               }else if(imc>=40){
                   System.out.println(nome + " do sexo " + sexo + " de " + idade + " anos de idade, estar como o IMC de " + imc + " Obesidade grau III");
        }

    }
}