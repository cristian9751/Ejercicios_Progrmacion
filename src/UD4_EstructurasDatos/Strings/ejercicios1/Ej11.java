package UD4_EstructurasDatos.Strings.ejercicios1;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cadena = in.nextLine();
        String[] creves = new String[cadena.length()];

        int espacio = cadena.lastIndexOf(" ");
        int max = cadena.length();

        while (espacio != -1) {
            String palabra = cadena.substring(espacio, max);
            max = espacio;
            espacio = cadena.lastIndexOf(" ", max);
            System.out.println(palabra) ;
        }
    }
}
