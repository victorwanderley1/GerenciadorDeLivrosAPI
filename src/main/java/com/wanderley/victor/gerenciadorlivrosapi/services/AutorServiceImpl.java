/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.services;

import com.wanderley.victor.gerenciadorlivrosapi.model.Autor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wanderley.victor.gerenciadorlivrosapi.repositories.AutorRepository;
import com.wanderley.victor.gerenciadorlivrosapi.repositories.AutorRepositoryImpl;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
@Service
public class AutorServiceImpl implements AutorService {
    
    //<-------------------------Metodos de Busca------------------------------->
    @Autowired
    AutorRepository autorRepository = new AutorRepositoryImpl();
    @Override
    public List<Autor> findAll(){
        return autorRepository.findAll();
    }
    //<------------------------Métodos insert---------------------------------->
    @Override
    public Boolean addAutor(final Autor autor) {
        return autorRepository.addAutor(autor);
    }
    //<--------------------------Metodos Delete-------------------------------->
    @Override
    public Boolean deleteAutor(Integer id) {
        if(id > 0){
            return autorRepository.deleteAutor(id);
        }return false;
    }
}
