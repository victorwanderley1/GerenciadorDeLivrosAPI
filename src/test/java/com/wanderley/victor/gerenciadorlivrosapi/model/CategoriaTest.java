/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.model;

import com.wanderley.victor.gerenciadorlivrosapi.model.Categoria;
import com.wanderley.victor.gerenciadorlivrosapi.model.CategoriaImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
@SpringBootTest
public class CategoriaTest {
    
    public CategoriaTest() {
    }

    /**
     * Test of getId method, of class CategoriaImpl.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Categoria instance = new CategoriaImpl();
        Integer expResult = 0;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class CategoriaImpl.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 5;
        Categoria instance = new CategoriaImpl();
        instance.setId(id);
    }

    /**
     * Test of getNomeCategoria method, of class CategoriaImpl.
     */
    @Test
    public void testGetNomeCategoria() {
        System.out.println("getNomeCategoria");
        Categoria instance = new CategoriaImpl();
        String expResult = "";
        String result = instance.getNomeCategoria();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNomeCategoria method, of class CategoriaImpl.
     */
    @Test
    public void testSetNomeCategoria() {
        System.out.println("setNomeCategoria");
        String nomeCategoria = "nome";
        Categoria instance = new CategoriaImpl();
        instance.setNomeCategoria(nomeCategoria);
    }
    
}
