package UD6_OOP.AppContactos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.AppContactos
 * @created 15/3/23
 */
public class main {

    private static int max_contactos = 100;
    private static int cont;
    public static Contacto[] agenda = new Contacto[max_contactos];
    public static int PideEntero(String txt) {
        System.out.println(txt);
        return new Scanner(System.in).nextInt();
    }

    public static String pideString(String txt) {
        System.out.println(txt);
        return new Scanner(System.in).nextLine();
    }

    public static void cabecera() {
        System.out.println("Id" + "\t" +
                "Nombre" + "\t" + "Telefono"+
                "\t" + "Correo");
    }

    public static int mostrar_menu() {
        System.out.println("1. Ver contactos");
        System.out.println("2. Agregar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Buscar por nombre");
        System.out.println("5. Buscar por telefono");
        System.out.println("6. Buscar por correo");
        System.out.println("7. Busqueda global");
        System.out.println("8. Salir");
        return PideEntero("Selecciona una opción");
    }

    public  static void mostrar_contacto(int pos) {
        System.out.println(agenda[pos]);
    }

    public static void agregar_contacto() {
        String nombre = pideString("Introduce el nombre del " +
                "contacto");
        int telefono = PideEntero("Introduce el numero de " +
                "telefono");
        String correo = pideString("Introduce el correo " +
                "electronico");

        agenda[cont] = new Contacto(nombre, correo, telefono);
        cont++;
    }

    public static void buscar(int opcion) {
        String busqueda;
        List<String> res = new ArrayList<String>();
        for(int i = 0; i<agenda.length; i++) {
            if(opcion == 4) {
                busqueda = pideString("Introduce el nombre del contacto");
                if(agenda[i].getNombre().equalsIgnoreCase(busqueda)) {
                    res.add(i + " " + agenda[i].toString());
                } else if(opcion == 5) {
                    busqueda = pideString("Introduce el telefono");
                    if(agenda[i].getCorreo().equalsIgnoreCase(busqueda)) {
                        res.add(i + " " + agenda.toString());
                    }
                } else {
                    busqueda = pideString("Introduce el correo electronico");
                    if(Integer.toString(agenda[i].getTelefono())
                            .equalsIgnoreCase(busqueda)) {
                        res.add(i + " " + agenda.toString());
                    }
                }
            }
        }

        mostrar_resultado(res);
    }


    public static void mostrar_resultado(List<String> resultado) {
        cabecera();
        for(String contacto : resultado) {
            System.out.println(contacto);
        }
    }

    public static void busqueda_global() {
        for(int i = 3; i<= 6; i++) {
            buscar(i);
        }
    }

    public static void eliminar_contacto(int n) {
        for(int i = n; i < cont -1; i++) {
            agenda[i] = agenda[i + 1];
        }
    }

    public static void Manejar(int opcion) {
        switch (opcion) {
            case 1:
                if(cont == 0) {
                    System.out.println("No hay contactos " +
                            "que mostrar");
                } else {
                    for(int i = 0; i<agenda.length; i++) {
                        mostrar_contacto(i);
                    }
                }

                break;
            case 2:
                agregar_contacto();
                break;
            case 3:
                busqueda_global();
                eliminar_contacto(PideEntero("Selecciona la id de la cuenta"));
                break;
            case 4: case 5: case 6:
                buscar(opcion);
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                System.out.println("Debes seleccionar una " +
                        "opcion del 1 al 8");
        }
    }
}
