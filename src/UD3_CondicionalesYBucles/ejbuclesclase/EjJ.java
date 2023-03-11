package UD3_CondicionalesYBucles.ejbuclesclase;

import java.util.Scanner;

public class EjJ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float suma = 0;
        System.out.println("Programa que muestra la suma de cinco precios");
        for(int i = 1; i<= 5; i++) {
            System.out.print("Introduce el precio nº "+ i + ": ");
            float precio = in.nextFloat();
            suma += precio;
        }

        System.out.println("La suma total de los precios introducidos es de: " + suma + " € ");
    }    
}
