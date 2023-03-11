package UD3_CondicionalesYBucles.ejbuclesclase;

import java.util.Scanner;

public class EjI {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Muestra la multiplicacion desde un numero hasta otro numero");
        System.out.print("Introduce el primer numero: ");
        int a = in.nextInt();
        System.out.print("Introduce el ultimo numero: ");
        int b = in.nextInt();
        int mult = 1;
        for(int i = a; i<= b; i++) {
            System.out.print(i);
            if(i != b)
                System.out.print(" * ");
            mult *= i;
        }

        System.out.println(" = " + mult);
    }
}
