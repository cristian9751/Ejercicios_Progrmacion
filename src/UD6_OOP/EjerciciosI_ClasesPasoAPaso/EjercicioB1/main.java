package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB1;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB1
 * @created 10/3/23
 */
public class main {
    public static void main(String[] args) {
        punto punto1 = new punto(50.0, 10.0);
        punto punto2 = new punto(-3.0,7.0);

        System.out.println(punto1);
        System.out.println(punto2);

        punto1.x += 1;
        punto2.y *= 2;
        punto2.x *= 5;

        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
    }
}
