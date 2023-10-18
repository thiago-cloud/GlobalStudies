package java.pacote.bd.dao;

import java.pacote.bd.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {

    public static DAOFactory getDAOFactory(){
        return new JdbcDAOFactory();//
    }
}
