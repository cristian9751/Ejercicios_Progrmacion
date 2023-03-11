package UD4_EstructurasDatos.Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] alturas = new double[10];
        double suma = 0;
        for(int i = 0; i<alturas.length; i++) {
            System.out.print("Introduce altura " + (i + 1) + ": ");
            alturas[i] = in.nextDouble();
            suma+= alturas[i];
        }

        double media = suma / alturas.length;

        Arrays.sort(alturas);
        double min = alturas[0];
        double max = alturas[alturas.length -1];

        System.out.println("La media de todas las alturas es: " + media);
        System.out.println("La altura maxima es " + max);
        System.out.println("La altura minima es " + min);
        int cont_encima = 0;
        int cont_debajo = 0;

        for(int i = 0; i<alturas.length; i++) {
            if(alturas[i] > media) {
                cont_encima++;
            } else if(alturas[i] < media) {
                cont_debajo++;
            }
        }

        System.out.println("Hay " + cont_encima + " personas por encima de la media");
        System.out.println("Hay " + cont_debajo + " personas por debajo de la media");
    }
}
