import java.util.Scanner;


public class EscopoDeVariavel{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        if (idade < 18) {
            System.out.println(nome + " você e de menor não pode dirigir");
        }
        else if(idade >= 18) {
            System.out.println("Você pode dirigir ja é de maior");
        }
    }
}