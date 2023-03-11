package UD4_EstructurasDatos.Matrices;

import java.util.Scanner;

public class appcontactos {

    //Metodo que devuelve la posicion del contacto en el array de datos segun el nombre
    public static int BuscarContacto(String nombre, String[][] datos, int pos) {
        int result = -1;
        for(int i = 0; i< pos; i++) {
           if(datos[i][0].contains(nombre)) {
            result = i;
           }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        int max = 100;
        String[][] datos = new String[max][2];
        int[] telefonos = new int[max];
        int pos = 0;
        do {
            System.out.println("Selecciona una de las siguientes opciones: ");
            System.out.println("1. Ver contactos");
            System.out.println("2. Añadir contactos");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Buscar contacto");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:

                    if(pos == 0) {
                        System.out.println("No hay ningun contacto");
                        continue;
                    }
                    for(int i = 0; i<max; i++) {
                        System.out.println("Nombre: " + datos[i][0] + " " + "Telf: " + telefonos[i]+ " " + "Mail: " + datos[i][1]);
                    }
                    break;

                case 2:
                    in.nextLine();
                    System.out.println("Introduce el nombre del contacto: ");
                    String nombre = in.nextLine(); 
                    if(BuscarContacto(nombre, datos, pos) == -1) {
                        for(int c = 0; c < datos[0].length; c++) {
                            if(c == 0) {
                                datos[pos][c] = nombre;
                            } else {
                                System.out.print("Introduce el correo electronico");
                                datos[pos][c] = in.nextLine();
                            }
                        }
                        System.out.println("Introduce el numero de telefono");
                        telefonos[pos] = in.nextInt();
                        pos++;
                    } else {
                        System.out.println("El contacto especificado ya existe");
                    }
                    break;
                case 3:
                    in.nextLine();
                    System.out.println("Introduce el nombre del contacto: ");
                    String contacto = in.nextLine();
                    int pb = BuscarContacto(contacto, datos, pos);
                    if(pb == -1) {
                        System.out.println("El contacto especificado no existe ");
                    } else {
                        for(int i = pb; i<= (pos - 1); i++) {
                            telefonos[i] = telefonos[i + 1];
                            for(int c = 0; c <= datos[i].length -1; c++) {
                                datos[i][c] = datos[i + 1][c];
                            }
                            
                        }
                    }

                    pos--;

                    break;
                case 4:
                    in.nextLine();
                    System.out.println("Introduce el nombre del contacto");
                    String busqueda = in.nextLine();
                    int p = BuscarContacto(busqueda, datos, pos);
                    if(p == -1) {
                        System.out.println("El contacto especificado no existe");
                    } else {
                         System.out.println("Nombre: " + datos[p][0] + " " + "Telf: " + telefonos[p]+ " " + "Mail: " + datos[p][1]);
                    }

                    break;
                case 5:
                    System.out.println("Adios");

                default:
                    System.out.println("Debes seleccionar una de las 5 opciones.");
                    break;
            }

        } while (opcion != 5);
    }
}
