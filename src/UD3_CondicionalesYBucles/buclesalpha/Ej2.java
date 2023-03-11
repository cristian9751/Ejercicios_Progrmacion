package UD3_CondicionalesYBucles.buclesalpha;

import java.util.Scanner;

public class Ej2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Programa que muestra los numeros enteros desde un numero hasta otro numero");
        System.out.print("Introduce el primer numero: ");
        int a = in.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int b = in.nextInt();

        for(int i = a; i<= b; i++) {
            System.out.println(i);
        }
    }
}
