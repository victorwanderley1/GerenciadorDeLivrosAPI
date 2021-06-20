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
}
