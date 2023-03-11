package UD4_EstructurasDatos.Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] ratings = new int[8];

        for(int i = 0; i < ratings.length; i++) {
            System.out.print("Introduce el numero " + i + " : ");
            ratings[i] = in.nextInt();
        }
        Arrays.sort(ratings);

        System.out.println("Ordenado: ");
        for(int i = ratings.length -1; i >= 0; i--) {
            System.out.println(ratings[i]);
        }
    }
}
