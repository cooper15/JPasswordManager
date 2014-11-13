
package conexiones;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;



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
        cierraConexion(conexionDatos);
    }

    private void cierraConexion(Conexion conexionDatos) {
        /*Cierra las conexiones abiertas con la base de datos*/
        try{
            conexionDatos.getConexion().close();
        }
        catch(SQLException e){
            e.getSQLState();
        } 
    }
    
    public String ObtieneDatosUsuario(String usuario){
        /*Obtiene nombre y contraseña para ser comparadas en login*/
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
        cierraConexion(conexionDatos);
        return datos;
    }
    
    public void llenaTabla(DefaultTableModel modeloTabla, String nombreUsuario){
        ResultSet resultado = ObtieneDatosPassword(nombreUsuario);
        String nombreColumnas [] = {"id", "Usuario", "Contraseña", "Nombre sitio", "URL sitio","Vencimiento"};
        for (int i=0; i<=5; i++)
            modeloTabla.addColumn(nombreColumnas[i]);
        try{
            // coloca los campos obtenidos con el resultset dentro de la tabla. 
            while(resultado.next()){
                 Object[] fila = new Object[6];
                 for (int i = 0; i < 6; i++) 
                    fila[i]=resultado.getObject(i+1);
            modeloTabla.addRow(fila);
            }
        }
        catch(Exception e){
        }
    }
        
    public void ingresaPassword(String datos){
        Conexion conexionDatos = new Conexion();
        conexionDatos.insertarPassword(datos);
        cierraConexion(conexionDatos);
    }
    
    public void actualizaPassword(int id, String datos){
        Conexion conexionDatos = new Conexion();
        conexionDatos.actualizarPassword(id, datos);
        cierraConexion(conexionDatos);
    }
    
    public ResultSet ObtieneDatosPassword(String usuario){
        /*Este metodo obtiene los datos para llenar la tabla*/
        ResultSet resultado;
        Conexion nuevaConexion = new Conexion();
        resultado = nuevaConexion.obtienePass(usuario);
        return resultado;
    }
    
    public void eliminar_password(String id){
        Conexion nuevaConexion = new Conexion();
        nuevaConexion.elinina_password(id);
        cierraConexion(nuevaConexion);
    }
}
    