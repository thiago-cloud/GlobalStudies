
import java.util.Scanner;

public class EstruturaDeControleSwitch{
    public static void main(String[] args){
        System.out.println("Pagamento de Ipva");
        System.out.println("Informe o final da placa do seu veiculo: ");
        Scanner entrada = new Scanner(System.in);
        int finalPlaca = entrada.nextInt();

        switch(finalPlaca){
            case 1:
                System.out.println("O vencimento do seu ipva e na data 11 de janeiro");
                break;
            case 2:
                System.out.println("O vencimento de seu ipva e na data 12 de janeiro");
                break;
            default:
                System.out.println("Desculpe essa numeração e desconhecida");
        }

    }
}

