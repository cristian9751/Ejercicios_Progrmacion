package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB1;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB1
 * @created 10/3/23
 */
public class punto {
    //ATRIBUTOS
    Double x, y;

    /**
     * Constructor de dos parametros double
     * @param x Coordenada X del punto
     * @param y Coordenada Y del punto
     */
    public punto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Metodo que muestra los parametros de un punto
     * @return Devuelve un string con los parametros de un objeto punto
     */
    public String toString() {
        return "Coordenada x: " + x + "\n" +
                "Coordenada y: " + y + "\n";
    }
}
