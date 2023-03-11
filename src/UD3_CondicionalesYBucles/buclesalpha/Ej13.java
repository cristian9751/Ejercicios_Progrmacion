package UD3_CondicionalesYBucles.buclesalpha;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Ej13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Programa que muestra los pares entre dos numeros");
        System.out.print("Introduce el primer numero: ");
        int a = in.nextInt();
        System.out.print("Introduce el segundo numero");
        int b = in.nextInt();

        for(int i = a; i<= b; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
