/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 *
 * @author cooper15
 */
public class Cifrados {
     
    protected String cifrado_password(String pass){
        StandardPBEStringEncryptor objeto_cifrado = new StandardPBEStringEncryptor();
        objeto_cifrado.setPassword("123");
        return objeto_cifrado.encrypt(pass);
    }
    
    protected String descifrado_password(String txt){
        StandardPBEStringEncryptor objeto_descifrado = new StandardPBEStringEncryptor();
        objeto_descifrado.setPassword("123");
        String retorno = "";
        try{
            retorno = objeto_descifrado.decrypt(txt);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    }
       
}
