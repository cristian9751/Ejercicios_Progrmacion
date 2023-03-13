package UD6_OOP.EjerciciosIII_ArraysObjetos.Ejercicios3_Cuenta;

import UD6_OOP.EjerciciosII_MasClases.Ejercicios3.CuentaCorriente;

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

    public static void menu() {
        System.out.println("1. Ver cuentas");
        System.out.println("2.Ingresar");
        System.out.println("3. Retirar");
        System.out.println("4. Transferencia");
        System.out.println("5. Salir");
        int opcion = PideInt("Selecciona una opción");
        manejar(opcion);

    }

    public static  void cabecera() {
        System.out.println("Titular" + "\t" + "Saldo");
    }

    public static cuenta buscar() {
        System.out.print("Indica el nombre de cuenta: ");
        String titular = new Scanner(System.in).nextLine();
        for(int i = 0; i<cuentas.length; i++) {
            if(cuentas[i].getTitular().equalsIgnoreCase(titular)) {
                System.out.println(i + "" + cuentas[i]);
            }
        }
        return elegir();
    }

    public static cuenta elegir() {
        int n_cuenta = PideInt("Selecciona la id de la cuenta ");
        return cuentas[n_cuenta];
    }

    public static void manejar(int opcion) {
        if(opcion == 4) {
            operaciones(opcion, buscar(), buscar());
        } else if(opcion != 1) {
            operaciones(opcion, buscar(), null);
        } else {
            operaciones(opcion, null, null);
        }
    }

    public static void transferencia(cuenta cuenta1, cuenta cuenta2, Double cant) {
        if(cuenta1.retirar(cant)) {
            cuenta2.ingresar(cant);
        }
    }
    private static void operaciones(int opcion, cuenta cuenta1, cuenta cuenta2) {
        switch (opcion) {
            case 1:
                cabecera();
                for(int i = 0; i<cuentas.length; i++) {
                    System.out.println(i + "" + cuentas[i]);
                }
                break;
            case 2:
                cuenta1.ingresar(PideDouble("Introduce la cantidad a ingresar"));
                break;
            case 3:
                cuenta1.retirar(PideDouble("Introduce la cantidad a retirar"));
                break;
            case 4:

                break;
            case 5:
                break;
            default:
                break;
        }
    }

}
