package UD4_EstructurasDatos.Strings.ejercicios1;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce una frase con dos palabras: ");
        String cadena = in.nextLine();
        int espacio = cadena.indexOf(" ");

        if(espacio == -1) {
            System.out.println("Debes de introducir dos palabras separadas por un espacio.");
            return;
        }

        System.out.println(cadena.substring(0, espacio));
        System.out.println(cadena.substring((espacio + 1), cadena.length()));


    }
}
