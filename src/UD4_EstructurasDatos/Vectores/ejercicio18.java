package UD4_EstructurasDatos.Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int prueba = (10 - 1 + 1) + 1;
        System.out.println(prueba);
        double[] numeros = new double[30];
        Arrays.fill(numeros, Math.random() * 10);
        Arrays.sort(numeros);

        String nums = Arrays.toString(numeros);
        System.out.println(nums);
    }
}
