/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lenguajes.a80703.data;

import com.lenguajes.a80703.dominio.Autor;
import com.lenguajes.a80703.dominio.Libro;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Carlos
 */
public class LibroDataTest {
    LibroData lb;
    @Before
    public void setUp() {
        lb = new LibroData();
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
     public void test() {
        try {
            Libro libro = new Libro();
            libro.setTituloLibro("El Silmarilion");
            libro.setAnoPublicacion(1977);
            libro.getAutores().add(new Autor(1004,"",""));
            libro.getPublicador().setCodPublicador(1002);
            libro.setIsbn("ISBN 84-450-7038-X");
            lb.insertarLibro(libro);
        } catch (SQLException ex) {
            Logger.getLogger(LibroDataTest.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
