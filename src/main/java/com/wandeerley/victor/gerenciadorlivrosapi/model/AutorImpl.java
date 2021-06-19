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
public class AutorImpl implements Autor {
    private Integer id;
    private String nome;
    private String sobrenome;

    public AutorImpl() {
        this.id = 0;
        this.nome = "";
        this.sobrenome = "";
    }

    public AutorImpl(String nome, String sobrenome) {
        this.id = 0;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public AutorImpl(Integer id, String nome, String sobrenome) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public AutorImpl(Integer id) {
        this.id = id;
        this.nome = "";
        this.sobrenome = "";
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
    public String getNome() {
        return nome;
    }
    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getSobrenome() {
        return sobrenome;
    }
    
    @Override
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
}
