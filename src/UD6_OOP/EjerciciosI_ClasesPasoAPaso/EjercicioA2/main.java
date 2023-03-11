package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioA2;

import java.util.Scanner;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioA2
 * @created 10/3/23
 */
public class main {
    public static void main(String[] args) {
        persona persona1 = new persona();
        persona persona2 = new persona();
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce el nombre de la primera persona: ");
        String nombre_persona1 = in.nextLine();
        System.out.println("Introduce los apellidos de la primera persona: ");
        String apellidos_persona1 = in.nextLine();
        System.out.print("Introduce el dni de la primera persona: ");
        int dni_persona1 = in.nextInt();
        System.out.println("Introduce la edad de la primera persona: ");
        int edad_persona1 = in.nextInt();

        System.out.println("Introduce el nombre de la segunda persona: ");
        in.nextLine();
        String nombre_persona2 = in.nextLine();
        System.out.println("Introduce los apellidos de la segunda persona: ");
        String apellidos_persona2 = in.nextLine();
        System.out.println("Introduce el dni de la segunda persona: ");
        int dni_persona2 = in.nextInt();
        System.out.println("Introduce la edad de la segunda persona: ");
        int edad_persona2 = in.nextInt();

        persona1.nombre = nombre_persona1;
        persona1.apellidos = apellidos_persona1;
        persona1.edad = edad_persona1;
        persona1.dni = dni_persona1;

        persona2.nombre = nombre_persona2;
        persona2.apellidos = apellidos_persona2;
        persona2.edad = edad_persona2;
        persona2.dni = dni_persona2;

        persona1.toString();
        persona2.toString();


    }
}
