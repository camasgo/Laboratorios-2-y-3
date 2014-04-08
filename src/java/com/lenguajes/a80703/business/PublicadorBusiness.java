/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lenguajes.a80703.business;

import com.lenguajes.a80703.data.PublicadorData;
import com.lenguajes.a80703.dominio.Publicador;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class PublicadorBusiness {
    
    PublicadorData publicadorData;

    public PublicadorBusiness() {
        publicadorData = new PublicadorData();
    }
    
     public LinkedList<Publicador> getPublicadores() throws SQLException{
         return publicadorData.getPublicadores();
     }
    
}
