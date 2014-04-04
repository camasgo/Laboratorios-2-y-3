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
public class Publicador {
    
    private int codPublicador;
    private String nombrePublicador;
    private String urlSitioWeb;
    private String telefono;

    public Publicador() {
    }

    public Publicador(int codPublicador, String nombrePublicador, String urlSitioWeb, String telefono) {
        this.codPublicador = codPublicador;
        this.nombrePublicador = nombrePublicador;
        this.urlSitioWeb = urlSitioWeb;
        this.telefono = telefono;
    }
    
    public int getCodPublicador() {
        return codPublicador;
    }

    public void setCodPublicador(int codPublicador) {
        this.codPublicador = codPublicador;
    }

    public String getNombrePublicador() {
        return nombrePublicador;
    }

    public void setNombrePublicador(String nombrePublicador) {
        this.nombrePublicador = nombrePublicador;
    }

    public String getUrlSitioWeb() {
        return urlSitioWeb;
    }

    public void setUrlSitioWeb(String urlSitioWeb) {
        this.urlSitioWeb = urlSitioWeb;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
