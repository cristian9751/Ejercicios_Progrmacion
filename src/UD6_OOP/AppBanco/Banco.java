package UD6_OOP.AppBanco;

import java.util.Scanner;

public class Banco {
    private static int max_cuentas = 100;
    private static Cuenta[] cuentas = new Cuenta[max_cuentas];
    private static int cont = 0;

    public static String mostrar_cuenta(Cuenta cuenta) {
        return cuenta.toString();
    }

    public static String mostrar_cuenta(int n) {
        return n + " " + mostrar_cuenta(cuentas[n]);
    }

    public static void cabeceraid() {
        System.out.println("Id" + "\t" + "Titular" + "\t" + "Saldo");
    }


    public static boolean mostrar_banco() {
        boolean res = false;
        if(cont == 0) {
            System.out.println("No hay cuentas que mostrar");
        } else {
            for(int i = 0; i<cont; i++) {
                res = true;
                mostrar_cuenta(i);
            }
        }

        return res;
    }


    public static int pideInt(String txt) {
        System.out.println(txt);
        return new Scanner(System.in).nextInt();
    }


    public static Cuenta Elegirid() {
        if(mostrar_banco()) {
            System.out.println("Selecciona la id de una cuenta");
            int id = new Scanner(System.in).nextInt();
            return SelCuenta(id);
        } else {
            mostrar_menu();
            return null;
            
        }
        
    }

    public static Cuenta SelCuenta(int id) {
        if(id < cont ) {
            return cuentas[id];
        } else  {
            System.out.println("La cuenta que has seleccionado no existe");
            return null;
        }
    }
    
    public static void manejar(int opcion) {
        switch(opcion) {
            case 1:
                mostrar_banco();
                break;
            case 2:
                Elegirid().ingresar();
                
                    
        }
    }
    
}
