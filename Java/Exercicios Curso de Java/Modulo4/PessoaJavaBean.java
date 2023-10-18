
//O java beans e um tipo de formato de classe que serve para para deixar o código mais reutilizavel e simples, ele e costituido de constructor é metodos como get e setter
//O metodo getter serve para ler o valor do atributo e em seguida mostrar na tela
//O método setter serve para alterar o  valor do atributo;


public class PessoaJavaBean {

    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;
    private String cidade;
    private String estado;

    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }
    public String getcpf(){
        return cpf;
    }

    public String getCidade(){
        return cidade;
    }

    public String getEstado(){
        return estado;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;

    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;

    }
    public void setEstado(String estado){
        this.estado = estado;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }



}


