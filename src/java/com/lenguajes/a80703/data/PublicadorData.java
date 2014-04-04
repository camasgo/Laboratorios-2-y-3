/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lenguajes.a80703.data;

import com.lenguajes.a80703.dominio.Publicador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class PublicadorData extends BaseData{

    public PublicadorData() {
    }
    
    public LinkedList<Publicador> getPublicadores() throws SQLException{
        
        String sqlSelect = "SELECT cod_publicador, nombre_publicador, url_sitio_web, telefono"
                                + " FROM Publicador"
                                + " ORDER BY nombre_publicador";          
        Connection con = this.getConnection();
        PreparedStatement stmtSelect = con.prepareCall(sqlSelect);
        ResultSet resultSet = stmtSelect.executeQuery();
        
        LinkedList<Publicador> publicadores = new LinkedList<Publicador>();
        
        while(resultSet.next()){
            Publicador publicador = new Publicador();
            publicador.setCodPublicador(resultSet.getInt("cod_publicador"));
            publicador.setNombrePublicador(resultSet.getString("nombre_publicador"));
            publicador.setUrlSitioWeb(resultSet.getString("url_sitio_web"));
            publicador.setTelefono(resultSet.getString("telefono"));
            publicadores.add(publicador);
            
        }
        
        con.close();
        
        return publicadores;
        
    }
    
}
