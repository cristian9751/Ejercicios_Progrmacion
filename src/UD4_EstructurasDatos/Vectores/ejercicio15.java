package UD4_EstructurasDatos.Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Tamaño del array: ");
        int n = in.nextInt();
        System.out.print("Contenido del array: ");
        int m = in.nextInt();
        int[] arr = new int[n];
        Arrays.fill(arr, m);

        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
}
