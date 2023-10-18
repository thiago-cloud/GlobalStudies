package pacote.java.poo.modificadorStatic;



//O modificador statico serve para acessarmos um objeto sem precisarmos de instancialo.
//A as Coisas staticas ficam sempre na classe principal

public class Contador {
    //Nessa variavel que criamos do tipo inteiro para podermos acessarmos ela apartir de outra classe seria necessario instaciarmos um novo objeto
    public int contador = 0;

    //Ja se colocarmos o static na variavel não precisaremos de intanciarmos um objeto em outra classe para acessarmos
    public static int count = 0;

    public void incrementar() {
        count++;
    }
    //Criando variavel constante
    //ex1:
    public static final int NUMBER = 1;//Sempre quando declararmos uma variavel constante temos como boa prática colocar o nome totalmente maiusculo.
        /*public void incrementando(){
            NUMBER++;//Obeserve que como se trata de uma constante o eclipse não considera o incremento porque contantes tem valor inalteravel.
        }*/

    //ex2:

    public static final double PI = 3.14;

       /* public void alterar(){
            PI++;
        }*/

    //O modificador statico alem de poder ser utilizados para atributo tambem pode ser usado para metodos.


    //Variavel
    public static int COUNT = 0;
    //Metodo

    public static void imprimirContador(){
        System.out.println("O valor do contador é: "+Contador.COUNT);
    }



}
