package UD4_EstructurasDatos.Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        int[] sec = new int[55];
        int pos_inicial = 0;
        int pos_final = 0;
        for(int i = 1; i<= 10; i++) {
            pos_final = pos_inicial + i;
            Arrays.fill(sec, pos_inicial, pos_final, i);
            pos_inicial = pos_final;
        }

        for(int i = 0; i<sec.length; i++) {
            System.out.println(sec[i]);
        }
    }
}
