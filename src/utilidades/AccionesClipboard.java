/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 *
 * @author cooper15
 */
public class AccionesClipboard {
    protected void copy_to_clipboard(String password_copiada){
          Toolkit utilidades = Toolkit.getDefaultToolkit();
        Clipboard portapapeles = utilidades.getSystemClipboard();
        StringSelection cadena_a_tran = new StringSelection(password_copiada);
        portapapeles.setContents(cadena_a_tran, null);
    }
}
