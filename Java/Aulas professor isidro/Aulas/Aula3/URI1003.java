
import java.util.Scanner;
public class URI1003{
    public static void main(String args[]){
        int a;
        int b;
        int soma;
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("Digite o primeiro valor: ");
        a = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = entrada.nextInt();
        soma = a+b;
        System.out.println(" A soma de a e b e igual a: "+soma);
    }
}