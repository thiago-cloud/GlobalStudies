package br.com.codando.DAO;

import br.com.codando.model.Categoria;
import br.com.codando.model.Despesa;

import java.util.List;
import java.util.Optional;

//Essa classe vai definir um contrato de uma despesa dao ou seja vai definir todos os métodos que o despesa dao possui
//No caso aki nosso objetivo é um crud


public interface IDespesaDAO {

    //Métodos
    Despesa save(Despesa despesa);
    Despesa update(Despesa despesa);
    void delete(Long id);

    List<Despesa> findAll();//Retorna todas as despesas
    Optional<Despesa> findById(Long id);//Ele retornara uma uma despesa selecionada atravês do id o optional epra verificar se o id existe.
    List<Despesa> findByCategoria(Categoria categoria);//Lista todas as despesas por categoria.


}
