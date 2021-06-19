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
public interface Autor {

    Integer getId();

    String getNome();

    String getSobrenome();
    
    void setId(Integer id);
    
    void setNome(String nome);
    
    void setSobrenome(String sobrenome);
    
}
