/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

/**
 *
 * @author oscar
 */
public class Utils {
    /**
     * @pre --
     * @post diu si s'ha pogut realitzar la connexió amb la B.D.
     */
    public static boolean provarConnexioBD(String host, String port, String bd){
        boolean connexioOK = false;
        try(Connection c = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+bd)){
            connexioOK = true;
        }
        catch(SQLException sqle){
            sqle.printStackTrace();
        }
        return connexioOK;
    }
}
