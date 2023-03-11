package UD4_EstructurasDatos.Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("¿Cuantas veces? :");
        int n = in.nextInt();
        System.out.print("¿Que numero?");
        int m = in.nextInt();
        int[] arr = new int[n];
        Arrays.fill(arr, m);

        for(int i = 0; i<n; i++) {
            System.out.println("Pos " + i + " = " + arr[i] );
        }
    }
}
