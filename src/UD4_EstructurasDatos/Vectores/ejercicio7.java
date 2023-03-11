package UD4_EstructurasDatos.Vectores;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p, q;
        while(true) {
            System.out.print("¿Desde que numero?: ");
            p = in.nextInt();
            System.out.print("¿Hasta que numero?: ");
            q = in.nextInt();
            if(q < p) {
                System.out.println("El segundo numero debe de ser mayor que el primero.");
                continue;
            }
            break;
        }

        int[] numeros = new int[(q - p) + 1];

        for(int i = 0; i<numeros.length; i++) {
            numeros[i] = p + i;
            System.out.println("Numero " + i + " = " + numeros[i]);
        }
        



    }
}
