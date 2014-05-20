/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lenguajes.a80703.data;

import com.lenguajes.a80703.dominio.Autor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo
 */
public class AutorDataTest {

    private AutorData ad;
    
    @Before
    public void setUp() {
        ad = new AutorData();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void test() {
        try {
//            for (Autor autor : ad.getAutores("G")) {
//                System.out.println(autor.getNombreAutor());
//            }//foreach
            
            Autor autor = ad.getAutor(1);
            autor.setNombreAutor("Gabo");
            ad.editarAutor(autor);
            System.out.println(autor.getNombreAutor());
            
        } catch (SQLException ex) {
            Logger.getLogger(AutorDataTest.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
