public class Animal {
    String especie;
    String nome;
    int idade;
    String cor;
    String tipo;

    Animal(String tipo){
        this.tipo = tipo;
    }
    //Constructor
    Animal(String nome,String especie,String cor,int idade,String tipo){
        this(tipo);//Ele ta chamando o atributo tipo do contrutor de cima.
        this.nome = nome;
        this.especie = especie;
        this.cor = cor;
        this.idade = idade;


    }//Atrevés do constructor podemos instanciar o nome é a especie.

}
