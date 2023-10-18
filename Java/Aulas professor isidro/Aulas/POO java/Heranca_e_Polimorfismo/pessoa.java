package Heranca_e_Polimorfismo;

public class pessoa {
    private String nome;
    private String email;

    //Método do construtor
    public pessoa(String nome,String email){
        this.nome = nome;
        this.email = email;

    }

    //Método getters e setters

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }
    
}
