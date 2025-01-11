import java.util.Random;
import java.util.Scanner;

public class EjercicioJuegoAdiminanza {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        Random random = new Random();
        //Crear un valor a adivinar de 1 al 100
        var adiviname = random.nextInt(100)+ 1;


        System.out.println("*** Adivina mi numero ***");

        for(var i =1; i<=10;i++){
            System.out.print("\nDame un valor y adivina que numero soy (1 - 100): ");
            var respuesta = Integer.parseInt(consola.nextLine());

            if(adiviname == respuesta){
                System.out.println("FELICIDADES ES CORRECTO YO SOY " + adiviname + "!!!");
                System.out.println("Total de intentos: " + i);
                break;
            } else if (adiviname <= respuesta) {
                System.out.println("El valor ingresado es menor a mi, intenta denuevo!!");
            } else if (adiviname >= respuesta && i < 10) {
                System.out.println("El valor ingresado es mayor a mi, intenta denuevo!!");
            } else if (i == 10) {
                System.out.println("Que lastima no adivinaste, mi numero era: " + adiviname);
            }

        }

    }
}
