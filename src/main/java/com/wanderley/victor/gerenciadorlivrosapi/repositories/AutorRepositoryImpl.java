/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.repositories;

import com.wanderley.victor.gerenciadorlivrosapi.model.Autor;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
@Repository
public class AutorRepositoryImpl implements AutorRepository {
    AutorDAO autorDAO = new AutorDAOImpl();
    //<-------------------------Metodos de Busca------------------------------->
    @Override
    public List<Autor> findAll(){
        return autorDAO.findAll();
    }
    //<------------------------Métodos insert---------------------------------->
    @Override
    public Boolean addAutor(final Autor autor) {
        return autorDAO.addAutor(autor);
    }
    
}
