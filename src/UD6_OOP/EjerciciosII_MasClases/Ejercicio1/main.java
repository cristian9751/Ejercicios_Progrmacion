package UD6_OOP.EjerciciosII_MasClases.Ejercicio1;

import java.util.Random;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.EjerciciosII_MasClases.Ejercicio1
 * @created 11/3/23
 */
public class main {
    public static void main(String[] args) {
        Asignatura Matematicas = new Asignatura("Matematicas",  new Random().nextInt(),
                "Primer curso");
        Asignatura Programacion = new Asignatura("Programacion", new Random().nextInt(),
                "Segundo curso");
        Asignatura BasesDeDatos = new Asignatura("Bases de Datos", new Random().nextInt(),
                "Tercer curso");

        System.out.println(Matematicas);
        System.out.println(Programacion);
        System.out.println(BasesDeDatos);
    }
}
