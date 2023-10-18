public class Boxing {
    public static void main(String[] args) {
        //O boxing e uma conversão automatica que o java faz para que não precisemos estar digitando o método, ele dimnui o código porem como o java
        //tem que estar convertendo a variavel de forma automática direto para o wrapper, Isso pode interferir no desempenho da aplicação.

        //Envelopando o x em integer sem o boxing do java
        Integer x = new Integer(10);

        //Envelopando o i em integer com o boxing do java
        Integer i = 70;

        //Obs: Não são todos os wrapper que o java faz o boxing

        //Long L = 20;// aki percebemos um erro pois o wrapper Long não possui o boxing

        Long LL = new Long(60);//Ele so funciona sem boxing

        //Uma coisa bizarra a se perceber é que os valores 127 para baixo em integer são armzenados em objetos iguais, ja os numeros 128 para cima em integer
        //São armazenados em objetos diferentes
        //ex:

        Integer i1 = 127;
        Integer i2 = 127;

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println(i1 == i2);//True
        System.out.println(i3 == i4);//False por estar armazendos em objetos diferentes.

        //Por conta dessa bizarrice toda existe um método esecifico para fazer comparações o método é o equals()
        //ex:


        System.out.println(i3.equals(i4));// i3 é igual a i4? 'True'.


    }





}
