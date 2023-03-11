package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB2;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB2
 * @created 10/3/23
 */
public class persona {
    //ATRIBUTOS
    String nombre, apellidos;
    int dni, edad;


    public persona(String nombre, String apellidos, int dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    public String toString() {
        return "nombre: " + nombre + "\n" +
                "apellidos: " + apellidos + "\n" +
                "dni: " + dni + "\n" +
                "edad: " + edad;
    }
}
