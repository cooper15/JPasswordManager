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
package calendario;

import javax.swing.JTable;

/**
 *
 * @author cooper15
 */
public class CalculaVencimiento {
    /*Calcula el vencimiento de las contraseñas*/
     private boolean comparaFecha(int numFila, JTable jtPasswords){
        FechaActual  obtieneFechaV = new FechaActual();
        int diaMes = obtieneFechaV.getDiaMes();
        int mesAnio = obtieneFechaV.getMesAnio();
        int anio = obtieneFechaV.getAnio();
        String fechaActual = anio+"-"+mesAnio+"-"+diaMes;
        String fechaV = jtPasswords.getModel().getValueAt(numFila, 5).toString();
        String anioA = "";
        String anioV = "";
        String mesAnioA = "";
        String mesAnioV = "";
        String diaMesA = "";
        String diaMesV = "";
        for(int i = 0; i < 4; i++){
            anioA += fechaActual.charAt(i);
            anioV += fechaV.charAt(i);
        }
        for(int i = 5; i < 7; i++){
            mesAnioA += fechaActual.charAt(i);
            mesAnioV += fechaV.charAt(i);
        }
        for(int i = 8; i < 10; i++){
            diaMesA += fechaActual.charAt(i);
            diaMesV += fechaV.charAt(i);
        }
        int diaMesVe = Integer.parseInt(diaMesV);
        if(anioA.equals(anioV) && mesAnioA.equals(mesAnioV)){
            if(diaMesA.equals(diaMesV))
                return true;
            if(diaMes > diaMesVe)
                return true;
            
        }
        return false; // por defecto ninguna fecha está vencida.
    }
    public String CalculaFechaVencimiento(int cantidadFilas, JTable jtPasswords){
        String vencidas = "";
        for(int i = 0; i < cantidadFilas; i++){
            if (comparaFecha(i, jtPasswords))
                vencidas += "\n"+jtPasswords.getModel().getValueAt(i, 3);
        }
        return vencidas;
    }
}
