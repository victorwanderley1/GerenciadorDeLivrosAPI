/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.repositories;

import com.wanderley.victor.gerenciadorlivrosapi.model.Autor;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
public interface AutorDAO {

    //<--------------------------Métodos insert-------------------------------->
    Boolean addAutor(final Autor autor);

    //<--------------------------Metodos Delete-------------------------------->
    Boolean deleteAutor(final Integer id);
    //<-------------------------Metodos de Busca------------------------------->
    List<Autor> findAll();
    Autor findById(final Integer id);
    Set<Integer> idsValidos();
    //<--------------------------Métodos Update-------------------------------->
    Boolean updateAutor(final Integer id, final Autor autor);
    
}
