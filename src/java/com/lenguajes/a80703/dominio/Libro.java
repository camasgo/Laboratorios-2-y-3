/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lenguajes.a80703.dominio;

import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class Libro {
    
    private int numLibro;
    private String tituloLibro;
    private int anoPublicacion;
    private String isbn;
    private float precio;
    private Publicador publicador;
    private LinkedList<Autor> autores;

    public Libro() {        
        publicador = new Publicador();
        autores = new LinkedList<Autor>();
    }

    public Libro(int numLibro, String tituloLibro, int anoPublicacion, String isbn, float precio, Publicador publicador,
            LinkedList<Autor> autores) {
        this.numLibro = numLibro;
        this.tituloLibro = tituloLibro;
        this.anoPublicacion = anoPublicacion;
        this.isbn = isbn;
        this.precio = precio;
        this.publicador = publicador;
        this.autores = autores;
    }

    public int getNumLibro() {
        return numLibro;
    }

    public void setNumLibro(int numLibro) {
        this.numLibro = numLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Publicador getPublicador() {
        return publicador;
    }

    public void setPublicador(Publicador publicador) {
        this.publicador = publicador;
    }

    public LinkedList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(LinkedList<Autor> autores) {
        this.autores = autores;
    }
    
}
