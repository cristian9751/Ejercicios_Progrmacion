package UD3_CondicionalesYBucles.ejbuclesclase;

import java.util.Scanner;

public class EjF {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Programa que muestra la suma de los numeros desde un numero hasta otro numero");
        System.out.println("(unicamente suma los numeros que son mayores que 10)");
        System.out.print("Introduce el primer numero: ");
        int a = in.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int b = in.nextInt();

        int suma = 0;

        for(int i = a; i<= b; i++) {
            if(i > 10) {
                System.out.print(i);
                if( i != b)
                    System.out.print(" + ");

                suma += i;
            }
        }

        System.out.println(" = " + suma);

    }
}
