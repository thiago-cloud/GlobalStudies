

import java.util.Scanner;

public class testeDoSwitch {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int code,quantidade;
        float total;


        System.out.println("-----------------Cardapio---------------");
        System.out.println("Code          Specification        Price");
        System.out.println("1              x-burguer         R$ 5,00");
        System.out.println("2              x-salada          R$ 7,00");
        System.out.println("3              batata-frita      R$ 3,00");
        System.out.println("4              x-tudo            R$ 10,00");
        System.out.println("5              Suco              R$ 2,00");
        System.out.println("6              Refrigerante      R$ 2,50");

        System.out.println("Informe o numero do pedido que deseja: ");
        code = input.nextInt();

        System.out.println("Informe a qunatidade do pedido: ");
        quantidade = input.nextInt();


        switch(code){
            case 1:
            total = 5 * quantidade;
            System.out.println("Total: R$ "+total);
            break;

            case 2:
            total = 7 * quantidade;
            System.out.println("Total: R$ "+total);
            break;

            case 3:
            total = 3 * quantidade;
            System.out.println("Total: R$ "+total);
            break;

            case 4:
            total = 10 * quantidade;
            System.out.println("Total: R$ "+total);
            break;

            case 5:
            total = 2 * quantidade;
            System.out.println("Total: R$ "+total);
            break;

            case 6:
            total = (float)2.5 * quantidade;
            System.out.println("Total: R$ "+total);
            break;
            
            default:
            System.out.println("Valor não encontrado");
        }
        







    }

    
}
