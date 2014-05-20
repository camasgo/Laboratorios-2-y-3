/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenguajes.a80703.data;

import com.lenguajes.a80703.dominio.Autor;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class AutorData extends BaseData {

    public AutorData() {
    }

    public LinkedList<Autor> getAutores() throws SQLException {
        String sqlSelect = "SELECT cod_autor, nombre_autor, apellidos_autor"
                + " FROM Autor "
                + " ORDER BY apellidos_autor";
        Connection con = this.getConnection();
        PreparedStatement stmt = con.prepareStatement(sqlSelect);
        ResultSet resultSet = stmt.executeQuery();
        LinkedList<Autor> autores = new LinkedList<Autor>();

        while (resultSet.next()) {
            Autor autor = new Autor();
            autor.setCodAutor(resultSet.getInt("cod_autor"));
            autor.setNombreAutor(resultSet.getString("nombre_autor"));
            autor.setApellidosAutor(resultSet.getString("apellidos_autor"));

            autores.add(autor);
        }
        con.close();

        return autores;
    }

    public LinkedList<Autor> getAutores(String apellidos) throws SQLException {
        String sqlSelect = "SELECT cod_autor, nombre_autor, apellidos_autor"
                + " FROM Autor "
                + " WHERE apellidos_autor LIKE '" + apellidos + "%'";
        Connection con = this.getConnection();
        PreparedStatement stmt = con.prepareStatement(sqlSelect);
        ResultSet resultSet = stmt.executeQuery();
        LinkedList<Autor> autores = new LinkedList<Autor>();

        while (resultSet.next()) {
            Autor autor = new Autor();
            autor.setCodAutor(resultSet.getInt("cod_autor"));
            autor.setNombreAutor(resultSet.getString("nombre_autor"));
            autor.setApellidosAutor(resultSet.getString("apellidos_autor"));

            autores.add(autor);
        }
        con.close();

        return autores;
    }

    public Autor getAutor(int codAutor) throws SQLException {
        String sqlSelect = "SELECT *"
                + " FROM Autor"
                + " WHERE cod_autor =?";
        Connection con = this.getConnection();
        PreparedStatement stmt = con.prepareStatement(sqlSelect);
        stmt.setInt(1, codAutor);
        ResultSet rs = stmt.executeQuery();
        Autor autor = new Autor();
        if (rs.next()) {
            autor.setCodAutor(rs.getInt("cod_autor"));
            autor.setNombreAutor(rs.getString("nombre_autor"));
            autor.setApellidosAutor(rs.getString("apellidos_autor"));
        }

        con.close();
        return autor;
    }

    public void editarAutor(Autor autor) throws SQLException {
        String sqlUpdate = "{CALL sp_editar_autor(?,?,?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlUpdate);
        stmt.setInt(1, autor.getCodAutor());
        stmt.setString(2, autor.getNombreAutor());
        stmt.setString(3, autor.getApellidosAutor());

        stmt.executeUpdate();
        con.close();
    }

    public void eliminarAutor(int codAutor) throws SQLException {
        String sqlDelete = "{CALL sp_eliminar_autor(?)}";
        Connection con = this.getConnection();
        CallableStatement stmtDelete = con.prepareCall(sqlDelete);
        stmtDelete.setInt(1, codAutor);
        stmtDelete.executeUpdate();
        con.close();
    }

}
