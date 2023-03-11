package UD6_OOP.EjerciciosII_MasClases.Ejercicio2;

import java.util.Random;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.EjerciciosII_MasClases.Ejercicio2
 * @created 11/3/23
 */
public class main {
    public static void main(String[] args) {
        Coches coche1 = new Coches("Modelo", "Verde", true, "1FKDFD",
                Coches.Tipo.DEPORTIVO, Coches.ModalidadSeguro.TODO_RIESGO);

        System.out.println(coche1);

        System.out.println(coche1.getTipo().getNombre());
        System.out.println(coche1.getModalidad().getNombre());
        
    }
}
