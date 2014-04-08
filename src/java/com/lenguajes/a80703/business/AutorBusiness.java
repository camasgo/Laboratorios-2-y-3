/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lenguajes.a80703.business;

import com.lenguajes.a80703.data.AutorData;
import com.lenguajes.a80703.dominio.Autor;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class AutorBusiness {
    
    AutorData autordata;

    public AutorBusiness() {
        autordata = new AutorData();
    }
    
    public LinkedList<Autor> getAutores() throws SQLException{
        return autordata.getAutores();
    }
    
}
