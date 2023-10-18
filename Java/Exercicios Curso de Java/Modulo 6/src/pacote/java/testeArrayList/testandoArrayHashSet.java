package pacote.java.testeArrayList;

import java.util.HashSet;
import java.util.Set;

public class testandoArrayHashSet {

    public static void main(String[] args) {
        Alunos a1 = new Alunos("Figueredo",35,"Go");
        Alunos a2 = new Alunos("João",30,"CSS");
        Alunos a3 = new Alunos("Pedro",26,"HTML");
        Alunos a4 = new Alunos("Fernando",20,"js");
        Alunos a5 = new Alunos("Maria",40,"Ruby");

        //Adicionando no arrayHashSet

        Set<Alunos> alunos = new  HashSet<Alunos>();

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);

        imprimir2(alunos);

    }


    public static void imprimir2(Set<Alunos> alunos){
        for(Alunos a : alunos ){
            System.out.println("\n\nNome: "+a.getNome()+"\n Idade: "+a.getidade()+"\n Curso: "+a.getCurso());
        }
    }






}
