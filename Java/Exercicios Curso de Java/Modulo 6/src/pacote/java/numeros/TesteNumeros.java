package pacote.java.numeros;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.math.BigDecimal;

public class TesteNumeros {

    public static void main(String[] args) {
        //Testando a classe DecimalFormat

        DecimalFormat formatando = new DecimalFormat("R$: #,##0.00");//Essa classe permite formatar o numero decimal para virgula e para quantidade casa definida

        double valorProduto = 12.05;

        System.out.println(formatando.format(valorProduto));


        //Transformando um valor do tipo string em um double
        DecimalFormat formatando1 = new DecimalFormat();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digete um numero decimal: ");
        String valor  = entrada.nextLine();

        try{
            double numero = formatando1.parse(valor).doubleValue();//Transformando em um double
            System.out.println("Numero: "+numero);//Imprimindo na tela
        }catch(ParseException e){
            System.out.println("Valor inválido!");
        }

        //A classe BigDecimal permite fazermos algumas operações com os numeros.

        BigDecimal bg = new BigDecimal(56465222d);
        bg.divide(BigDecimal.TEN);

        System.out.println("Dividindo o numero por 10 "+bg);



    }
}
