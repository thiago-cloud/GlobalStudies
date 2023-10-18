
import java.util.Scanner;

public class URI1038 {
    public static void main(String args[]){
        int code,qtd;
        float total;

        Scanner input = new Scanner(System.in);

        System.out.println("----------------Cardapio----------------");
        System.out.println("CODE        SPECIFICATION            PRICE");
        System.out.println("1           Cachorro Quente         R$ 4,00");
        System.out.println("2           X-Salada                R$ 4,50");
        System.out.println("3           X-Bacon                 R$ 5,00");
        System.out.println("4           Torrada simples         R$ 2,00");
        System.out.println("5           Refrigerante            R$ 1,50");

    System.out.println("Informe o codigo do seu pedido: ");
    code = input.nextInt();
    
    System.out.println("Informe a quantodade: ");
    qtd = input.nextInt();


    if(code == 1){
        total = 4 * qtd;
        System.out.println("Total: R$ "+total );
    }else if(code == 2){
        total = (float) (4.5 * qtd);
        System.out.println("Total: R$: "+total);
    }else if(code == 3){
        total = (float)(5 * qtd);
        System.out.println("Total: R$ "+total);
    }else if(code == 4){
        total = (float)(2*qtd);
        System.out.println("Total R$ "+total);
    }else if(code == 5 ){
        total = (float)(1.5 *qtd);
        System.out.println("Total: R$ "+total);
    }else{
        System.out.println("Código não encontrado");
    }
    
    }
}
