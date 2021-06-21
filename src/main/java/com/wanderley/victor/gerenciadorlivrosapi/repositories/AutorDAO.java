/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.repositories;

import com.wanderley.victor.gerenciadorlivrosapi.exceptions.FalhaConexaoException;
import com.wanderley.victor.gerenciadorlivrosapi.model.Autor;
import com.wanderley.victor.gerenciadorlivrosapi.model.AutorImpl;
import com.wanderley.victor.gerenciadorlivrosapi.repositories.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
class AutorDAO {
    protected List<Autor> findAll(){
        try(Connection connection = ConnectionFactory.getConnection()){
            return getAutores(getPreparedStatementFindAll(connection).executeQuery());
        }catch(SQLException e){
            throw new FalhaConexaoException(e.getMessage());
        }
    }

    private PreparedStatement getPreparedStatementFindAll(final Connection connection) throws SQLException {
        PreparedStatement prst = connection.prepareStatement(getSqlFindAll());
        return prst;
    }
    
    private String getSqlFindAll(){
        return "SELECT * FROM autor";
    }
    
    private Autor getAutor(ResultSet result) throws SQLException{
        Autor autor = new AutorImpl();
        autor.setNome(result.getString("nome"));
        autor.setSobrenome(result.getString("sobrenome"));
        autor.setId(result.getInt("idautor"));
        return autor;
    }
    
    private List<Autor> getAutores(ResultSet result) throws SQLException{
        List<Autor> autores = new ArrayList();
        while(result.next()){
            autores.add(getAutor(result));
        }
        return autores;
    }
    
    public Boolean addAutor(final Autor autor){
        try(Connection connection = ConnectionFactory.getConnection()){
            int rowAfected = insert(connection, autor);
            return true;
            //Alterar retorno para Autor;
        }catch(Exception e){
            throw new RuntimeException();
        }
    }
    
    private String getSQLAdd(){
        return "INSERT INTO autor(idautor, nome, sobrenome) VALUES (?,?)";
    }
    
    private PreparedStatement getPreparedStatementAdd(final Connection connection) throws SQLException{
        return connection.prepareStatement(getSQLAdd());
    }
    
    private PreparedStatement prepareAutorToAdd(final Connection connection, final Autor autor) throws SQLException{
        return setAutorOnStatement(getPreparedStatementAdd(connection), autor);
    }
    
    private PreparedStatement setAutorOnStatement(final PreparedStatement prst, final Autor autor) throws SQLException{
        prst.setString(0, autor.getNome());
        prst.setString(1, autor.getSobrenome());
        return prst;
    }
    
    private Integer insert(final Connection connection, final Autor autor) throws SQLException{
        return prepareAutorToAdd(connection, autor).executeUpdate();
    }
    
}
