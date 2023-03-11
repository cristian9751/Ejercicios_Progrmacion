package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioE2;

import java.util.Scanner;

/**
 * @author cristian
 * @project Ejercicios - UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioE2
 * @created 11/3/23
 */
public class main {
    static Scanner in = new Scanner(System.in);


    public static persona  creapersona() {
        System.out.println("Crear nuevo usuario: ");
        System.out.print("Introduce el nombre ");
        String nombre = in.nextLine();
        System.out.print("Introduce los apellidos");
        String apellidos = in.nextLine();
        System.out.print("Introduce el DNI: ");
        String dni = in.nextLine();
        System.out.print("Introduce la edad: ");
        int edad = in.nextInt();

        return new persona(dni, nombre, apellidos, edad);
    }
    public static void main(String[] args) {
        persona persona1 = creapersona();
        persona persona2 = creapersona();
        persona persona3 = creapersona();

        persona1.esMayorEdad();
        persona2.esMayorEdad();
        persona3.esMayorEdad();

    }



}
