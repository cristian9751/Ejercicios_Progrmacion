package UD4_EstructurasDatos.Vectores;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        for(int i = 0; i<20; i++) {
            System.out.print("Introduce el numero " + i + " : ");
            numeros[i] = new Scanner(System.in).nextInt();
        }

        int max = 0;
        int min = 1;

        for(int i = 0; i<20; i++) {
            if(numeros[i] > max) {
                max = numeros[i];
            }

            if(numeros[i] < min) {
                min = numeros[i];
            }
        }

        System.out.println("Minimo: " + min);
        System.out.println("Maximo: " + max);
    }
}
