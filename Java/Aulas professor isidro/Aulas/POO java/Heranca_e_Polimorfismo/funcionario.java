package Heranca_e_Polimorfismo;

public class funcionario extends pessoa {
    private float salario;

    
    //construtor
    public funcionario(String nome, String email, float salario){
        super(nome,email);//Referese ao contrutor da superclasse pessoa
        this.salario = salario;
    }

    

    //getters e setters
    public void setSalario(float salario){
        this.salario = salario;
    }

    public float getSalario(){
        return this.salario;
    
}


    
    
    
 
}