package UD4_EstructurasDatos.Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio17 {
    public static void agregar(int[] sec) {
        for(int i = 0; i<sec.length; i++) {
            System.out.println("Introduce un numero: ");
            sec[i] = new Scanner(System.in).nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] primero = new int[10];
        int[] segundo = new int[10];

        agregar(primero);
        agregar(segundo);


        if(Arrays.equals(primero, segundo)) {
            System.out.println("Los dos arrays son igules");
        } else {
            System.out.println("Los dos arrays no son iguales");
        }

    }
}
