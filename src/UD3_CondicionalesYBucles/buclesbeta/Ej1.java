package UD3_CondicionalesYBucles.buclesbeta;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Programa que muestra la tabla de multiplicar del numero indicado");
        System.out.print("Introduce el numero");
        int num = in.nextInt();

        for(int i = 1; i<= 10; i++) {
            int mult = i * num;
            System.out.println(num + " * " + i + " = " + mult);
        }

    }
}
