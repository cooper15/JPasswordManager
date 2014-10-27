package seguridad;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author cooper15
 */
public class SeguridadPasswordRegEx {
    final String password;
    final String MAYUSCULA_REGEX = ".*[A-Z].*";
    final String MINUSCULA_REGEX = ".*[a-z].*";
    final String NUMEROS_REGEX = ".*[1-9].*";
    
    
    public SeguridadPasswordRegEx(String Password){
        this.password = Password;
    }
    
    public int esSegura(){
        int segura = -1; // insegura
        if(caracteresMayuscula() && caracteresMinuscula() 
                && caracteresNumerales() && longitud())
            return 0;
        return segura;
    }
    
    private boolean caracteresMayuscula(){
       return(comparador(MAYUSCULA_REGEX));
    }
    
    private boolean caracteresMinuscula(){
        return comparador(MINUSCULA_REGEX);
    }
    
    private boolean caracteresNumerales(){
        return comparador(NUMEROS_REGEX);
    }
    
    private boolean longitud(){
        return this.password.length() > 6;
    }
    
    private boolean comparador(String caracteres){
        Pattern patron = Pattern.compile(caracteres);
        Matcher comparador = patron.matcher(password);
        return comparador.matches();
    }
}