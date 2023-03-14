package UD6_OOP.EjerciciosIII_ArraysObjetos.Ejercicios3_Cuenta;

import UD6_OOP.EjerciciosII_MasClases.Ejercicios3.CuentaCorriente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.EjerciciosIII_ArraysObjetos.Ejercicios3_Cuenta
 * @created 13/3/23
 */
public class main {
    private static cuenta[] cuentas = {new cuenta(100.0, "Pepe")
    , new cuenta(200.0, "Antonio"), new cuenta(300.0, "Felipe"),
    new cuenta(400.0, "Ramon"), new cuenta(500.0, "Marcos")};

    public static int PideInt(String txt) {
        System.out.println(txt);
        return new Scanner(System.in).nextInt();
    }

    public static Double PideDouble(String txt) {
        System.out.println(txt);
        return new Scanner(System.in).nextDouble();
    }

    public static int menu() {
        System.out.println("1. Ver cuentas");
        System.out.println("2.Ingresar");
        System.out.println("3. Retirar");
        System.out.println("4. Transferencia");
        System.out.println("5. Salir");
        int opcion = PideInt("Selecciona una opción");
        manejar(opcion);
        return opcion;

    }

    public static String imprimir_cuenta(cuenta cuenta) {
        return cuenta.toString();
    }

    public static String imprimir_cuenta(int n) {
        System.out.print(n + "\t");
        return imprimir_cuenta(cuentas[n]);
    }

    public static String cabeceraid() {
        return "Id" + "\t" + cuenta.cabecera();
    }

    public static void muestracuentas() {
        System.out.println(cabeceraid());
        for(int i = 0; i<cuentas.length; i++) {
            System.out.println(imprimir_cuenta(i));
        }
    } 

    public static cuenta elegir(String txt) {
        muestracuentas();
        int n_cuenta = PideInt("Selecciona la id de la cuenta " + txt + ": ");
        return cuentas[n_cuenta];
    }

    public static void manejar(int opcion) {
        if(opcion == 4) {
            operaciones(opcion, elegir("emisora"), elegir("receptora"));
        } else if(opcion == 2 || opcion == 3) {
            operaciones(opcion, elegir(""), null);
        } else {
            operaciones(opcion, null, null);
        }
    }

    public static void transferencia(cuenta emisor, cuenta receptor, Double cant) {
        System.out.println(cuenta.cabecera());
        if(emisor.retirar(cant, false)) {
            receptor.ingresar(cant, false);
            System.out.println("Transferencia realizada con exito");
        }
        
    }
    private static void operaciones(int opcion, cuenta cuenta1, cuenta cuenta2) {
        switch (opcion) {
            case 1:
                muestracuentas();
                break;
            case 2:
                cuenta1.ingresar(PideDouble("Introduce la cantidad a ingresar"), true);
                break;
            case 3:
                cuenta1.retirar(PideDouble("Introduce la cantidad a retirar"), true);
                break;
            case 4:
                transferencia(cuenta1, cuenta2,PideDouble("Introduce la cantidad" +
                " a transferir"));
                break;
            case 5:
                System.out.println("Saliste del menu");
                break;
            default:
                System.out.println("Debes escoger una opcion de 1 a 5.");
                break;
        }
    }

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menu();
        } while(opcion != 5);
    }

}
