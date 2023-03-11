package UD3_CondicionalesYBucles.buclesalpha;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Programa que muestra los numeros enteros de mayor a menor desde un numero determinado");
        System.out.println(" hasta otro");
        System.out.print("Introduce el numero mayor: ");
        int mayor = in.nextInt();
        System.out.print("Introduce el numero menor: ");
        int menor = in.nextInt();

        while(menor > mayor) {
            for(int i = 1; i<= 3; i++) {
                System.out.print("Debes introducir un numero menor a " + mayor + ": ");
                menor = in.nextInt();
            }
            System.out.println("Demasiados intentos fallidos");
            return;
        }

        for(int i = mayor; i>= menor; i-= 2) {
            System.out.println(i);
        }

    }
}
