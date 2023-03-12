package UD6_OOP.EjerciciosII_MasClases.Ejercicio4;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.EjerciciosII_MasClases.Ejercicio4
 * @created 12/3/23
 */
public class main {
    public static void main(String[] args) {
        Reloj primero = new Reloj(13, 35, 15);
        primero.dimeHora(24);

        while (true) {
            primero.tick(12);
        }
    }
}
