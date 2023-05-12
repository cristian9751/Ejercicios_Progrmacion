package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TienDAM {

    private static Scanner in = new Scanner(System.in);

    private static void mostrarLista(List lista, String txt) {
        if(lista.isEmpty()) {
            System.out.println("No hay elementos que mostrar");
            return;
        }
        Iterator itLista = lista.iterator();
        int contador = 0;
        System.out.println(txt);
        while (itLista.hasNext()) {
            System.out.println("ID: " + contador + "\n" + itLista.next());
            contador++;
        }
    }

    private static String pideString(String txt) {
        boolean valido = true;
        System.out.println(txt);
        do {
            try {
                in.nextLine();
            } catch(InputMismatchException e) {
                System.out.println("Dato invalido! Debes introducir un numero");
                valido = false;
            }
        } while(!valido);

        return in.nextLine();
    }

    private static double pideDouble(String txt) {
        System.out.println(txt);
        boolean valido = true;
        double a = 0.0;
            do {
                try {
                    a = in.nextDouble();
                    in.nextLine();
                } catch(InputMismatchException e) {
                    System.out.println("Dato invalido!. Debes introducir " +
                            "un numero double. Ej: 0.0");
                    valido = false;
                }
            } while(!valido);
        return a;
    }

    private static int pideInt(String txt) {
        System.out.println(txt);
        boolean valido = true;
        int a = 0;
        do {
            try {
                a= in.nextInt();
                in.nextLine();
            } catch(InputMismatchException e) {
                System.out.println("Dato invalido. Debes introducir" +
                        " un numero entero ");
                valido = false;
            }
        } while(!valido);
        return a;
    }

    private static TiposIva pideTipoIva() {
        System.out.println("TIPOS DE IVA");
        System.out.println("ID \t TIPO DE IVA \t PROCENTAJE\n");
        TiposIva[] tipos = TiposIva.values();

        for (int i = 0; i < tipos.length; i++) {
            System.out.println(i + "\t" + tipos[i].getNombre() + "\t\t" + tipos[i].getProcentaje());
        }

        TiposIva res = null;
        boolean valido = true;
        do {
            try {
                res = tipos[pideInt("Introduce el ID del tipo de iva que quieres aplicar: ")];
            } catch(IndexOutOfBoundsException e) {
                System.out.println("Debes seleccionar una opcion del 1 al " + tipos.length);
                valido = false;
            }
        }while(!valido);
        return res;
    }

    private static boolean checksArticulo(Articulo articulo) {
        boolean res = true;
        if (articulo.getNombre() == null) {
            System.out.println("El nombre debe de contener mas de un caracter alfanumerico");
            res = false;
        }
        if (articulo.getPrecioSinIva() == 0) {
            System.out.println("Debes de inidcar un precio mayor que 0");
            res = false;
        }

        if (articulo.getCantidad() == 0) {
            System.out.println("La cantidad del articulo debe de ser mayhor que 0");
            res = false;
        }

        return res;

    }

    private static Articulo crearArticulo() {
        String nombre = pideString("Introduce el nombre del nuevo articulo: ");
        double precioSinIva = pideDouble("Introduce el precio sin iva del nuevo articulo: ");
        int cantidad = pideInt("Introduce la cantidad del nuevo articulo(Debe de ser superior a 0): ");
        TiposIva iva = pideTipoIva();

        try {
            Articulo nuevoArticulo = new Articulo(nombre, precioSinIva, iva, cantidad);
            return nuevoArticulo;
        } catch(Exception e) {
            System.err.println(e.getMessage());
            return null;
        }

        /*
        if (!checksArticulo(nuevoArticulo)) {
            System.out.println("No se ha podido crear el nuevo articulo");
            return null;
        } else {
            System.out.println("El articulo " + nuevoArticulo.getNombre() + " se ha creado correctamente " +
                    " y se ha añadido al almacen");
            return nuevoArticulo;
        }
        */
    }


    private static Almacen escogerAlmacen() {
        if (Almacen.isEmpty()) {
            System.out.println("No hay ningun almacen que escoger");
            return null;
        } else if (Almacen.getSize() == 1) {
            return Almacen.getAlmacen(0);
        } else {
            int idAlmacen = obtnerId(Almacen.getList(), "Lista de almacenes", "Escoge la id " +
                    "del almacen: ");
            try {
                return Almacen.getAlmacen(idAlmacen);
            }catch(IndexOutOfBoundsException e) {
                System.out.println("El id de almacen que has seleccionado no existe");
            }
        }
    }

    private static void recogerOpcion(MenuOpciones menu, Almacen almacen, Articulo articulo) {
        System.out.println(menu.getTitulo());
        menu.mostrarOpciones();
        int opcion = pideInt("Selecciona una opcion del 1 al " + menu.getOpcionFinal());
        switch (menu) {
            case PRINCIPAL :
                manejarMenuPrincipal(opcion, almacen, articulo);
                break;
            case SUBMENU_PEDIDOS:
                manejarMenuPedidos(opcion, almacen, articulo);
                break;
            case SUBMENU_ALMACEN:
                manejarMenuAlmacen(opcion, almacen, articulo);
                break;

        }

        if(opcion != menu.getOpcionFinal()) {
            recogerOpcion(menu, almacen, articulo);
        }
     }

    private static int obtnerId(List list, String s1, String s2) {
        mostrarLista(list, s1);
        return pideInt(s2);
    }


    private static void manejarMenuPrincipal(int opcion, Almacen almacen, Articulo articulo) {
        switch (opcion) {
            case 1:
                recogerOpcion(MenuOpciones.SUBMENU_ALMACEN, almacen, articulo);
                break;
            case 2:
                recogerOpcion(MenuOpciones.SUBMENU_PEDIDOS, almacen, articulo);
                break;
            case 3:
                System.out.println("Has seleccionado salir del menu");
                break;
            default:
                System.out.println("Debes seleccionar una opcion del 1 al " + MenuOpciones.PRINCIPAL.getOpcionFinal());
                recogerOpcion(MenuOpciones.PRINCIPAL, almacen, articulo);
                break;
        }
    }

    private static void manejarMenuPedidos(int opcion, Almacen almacen, Articulo articulo) {
        Pedido pedido = null;
        almacen = escogerAlmacen();
        if(almacen == null) {
            return;
        }
        int error;
        if(opcion >= 3 && opcion <= 6) {
            pedido = Pedido.getPedido(obtnerId(Pedido.getPedidos(), "Lista de pedidos",
                    "Selecciona la id del pedido"));

            almacen = escogerAlmacen();
            if(almacen == null) {
                return;
            }
            articulo = almacen.getArticulo(obtnerId(almacen.getArticulos(), "Articulos del almacen: " ,
                    "Escoge la id del articulo: "));
        }
        switch (opcion) {
            case 1:
                mostrarLista(Pedido.getPedidos(), "Listado de pedidos: ");
                break;
            case 2:
                pedido = new Pedido(pideString("Introduce el nombre del cliente: "));
                if(pedido.getNombre() == null) {
                    System.out.println("El nombre del cliente debe contener mas de un " +
                            "caracter alfanumerico");

                } else {
                    System.out.println("Pedido de " + pedido.getNombre() + " realizado correctametne");;
                }
                break;

            case 3:
                //ELIMINAR ARTICULO DE PEDIDO
                break;
            case 4:
                if(!pedido.removeArticulo(articulo)) {
                    System.out.println(articulo.getNombre() +
                            " no se encuentra en el pedido indicado");
                } else {
                    System.out.println("Se ha eliminado " + articulo.getNombre()
                    + " del pedido");
                }
                break;
            case 5:
                if(!pedido.existsInPedido(articulo)) {
                    System.out.println("Primero debes añadir el articulo al pedido");
                } else {
                    pedido.addArticulo(articulo, pideInt("Indica la nueva cantidd de " +
                            articulo.getNombre()));
                }
                break;

            case 6:
                String hayDescuento = pideString("¿Se va a aplicar un descuento a este pedido?(SI o NO): ");
                if(hayDescuento.toUpperCase() == "SI") {
                    System.out.println(pedido);
                    System.out.println("TOTAL: " + pedido.getTotal(pideDouble(
                            "Introduce el desceunto que quieres aplicar al pedido"
                    )));
                } else if(hayDescuento.toUpperCase() == "NO") {
                    System.out.println(pedido);
                    System.out.println("TOTAL : "+ pedido.getTotal());
                } else {
                    System.out.println("Debes de seleccionar si deseas o no aplicar" +
                            " un decuento");
                }
                break;

            case 7:
                System.out.println("Volviendo al menu principal....");
                break;
            default:
                System.out.println("Debes seleccionar una opcion del 1 al "
                + MenuOpciones.SUBMENU_PEDIDOS.getOpcionFinal());
                recogerOpcion(MenuOpciones.SUBMENU_PEDIDOS, almacen, articulo);
                break;
        }
    }


    private static void manejarMenuAlmacen(int opcion, Almacen almacen, Articulo articulo) {
        if(opcion >= 3 && opcion <= 5) {
            almacen =  escogerAlmacen();

            if(almacen == null) {
                return;
            }
        }
        switch(opcion) {
            case 1:
                mostrarLista(Almacen.getList(), "Lista de almacenes");
                break;
            case 2:
                new Almacen();
                System.out.println("Almacen creado correctamente");
                break;
            case 3:
                Almacen.eliminarAlmacen(obtnerId(Almacen.getList(), "Lista de almacenes"
                        , "Selecciona el almacen que quieres eliminar"));
                System.out.println("Se ha eliminado el almacen correctamente");
                break;

            case 4:
                articulo =almacen.getArticulo(obtnerId(almacen.getArticulos(), "Lista de articulos del almacen"
                        , "Selecciona el  articulo del cual se han recibido unidades"));

                if(articulo.aumentarCantidad(pideInt("Introduce la  cantidad de "
                        + articulo.getNombre() + " que se ha recibido"))) {
                    System.out.println("Se ha modificado la cantidad de " +
                            articulo.getNombre() + " correctamente");
                }
                break;
            case 5:
               //DEVOLVER ARTICULOS
                break;

            case 6:
                articulo = crearArticulo();
        }

    }
    public static void main(String[] args) {
        Articulo articulo = null;
        Almacen almacen = null;
        recogerOpcion(MenuOpciones.PRINCIPAL, almacen, articulo);
    }

}
