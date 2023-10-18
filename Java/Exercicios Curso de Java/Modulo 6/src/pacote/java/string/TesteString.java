package pacote.java.string;

public class TesteString {
    public static void main(String[] args) {

        //Maneira comum porem inadequada
        //Fazer uma modificação ou um incremento de uma string dessa forma não uma forma correta de se fazer apesar de funciona pois pode interferir no desempenho da
        //aplicação futuramente.
        String a = "Olá";
        a = a+" mundo";
        System.out.println(a);

        //StringBuilder
        //A maneira correta de adicionar uma string e criando um objeto com o string builder.
        //Uma desvantagem da string builder e que ela não é  protegida a threads.
        StringBuilder sb = new StringBuilder("Hello ");

        sb.append("World");//Adicionamos o world com o append

        String resultado = sb.toString();
        System.out.println("Utilizando o stringBuider "+resultado);



        //StringBuffer
        //A vantagem do stringBuffer em relação ao StringBuilder e que ele e mais protegido de threads porém ele e menos performatico ou seja o desepenho e menor.

        StringBuffer sb1 = new StringBuffer("Hellow ");
        sb1.append("world outra vêz");

        String resultado1 = sb1.toString();
        System.out.println("Utilizando StringBuffer: "+sb1);




    }
}
