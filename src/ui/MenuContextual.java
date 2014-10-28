/*
 * Copyright (C) 2014 cooper15
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import utilidades.InterfazAccionesClipboard;

/**
 *
 * @author cooper15
 */
public class MenuContextual {
        protected JPopupMenu menuContextual(final javax.swing.JPasswordField passField){
        JPopupMenu menuContextual = new JPopupMenu();
        JMenuItem menu_item = new JMenuItem("Pegar");
        menu_item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               passField.setText(pegar());
            }
        }
        );
        menuContextual.add(menu_item);
        return menuContextual;
    }
    
    protected JPopupMenu menuContextual(final javax.swing.JTextField textField){
        JPopupMenu menuContextual = new JPopupMenu();
        JMenuItem pegar = new JMenuItem("Pegar");
        pegar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               textField.setText(pegar());
            }
        }
        );
        JMenuItem copiar = new JMenuItem("Copiar");
        copiar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                copiar(textField.getText());
            }
        });
        menuContextual.add(copiar);
        menuContextual.add(pegar);
        return menuContextual;
    }
    
        private void copiar(String password){
            InterfazAccionesClipboard copiar = new InterfazAccionesClipboard();
            copiar.copy_to_clipboard(password);
        }
        
        private String pegar(){
        InterfazAccionesClipboard clipboard = new InterfazAccionesClipboard();
        return clipboard.paste_from_clipboard();
    }
}
