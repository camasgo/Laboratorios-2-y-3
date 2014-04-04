/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenguajes.a80703.data;


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
public class BaseDataTest {

    public BaseDataTest() {
    }

    @Before
    public void setUp() {
        try {
            BaseData bd = new BaseData();
            bd.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDataTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @After
    public void tearDown() {
    }

    @Test
    public void hello() {
    }
}
