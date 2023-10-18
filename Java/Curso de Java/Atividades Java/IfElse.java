
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Média de Notas!");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite sua primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media < 7) {
            System.out.println("Reprovado");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Valor invalido");
        }
    }
}