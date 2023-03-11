package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB3;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB3
 * @created 10/3/23
 */
public class rectangulo {
    //ATRIBUTOS
    Double x1, y1, x2, y2;

    public rectangulo(Double x1, Double y1, Double x2, Double y2) {
        if((x1 == y1) && (x2 == y2)) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        } else {
            System.err.println("Las coordenadas x1 e y1 deben coincidir asi como " +
                    "las coordenadas x2 e y2");
        }
    }

    public rectangulo(Double valor1, Double valor2) {
        this(valor1, valor1, valor2, valor2);
    }

    public String toString() {
        return "x1=" + this.x1 + "\n" +
                "y1=" + this.y1 + "\n" +
                "x2=" + this.x2 + "\n" +
                "y2=" + this.y2;
    }

    public Double perimetro() {
        return this.x1 + this.y1 + this.x2 + this.y2;
    }

    public Double area() {
        return this.x1 + this.x2 + this.y1 + this.y2;
    }
}
