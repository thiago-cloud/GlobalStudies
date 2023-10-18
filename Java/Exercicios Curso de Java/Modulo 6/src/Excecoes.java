public class Excecoes {

    public static void main(String[] args) {

        System.out.println("Antes");
        /*int numero = 5/0;//Aki aconteceu uma exceção ou seja dividir qualquer numero por zero não pode por conta disso é uma exceção a se tratar
        System.out.println(numero);*/

        System.out.println("depois");
        String a = "Recebendo string";
        a= null;//Variavel passa a apontar para null

        String maiuscula = a.toUpperCase();//Como a variavel a estar apontando para null agora ela não pode ter letra maiusculas porque e nula então isso gera uma exceção
        //que pode ser tratada.




    }
}
