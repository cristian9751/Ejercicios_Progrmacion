package UD6_OOP.EjerciciosIII_ArraysObjetos.Ejercicio1_Asignaturas;

public class Asignatura {
    private String nombre;
    private String curso;
    private final int codigo;
    
    public Asignatura(String nombre, String curso, int codigo) {
        this.nombre = nombre;
        this.curso = curso;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Asignatura [nombre=" + nombre + ", curso=" + curso + ", codigo=" + codigo + "]";
    }


    
}
