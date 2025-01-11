import java.util.Scanner;

public class EjercicioCalculadora {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        var bandera = false;


        while (!bandera){
            System.out.print("""
                    \n*** CALCULADORA ***
                    
                    Menu
                    1.Suma
                    2.Resta
                    3.Multiplicacion
                    4.Divicion
                    5.Salir
                    
                    Elija una operacion a realizar:\s""");

            var operacion = Integer.parseInt(consola.nextLine());

            if(operacion >= 1  && operacion <= 4 ) {
                System.out.print("Ingresa el primer valor: ");
                var valor1 = Double.parseDouble(consola.nextLine());

                System.out.print("Ingresa el segundo valor: ");
                var valor2 = Double.parseDouble(consola.nextLine());

                switch (operacion) {
                    case 1 -> {
                        var suma = valor1 + valor2;
                        System.out.println(valor1 + " + " + valor2 + " = " + suma);
                    }
                    case 2 -> {
                        var resta = valor1 - valor2;
                        System.out.println(valor1 + " - " + valor2 + " = " + resta);
                    }
                    case 3 -> {
                        var multiplicacion = valor1 * valor2;
                        System.out.println(valor1 + " x " + valor2 + " = " + multiplicacion);
                    }
                    case 4 -> {
                        if (valor2 == 0 || valor1 == 0)
                            System.out.println("Ninguno de los dos valores de divicion debe ser igual a '0'");
                        else {
                            var divicion = valor1 / valor2;
                            System.out.println(valor1 + " / " + valor2 + " = " + divicion);
                        }
                    }
                    default -> System.out.println("Valor ingresado incorrecto");
                }
            }else if(operacion == 5){
                System.out.println("Saliendo del sistema...");
                bandera = true;
            } else {
                System.out.println("Opción invalida, selecciona otra operacion");
            }
        }
    }
}
