package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioA1;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioA1
 * @created 10/3/23
 */
public class main {
    public static void main(String[] args) {
        punto punto1 = new punto();
        punto punto2 = new punto();

        punto1.x = 50.0;
        punto1.y = 10.0;
        punto2.x = -3.0;
        punto2.y = 7.0;

        System.out.println(punto1.toString());
        System.out.println(punto2.toString());

        punto1.x += 1;
        punto2.y *= 2;
        punto2.x *= 5;

        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
    }
}
