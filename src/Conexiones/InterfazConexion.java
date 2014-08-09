
package Conexiones;

/**
 *
 * @author cooper15
 */
public class InterfazConexion {
    public void ingresarDatosUsuario(String datos){
        Conexion conexionDatos = new Conexion();
        conexionDatos.insertarUsuario(datos);
    }
}
