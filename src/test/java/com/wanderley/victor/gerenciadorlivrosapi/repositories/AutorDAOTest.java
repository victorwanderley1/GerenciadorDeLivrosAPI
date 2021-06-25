/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.repositories;

import com.wanderley.victor.gerenciadorlivrosapi.exceptions.FalhaConexaoException;
import com.wanderley.victor.gerenciadorlivrosapi.model.Autor;
import com.wanderley.victor.gerenciadorlivrosapi.model.AutorImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
@SpringBootTest
public class AutorDAOTest {
    Integer idAutorAdicionado;
    public AutorDAOTest() {
    }

    /**
     * Test of findAll method, of class AutorDAOImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        AutorDAO instance = new AutorDAOImpl();
        instance.findAll();
    }

    /**
     * Test of findById method, of class AutorDAOImpl.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Integer id = 1;
        AutorDAO instance = new AutorDAOImpl();
        Autor result = instance.findById(id);
        assertEquals(id, result.getId());
    }

    /**
     * Test of addAutor method, of class AutorDAOImpl.
     */
    @Test
    public void testAddAutor() {
        System.out.println("addAutor");
        AutorDAO instance = new AutorDAOImpl();
        assertFalse(instance.addAutor(null));
    }
    
    @Test
    public void testDeleteAutor(){
        System.out.println("deleteAutor");
        AutorDAO instance = new AutorDAOImpl();
        
        assertFalse(instance.deleteAutor(0));
    }
    
    @Test
    public void testUpdateAutor(){
        System.out.println("updateAutor");
        AutorDAO instance = new AutorDAOImpl();
        Autor autor = new AutorImpl("Chico", "Bento");
        Integer id = 0;
        try{
            instance.updateAutor(id, autor);
        }catch(FalhaConexaoException e){
            
        }
    }
}
