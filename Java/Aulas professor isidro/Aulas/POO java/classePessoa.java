

public class classePessoa{
    
    //Emcapsulamento
    private int idade; 
    private String nome;
    private String sobrenome;
    private String email;
    private double altura;
    private float peso;
    //O private garante o encapsulamento das varaiveis

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public String getEmail(){
        return this.email;
    }

    public int getIdade(){
        return this.idade;
    }

    public float getPeso(){
        return this.peso;
    }

    public double getAltura(){
        return this.altura;
    }





}