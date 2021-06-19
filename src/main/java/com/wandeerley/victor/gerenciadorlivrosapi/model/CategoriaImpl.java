/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandeerley.victor.gerenciadorlivrosapi.model;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
public class CategoriaImpl implements Categoria {
    private Integer id;
    private String nomeCategoria;

    public CategoriaImpl(Integer id, String nomeCategoria) {
        this.id = id;
        this.nomeCategoria = nomeCategoria;
    }

    public CategoriaImpl(Integer id) {
        this.id = id;
    }

    public CategoriaImpl() {
        this.id = 0;
        this.nomeCategoria = "";
    }
    
    
    
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getNomeCategoria() {
        return nomeCategoria;
    }

    @Override
    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
    
}
