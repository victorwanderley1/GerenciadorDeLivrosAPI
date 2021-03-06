/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.repositories;

import com.wanderley.victor.gerenciadorlivrosapi.model.Autor;
import java.util.List;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
public interface AutorRepository {

    List<Autor> findAll();
    Boolean addAutor(final Autor autor);
    Boolean deleteAutor(final Integer idAutor);
    Boolean updateAutor(final Integer id, final Autor autor);
}
