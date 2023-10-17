import java.util.Scanner;


public class Password {

    public static void main(String[] args) {
   
        try (Scanner scanner = new Scanner(System.in)) {
            
            String password = getPasswordFromUser(scanner);
            String confirmPassword = getPasswordFromUser(scanner);

            validatePassword(password, confirmPassword);
            System.out.println("La contraseña es válida y confirmada correctamente.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String getPasswordFromUser(Scanner scanner) {
        System.out.print("Ingrese su contraseña: ");
        return scanner.nextLine();
    }

    public static void validatePassword(String password, String confirmPassword) throws Exception {
        if (password.length() < 8) {
            throw new Exception("La contraseña debe tener al menos 8 caracteres.");
        }

        if (password.contains(" ")) {
            throw new Exception("La contraseña no debe contener espacios en blanco.");
        }

        if (!password.matches(".*[a-z].*") || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*") || !password.matches(".*[@#$%^&+=].*")) {
            throw new Exception("La contraseña debe contener al menos un carácter, una letra mayúscula, un número y un carácter especial.");
        }

        if (!password.equals(confirmPassword)) {
            throw new Exception("Las contraseñas no coinciden.");
        }
    }
}
    
    

