package UD6_OOP.AppContactos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.AppContactos
 * @created 15/3/23
 */
public class MainApp {

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
        System.out.println("Id " +
                "Nombre" + " " + "Correo"+
                " " + "Telefono");
    }

    public static int mostrar_menu() {
        System.out.println("1. Ver contactos");
        System.out.println("2. Agregar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Buscar por nombre");
        System.out.println("5. Buscar por correo");
        System.out.println("6. Buscar por telefono");
        System.out.println("7. Busqueda global");
        System.out.println("8. Salir");
        int opcion = PideEntero("Selecciona una opción");
        Manejar(opcion);
        return opcion;
    }

    public  static String mostrar_contacto(Contacto contacto) {
        return contacto.toString();
    }

    public static void mostrar_contacto(int pos) {
        System.out.println(pos+ " " + mostrar_contacto(agenda[pos]));
    }

    public static void agregar_contacto() {
        String nombre = pideString("Introduce el nombre del " +
                "contacto");
        int telefono = PideEntero("Introduce el numero de " +
                "telefono");
        String correo = pideString("Introduce el correo " +
                "electronico ");

        agenda[cont] = new Contacto(nombre, correo, telefono);
        cont++;
    }
    
    public static String busqueda(int opcion) {
        String result = new String();
        if(opcion == 4) {
            result = pideString("Introduce el nombre del contacto ");
        } else if(opcion == 6) {
            result = pideString("Introduce el telefono del contacto ");
        } else if(opcion == 5) {
            result = pideString("Introduce el correo electronico del contacto ");
        }
        return result;
    }

    public static boolean buscar(int opcion) {
        String busqueda = busqueda(opcion);
        String txt = new String();
        List<String> res = new ArrayList<String>();
        for(int i = 0; i<cont; i++) {
            if(opcion == 4) {
                if(agenda[i].getNombre().equalsIgnoreCase(busqueda)) {
                    res.add(i + " " + agenda[i].toString());
                    txt = "nombre";
                }
            } else if(opcion == 5) {
                if(agenda[i].getCorreo().equalsIgnoreCase(busqueda)) {
                    res.add(i + " " + agenda[i].toString());
                    txt = "correo";
                }

            } else if(opcion == 6) {
                String telefono = Integer.toString(agenda[i].getTelefono());
                if(telefono.equalsIgnoreCase(busqueda)) {
                    res.add(i + " " + agenda[i].toString());
                    txt = "telefono";
                }
            }
        }

       return mostrar_resultado(res, txt);
    }


    public static boolean mostrar_resultado(List<String> resultado, String txt) {
        if(resultado.isEmpty()) {
            System.out.println("No se ha encontrado ninguna cuenta con el " + txt +
            " indicado");
            return false;
        } else {
        cabecera();
        for(String contacto : resultado) {
            System.out.println(contacto);
        }
        return true;
        }
    }

    public static void busqueda_global() {
        for(int i = 4; i< 7; i++) {
           if(buscar(i)) {
                break;
           }
        }
    }

    public static void eliminar_contacto(int n) {
        for(int i = n; i < cont -1; i++) {
            agenda[i] = agenda[i + 1];
        }
        cont--;
    }

    public static void mostrar_agenda() {
        System.out.println("Contactos disponibles: ");
        if(cont == 0) {
            System.out.println("No hay contactos " +
                    "que mostrar");
        } else {
            cabecera();
            for(int i = 0; i<cont; i++) {
                mostrar_contacto(i);
            }
        }

    }

    public static void Manejar(int opcion) {
        switch (opcion) {
            case 1:
                mostrar_agenda();
                break;
            case 2:
                agregar_contacto();
                break;
            case 3:
                busqueda_global();
                int j = PideEntero("Selecciona la id de la cuenta");
                eliminar_contacto(j);
                mostrar_agenda();
                break;
            case 4: case 5: case 6:
                buscar(opcion);
                break;
            case 7:
                busqueda_global();
                break;
            case 8:
                System.out.println("Saliste del menu.");
                break;
            default:
                System.out.println("Debes seleccionar una " +
                        "opcion del 1 al 8");
        }
    }

    public static void main(String[] args) {
        int opcion = mostrar_menu();
        while(opcion != 8) {
           opcion = mostrar_menu();
        }
    }
}
