package vistasForm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author minib
 */
public class conexion {

    private static Connection cnx = null;
    
    public static Connection obtener() throws SQLException, 

    ClassNotFoundException {
    if (cnx == null) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_final", "root", "2140");
    } 
 catch (Exception ex) {
    System.out.println(ex);
    }
    }
    return cnx;
   }
}
