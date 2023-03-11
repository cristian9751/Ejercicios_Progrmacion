package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioE4;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB4
 * @created 10/3/23
 */
public class main {
    public static void main(String[] args) {
        articulo miarticulo = new articulo("Mi producto", 256.0, 7, 2);
        System.out.println(miarticulo.toString());
        System.out.println(miarticulo.pvp());
        System.out.println();
    }

}
