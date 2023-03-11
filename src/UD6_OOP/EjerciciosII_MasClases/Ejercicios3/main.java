package UD6_OOP.EjerciciosII_MasClases.Ejercicios3;

import java.util.Random;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.EjerciciosII_MasClases.Ejercicios3
 * @created 11/3/23
 */
public class main {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente(new Random().nextInt(),
                100.0);
        CuentaCorriente cuenta2 = new CuentaCorriente(new Random().nextInt(),
                100.0);

        cuenta2.retirar(-1.0);
        System.out.println(cuenta2);
    }
}
