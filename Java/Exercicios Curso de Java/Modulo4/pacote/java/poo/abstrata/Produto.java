package pacote.java.poo.abstrata;

//Quando colocamos a classe para ser abstrata não conseguimos criar mais objetos apartir dela;


public abstract class Produto {
    String descricao;

    //Método abstrato
    public abstract void imprimirDescricao();//Por ser uma classe abstrata precisamos configurar o método na classe filha. isso siginifica que toda extenção da classe
    //produto precisa implementar os métodos da classe produto.


    //Método com incrementação normal
    public String getDescricao(){
        return descricao;
    }

}
