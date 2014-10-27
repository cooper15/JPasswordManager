
package conexiones;

import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author cooper15
 */
public class InterfazConexion {
    String password;
    
    public String getpassword(){
        return password;
    }
    
    public void ingresarDatosUsuario(String datos){
        Conexion conexionDatos = new Conexion();
        conexionDatos.insertarUsuario(datos);
    }
    
    public String ObtieneDatosUsuario(String usuario){
        String datos = "";  
        Conexion conexionDatos = new Conexion();
        ResultSet Resultado = conexionDatos.obtieneUsuarioPass(usuario);
        try{
            while(Resultado.next()){
                datos = Resultado.getString(1);
                this.password = Resultado.getString(2);
            }
        }
        catch(SQLException e){
        }
        return datos;
    }
        
    public void ingresaPassword(String datos){
        Conexion conexionDatos = new Conexion();
        conexionDatos.insertarPassword(datos);
    }
    
    public void actualizaPassword(int id, String datos){
        Conexion conexionDatos = new Conexion();
        conexionDatos.actualizarPassword(id, datos);
    }
    
    public ResultSet ObtieneDatosPassword(String usuario){
        ResultSet resultado = null;
        Conexion nuevaConexion = new Conexion();
        resultado = nuevaConexion.obtienePass(usuario);
        return resultado;
    }
    
    public void eliminar_password(String id){
        Conexion nueva_conexion = new Conexion();
        nueva_conexion.elinina_password(id);
    }
}
    