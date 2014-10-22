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
        protected JPopupMenu menu_contextual(final javax.swing.JPasswordField pass_field){
        JPopupMenu menu_contextual = new JPopupMenu();
        JMenuItem menu_item = new JMenuItem("Pegar");
        menu_item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               pass_field.setText(pegar());
            }
        }
        );
        menu_contextual.add(menu_item);
        return menu_contextual;
    }
    
    protected JPopupMenu menu_contextual(final javax.swing.JTextField text_field){
        JPopupMenu menu_contextual = new JPopupMenu();
        JMenuItem menu_item = new JMenuItem("Pegar");
        menu_item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               text_field.setText(pegar());
            }
        }
        );
        menu_contextual.add(menu_item);
        return menu_contextual;
    }
    
        private String pegar(){
        InterfazAccionesClipboard clipboard = new InterfazAccionesClipboard();
        return clipboard.paste_from_clipboard();
    }
}
