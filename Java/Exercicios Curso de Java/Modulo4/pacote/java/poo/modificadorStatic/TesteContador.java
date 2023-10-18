package pacote.java.poo.modificadorStatic;

public class TesteContador {
    public static void main(String[] args) {
        Contador.count++;//Observe que por conta do static não precisarmos  intanciar um objeto
        Contador.count++;

        System.out.println(Contador.count);

        //------------------------
        Contador contar = new Contador();//Intanciando um objeto ou seja criando um objeto para acessar a variavel contador

        contar.contador++;//acessando a variavel contador.

        //------------------------

        Contador c = new Contador();

        c.incrementar();

        System.out.println("Acessando apartir do objeto c: "+c.count);


        Contador.count++;
        System.out.println("Acessando apartir da classe Contador: "+Contador.count);

        //Chamando metodo

        Contador.COUNT++;
       Contador.imprimirContador();





    }

}
