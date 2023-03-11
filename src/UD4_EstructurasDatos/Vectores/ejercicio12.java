package UD4_EstructurasDatos.Vectores;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio12 {

    public static void anadir(int[] numeros) {
        System.out.print("Introduce el nuevo numero: ");
        int numero = new Scanner(System.in).nextInt();
        System.out.print("Introduce en que posicion colocarlo");
        int pos = new Scanner(System.in).nextInt();

        if(numeros[pos] == 0 && (pos >= 0 && pos<= numeros.length))  {
            numeros[pos - 1] = numero;
        } else {
            System.out.println("Esa posicion no existe o ya esta en uso");
        }
    }

    public static void mostrar(int[] numeros) {
        for(int i = 0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    public static void main(String[] args) {
            int opcion;
            int[] numeros = new int[10];
            menu:
            while (true) {
                System.out.println("1. Mostrar valores");
                System.out.println("2. Introducir valor");
                System.out.println("3. Salir");
                System.out.println("Selecciona una opcion");
                opcion = new Scanner(System.in).nextInt();

                switch (opcion) {
                    case 1:
                        mostrar(numeros);
                        continue;
    
                    case 2:
                        anadir(numeros);
                        continue;
                
                    case 3:
                       System.out.println("Saliendo");
                        break menu;
                }
            }
    }
}
