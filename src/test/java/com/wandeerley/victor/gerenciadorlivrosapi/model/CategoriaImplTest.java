/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandeerley.victor.gerenciadorlivrosapi.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
public class CategoriaImplTest {
    
    public CategoriaImplTest() {
    }

    /**
     * Test of getId method, of class CategoriaImpl.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        CategoriaImpl instance = new CategoriaImpl();
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
        CategoriaImpl instance = new CategoriaImpl();
        instance.setId(id);
    }

    /**
     * Test of getNomeCategoria method, of class CategoriaImpl.
     */
    @Test
    public void testGetNomeCategoria() {
        System.out.println("getNomeCategoria");
        CategoriaImpl instance = new CategoriaImpl();
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
        CategoriaImpl instance = new CategoriaImpl();
        instance.setNomeCategoria(nomeCategoria);
    }
    
}
