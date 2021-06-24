package com.wanderley.victor.gerenciadorlivrosapi.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
@SpringBootTest
public class LivroTest {
    
    public LivroTest() {
    }

    /**
     * Test of getId method, of class LivroImpl.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Livro instance = new LivroImpl();
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
        Livro instance = new LivroImpl();
        instance.setId(id);
    }

    /**
     * Test of getTitulo method, of class LivroImpl.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Livro instance = new LivroImpl();
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
        Livro instance = new LivroImpl();
        instance.setTitulo(titulo);
        
    }

    /**
     * Test of getAutor method, of class LivroImpl.
     */
    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        Livro instance = new LivroImpl();
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
        Livro instance = new LivroImpl();
        Categoria expResult = new CategoriaImpl();
        Categoria result = instance.getCategoria();
        assertEquals(expResult.getId(), result.getId());
    }
    
}
