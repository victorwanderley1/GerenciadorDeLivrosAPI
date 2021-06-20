/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderley.victor.gerenciadorlivrosapi.exceptions;

/**
 *
 * @author Victor Wanderley <wanderley.victor>
 */
public class FalhaConexaoException extends RuntimeException{
    public FalhaConexaoException(String e){
        super("Falha na conexão com o DB: -> "+e);
    }
}
