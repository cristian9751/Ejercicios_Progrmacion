package UD8_POII.EjerciciosA;

public class Persona {
   protected String nombre;
    protected String apellidos;
    protected String f;

    public Persona(String n, String a, String f) {
        this.nombre = n;
        this.apellidos = a;
        this.f = f;
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

    public String getFechaNacim() {
        return f;
    }

    public void setFechaNacim(String fechaNacim) {
        this.f= fechaNacim;
    }


    public String toString() {
        return this.getClass().getSimpleName() + ": " + nombre + " " + apellidos + " " +  f;
    }
}



