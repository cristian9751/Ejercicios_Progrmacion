package UD4_EstructurasDatos.Vectores;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] secuencia = new int[100];
        System.out.println("Introduce el primer numero: ");
        int v = in.nextInt();
        System.out.println("Introduce el valor del incremento: ");
        int incremento = in.nextInt();

        for(int i = 0; i<secuencia.length; i++) {
            secuencia[i] = v;
            v+= incremento;
            System.out.println(secuencia[i]);
        }
    }
}
