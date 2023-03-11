package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioD3;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB3
 * @created 10/3/23
 */
public class main {
    public static void main(String[] args) {
        rectangulo rectangulo1 = new rectangulo(0.0, 5.5);
        rectangulo rectangulo2 = new rectangulo(7.9, 2.3);


        rectangulo1.setX1(rectangulo2.getX1());
        rectangulo2.setX1(rectangulo1.getX1());
        rectangulo1.setX2(rectangulo2.getX2());
        rectangulo2.setX2(rectangulo1.getX2());
        rectangulo1.setY1(rectangulo2.getY1());
        rectangulo2.setY1(rectangulo1.getY1());
        rectangulo1.setY2(rectangulo2.getY2());
        rectangulo2.setY2(rectangulo1.getY1());

        System.out.println("Valores rectangulo 1: "+ "\n" + rectangulo1.toString());
        System.out.println("Valores rectangulo 2: "+ "\n" + rectangulo2.toString());

        System.out.println("Perimetro rectangulo1: "+ "\n" + rectangulo1.perimetro());
        System.out.println("Perimetro rectangulo2: "+ "\n" + rectangulo2.perimetro());

        System.out.println("Area rectangulo1: " + "\n" + rectangulo1.area());
        System.out.println("Area rectangulo2: " + "\n" + rectangulo2.area());
    }
}
