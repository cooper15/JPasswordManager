/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.util.password.BasicPasswordEncryptor;
/**
 *
 * @author cooper15
 */
public class Cifrados {
    static final private String CLAVE_CIFRADO = "a%bc&fc345-#hi154%";
    protected String cifrado_password(String pass){
        StandardPBEStringEncryptor objeto_cifrado = new StandardPBEStringEncryptor();
        objeto_cifrado.setPassword(CLAVE_CIFRADO);
        return objeto_cifrado.encrypt(pass);
    }
    
    protected String descifrado_password(String txt){
        StandardPBEStringEncryptor objeto_descifrado = new StandardPBEStringEncryptor();
        objeto_descifrado.setPassword(CLAVE_CIFRADO);
        String retorno = "";
        try{
            retorno = objeto_descifrado.decrypt(txt);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    }
    
    protected String cifradoPassword(String Password){
        String contrasena = new String(Password);
        BasicPasswordEncryptor cifrador = new BasicPasswordEncryptor();
        contrasena = cifrador.encryptPassword(contrasena);
        return contrasena;
    }
    
    protected boolean coincidePassword(String passVerificar, String Password){
        BasicPasswordEncryptor verificador = new BasicPasswordEncryptor();
        return verificador.checkPassword(passVerificar, Password);
    }
}
