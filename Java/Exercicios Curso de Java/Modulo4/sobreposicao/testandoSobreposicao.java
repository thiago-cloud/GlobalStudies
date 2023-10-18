package sobreposicao;

import java.util.Date;

public class testandoSobreposicao {

    public static void main(String[] args) {
        produtoPerecivel p1 = new produtoPerecivel();

        p1.descricao = "carne bovina";
        p1.dataDeValidade = new Date();
        p1.indentificar();

    }
}
