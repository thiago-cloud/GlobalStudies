import java.util.Scanner;



public class doWhile{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        int valor = 0;

        do{
            System.out.println("Digite 0 pra sair e qualquer numero para somar: ");
            valor = entrada.nextInt();
            soma+= valor;
            System.out.println("Somar: "+soma);
        }while(valor!=0);
    }

}