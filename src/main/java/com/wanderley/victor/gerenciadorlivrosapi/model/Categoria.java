/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.model;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
public interface Categoria {

    Integer getId();

    String getNomeCategoria();

    void setId(Integer id);

    void setNomeCategoria(String nomeCategoria);
    
}
