/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenguajes.a80703.application.action;

import com.lenguajes.a80703.business.AutorBusiness;
import com.lenguajes.a80703.business.PublicadorBusiness;
import com.lenguajes.a80703.dominio.Autor;
import com.lenguajes.a80703.dominio.Libro;
import com.lenguajes.a80703.dominio.Publicador;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Carlos
 */
public class InsertarLibroAction extends ActionSupport implements Preparable, ModelDriven<Libro>, ServletRequestAware {

    private LinkedList<Autor> autoresDisponibles;
    private LinkedList<Publicador> publicadores;
    private Libro libro;
    private HttpServletRequest request;

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
        System.out.println("Salvar");
        
        return INPUT;
    }

    public String incluirAutor() {
        System.out.println("Incluir");
//        int i = 0;
//        while (i < autoresDisponibles.size()) {
//            if (autoresDisponibles.get(i).getCodAutor() == Integer.parseInt(request.getParameter("codAutor"))) {
//                libro.getAutores().add(autoresDisponibles.get(i));
//                autoresDisponibles.remove(i);
//                break;
//            }//if
//            i++;
//        }//for
        return INPUT;
    }

    public String excluirAutor() {
        System.out.println("Excluir");
//        int i = 0;
//        while (i < libro.getAutores().size()) {
//            if (libro.getAutores().get(i).getCodAutor() == Integer.parseInt(request.getParameter("codAutor"))) {
//                autoresDisponibles.add(libro.getAutores().get(i));
//                libro.getAutores().remove(i);
//                break;
//            }//if
//            i++;
//        }//for
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

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

}
