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
public class FalhaNoArquivoPropertiesException extends RuntimeException{
    public FalhaNoArquivoPropertiesException(){
        super("Falha no carregamento do arquivo de propriedade");
    }
}
