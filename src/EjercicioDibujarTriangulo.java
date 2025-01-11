import java.util.Scanner;

public class EjercicioDibujarTriangulo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("** Dibuja un triangulo ***");
        System.out.print("Proporciona el numero de filas: ");
        var numeroFilas = consola.nextInt();

        for (var i = 1; i <= numeroFilas; i++){
            var espacio = " ".repeat(numeroFilas-i);
            var estrella = "*".repeat(i*2-1);
            System.out.println(espacio+estrella);
        }
    }
}
