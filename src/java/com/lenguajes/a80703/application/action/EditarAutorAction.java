/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lenguajes.a80703.application.action;

import com.lenguajes.a80703.business.AutorBusiness;
import com.lenguajes.a80703.dominio.Autor;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Equipo
 */
public class EditarAutorAction extends ActionSupport implements Preparable, ModelDriven<Autor>, ServletRequestAware{
    private Autor autor;
    private HttpServletRequest request;

    @Override
    public String execute() throws Exception {
        return INPUT;
    }

    @Override
    public void prepare() throws Exception {
        AutorBusiness ab = new AutorBusiness();
        autor = ab.getAutor(Integer.parseInt(request.getParameter("codAutor")));
    }
    
    public String editar(){
        try {
            AutorBusiness ab = new AutorBusiness();
            ab.editarAutor(autor);        
            
        } catch (SQLException ex) {
            Logger.getLogger(EditarAutorAction.class.getName()).log(Level.SEVERE, null, ex);
            return ERROR;
        }
        return SUCCESS;
    }

    @Override
    public Autor getModel() {
        return autor;
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }       
    
}
