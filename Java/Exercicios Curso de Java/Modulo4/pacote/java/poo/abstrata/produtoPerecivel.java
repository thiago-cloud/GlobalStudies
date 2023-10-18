package pacote.java.poo.abstrata;

public class produtoPerecivel extends Produto {
    //No caso como a classe pai produto e abstrata as implementações dos metodos da classe pai produto fica a cargo da classe filha produtoPerecivel
        String descricao;
        String dataValidade;
    public void imprimirDescricao() {
        System.out.println("Descrição do produto: "+super.getDescricao()+"Data de Validade: "+dataValidade);
    }
}
