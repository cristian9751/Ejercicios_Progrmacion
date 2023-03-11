package UD3_CondicionalesYBucles.ejbuclesclase;

import java.util.Scanner;

//Muestra los numeros desde el A al B de 2 en 2

public class EjC {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int a = in.nextInt();
        System.out.print("Introduce el ultimo numero: ");
        int b = in.nextInt();

        System.out.println("La secuencia de numeros es la siguiente: ");

        for(int i = a; i<= b; i+= 2) {
            System.out.println(i);
        }

    }
}
