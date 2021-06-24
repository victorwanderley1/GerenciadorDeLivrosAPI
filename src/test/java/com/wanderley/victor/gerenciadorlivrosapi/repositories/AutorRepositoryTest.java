/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.repositories;

import com.wanderley.victor.gerenciadorlivrosapi.model.Autor;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
public class AutorRepositoryTest {
    
    /**
     * Test of findAll method, of class AutorRepository.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        AutorRepository instance = new AutorRepositoryImpl();
        List<Autor> expResult = new ArrayList();
        List<Autor> result = instance.findAll();
        assertTrue(expResult.addAll(result));
    }

    
}
