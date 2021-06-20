/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.repositories.connection;

import com.wanderley.victor.gerenciadorlivrosapi.exceptions.FalhaConexaoException;
import com.wanderley.victor.gerenciadorlivrosapi.exceptions.FalhaNoArquivoPropertiesException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
public class ConnectionFactory {
    public static Connection getConnection(){
        try{
            Connection connection = DriverManager.getConnection(getURL(), getUserDb(), 
                    getPassword());
            return connection;
        }catch (SQLException e){
            throw new FalhaConexaoException(e.getMessage());
        }
    }
        
    private static InputStream loadFileProperties(){
        return ConnectionFactory.class.getClassLoader().getResourceAsStream("connectionlivro.properties");
    }
    
    private static Properties getProperties(){
        try{
            Properties properties = new Properties();
            properties.load(loadFileProperties());
            return properties;
        }catch(IOException e){
            throw new FalhaNoArquivoPropertiesException();
        }
    }
    
    private static String getURL(){
        String dbDriver = getProperties().getProperty("jdbc.driver");
        String dbAdress = getProperties().getProperty("db.adress");
        String dbName = getProperties().getProperty("db.name");
        return "jdbc:"+dbDriver+"://"+dbAdress+"/"+dbName;
    }
    
    private static String getUserDb(){
        return getProperties().getProperty("db.user.login");
    }
    
    private static String getPassword(){
        return getProperties().getProperty("db.user.password");
    }
}
