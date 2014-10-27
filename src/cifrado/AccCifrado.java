/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado;

/**
 *
 * @author cooper15
 */
public class AccCifrado {
   
    public String cifrar_password(String clave){
        Cifrados nuevo_cifrado = new Cifrados();
        clave = nuevo_cifrado.cifrado_password(clave);
        return clave;
    }
    
    public String descifrar_password(String clave){
        Cifrados nuevo_descifrado = new Cifrados();
        clave = nuevo_descifrado.descifrado_password(clave);
        return clave;
    }
    
    public String cifrarPassword(String clave){
        Cifrados nuevoCifrado = new Cifrados();
        clave = nuevoCifrado.cifradoPassword(clave);
        return clave;
    }
    
    public boolean coincidePassword(String claveVerificar, String clave){
        Cifrados nuevoDescifrado = new Cifrados();
        return nuevoDescifrado.coincidePassword(claveVerificar, clave);
    }
}
