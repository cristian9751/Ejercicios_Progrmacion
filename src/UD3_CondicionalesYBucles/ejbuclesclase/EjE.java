package UD3_CondicionalesYBucles.ejbuclesclase;

import java.util.Scanner;

public class EjE {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int a = in.nextInt();
        System.out.print("Introduce el ultimo numero: ");
        int b = in.nextInt();

        int suma = 0;

        for(int i = a; i <= b; i++) {
            System.out.print(i);
            if( i != b)
                System.out.print(" + ");
                
            suma += i;
        }

        System.out.println(" = " + suma);
    }
}
