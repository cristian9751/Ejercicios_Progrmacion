package UD4_EstructurasDatos.Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        double[] numeros = new double[100];
        Arrays.fill(numeros, Math.random()*100);
        System.out.print("Introduce el digito que buscas: ");
        int busqueda = new Scanner(System.in).nextInt();
        int cont = 0;

        for(int i = 0; i<numeros.length; i++) {
            if(numeros[i] == busqueda) {
                cont++;
            }
        }

        if(cont > 0) {
            System.out.println("Se ha encontrado " + busqueda + " " + cont + " veces");
        } else {
            System.out.println("No se ha encontrado " + busqueda);
        }
    }
}
