package UD6_OOP.AppBanco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.AppBanco
 * @created 20/3/23
 */
public class Banco {

    public static int max_cuentas = 100;

    private static int cont = 0;
    public static Cuenta cuentas[] = new Cuenta[max_cuentas];

    public static void setMax_cuentas(int max_cuentas) {
        Banco.max_cuentas = max_cuentas;
    }

    public static int PideInt(String txt) {
        System.out.println(txt);
        return new Scanner(System.in).nextInt();
    }

    public static int mostrar_menu() {
        System.out.println("1. Ver cuentas");
        System.out.println("2. Ingresar dinero.");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Transferencia");
        System.out.println("5. Agregar cuenta");
        System.out.println("6. Eliminar cuenta");
        System.out.println("7. Buscar cuenta");
        System.out.println("8. Mostrar morosos");
        System.out.println("9. Salir");
        int opcion = PideInt("Selecciona una opcion del 1 al 9");
        if (cuentas_banco() || opcion == 5) {
            manejar(opcion);
        }
        return opcion;
    }


    public static final void Cabeceraid() {
        System.out.println("Id" + "\t" + "Titular" + "\t" + "Saldo");
    }

    public static String mostrar_cuenta(int n) {
        return n + " " + cuentas[n].toString();
    }

    public static boolean cuentas_banco() {
        if (cont > 0) {
            return true;
        } else {
            System.out.println("No hay cuentas en el banco");
            return false;
        }
    }


    public static boolean buscar() {
        boolean res = false;
        System.out.println("Introduce el nombre de la cuenta que buscas:");
        String Titular = new Scanner(System.in).nextLine();
        List<String> respuesta = new ArrayList<String>();
        for (int i = 0; i < cont; i++) {
            if (cuentas[i].getTitular().equalsIgnoreCase(Titular)) {
                respuesta.add(mostrar_cuenta(i));
                res = true;
            }
        }

        mostrar_res(respuesta, "No hay cuentas con el nombre de titular indicado");
        return res;
    }


    public static void mostrar_res(List<String> res, String txt) {
        if (res.isEmpty()) {
            System.out.println(txt);
        } else {
            for (String cuenta : res) {
                System.out.println(res);
            }
        }
    }

    public static int sel_cuenta(String txt) {
        boolean busqueda;
        do {
            busqueda = buscar();
        } while (!busqueda);

        return PideInt("Selecciona la id de la cuenta " + txt);

    }


    public static void transferncia(Cuenta emisora, Cuenta receptora, int cantidad) {
        if (emisora.retirar(cantidad)) {
            receptora.ingresar(cantidad);
            System.out.println("Se ha hecho una transferncia de " + cantidad + "€" +
                    " desde la cuenta de " + emisora.getTitular() + " a la cuenta de "
                    + receptora.getTitular());
        }

        System.out.println(emisora);
        System.out.println(receptora);
    }

    public static void Agregar_Cuenta() {
        System.out.println("Creando una nueva cuenta....");
        System.out.println("Introduce el nombre del titular de "
                + " la cuenta");
        String Titular = new Scanner(System.in).nextLine();
        int Saldo = PideInt("Introduce el saldo inicial que va a tenr la cuenta");
        if (Cuenta.comprobar_saldo(Saldo)) {
            cuentas[cont] = new Cuenta(Titular, Saldo);
            cont++;
        }
    }


    public static void eliminar_cuenta(int n) {
        System.out.println(mostrar_cuenta(n));
        int seguro = PideInt("Estas seguro de querer eliminar la cuenta con ID " + n + "?" +
                "(Presiona 0 para confirmar o cualquier otra tecla para cancelar)");
        if (seguro == 0) {
            for (int i = n; i < cont - 1; i++) {
                cuentas[i] = cuentas[i + 1];
            }
            System.out.println("Cuenta eliminada correctamente");
            cont--;
        } else {
            System.out.println("Se ha cancelado la eliminacion de cuenta");
        }

    }

    public static void mostrar_morosos() {
        List<String> Morosos = new ArrayList<String>();
        for (int i = 0; i < cont; i++) {
            if (cuentas[i].getSaldo() < 0) {
                Morosos.add(cuentas[i].toString());
            }
        }

        mostrar_res(Morosos, "No hay morosos");
    }

    public static void manejar(int opcion) {
        int id_cuenta = -1;
        switch (opcion) {
            case 1:
                Cabeceraid();
                for (int i = 0; i < cont; i++) {
                    System.out.println(i + "\t" + cuentas[i]);
                }
                break;
            case 2:
                id_cuenta = sel_cuenta("en la que quieres ingresar");
                cuentas[id_cuenta].ingresar(PideInt("Indica la cantidad a ingresar"));
                break;
            case 3:
                id_cuenta = sel_cuenta(" de la que quieres retirar");
                cuentas[id_cuenta].retirar(PideInt("Indica la cantidad que quieres retirar"));
                break;
            case 4:
                id_cuenta = sel_cuenta(" desde la que quieres transferir");
                Cuenta emisora = cuentas[id_cuenta];
                id_cuenta = sel_cuenta(" que va a recibir la transferencia");
                Cuenta receptora = cuentas[id_cuenta];
                transferncia(emisora, receptora, PideInt("Indica la cantidad a transferir"));
                break;
            case 5:
                Agregar_Cuenta();
                Cabeceraid();
                System.out.println((cont -1) + "\t" + cuentas[cont - 1]);
                break;
            case 6:
                id_cuenta = sel_cuenta(" que quieres eliminar");
                eliminar_cuenta(id_cuenta);
                break;
            case 7:
                buscar();
                break;
            case 8:
                mostrar_morosos();
                break;
            case 9:
                System.out.println("Saliste del menu");
                break;
            default:
                System.out.println("Debes de seleccionar una opcion del "
                        + " 1 al 9");
        }

        if(opcion == 2 || opcion == 3) {
            Cabeceraid();
            System.out.println(id_cuenta + "\t" + cuentas[id_cuenta]);
        }

    }

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = mostrar_menu();
        } while(opcion != 9);
    }
}
