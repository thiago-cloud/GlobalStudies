package br.com.codando.model;

import java.time.LocalDate;
//Classe de representação das despesas
public class Despesa {
    private long id;
    private String descricao;
    private LocalDate data;
    private double valor;

    private Categoria categoria;

}
