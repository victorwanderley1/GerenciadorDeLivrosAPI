package com.wanderley.victor.gerenciadorlivrosapi.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
@SpringBootTest
public class AutorTest {
    
    public AutorTest() {
    }

    /**
     * Test of getId method, of class AutorImpl.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Autor instance = new AutorImpl();
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
        Autor instance = new AutorImpl();
        instance.setId(id);
    }

    /**
     * Test of getNome method, of class AutorImpl.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Autor instance = new AutorImpl();
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
        Autor instance = new AutorImpl();
        instance.setNome(nome);
    }

    /**
     * Test of getSobrenome method, of class AutorImpl.
     */
    @Test
    public void testGetSobrenome() {
        System.out.println("getSobrenome");
        Autor instance = new AutorImpl();
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
        Autor instance = new AutorImpl();
        instance.setSobrenome(sobrenome);
    }
    
}
