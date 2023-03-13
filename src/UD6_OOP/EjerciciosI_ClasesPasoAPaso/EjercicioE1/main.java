package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioE1;

import java.util.Random;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioC1
 * @created 10/3/23
 */
public class main {

    public static punto CreaPuntoAle() {
        return new punto(Math.random() * (100 - (-100) + 1) + (-100),
        Math.random() * (100 - (-100) + 1) + (-100));
    } 

    public static void main(String[] args) {
        punto punto1 = new punto(50.0, 10.0);
        punto punto2 = new punto(-3.0, 7.0);
        punto punto3 = CreaPuntoAle();

        System.out.println(punto1);
        System.out.println(punto2);
        System.out.println(punto3);


        Double x1 = punto1.getX();
        Double y1 = punto1.getY();
        Double x2 = punto2.getX();
        Double y2 = punto2.getY();

        x1 += 1;
        y2  *= 2;
        x2 *= 5;

        punto1.setX(x1);
        punto1.setY(y1);
        punto2.setX(x2);
        punto2.setY(y2);

        System.out.println(punto1);
        System.out.println(punto2);
    }
}
