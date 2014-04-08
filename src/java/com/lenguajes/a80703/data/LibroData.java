/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenguajes.a80703.data;

import com.lenguajes.a80703.dominio.Autor;
import com.lenguajes.a80703.dominio.Libro;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author Carlos
 */
public class LibroData extends BaseData {

    public LibroData() {
    }

    public Libro insertarLibro(Libro libro) throws SQLException {
        Connection con = this.getConnection();
        con.setAutoCommit(false);

        try {
            String sqlInsertLibro = "{CALL insertar_libro(?,?,?,?,?,?)}";
            CallableStatement stmtLibro = con.prepareCall(sqlInsertLibro);
            
            stmtLibro.registerOutParameter("1", Types.INTEGER);
            stmtLibro.setInt("2", libro.getPublicador().getCodPublicador());
            stmtLibro.setString("3", libro.getTituloLibro());
            stmtLibro.setInt("4", libro.getAnoPublicacion());
            stmtLibro.setString("5", libro.getIsbn());
            stmtLibro.setFloat("6", libro.getPrecio());
            stmtLibro.executeUpdate();
            libro.setNumLibro(stmtLibro.getInt("1"));
            
            for (Autor autor : libro.getAutores()) {
                String sqlInsertAutor = "{CALL insertar_libro_autor(?,?)}";
                CallableStatement stmtAutor = con.prepareCall(sqlInsertAutor);
                stmtAutor.setInt("1", libro.getNumLibro());
                stmtAutor.setInt("2", autor.getCodAutor());
                stmtAutor.executeUpdate();
                
            }
            
        } catch (SQLException e) {
            con.rollback();
            throw new SQLException(e);
        }
        
        con.commit();
        con.close();

        return libro;
    }

}
