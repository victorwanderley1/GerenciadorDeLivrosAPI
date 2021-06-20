/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.repositories.connection;

import com.wanderley.victor.gerenciadorlivrosapi.repositories.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
public class ConnectionFactoryTest {
    
    public ConnectionFactoryTest() {
    }

    /**
     * Test of getConnection method, of class ConnectionFactory.
     */
    @Test
    public void testGetConnection() throws SQLException {
        System.out.println("getConnection");
        Connection result = ConnectionFactory.getConnection();
        result.close();
        assertTrue(result.isClosed());
    }
    
}
