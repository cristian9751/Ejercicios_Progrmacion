package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioE3;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB3
 * @created 10/3/23
 */
public class main {
    public static void main(String[] args) {
        rectangulo rectangulo1 = new rectangulo(101.101, 5.5);
        rectangulo rectangulo2 = new rectangulo(7.9, 2.3);



        System.out.println("Valores rectangulo 1: "+ "\n" + rectangulo1.toString());
        System.out.println("Valores rectangulo 2: "+ "\n" + rectangulo2.toString());

        System.out.println("Perimetro rectangulo1: "+ "\n" + rectangulo1.perimetro());
        System.out.println("Perimetro rectangulo2: "+ "\n" + rectangulo2.perimetro());

        System.out.println("Area rectangulo1: " + "\n" + rectangulo1.area());
        System.out.println("Area rectangulo2: " + "\n" + rectangulo2.area());
    }
}
