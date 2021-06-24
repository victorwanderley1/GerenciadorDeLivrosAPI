/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.controllers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
@SpringBootTest
public class AutorControllerTest {
    
    public AutorControllerTest() {
    }

    @Test
    public void testMetodoFindAll() {
        final AutorController autorController = new AutorController();
        
        
        assertTrue(autorController.findAll().hasBody());
    }
    
}
