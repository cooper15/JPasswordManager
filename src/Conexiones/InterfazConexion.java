
package Conexiones;

import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author cooper15
 */
public class InterfazConexion {
    public void ingresarDatosUsuario(String datos){
        Conexion conexionDatos = new Conexion();
        conexionDatos.insertarUsuario(datos);
    }
    
    public String ObtieneDatosUsuario( String usuario, String password){
        String datos ="";
        
            Conexion conexionDatos = new Conexion();
            ResultSet Resultado = conexionDatos.obtieneUsuarioPass( usuario, password);
            try  {
                while(Resultado.next()){
                    datos += Resultado.getString(1) + Resultado.getString(2);
                }
            }
            catch(SQLException e){
            }
        return datos;
    }
}
