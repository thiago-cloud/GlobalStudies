package pacote.java.datas;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestandoDatas {
    public static void main(String[] args) throws ParseException {
        Date hoje = new Date();//A classe date permite nos dar a data e horario exato do momento assim que é acessada.
        System.out.println(hoje);


        //Além disso podemos fazer o formato da data

        DateFormat Formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//Aki criamos um objeto para fazer o formato da data importando assim também duas bibliotecas.
        System.out.println(Formatador.format(hoje));




      //Agora digamos que um determinado usuario digitou sua data de nascimento nesse determinado formato dd/MM/yyyy.

        String dataDeAniversario = "16/02/1997";
        DateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:yyyy");//Definimos esse tipo de formato
       //o parse automaticamente solicita uma exceção porque se o usuario digitar alguma coisa errada ja exibira uma mensagem a ele.

        try{
            Date resultado = data.parse(dataDeAniversario);//o parser analisa o valor que o usuario atribuiu a variavel
            System.out.println(data.format(resultado));
        }catch(ParseException e){
            System.out.println("Formato de data inválido"+e.getMessage());
        }



    }



}

