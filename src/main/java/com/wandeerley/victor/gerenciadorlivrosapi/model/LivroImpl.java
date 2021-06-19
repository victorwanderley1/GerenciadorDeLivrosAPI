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
public class LivroImpl implements Livro{
    private Integer id;
    private String titulo;
    private Autor autor;
    private Categoria categoria;

    public LivroImpl() {
        this.id = 0;
        this.titulo = "";
        this.autor = new AutorImpl();
        this.categoria = new CategoriaImpl();
    }

    public LivroImpl(String titulo, Integer idAutor, Integer idCategoria) {
        this.id = 0;
        this.titulo = titulo;
        this.autor = new AutorImpl(idAutor);
        this.categoria = new CategoriaImpl(idCategoria);
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
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public Autor getAutor() {
        return autor;
    }

    @Override
    public Categoria getCategoria() {
        return categoria;
    }
    
}
