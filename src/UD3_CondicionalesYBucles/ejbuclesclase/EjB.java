package UD3_CondicionalesYBucles.ejbuclesclase;

import java.util.Scanner;

public class EjB {
    public static void name(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int a = in.nextInt();
        System.out.print("Introduce el ultimo numero: ");
        int b = in.nextInt();
        System.out.println("La secuencia de numeros es la siguiente: ");
        for(int i = a; i <= b; i++) {
            System.out.println(i);
        }

    }
}
