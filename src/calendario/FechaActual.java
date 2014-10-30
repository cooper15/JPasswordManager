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

import java.util.Calendar;

/**
 *
 * @author cooper15
 */
public class FechaActual {
       private final Calendar fecha = Calendar.getInstance();
       private final int diaMes = fecha.get(Calendar.DAY_OF_MONTH);
       private final int mesAnio = fecha.get(Calendar.MONTH) + 1;
       private final int anio = fecha.get(Calendar.YEAR);

    public Calendar getFecha() {
        return fecha;
    }

    public int getDiaMes() {
        return diaMes;
    }

    public int getMesAnio() {
        return mesAnio;
    }

    public int getAnio() {
        return anio;
    }

}
