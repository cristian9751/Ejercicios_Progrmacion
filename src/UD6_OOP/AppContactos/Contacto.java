package UD6_OOP.AppContactos;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.AppContactos
 * @created 15/3/23
 */
public class Contacto {
    private String nombre, correo;
    private int Telefono;

    public Contacto(String nombre, String correo, int telefono) {
        this.nombre = nombre;
        this.correo = correo;
        Telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String toString() {
        return this.nombre + "\t" + this.correo + "\t" + this.Telefono;
    }
}
