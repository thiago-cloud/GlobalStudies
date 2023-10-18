package pacote.java.poo.heranca;


//Herança

//Private significa que o acesso e dado a propriedade so dentro da classe por conta disso instanciamos metodos para acessar em outras classes como os metodos getter e setter.

//O protected siginifica que oa propriedades so estarão disponivel para as classes que herdam a classe pessoa e para as classes de mesmo pacote

//public todos as classes tem acesso ao objeto.

public class Pessoa {
   protected String nome;
   protected String sobrenome;
   protected int idade;
   protected String cpf;
   protected String cidade;
   protected String estado;
   protected String bairro;

   //método
   protected void seApresentar(){
      System.out.println("Olá meu nome é "+nome+" tenho "+idade+" anos");
   }

}
