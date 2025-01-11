import java.util.Scanner;

public class EjercicioSistemaAdministracionCuentas {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        var bandera = false;

        //Ciclo repetitivo con bandera de ejecucion
        while (!bandera) {
            //Titulo
            System.out.println("\n*** Sistema de Administracion de cuentas ***");

            //Menu de opciones
            System.out.println("""
                    Menu:
                    \t1.Crear cuenta
                    \t2.Eliminar cuenta
                    \t3.Salir
                    """);

            //Obtencion de operacion
            System.out.print("Seleccione la operacion: ");
            var operacion = Integer.parseInt(consola.nextLine());

            //Validacion y ejecucion
            switch (operacion){
                case 1 -> System.out.println("Creando cuenta...");
                case 2 -> System.out.println("Eliminando cuenta...");
                case 3 -> {
                    System.out.println("Saliendo del sistema...");
                    bandera = true;
                }
                default -> System.out.println("Valor incorrecto, seleccione del menu del 1 al 3");

            }
        }
    }
}
