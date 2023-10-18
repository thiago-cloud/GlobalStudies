import java.util.Scanner;

public class Aula24_breakContinue{
    public static void main(String args[]){

        //O continue é o break serve para sair do laço de repetição porem os dois tem algumas diferenças
        //break: ele para o laço de repetição quando acionado
        //Continue: Ele ignora um determinado valor quando acionado ja no while o continue ignora todos os blocos abaixo quando acionado.

        Scanner entrada = new Scanner(System.in);
        int valor;
        int valor2;

            System.out.println("Informe um valor: ");
            valor = entrada.nextInt();

            for(int i = 0; i<= 1000 ; i++){
                if(i == valor){
                    break;
                }
                System.out.println(i);
            }
            System.out.println("Fim do programa");
           
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");

            System.out.println("Informe o Valor 2: ");
            valor2 = entrada.nextInt();

            for(int a = 0; a <= 100 ; a++){
                if(a == valor2){
                    continue; //Imprimira tudo porem quando chegar no valor sera ignorado
                }
                System.out.println(a);
            }
            System.out.println("Fim do programa 2");



    }
}