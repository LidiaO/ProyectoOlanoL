/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.upeu.edu.proyectooolanol.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author alum.fial8
 */
public class Conexion {
    private static Connection connex = null;
    private static String url="jdbc:mysql//localhost/bd_visitas";
    private static String usuario="root";
    private static String password="root";
    
    public static Connection getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            if(connex == null){
                connex = DriverManager.getConection(url, usuario, clave);
            }else{
                connex = null;
            }
        }
    }
        return null;
}
