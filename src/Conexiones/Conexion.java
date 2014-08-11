
package Conexiones;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author cooper15
 */
public class Conexion {
    
    private java.sql.Connection conectar(){
        java.sql.Connection conexion;
        try {
             Class.forName("com.mysql.jdbc.Driver");
             conexion = DriverManager.getConnection("jdbc:mysql://localhost/Password", "root", "antares15"); 
             return conexion;
        }
        catch (SQLException | ClassNotFoundException exception){
            return null;
        }

    }
    
    protected void insertarUsuario( String datos){
        java.sql.Connection conexion= conectar();
        try {
            if (conexion != null){
               Statement estado = conexion.createStatement(); 
               estado.executeQuery ("Call agregarUsuario("+datos+")");
            }
           
        }
        catch(SQLException e){
        }
        
    }
    
    protected ResultSet obtieneUsuarioPass(String usuario, String password){
        java.sql.Connection conexion= conectar();
        ResultSet resultado = null;
        try {
            if (conexion != null){
                Statement estado = conexion.createStatement(); 
                resultado  = estado.executeQuery ( "Call obtiene_Usuario_pass("+ "'"+usuario+"'"+","+"'"+password+"'" +")"  );
            }
           
        }
        catch(SQLException e){
        }
        return resultado;
    }
    
    protected void insertarPassword(String datos){
        java.sql.Connection conexion= conectar();
        try {
            if (conexion != null){
                Statement estado = conexion.createStatement(); 
                 ResultSet rs = estado.executeQuery ("Call agregarPassword("+datos+")");
                
            }
           
        }
        catch(SQLException e){
        }
    
    }
    
       protected ResultSet obtienePass(String usuario){
        java.sql.Connection conexion= conectar();
        ResultSet resultado = null;
        try {
            if (conexion != null){
                Statement estado = conexion.createStatement(); 
                resultado  = estado.executeQuery ( "Call obtienePasswords("+ "'"+usuario+"'"+")"  );
            }
   
        }
        catch(SQLException e){
        }
        return resultado;
    }
    
}
