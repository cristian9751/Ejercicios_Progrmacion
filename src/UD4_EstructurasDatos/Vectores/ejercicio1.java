package UD4_EstructurasDatos.Vectores;

import java.util.Scanner;

public class ejercicio1 {
    /* Crear un programa que pida diez numeros reales, los almacene en un array 
    y luego muestre todos sus valores
     */

    public static void main(String[] args) {
        boolean introducir = true;
        int[] numeros = new int[10];
        int suma = 0;

            for(int o = 1; o<= 2; o++) {
                if(o == 2) {
                    introducir = false;
                }
                for(int i = 0; i<10; i++) {
                    if(introducir) {
                        System.out.print("Introduce el numero " + i + " : ");
                        numeros[i] = new Scanner(System.in).nextInt();
                    } else {
                        suma += numeros[i];
                    }
            }
        }

        System.out.println("La suma total de los numeros es " + suma);
        
    }

}
