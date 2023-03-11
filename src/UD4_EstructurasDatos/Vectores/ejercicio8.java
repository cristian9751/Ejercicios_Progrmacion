package UD4_EstructurasDatos.Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] numeros = new double[100];
        Arrays.fill(numeros, Math.random() * (1.0 - 0.0 + 1));
        System.out.print("Introduce un numero entre 0.0 y 1.0: ");
        double r = in.nextDouble();
        int cont = 0;

        for(int i = 0; i<numeros.length; i++) {
            if(numeros[i] >= r )
                cont++;

            System.out.println(numeros[i]);
        }

        System.out.println(cont + " numeros han sido mayor o iguales que " + r);
    }
}
