/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lenguajes.a80703.business;

import com.lenguajes.a80703.data.LibroData;
import com.lenguajes.a80703.dominio.Libro;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class LibroBusiness {
     LibroData libroData;

    public LibroBusiness() {
        libroData = new LibroData();
    }
     
     public Libro insertarLibro(Libro libro) throws SQLException {
         return libroData.insertarLibro(libro);
     }
    
    
}
