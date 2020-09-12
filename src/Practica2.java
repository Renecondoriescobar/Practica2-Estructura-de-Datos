import java.util.Scanner;

/***
 * PRACTICA 2 - ESTRUCTURA DE DATOS - RENE SEBASTIAN CONDORI ESCOBAR
 *
 */

public class Practica2 {
    //aqui definimos el vector
    int []numeros;

    Scanner scanner;

    //Este es el metodo constructor
    public Practica2(){
        numeros = new int[10];

        scanner = new Scanner(System.in);

    }

    //Este es el metodo ejecutar
    public void ejecutar(){
        //ingresando numeros (0-10)
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("notas [" + i + "]: ");
            int numero = scanner.nextInt();

            numeros[i]= numero;
        }


        int positivos = 0;
        int negativos = 0;


        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > 0) {
                positivos++;
            }

            if (numeros[i] < 0) {
                negativos++;
            }

        }
        System.out.println("Cantidad de numeros positivos insertados: " +positivos);
        System.out.println("Cantidad de numeros negativos insertados: " +negativos);

    }
}























