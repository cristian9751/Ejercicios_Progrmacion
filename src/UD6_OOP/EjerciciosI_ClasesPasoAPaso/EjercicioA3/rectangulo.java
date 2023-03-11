package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioA3;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioA3
 * @created 10/3/23
 */
public class rectangulo {
    //ATRIBUTOS
    Double x1, y1, x2, y2;


    public String toString() {
        return "Rectangulo: " +
                "x1=" + this.x1 +
                "y1=" + this.y1 +
                "x2=" + this.x2 +
                "y2=" + this.y2;
    }

    public Double perimetro() {
        return x1 + y1 + x2 + y2;
    }

    public float area() {
        return Math.round((x1 + x2) * (y1 + y2));
    }
}
