import java.util.Scanner;

public class estruturaFor{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numFinal = entrada.nextInt();

        for(int i = 1; i<=numFinal; i++){
            System.out.println(i);
        }
    }
}