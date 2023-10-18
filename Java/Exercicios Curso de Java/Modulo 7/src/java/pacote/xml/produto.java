package java.pacote.xml;

import java.math.BigDecimal;

public class produto {
    private String descricao;
    private BigDecimal valor;
    private long codigo;

    //Construtor


    public produto(String descricao, BigDecimal valor, long codigo) {
        this.descricao = descricao;
        this.valor = valor;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
}
