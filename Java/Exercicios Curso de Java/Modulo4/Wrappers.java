public class Wrappers {
    //O wrapper siginifica envelopar
    //Os wrapper vem de uma classe de envelopamento no java.

    public static void main(String[] args) {
        //Exemplo envelopar variaveis do tipo int

        Integer i = 20; //aki estamos declarando uma variavel do tipo int envelopada.

        System.out.println("variavel integer "+i);
        //Além disso podemos instanciar um objeto ao integer e atribuir um valor

        Integer x = new Integer(50); //A variavel x aponta para o objeto integer e recebe um valor 50.

        System.out.println("O valor da variavel integer é: "+x);

        //Wrapper: Byte,Short,Integer,Long,Float,Double,Character
        //Tipos Primitivos:byte,short,int,long,float,double,char

        //Convertendo wrappers em um tipo primitivo

        Integer q = Integer.valueOf(60);

        int c = q.intValue();///pegamos a variavel Integer wrapper q e convertemos para a variavel c do tipo primitivo int

        //ex:

        Byte B = 10;

        byte b = B.byteValue();//Tipo primitivo

        Double D = Double.valueOf(100000);

        double d = D.doubleValue();//Tipo primitivo

        Long L = Long.valueOf(500);

        long l = L.longValue();//Tipo primitivo

        System.out.println("O valor do byte é igual: "+b);












    }

}
