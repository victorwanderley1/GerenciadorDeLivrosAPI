/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.controllers;

import com.wanderley.victor.gerenciadorlivrosapi.model.Autor;
import com.wanderley.victor.gerenciadorlivrosapi.services.AutorService;
import com.wanderley.victor.gerenciadorlivrosapi.services.AutorServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
@RestController
@RequestMapping("/autor")
public class AutorController {
    @Autowired
    private final AutorService autorService = new AutorServiceImpl();
    
    @GetMapping
    ResponseEntity<List<Autor>> findAll() {
        return new ResponseEntity(autorService.findAll(), HttpStatus.OK);
    }
    
    
    
}
