import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LendoArquivoItensPedido {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("itens_pedido.txt")))){
            scanner.useDelimiter(";");//O delimitador server para substituir o ponto e virgula por espaço
            String t = scanner.next();//Vai me devolver um token

            Locale localeBrasil = new Locale("pt","BR");//A classe locale serve para dizer qual a região deve ser o formato  aki no caso é brasil
            scanner.useLocale(localeBrasil);//pedimos para o scanner usar o objeto localBrasil da classe locale
            NumberFormat formatador = NumberFormat.getCurrencyInstance(localeBrasil);//Formatando os numeros de acordo com o objeto localeBrasil

            while(scanner.hasNext()){
                String produto = scanner.next();//Leia o primeiro token como um produto do tipo string
                int quantidade = scanner.nextInt();//Leia o segundo token como uma quantidade do tipo int
                double valor = scanner.nextDouble();//Leia o terceiro token como um valor do tipo double
                scanner.nextLine();

                System.out.printf("Produto: %s. Quantidade: %s. Valor: %s.\n",produto,quantidade,formatador.format(valor));
            }//O scanner.hasNext significa equanto tiver alguma coisa para ler execute o looping

        }catch(IOException e){
            System.err.println("Erro abrindo arquivo "+e.getMessage());

        }

    }
}
