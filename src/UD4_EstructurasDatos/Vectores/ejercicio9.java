package UD4_EstructurasDatos.Vectores;

import java.util.Random;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        int[] numeros = new int[100];
        for(int i = 0; i<numeros.length; i++) {
            numeros[i]= ran.nextInt(1, 10);
        }

        System.out.print("Introduce el valor a buscar: ");
        int n = in.nextInt();
        int pos = 0;
        boolean found = false;
        while(pos < numeros.length) {
            if(numeros[pos] == n ) {
                System.out.println(n + " encontrado en la posicion " + pos);
                found = true;
            }
            pos++;
        }

        if(!found) {
            System.out.println("No se ha podido encontrar " + n);
        }
    }
}
