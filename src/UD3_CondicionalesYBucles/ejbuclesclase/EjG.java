package UD3_CondicionalesYBucles.ejbuclesclase;

import java.util.Scanner;

public class EjG {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Programa que muetra los numeros desde un numero hasta otro");
        System.out.println("(unicamente suma los numeros multiplos de 5)");
        System.out.print("Introduce el primer numero: ");
        int a = in.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int b = in.nextInt();
        int suma = 0;
        for(int i = a; i<= b; i++) {
            if(i % 5 == 0) {
                System.out.print(i);
                if(i != b)
                    System.out.print(" + ");
                suma += i;
            }
        }

        System.out.println(" = " + suma);
    }
}
