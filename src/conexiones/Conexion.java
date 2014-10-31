
package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author cooper15
 */
public class Conexion {

    public Connection getConexion() {
        return conexion;
    }
    private java.sql.Connection conexion;
    private java.sql.Connection conectar(){
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
        java.sql.Connection conectar= conectar();
        try {
            if (conectar != null){
               Statement estado = conectar.createStatement(); 
               estado.executeQuery ("Call agregarUsuario("+datos+")");
               estado.close();
            }
        }
        catch(SQLException e){
        }
        
    }
    
    protected ResultSet obtieneUsuarioPass(String usuario){
        java.sql.Connection conectar= conectar();
        ResultSet resultado = null;
        try {
            if (conectar != null){
                Statement estado = conectar.createStatement(); 
                resultado  = estado.executeQuery ( "Call obtiene_Usuario_Password("+ "'"+usuario+"'" +")");      
            }
           
        }
        catch(SQLException e){
        }
        return resultado;
    }
    
    protected void insertarPassword(String datos){
        java.sql.Connection conectar= conectar();
        try {
            if (conectar != null){
                Statement estado = conectar.createStatement(); 
                estado.executeQuery ("Call agregarPassword("+datos+")");
                
            }
           
        }
        catch(SQLException e){
        }
    }
    
       protected void actualizarPassword(int id, String datos){
        java.sql.Connection conectar= conectar();
        try {
            if (conectar != null){
                Statement estado = conectar.createStatement(); 
                estado.executeQuery ("Call actualizarPassword("+"'"+id+"'"+","+datos+")");
            }   
        }
        catch(SQLException e){
        }
    }
    
       protected ResultSet obtienePass(String usuario){
        java.sql.Connection conectar= conectar();
        ResultSet resultado = null;
        try {
            if (conectar != null){
                Statement estado = conectar.createStatement(); 
                resultado  = estado.executeQuery ( "Call obtienePasswords("+ "'"+usuario+"'"+")"  );
            }
   
        }
        catch(SQLException e){
        }
        return resultado;
    }
       
       protected void elinina_password(String id){
          java.sql.Connection conectar = conectar();
           try{
              if(conectar != null){
                  Statement estado = conectar.createStatement();
                  estado.executeQuery("call eliminarPassword("+"'"+id+"'"+")");
              }   
          }
          catch(SQLException e){
          }
       }
}