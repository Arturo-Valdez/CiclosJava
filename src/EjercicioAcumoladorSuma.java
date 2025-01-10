public class EjercicioAcumoladorSuma {
    public static void main(String[] args) {
        System.out.println("*** Acumolador Suma ***");

        //Maximo a contar
        final var MAXIMO = 5;
        //Contador
        var acumuladorSuma = 0;
        //Acumulador de suma
        var contador = 1;

        while (contador <= MAXIMO) {
            System.out.println("acumuladorSuma + contador -> " + acumuladorSuma + " + " + contador);

            //Se realiza acumulacion
            acumuladorSuma += contador++;

            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");

        }
        //Se imprime la acumulacion de suma
        System.out.println("Suma de los primeros "+MAXIMO + " numeros es igual a: "+ acumuladorSuma);
    }
}
