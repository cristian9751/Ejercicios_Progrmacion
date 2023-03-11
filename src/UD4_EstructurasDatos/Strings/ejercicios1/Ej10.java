package UD4_EstructurasDatos.Strings.ejercicios1;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Introduce una frase: ");

        String cadena = in.nextLine().concat(" ");
        int espacio = cadena.indexOf(" ");
        int min = 0;

        while(espacio != -1) {
            System.out.println(cadena.substring(min, espacio));
            min = espacio + 1;
            espacio = cadena.indexOf(" " , min);
        }
    }
}
