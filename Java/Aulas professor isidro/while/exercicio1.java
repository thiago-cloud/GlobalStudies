import java.util.Scanner;


public class exercicio1{
    public static void main(String args[]){

        int valor;
        int contador;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = entrada.nextInt();
        System.out.println(" O valor digitado foi: "+valor);
        System.out.println(" ");

        contador= 1;
        while(contador<=valor){
            System.out.println(contador);
            contador ++;//Se Nã colocar o contador++ ele contara infinitas vezes
        }
    }
}