package CollectionFramework;
import java.util.Map;
import java.util.HashMap;




public class MapHashMape {
    public static void main(String[] args) {
        //No array MapHashMap dentro do array cada indice e composto por chaves e essas chave apontam para um determinado objeto de uma lista
        Aluno a11 = new Aluno("Leonidas");
        Aluno a12 = new Aluno("Cipriano");
        Aluno a13 = new Aluno("Inacio");
        Aluno a14 = new Aluno("Zasp");
        Aluno a15 = new Aluno("Fernando");

        Map<String, Aluno> alunos = new HashMap<String, Aluno>();

        alunos.put("1",a11);// Colocamos aki o key é o objeto dentro do indice da array, no caso o indice contém o key que aponta para o objeto definido.
        alunos.put("2",a12);
        alunos.put("3",a13);
        alunos.put("4",a14);
        alunos.put("5",a15);




        imprimir(alunos);//Invocando o método imprimir que contém o for


    }
        public static void imprimir(Map<String, Aluno> alunos){
            for(Aluno a : alunos.values()){
                System.out.println("imprimindo atravês do map: "+a.getNome());
            }
        }





}
