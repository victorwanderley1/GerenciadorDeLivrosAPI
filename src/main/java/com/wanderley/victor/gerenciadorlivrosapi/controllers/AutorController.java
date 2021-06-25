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
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @PostMapping("/novoautor")
    public ResponseEntity<Boolean> addAutor(@RequestParam(defaultValue = "") final String nome,
            @RequestParam(required = false, defaultValue = "") final String sobrenome){
        Autor autor = new AutorImpl(nome, sobrenome);
        return new ResponseEntity(autorService.addAutor(autor), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/deleteautor/{id}")
    public ResponseEntity<Boolean> deleteAutor(@PathVariable final Integer id){
        return new ResponseEntity(autorService.deleteAutor(id), HttpStatus.NOT_FOUND);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Boolean> updateAutor(@RequestBody AutorImpl autor,
            @PathVariable final Integer id){
        return new ResponseEntity(autorService.updateAutor(id, autor), HttpStatus.OK);
    } 
}
