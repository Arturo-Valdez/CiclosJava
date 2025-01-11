import java.util.Scanner;

public class EjercicioAplicacionCajeroAutomatico {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Saldo inicial
        var saldo = 1000.0;

        //Deposito maximo
        final var LIMITE_MAXIMO = 5000;
        final var LIMITE_MINIMO = 100;

        //Bandera de ciclo entrada/salida
        var bandera = false;

        //Ciclo
        while (!bandera){

            //Titulo
            System.out.println("\n*** Aplicacion Cajero Automatico");

            //Menu
            System.out.print("""
                    Menu
                    \t1.Depostiar
                    \t2.Retirar
                    \t3.Consultar saldo
                    \t4.Salir
                    \nIngresa la operacion a realizar:\s""");

            //Captura de operacion a realizar
            var operacion = Integer.parseInt(consola.nextLine());

            //Validacion y ejecucion de la operacion solicitada
            switch (operacion){
                case 1 -> {
                    //DEPOSITO
                    System.out.print("¿Cuando desea depositar?: ");
                    var deposito = Double.parseDouble(consola.nextLine());
                    if (deposito <= LIMITE_MAXIMO && deposito >= LIMITE_MINIMO)
                        saldo += deposito;
                    else
                        System.out.println("El deposito solicitado no cuenta con el minimo ni maximo a depositar 'Maximo-> "
                                + LIMITE_MAXIMO + "' / 'Minimo -> " + LIMITE_MINIMO + "'");
                }
                case 2 -> {
                    //RETIRO
                    System.out.print("¿Cuando desea retirar?: ");
                    var retirar = Double.parseDouble(consola.nextLine());
                    if (retirar <= saldo && retirar >= LIMITE_MINIMO && retirar <= LIMITE_MAXIMO)
                        saldo -= retirar;
                    else if (retirar > saldo)
                        System.out.println("Saldo insuficiente");
                    else
                        System.out.println("El retiro solicitado no cuenta con el minimo ni maximo a retirar 'Maximo-> "
                                + LIMITE_MAXIMO + "' / 'Minimo -> " + LIMITE_MINIMO + "'");

                }
                //CONSULTA
                case 3 -> System.out.println("Tu saldo es: " + saldo);
                case 4 -> {
                    //BANDERA DE SALIDA
                    System.out.println("Saliendo del sistema...");
                    bandera = true;
                }
                //ERROR AL INGRESAR DATOS
                default -> System.out.println("Valor incorrecto, ingrese valores mostrados en menu del 1 al 4");

            }//fin switch
        }//fin while
    }//fin main
}//fin clase
