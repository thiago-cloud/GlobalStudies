
import java.util.Scanner;


public class Aula18_estruturaDeControle {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int finalPlaca;

        System.out.println("Informe o final da placa: ");
        finalPlaca = entrada.nextInt();

        switch (finalPlaca){
            case 1:
                System.out.println("Vencimento no dia 11 de janeiro: ");
            break;
            case 2:
                System.out.println("Vencimento no dia 12 de janeiro ");
            break;
            case 3:
                System.out.println("Vencimento no dia 13 de janeiro ");
            break;
            case 4:
                System.out.println("Vencimento no dia 14 de janeiro ");
            break;
            case 5:
                System.out.println("Vencimento no dia 15 de janeiro ");
            break;
            default:
                System.out.println("Desculpe não temos data disponivel para esse numero!");
        }

    }    
}
