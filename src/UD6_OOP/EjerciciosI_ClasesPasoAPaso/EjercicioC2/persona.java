package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioC2;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB2
 * @created 10/3/23
 */
public class persona {
    //ATRIBUTOS
    private String nombre, apellidos;
    private int dni, edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

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
