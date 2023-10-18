package pacote.java.datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.DateFormat;

public class TesteCalendario {

    public static void main(String[] args) {


        //Temos aki outra forma de definirmos a data e o horario atravês do objeto calendar porem e necessario denirmos também hora.
        Calendar c = new GregorianCalendar();//Calendar e uma classe do tipo abstrata com a implementação na classe grforianCalendar().

        c.set(Calendar.DAY_OF_MONTH,20);
        c.set(Calendar.MONTH,5);
        c.set(Calendar.YEAR,2010);
        c.set(Calendar.HOUR_OF_DAY,9);
        c.set(Calendar.MINUTE,30);
        c.set(Calendar.SECOND,0);

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatador.format(c.getTime()));//Aki imprime na tela a data que é c e a hora que é getTime ja com o format.

        //ADD
        //Além disso podemos fazer soma dos meses

        c.add(Calendar.MONTH,2);//O método adicionar serve para acrescentar meses anos e horas
        System.out.println("Somando "+formatador.format(c.getTime()));

        c.add(Calendar.YEAR,5);//Além de adicionar esse método também pode subtrair.
        System.out.println("Acrescentado anos: "+formatador.format(c.getTime()));

        //Roll
        //O roll so meche numa parte da data.
        c.roll(Calendar.DAY_OF_MONTH,25);
        System.out.println(formatador.format(c.getTime()));//apesar de termos coloca acresentado 25 dias a mais ele não alterou o mês esse método e o roll.






    }
}
