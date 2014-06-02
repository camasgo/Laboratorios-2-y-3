/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenguajes.a80703.application.action;

import com.lenguajes.a80703.business.AutorBusiness;
import com.lenguajes.a80703.business.LibroBusiness;
import com.lenguajes.a80703.business.PublicadorBusiness;
import com.lenguajes.a80703.dominio.Autor;
import com.lenguajes.a80703.dominio.Libro;
import com.lenguajes.a80703.dominio.Publicador;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class InsertarLibroAction extends ActionSupport implements Preparable, ModelDriven<Libro> {

    private LinkedList<Autor> autoresDisponibles;
    private LinkedList<Publicador> publicadores;
    private List<String> autoresSel = new ArrayList<String>();
    private Libro libro;

    @Override
    public String execute() throws Exception {
        return INPUT;
    }

    @Override
    public void prepare() throws Exception {
        publicadores = new PublicadorBusiness().getPublicadores();
        autoresDisponibles = new AutorBusiness().getAutores();
        libro = new Libro();
    }

    public String salvar() {
        String valor;
        try {
            LibroBusiness lb = new LibroBusiness();
            lb.insertarLibro(libro);
            valor = SUCCESS;            
        } catch (SQLException ex) {
            valor = ERROR;
        }
        return valor;
    }

    public String incluirAutor() {
        int i = 0;
        while (i < autoresSel.size()) {
            int j = 0;
            while (j < autoresDisponibles.size()) {
                if (autoresDisponibles.get(j).getCodAutor() == Integer.parseInt(autoresSel.get(i))) {
                    libro.getAutores().add(autoresDisponibles.get(j));
                    autoresDisponibles.remove(j);
                    break;
                }//if
                j++;
            }
            i++;
        }//for
        return INPUT;
    }

    public String excluirAutor() {
        int i = 0;
        while (i < autoresSel.size()) {
            int j = 0;
            while (j < libro.getAutores().size()) {
                if (libro.getAutores().get(j).getCodAutor() == Integer.parseInt(autoresSel.get(i))) {
                    autoresDisponibles.add(libro.getAutores().get(j));
                    libro.getAutores().remove(j);
                    break;
                }//if
                j++;
            }
            i++;
        }//for
        return INPUT;
    }

    @Override
    public Libro getModel() {
        return libro;
    }

    public LinkedList<Autor> getAutoresDisponibles() {
        return autoresDisponibles;
    }

    public LinkedList<Publicador> getPublicadores() {
        return publicadores;
    }

    public Libro getLibro() {
        return libro;
    }

    public List<String> getAutoresSel() {
        return autoresSel;
    }

    public void setAutoresSel(List<String> autoresSel) {
        this.autoresSel = autoresSel;
    }

}
