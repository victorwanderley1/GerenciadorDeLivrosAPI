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
public class AutorImplTest {
    
    public AutorImplTest() {
    }

    /**
     * Test of getId method, of class AutorImpl.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        AutorImpl instance = new AutorImpl();
        Integer expResult = 0;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class AutorImpl.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 5;
        AutorImpl instance = new AutorImpl();
        instance.setId(id);
    }

    /**
     * Test of getNome method, of class AutorImpl.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        AutorImpl instance = new AutorImpl();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class AutorImpl.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Nome";
        AutorImpl instance = new AutorImpl();
        instance.setNome(nome);
    }

    /**
     * Test of getSobrenome method, of class AutorImpl.
     */
    @Test
    public void testGetSobrenome() {
        System.out.println("getSobrenome");
        AutorImpl instance = new AutorImpl();
        String expResult = "";
        String result = instance.getSobrenome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSobrenome method, of class AutorImpl.
     */
    @Test
    public void testSetSobrenome() {
        System.out.println("setSobrenome");
        String sobrenome = "Sobrenome";
        AutorImpl instance = new AutorImpl();
        instance.setSobrenome(sobrenome);
    }
    
}
