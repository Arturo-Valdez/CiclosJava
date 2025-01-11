import java.util.Scanner;

public class EjecicioCreacionValidacionPassword {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        var bandera = false;

        while (!bandera) {
            System.out.print("""
                    *** Validacion de Password ***
                    
                    Tu Password debe tener almenos 6 caracteres:
                    -Numeros
                    -Letras
                    -Mayusculas
                    -Minuscuas
                    -Caracteres
                    
                    Ingresa tu password:\s""");
            var password = consola.nextLine();

            if (password.length() >= 6) {
                System.out.println("El valor del password: " + password + " es valido!! :)");
                bandera = true;
            }
            else {
                System.out.println("Valor password: " + password + " es invalido, intenta nuevamente!");
            }
        }

    }
}
