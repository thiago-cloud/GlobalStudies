package pacote.java.poo.abstrata;

public class TestandoClasseAbstrata {

    public static void main(String[] args) {
        Produto p1 = new produtoPerecivel();
        p1.descricao = "Chocolate";

        produtoPerecivel p2 = (produtoPerecivel) p1;//pegamos a variavel p1 e igualamos a p2
        p2.dataValidade = "10/02/2025";


        //Aki tanto faz colocarmos p1 como p2;
        p1.imprimirDescricao();


    }



}
