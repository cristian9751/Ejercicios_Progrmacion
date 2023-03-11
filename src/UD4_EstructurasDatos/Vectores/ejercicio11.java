package UD4_EstructurasDatos.Vectores;

import java.util.Arrays;

public class ejercicio11 {

    public static void mostrar(int[] array) {
        for(int i = 0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] ascendente = new int[10];
        for(int i = 0; i<ascendente.length; i++) {
            ascendente[i] = i + 1;
        }


        System.out.println("Array ascendente: ");
        mostrar(ascendente);
        int o = 0;
        int[] descendente = new int[10];

        for(int i = ascendente.length -1; i >= 0; i--) {
            descendente[o] = ascendente[i];
            o++;
        } 

        System.out.println("Array descendente: ");
        mostrar(descendente);




    }
}
