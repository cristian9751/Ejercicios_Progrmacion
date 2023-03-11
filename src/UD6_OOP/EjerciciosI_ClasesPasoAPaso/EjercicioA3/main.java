package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioA3;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioA3
 * @created 10/3/23
 */
public class main {
    public static void main(String[] args) {
        rectangulo rectangulo1 = new rectangulo();
        rectangulo rectangulo2 = new rectangulo();

        rectangulo1.x1 = 0.0;
        rectangulo1.y1 = 0.0;
        rectangulo1.x2 = 5.5;
        rectangulo1.y2 = 5.5;

        rectangulo2.x1 = 7.9;
        rectangulo2.y1 = 7.9;
        rectangulo2.x2 = 2.3;
        rectangulo2.y2 = 2.3;

        System.out.println("Valores rectangulo 1: " + rectangulo1.toString());
        System.out.println("Valores rectangulo 2: " + rectangulo2.toString());

        System.out.println("Perimetro rectangulo1: " + rectangulo1.perimetro());
        System.out.println("Perimetro rectangulo2: " + rectangulo2.perimetro());

        System.out.println("Area rectangulo1: " + rectangulo1.area());
        System.out.println("Area rectangulo2: " + rectangulo2.area());
    }
}
