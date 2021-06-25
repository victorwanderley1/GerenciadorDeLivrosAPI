/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.repositories;

import com.wanderley.victor.gerenciadorlivrosapi.model.Autor;
import java.util.List;
import java.util.Set;
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
    //<--------------------------Metodos Delete-------------------------------->
    @Override
    public Boolean deleteAutor(final Integer idAutor) {
        if(getIdsValidos().contains(idAutor)){
            return autorDAO.deleteAutor(idAutor);
        }return false;
    }
    //<--------------------------Métodos Update-------------------------------->
    @Override
    public Boolean updateAutor(final Integer id, final Autor autor){
        if(getIdsValidos().contains(id)){
            return autorDAO.updateAutor(id, autor);
        }return false;
        
    }
    
    private Set<Integer> getIdsValidos(){
        return autorDAO.idsValidos();
    }
    
    
}
