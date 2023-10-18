package CollectionFramework;
import java.util.List;
import java.util.ArrayList;

public class ArrayListe {
    public static void main(String[] args) {
        //ArrayList


        /*No array list a medida não definimos o tamanho como no array comum ou seja a médida em que precisamos colocar mais indices podemos adicionar.*/

        Aluno a1 = new Aluno("Jurubeba");
        Aluno a2 = new Aluno("Junior");
        Aluno a3 = new Aluno("Fernando");
        Aluno a4 = new Aluno("Felipe");
        Aluno a5 = new Aluno("Antonio");


        List<Aluno> alunos = new ArrayList<Aluno>();//Intanciamos classe ArrayList, List é classe de interface é ArrayList é classe de implementação.

        //O aluno permite referenciar a classe Aluno porque sem o aluno poderiamos colocar qualquer coisa uma string diferente um inteiro e por ai vai.


        alunos.add(a1);//Adicionamos o objeto a1 no array list é assim sucessivamente
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);
        imprimirAlunos(alunos);



    }

    public static void imprimirAlunos(List<Aluno> alunos){
        for(Aluno a : alunos){
            System.out.println("Nome: "+a.getNome());//Aki ele vai pegar cada objeto da lista e jogar na variavel a, me seguida e so mostrar na tela.
        }
    }






    }






