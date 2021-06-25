/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.controllers;

import com.wanderley.victor.gerenciadorlivrosapi.model.Autor;
import com.wanderley.victor.gerenciadorlivrosapi.model.AutorImpl;
import com.wanderley.victor.gerenciadorlivrosapi.services.AutorService;
import com.wanderley.victor.gerenciadorlivrosapi.services.AutorServiceImpl;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
@RestController
@RequestMapping("/autor")
public class AutorController {
    @Autowired
    AutorService autorService = new AutorServiceImpl();
    
    @GetMapping
    public ResponseEntity<List<Autor>> findAll() {
        return new ResponseEntity(autorService.findAll(), HttpStatus.OK);
    }
    
    @PostMapping("/novo")
    public ResponseEntity<Boolean> addAutor(@RequestParam final String nome,
            final String sobrenome){
        Autor autor = new AutorImpl(nome, sobrenome);
        return new ResponseEntity(autorService.addAutor(autor), HttpStatus.CREATED);
    }
    
    
    
}
