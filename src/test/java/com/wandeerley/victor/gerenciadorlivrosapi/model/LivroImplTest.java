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
public class LivroImplTest {
    
    public LivroImplTest() {
    }

    /**
     * Test of getId method, of class LivroImpl.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        LivroImpl instance = new LivroImpl();
        Integer expResult = 0;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class LivroImpl.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 3;
        LivroImpl instance = new LivroImpl();
        instance.setId(id);
    }

    /**
     * Test of getTitulo method, of class LivroImpl.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        LivroImpl instance = new LivroImpl();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitulo method, of class LivroImpl.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "algum título";
        LivroImpl instance = new LivroImpl();
        instance.setTitulo(titulo);
        
    }

    /**
     * Test of getAutor method, of class LivroImpl.
     */
    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        LivroImpl instance = new LivroImpl();
        Autor expResult = new AutorImpl();
        Autor result = instance.getAutor();
        assertEquals(expResult.getId(), result.getId());
    }

    /**
     * Test of getCategoria method, of class LivroImpl.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        LivroImpl instance = new LivroImpl();
        Categoria expResult = new CategoriaImpl();
        Categoria result = instance.getCategoria();
        assertEquals(expResult.getId(), result.getId());
    }
    
}
