
package Conexiones;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cooper15
 */
public class Conexion {
    
    protected void conectar(){
        try {
             Class.forName("com.mysql.jdbc.Driver");
             java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Password", "root", "antares15"); 
        }
        catch (SQLException | ClassNotFoundException exception){
        }
  
    }
}
