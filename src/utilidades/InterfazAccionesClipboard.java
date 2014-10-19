/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author cooper15
 */
public class InterfazAccionesClipboard {
    public void copy_to_clipboard(String password_copiada){
        AccionesClipboard acciones = new AccionesClipboard();
        acciones.copy_to_clipboard(password_copiada);
    }
}
