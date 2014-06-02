/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lenguajes.a80703.dominio;

/**
 *
 * @author Carlos
 */
public class Autor {
    
    private int codAutor;
    private String nombreAutor;
    private String apellidosAutor;

    public Autor() {
    }

    public Autor(int codAutor, String nombreAutor, String apellidosAutor) {
        this.codAutor = codAutor;
        this.nombreAutor = nombreAutor;
        this.apellidosAutor = apellidosAutor;
    }
    
    public int getCodAutor() {
        return codAutor;
    }

    public void setCodAutor(int codAutor) {
        this.codAutor = codAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidosAutor() {
        return apellidosAutor;
    }

    public void setApellidosAutor(String apellidosAutor) {
        this.apellidosAutor = apellidosAutor;
    }
    
}
