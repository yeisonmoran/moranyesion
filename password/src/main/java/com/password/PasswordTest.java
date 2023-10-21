import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class PasswordTest {
    Password mypassword;
    
    @Test
    public void testGetPasswordFromUser() {
        String password = "c$ontraseña";
        String confirmPassword = "c$ontraseña";
        try {
            mypassword.validatePassword(password, confirmPassword);
        } catch (Exception e) {
            // TODO: handle exception
            assertEquals("La contraseña debe contener al menos un carácter, una letra mayúscula, un número y un carácter especial.", e.getMessage());
        }
        
    }

    @Test
    public void validarEspaciosBlanco() {
        String password = "co traseña";
        String confirmPassword = "co traseña";
        try {
            mypassword.validatePassword(password, confirmPassword);
        } catch (Exception e) {
            // TODO: handle exception
            assertEquals("La contraseña no debe contener espacios en blanco.", e.getMessage());
        }
    
    }


    @Test 
    public void validarSItieneCaracteresMayusculasYnumeros() {
        String password = "contraseña";
        String confirmPassword = "contraseña";
        try {
            mypassword.validatePassword(password, confirmPassword);
        } catch (Exception e) {
            // TODO: handle exception
            assertEquals("Error en el tipo de caracteres","La contraseña debe contener al menos un carácter, una letra mayúscula, un número y un carácter especial.", e.getMessage());
        }
    
    }
     @Test 
    public void coincidirContraseñas() {
         String password = "Moran@88";
        String confirmPassword = "Moran@89";
        try {
            mypassword.validatePassword(password, confirmPassword);
        } catch (Exception e) {
            // TODO: handle exception
            assertEquals("Las contraseñas no coinciden.", e.getMessage());
    }
}
