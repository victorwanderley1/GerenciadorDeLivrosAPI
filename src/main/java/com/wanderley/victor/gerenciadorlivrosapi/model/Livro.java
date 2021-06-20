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
public interface Livro {

    Autor getAutor();

    Categoria getCategoria();

    Integer getId();

    String getTitulo();

    void setId(Integer id);

    void setTitulo(String titulo);
    
}
