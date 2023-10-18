package Heranca_e_Polimorfismo.Polimorfismo;

public class cliente {
    String nome;
    String email;
    float credito;

    public cliente(String nome, String email, float credito){
        this.nome = nome;
        this.email = email;
        this.credito = credito;

    }

    public void setCredito(float credito){
        this.credito = credito;
    }

    public float getCredito(){
        return this.credito;
    }

    public String toString(){
        return "Cliente: "+nome+"Email: "+email+"Credito R$: "+credito;
    }
    
    public String getNome(){
        return nome;
    }


    
}
