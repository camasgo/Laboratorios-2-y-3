/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lenguajes.a80703.data;

import com.lenguajes.a80703.dominio.Autor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class AutorData extends BaseData{

    public AutorData() {
    }
    
    public LinkedList<Autor> getAutores() throws SQLException{
        String sqlSelect = "SELECT cod_autor, nombre_autor, apellidos_autor"
                                + " FROM Autor "
                                + " ORDER BY apellidos_autor";
        Connection con = this.getConnection();
        PreparedStatement stmt = con.prepareStatement(sqlSelect);
        ResultSet resultSet = stmt.executeQuery();
        LinkedList<Autor> autores = new LinkedList<Autor>();   
        
        while(resultSet.next()){
            Autor autor = new Autor();
            autor.setCodAutor(resultSet.getInt("cod_autor"));
            autor.setNombreAutor(resultSet.getString("nombre_autor"));
            autor.setApellidosAutor(resultSet.getString("apellidos_autor"));
            
            autores.add(autor);
        }
        con.close();
        
        return autores;
    }
    
    
}
