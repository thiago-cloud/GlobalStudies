package pacote.java.poo.animal;

public class Cachorro {

    private String nome;


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }


    //Se no lugar de public colocassemos default não poderiamos chamar esse metodo.
    public void sentar(){

        System.out.println("Eu "+nome+" vou sentar!");
    }

}
