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
package seguridad;
import java.security.SecureRandom;
/**
 *
 * @author cooper15
 */
public class GenerarPasswordSeguro {
    String ALFABETO_MINUSCULA = "abcdefghijkmnlropqwvxyz";
    String ALFABETO_MAYUSCULA = ALFABETO_MINUSCULA.toUpperCase();
    String NUMEROS = "0123456789";
    public String generatePassword(int longitudPassword){
        String passwordSecure;
        passwordSecure = generar(longitudPassword);
        return passwordSecure;
    }
    private String generar(int longitudPassword){
        String passwordGenerando = "";
        SecureRandom aleatorio = new SecureRandom();
        int totalLetras = 0;
        do{
            switch(aleatorio.nextInt(3)){
                case 0:
                    passwordGenerando += ALFABETO_MINUSCULA.charAt(aleatorio.nextInt(23));
                    totalLetras ++;
                    break;
                case 1:
                    passwordGenerando += ALFABETO_MAYUSCULA.charAt(aleatorio.nextInt(23));
                    totalLetras ++;
                    break;
                case 2:
                    passwordGenerando += NUMEROS.charAt(aleatorio.nextInt(10));
                    totalLetras ++;
                    break;
            }
        }while(totalLetras < longitudPassword);
        return passwordGenerando;
    }
}
