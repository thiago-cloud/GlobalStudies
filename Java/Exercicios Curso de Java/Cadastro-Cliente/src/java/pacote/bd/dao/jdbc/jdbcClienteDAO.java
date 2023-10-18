package java.pacote.bd.dao.jdbc;

import java.pacote.bd.dao.ClienteDAO;
import java.pacote.bd.dao.DAOException;
import java.pacote.bd.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcClienteDAO implements ClienteDAO {


    /**
     * Classe responsavel por salvar o cliente no banco de dados
     *
     */
    private Connection connection;

    public jdbcClienteDAO(Connection connection){
        this.connection = connection;
    }


    public void salvar(Cliente cliente) {
        try{
        String sql = String.format("insert into cliente (nome) values ('%s')",cliente.getNome());

        PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.executeUpdate();//Fazendo commit no banco de dados
    }catch(SQLException e){
            throw new DAOException("Erro Salvando cliente", e)
        }finally {
            try{
                this.connection.clone();
            }catch (Exception e){

            }

        }
        }
}
