package UD3_CondicionalesYBucles.ejbuclesclase;

import java.util.Scanner;

public class EjK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Programa que suma un determinado numero de precios");
        System.out.print("Introduce la cantidad de precios que se van a sumar: ");
        int x = in.nextInt();
        float suma = 0;
        for(int i = 1; i<= x; i++) {
            System.out.print("Introduce el precio nº " + i + ": ");
            float precio = in.nextFloat();
            suma += precio;
        }

        System.out.println("La suma total de los precios indicados es de: " + suma + " € ");
    }
}
