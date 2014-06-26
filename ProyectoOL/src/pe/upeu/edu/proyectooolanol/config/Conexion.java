/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.upeu.edu.proyectooolanol.config;


/**
 *
 * @author alum.fial8
 */
public class Conexion {
    private static Connection connex = null;
    private static final String url="jdbc:mysql//localhost/bd_visitas";
    private static final String usuario="root";
    private static final String clave="root";
    
    public static Connection getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            if(connex == null){
                connex = DriverManager.getConection(url, usuario, clave);
            }else{
                connex = null;
            }
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.ShowMessageDialog(null, e);
        }
        return conex;
    }

}
