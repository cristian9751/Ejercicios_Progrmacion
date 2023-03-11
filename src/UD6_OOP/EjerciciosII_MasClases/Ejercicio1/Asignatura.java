package UD6_OOP.EjerciciosII_MasClases.Ejercicio1;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.EjerciciosII_MasClases.Ejercicio1
 * @created 11/3/23
 */
public class Asignatura {
    private String nombre;
    private final int cod;

    private String curso;

    /***
     * Constructor de tres parametros
     * @param nombre Nombre de la asignatura
     * @param cod Codigo de la asignatura
     * @param curso Curso de la asignatura
     */
    public Asignatura(String nombre, int cod, String curso) {
        this.nombre = nombre;
        this.cod = cod;
        this.curso = curso;
    }

    /***
     * Metodo que obtiene el parametro nombre de un objeto tipo asignaturas
     * @return Devuelve nombre de la asignatura
     */
    public String getNombre() {
        return nombre;
    }

    /***
     * Metodo que modifica el parametro nombre del objeto
     * @param nombre String  que pasara a ser el parametro nombre del objeto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /***
     * Metodo que obtiene el parametro codigo del objeto
     * @return Devuelve el parametro codigo del objeto
     */
    public int getCod() {
        return cod;
    }

    /**
     * Metodo que obtiene el parametro curso del objto
     * @return Devuelve el paramtro curso del objeto
     */
    public String getCurso() {
        return curso;
    }

    /***
     * Metodo que modifica el parametro curso del objeto
     * @param curso String que pasara a ser el parametro curso del objeto
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Metodo que muestra los valores de los parametros del objeto
     * @return Devuelve los valores de los parametros del objeto en  un String
     */

    @Override
    public String toString() {
        return "nombre=" + nombre + "\n" +
                "cod=" + cod + "\n" +
                "curso=" + curso + "\n";
    }
}
