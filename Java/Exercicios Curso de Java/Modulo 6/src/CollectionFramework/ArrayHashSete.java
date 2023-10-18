package CollectionFramework;
import java.util.HashSet;

import java.util.Set;

public class ArrayHashSete {
    //Ja no array hashSet ele não permite que repitimos o objeto mais de uma vez
    //Outra coisa que se deve levar em consideração referente ao hashSet é que ele não imprimi na ordem ja o array liste imprimi na ordem a medida que adicionamos os objetos.


    public static void main(String[] args) {
        Aluno a6 = new Aluno("Irneu");
        Aluno a7 = new Aluno("Juvenal");
        Aluno a8 = new Aluno("rodrigo");
        Aluno a9 = new Aluno("Romario");
        Aluno a10 = new Aluno("Ronaldo");

        Set<Aluno> alunos = new HashSet<Aluno>();

        alunos.add(a6);
        alunos.add(a7);
        alunos.add(a8);
        alunos.add(a8);//Observe que aki ele não repete o mesomo objeto mais de uma vez.
        alunos.add(a10);

        imprimirHash(alunos);


    }

        public static void imprimirHash(Set<Aluno> alunos){
            for(Aluno a : alunos){
                System.out.println("imprimindo: "+ a.getNome());
            }
        }



}
