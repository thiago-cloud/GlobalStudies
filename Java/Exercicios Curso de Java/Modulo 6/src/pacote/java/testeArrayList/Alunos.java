package pacote.java.testeArrayList;

public class Alunos {
    String nome;
    int idade;
    String Sobrenome;
    String cpf;
    String estado;
    String cidade;
    String bairro;
    String curso;

    //construtor
    public Alunos(String nome,int idade, String curso){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;

    }

    public String getNome(){
        return nome;
    }

    public int getidade(){
        return idade;
    }

    public String getCurso(){
        return curso;
    }




}
