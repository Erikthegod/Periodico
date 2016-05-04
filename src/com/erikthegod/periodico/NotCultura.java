/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikthegod.periodico;

/**
 *
 * @author dam
 */
public class NotCultura extends Noticia{
    private String categoria;

    public NotCultura(String titulo, String autor, String categoria, String cuerpo) {
        this.setAutor(autor);
        this.setTitulo(titulo);
        this.categoria = categoria;
        this.setCuerpoNoticia(cuerpo);
    }

    public String getCategoria() {
        return categoria;
    }
    
}
