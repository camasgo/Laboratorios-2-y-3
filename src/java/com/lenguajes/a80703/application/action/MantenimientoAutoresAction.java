/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lenguajes.a80703.application.action;

import com.lenguajes.a80703.business.AutorBusiness;
import com.lenguajes.a80703.dominio.Autor;
import com.opensymphony.xwork2.ActionSupport;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Equipo
 */
public class MantenimientoAutoresAction extends ActionSupport implements ServletRequestAware{
    
    private LinkedList<Autor> autores;
    private HttpServletRequest request;
    
    @Override
    public String execute() throws Exception {
        AutorBusiness ab = new AutorBusiness();
        autores = ab.getAutores(request.getParameter("apellidos"));
        
        return INPUT;        
    }

    public LinkedList<Autor> getAutores() {
        return autores;
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }
    
    
}
