package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TienDAM {

    private static Scanner in = new Scanner(System.in);

    private static void mostrarLista(List lista, String txt) {
        Iterator itLista = lista.iterator();
        int contador = 0;
        System.out.println(txt);
        while (itLista.hasNext()) {
            System.out.println("ID: " + contador + "\n" + itLista.next());
        }
    }

    private static String pideString(String txt) {
        System.out.println(txt);
        return in.nextLine();
    }

    private static double pideDouble(String txt) {
        System.out.println(txt);
        double a = in.nextDouble();
        in.nextLine();
        return a;
    }

    private static int pideInt(String txt) {
        System.out.println(txt);
        return in.nextInt();
    }

    private static TiposIva pideTipoIva() {
        System.out.println("TIPOS DE IVA");
        System.out.println("ID \t TIPO DE IVA \t PROCENTAJE\n");
        TiposIva[] tipos = TiposIva.values();

        for (int i = 0; i < tipos.length; i++) {
            System.out.println(i + "\t" + tipos[i].getNombre() + "\t\t" + tipos[i].getProcentaje());
        }

        return tipos[pideInt("Introduce el ID  del tipo de iva que quieres aplicar")];
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
        Articulo nuevoArticulo = new Articulo(nombre, precioSinIva, iva, cantidad);

        if (!checksArticulo(nuevoArticulo)) {
            System.out.println("No se ha podido crear el nuevo articulo");
            return null;
        } else {
            System.out.println("El articulo " + nuevoArticulo.getNombre() + " se ha creado correctamente " +
                    " y se ha añadido al almacen");
            return nuevoArticulo;
        }
    }


    private static boolean checkPedido(Pedido pedido, boolean descuento) {
        boolean res = true;
        if (pedido.getNombreCliente() == null) {
            System.out.println("El nombre del cliente debe de contener mas de un caracter alfanumerico");
            res = false;
        }

        if (descuento && pedido.getDescuento() == 0.0) {
            System.out.println("No puedes indicar valores negativos como descuento");
        }
        return res;
    }

    private static boolean selDescuento() {
        String seleccion = pideString("¿Quieres aplicar un descuento a este pedido?");
        if (seleccion.toUpperCase() == "SI") {
            return true;
        } else {
            System.out.println("No se va a aplicar ningun descuento a este pedido");
            return false;
        }
    }

    private static Pedido nuevoPedido(Articulo articulo, int cantidadArticulo) {
        String nombreCliente = pideString("Introduce el nombre del cliente: ");
        boolean hayDescuento = selDescuento();
        Pedido nuevoPedido = null;
        if (!hayDescuento) {
            nuevoPedido = new Pedido(nombreCliente, articulo, cantidadArticulo);
        } else {
            double descuento = pideDouble("Introduce el descuento que va a tener el pedido: ");
            if (descuento == Pedido.getDescuentoDefault()) {
                hayDescuento = false;
            }
            nuevoPedido = new Pedido(nombreCliente, descuento, articulo, cantidadArticulo);
        }

        if (!checkPedido(nuevoPedido, hayDescuento)) {
            System.out.println("No se ha podido realizar el pedido");
            return null;
        } else {
            System.out.println("Pedido realizado correctamente");
            return nuevoPedido;

        }

    }


    private static Almacen escogerAlmacen() {
        if (Almacen.isEmpty()) {
            System.out.println("No hay ningun almacen que escoger");
            return null;
        } else if (Almacen.getSize() == 1) {
            return Almacen.getAlmacen(0);
        } else {
            mostrarLista(Almacen.getList(), "Lista de almacenes a escoger");
            return Almacen.getAlmacen(pideInt("Selecciona la id del almacen que quieres escoger: "));
        }
    }

    private static void recogerOpcion(MenuOpciones menu, Almacen almacen, Articulo articulo) {
        System.out.println(menu.getTitulo());
        menu.mostrarOpciones();
        int opcion = pideInt("Selecciona una opcion del 1 al " + menu.getOpcionFinal());
        //CONTINUAR
    }

    private static int obtenerIdArticulo(Almacen almacen) {
        mostrarLista(almacen.buscarArticulo(pideString("Introduce el nombre del articulo: ")),
                "Articulos que coinciden con el nombre indicado");
        return pideInt("Selecciona la id del articulo: ");
    }

    private static void mostrarError(int error, String error0, String error1, String correcto) {
        switch (error) {
            case 0:
                System.out.println(error0);
                break;
            case 1:
                System.out.println(error1);
                break;
            case 2:
                System.out.println(correcto);

        }
    }




    private static void manejarMenuPrincipal(int opcion, Almacen almacen, Articulo articulo) {
        almacen = escogerAlmacen();
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



}
