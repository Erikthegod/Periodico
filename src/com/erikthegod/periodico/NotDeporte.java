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
public class NotDeporte extends Noticia{
    private String deporte;
    private String genero;

    public NotDeporte(String titulo, String autor, String deporte, String genero,String cuerpo ) {
        this.setTitulo(titulo);
        this.deporte = deporte;
        this.genero = genero;
        this.setAutor(autor);
        this.setCuerpoNoticia(cuerpo);
    }

    public String getDeporte() {
        return deporte;
    }

    public String getGenero() {
        return genero;
    }
    


    
}
