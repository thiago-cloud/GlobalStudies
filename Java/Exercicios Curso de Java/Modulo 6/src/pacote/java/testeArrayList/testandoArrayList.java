package pacote.java.testeArrayList;
import java.util.ArrayList;
import java.util.List;

public class testandoArrayList {

    public static void main(String[] args) {

        Alunos a1 = new Alunos("Thiago",25,"Java");
        Alunos a2 = new Alunos("Irineu",50,"Delphi");
        Alunos a3 = new Alunos("Jose",30,"Cobol");
        Alunos a4 = new Alunos("Antonio",15,"JS");
        Alunos a5 = new Alunos("Felipe",41,"PHP");


        List<Alunos> alunos = new ArrayList<Alunos>();


        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);



        imprimir(alunos);



    }
        public static void imprimir(List<Alunos> alunos){
            for(Alunos a : alunos){
                System.out.println("aluno: "+a.getNome()+" idade: "+a.getidade()+" curso: "+a.getCurso());
            }
        }



}
