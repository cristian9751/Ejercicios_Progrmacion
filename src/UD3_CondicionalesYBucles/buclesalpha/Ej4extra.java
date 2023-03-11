package UD3_CondicionalesYBucles.buclesalpha;

import java.util.Scanner;

public class Ej4extra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero menor: ");
        int menor = in.nextInt();
        System.out.println("Introduce el numero mayor: ");
        int mayor = in.nextInt();
        while(mayor < menor) {
            for(int i = 1; i<= 3; i++) {
                System.out.println("Debes introducir un numero mayor a " + menor);
                mayor = in.nextInt();
            }
            System.out.println("Demasiados intentos fallidos");
            return;
        }

        for(int i = mayor; i>= menor; i--) {
            System.out.println(i);
        }
    }
}
