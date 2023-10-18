
import java.util.Scanner;


public class exemploBreak{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int divisor = entrada.nextInt();


        for(int i = 0; i<=200 ; i++){
            if(i % divisor == 0){
                break;//Ou poderiamos colocar aki continue para continuar a execução do código.
            }
            System.out.println(i);
        }
        System.out.println("Fim!");
    }
}