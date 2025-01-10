public class EjercicioAcumoladorSuma {
    public static void main(String[] args) {
        System.out.println("*** Acumolador Suma ***");

        final var MAXIMO = 5;
        var contar = 0;
        var contador = 1;
        while (contador <= MAXIMO){
            contar = contar + contador;
            contador++;
        }
        System.out.println("Suma de los primeros "+MAXIMO + " numeros es igual a: "+ contar);
    }
}
