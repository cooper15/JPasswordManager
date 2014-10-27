package seguridad;

/**
 *
 * @author cooper15
 */
public class SeguridadPassword {
    final private String password; // se pasa y no se modifica.
    private int cantidad_mayusculas;
    private int cantidad_minusculas;
    private int cantidad_numeros;
    private String abecedario[] = {"A", "B", "C","D", "F", "G","H", "I", "J",
                                   "K", "L", "M","N", "O","P", 
                                   "Q", "R","S", "T", "V",
                                   "W", "X", "Y", "Z"};
    public SeguridadPassword(String password){
        this.password = password;
    }
    
    public int password_segura(){
        int es_segura = 0;
        if(caracteres_mayuscula() && caracteres_minuscula()
           && caracteres_numerales())
            return es_segura;
        return -1;
    }
    
    private boolean tamanio(){
        if (password.length() <= 6)
            return false;
        return true;
    }
    
    private boolean caracteres_mayuscula(){
        for(int i = 0; i<abecedario.length; i++){
            if(password.contains(abecedario[i]))
                cantidad_mayusculas += 1; 
        } 
        if(cantidad_mayusculas > 0)
            return true;
        return false; // provisional
    }
    
    private boolean caracteres_minuscula(){
        for(int i = 0; i < abecedario.length; i++)
            abecedario[i] = abecedario[i].toLowerCase();
        for(int i = 0; i < abecedario.length; i++){
            if(password.contains(abecedario[i]))
                cantidad_minusculas += 1;
        }
        if(cantidad_minusculas > 0)
            return true;
        return false;    
    }
    
    private boolean caracteres_numerales(){
       String numeros[] = {"0","1", "2", "3",
                            "4", "5", "6", "7",
                            "8", "9"};
       for(int i = 0; i < numeros.length; i++){
           if(password.contains(numeros[i]))
               cantidad_numeros += 1;
       }
       if(cantidad_numeros > 0)
           return true;
       return false;
    }
}