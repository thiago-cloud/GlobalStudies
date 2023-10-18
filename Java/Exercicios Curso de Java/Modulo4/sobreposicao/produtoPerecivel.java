package sobreposicao;

import java.util.Date;

public class produtoPerecivel extends Produto {

    protected Date dataDeValidade;
    public void indentificar(){
        super.indentificar();
        System.out.println("A data de validade é: "+dataDeValidade);
    }
}
