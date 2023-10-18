package pacote.java.poo.sobrecarga;

//Sobrecarga é ter varios metodos utlizando o mesmo nome,Porem A lista de parametros pode ser diferente.



public class Pessoa {

    private String nome;
    private int idade;

    //constructor

    public Pessoa(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }




}
