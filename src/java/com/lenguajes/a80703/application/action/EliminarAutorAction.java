/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenguajes.a80703.application.action;

import com.lenguajes.a80703.business.AutorBusiness;
import com.lenguajes.a80703.dominio.Autor;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Carlos
 */
public class EliminarAutorAction extends ActionSupport implements Preparable, ServletRequestAware {

    private Autor autor;
    private HttpServletRequest request;
    private String codAutor;

    @Override
    public void prepare() throws Exception {
        AutorBusiness ab = new AutorBusiness();
        autor = ab.getAutor(Integer.parseInt(request.getParameter("codAutor")));
    }

    @Override
    public String execute() throws Exception {
        return INPUT;
    }

    public String eliminar() {
        try {
            
            AutorBusiness ab = new AutorBusiness();
            ab.eliminarAutor(Integer.parseInt(codAutor));

        } catch (SQLException ex) {
            return ERROR;
        }
        return SUCCESS;
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getCodAutor() {
        return codAutor;
    }

    public void setCodAutor(String codAutor) {
        this.codAutor = codAutor;
    }
    
}
