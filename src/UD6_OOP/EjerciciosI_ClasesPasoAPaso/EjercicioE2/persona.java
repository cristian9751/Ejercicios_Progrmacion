package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioE2;

import java.util.regex.Pattern;

/**
 * @author cristian
 * @project Ejercicios - UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioE2
 * @created 11/3/23
 */
public class persona {
    private String nombre, apellidos;
    private final String dni;
    private int edad;

    private final static  int mayoriaEdad = 18;


    public persona(String dni, String nombre, String apellidos, int edad) {
        if(validarDNI(dni)) {
            this.dni = dni;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
        } else {
            this.dni = null;
        }
    }
    public String getDni() {
        return dni;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String toString() {
        return "persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }

    public boolean esMayorEdad() {
        if(this.edad >= mayoriaEdad) {
            System.out.println(this.nombre + " es mayor de edad");
            return true;
        } else {
            System.out.println(this.nombre + " es menor de edad");
            return false;
        }
    }
    public boolean validarDNI(String dni) {
        Pattern mayus = Pattern.compile("[A-Z]");

        if(dni.length() == 9 && mayus.matcher(dni.charAt(8)+ "").find()){
            return true;
        } else {
            System.err.println("El dni debe contener 8 caracteres numericos y una letra");
            return false;
        }
    }
}
