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
    //<--------------------------Métodos de busca------------------------------>
    
    
    protected List<Autor> findAll(){
        try(Connection connection = ConnectionFactory.getConnection()){
            return getAutores(getPreparedStatementFindAll(connection).executeQuery());
        }catch(SQLException e){
            throw new FalhaConexaoException(e.getMessage());
        }
    }
    
    private String getSqlFindAll(){
        return "SELECT * FROM autor";
    }
    
    private PreparedStatement getPreparedStatementFindAll(
            final Connection connection) throws SQLException {
        return connection.prepareStatement(getSqlFindAll());
    }
    
    private Autor getAutor(final ResultSet result) throws SQLException{
        Autor autor = new AutorImpl();
        autor.setNome(result.getString("nome"));
        autor.setSobrenome(result.getString("sobrenome"));
        autor.setId(result.getInt("idautor"));
        return autor;
    }
    
    private List<Autor> getAutores(final ResultSet result) throws SQLException{
        List<Autor> autores = new ArrayList();
        while(result.next()){
            autores.add(getAutor(result));
        }
        return autores;
    }
    
     public Autor findById(final Integer id){
        try(Connection connection = ConnectionFactory.getConnection()){
            return getAutorById(getPreparedStatementFindById(connection, id)
                    .executeQuery());
        }catch(SQLException e){
            throw new FalhaConexaoException(e.getMessage());
        }
    }
     
    private Autor getAutorById(final ResultSet result) throws SQLException{
        result.next();
        return getAutor(result);
    }

    private static String getSqlFindById() {
        return "SELECT * FROM autor WHERE idAutor = ?";
    }
     
    private PreparedStatement getPreparedStatementFindById(
            final Connection connection, Integer id) throws SQLException {
        return setIdOnStatement(id, connection.prepareStatement(getSqlFindById()));
    }
     
    private PreparedStatement setIdOnStatement(final Integer id, final PreparedStatement prst) throws SQLException{
        prst.setInt(1, id);
        return prst;
    }
    
    
    //<------------------------Métodos insert---------------------------------->
    
    public Boolean addAutor(final Autor autor){
        if(autor != null){
            try(Connection connection = ConnectionFactory.getConnection()){
                insert(connection, autor);
                return true;
                //Alterar retorno para Autor;
            }catch(Exception e){
                throw new FalhaConexaoException(e.getMessage());
            }
        } return false;    
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
        prst.setString(1, autor.getNome());
        prst.setString(2, autor.getSobrenome());
        return prst;
    }
    
    private Integer insert(final Connection connection, final Autor autor) throws SQLException{
        return prepareAutorToAdd(connection, autor).executeUpdate();
    }

    //<--------------------------Metodos Delete------------------------------------>

    public Boolean deleteAutor(final Integer id){
        try(Connection connection = ConnectionFactory.getConnection()){
            final int rowsAfect = getPreparedStatementDelete(connection, id).executeUpdate();
            if(rowsAfect != 0){
                return true;
            }
        }catch (SQLException e){
            throw new FalhaConexaoException(e.getMessage());
        }
        return false;
    }
    private String sqlDelete(){
        return "DELETE FROM autor WHERE idautor = ?"; 
    }
    
    private PreparedStatement getPreparedStatementDelete(final Connection connection, final Integer id) throws SQLException{
        PreparedStatement prst = connection.prepareStatement(sqlDelete());
        return setIdOnStatement(id, prst);
    }

//<-----------------------------Métodos Update--------------------------------->
    
    public Boolean updateAutor(final Integer id, final Autor autor){
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "UPDATE autor SET nome = ?, sobrenome = ? WHERE idautor = ?";
            if(id!=0){
                Autor autorInDB = findById(id);
                if((autorInDB != null)){
                    if(!autor.getNome().isBlank()){
                        autorInDB.setNome(autor.getNome());
                    }
                    if(!autor.getSobrenome().isBlank()){
                        autorInDB.setSobrenome(autor.getSobrenome());
                    }
                    PreparedStatement prst = connection.prepareStatement(sql);
                    prst.setString(1, autorInDB.getNome());
                    prst.setString(2, autorInDB.getSobrenome());
                    Integer rowAfect = prst.executeUpdate();
                    return rowAfect != 0;
                }
            }
        }catch (SQLException e){
            
        }
        
        
        return false;
    }
    
}