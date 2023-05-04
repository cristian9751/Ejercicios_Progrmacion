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
        while(itLista.hasNext()) {
            System.out.println("ID: " + contador + "\n" +  itLista.next());
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
        for(int i = 0; i<tipos.length; i++) {
            System.out.println(i + "\t"  + tipos[i].getNombre() + "\t" + tipos[i].getProcentaje() + "\n");
        }

        return tipos[pideInt("Introduce el ID  del tipo de iva que quieres aplicar")];
    }

    private static boolean checksArticulo(Articulo articulo)  {
        boolean res = true;
        if(articulo.getNombre() == null) {
            System.out.println("El nombre debe de contener mas de un caracter alfanumerico");
            res = false;
        }
        if(articulo.getPrecioSinIva() == 0) {
            System.out.println("Debes de inidcar un precio mayor que 0");
            res = false;
        }

        if(articulo.getCantidad() == 0) {
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

        if(!checksArticulo(nuevoArticulo)) {
            System.out.println("No se ha podido crear el nuevo articulo");
            return null;
        } else {
            System.out.println("El articulo " + nuevoArticulo.getNombre() + " se ha creado correctamente");
            return nuevoArticulo;
        }
    }


    private static boolean checkPedido(Pedido pedido, boolean descuento) {
        boolean res = true;
        if(pedido.getNombreCliente() == null) {
            System.out.println("El nombre del cliente debe de contener mas de un caracter alfanumerico");
            res = false;
        }

        if(descuento && pedido.getDescuento() == 0.0) {
            System.out.println("No puedes indicar valores negativos como descuento");
        }
        return res;
    }
    private static Pedido nuevoPedido() {
        String nombreCliente = pideString("Introduce el nombre del cliente: ");
        boolean hayDescuento = false;
        Pedido nuevoPedido = null;
        if(!hayDescuento) {
           nuevoPedido = new  Pedido(nombreCliente);
        } else {
            double descuento = pideDouble("Introduce el descuento que va a tener el pedido: ");
            nuevoPedido = new Pedido(nombreCliente, descuento);
        }

        if(!checkPedido(nuevoPedido, hayDescuento)) {
            System.out.println("No se ha podido realizar el pedido");
            return null;
        } else {
            System.out.println("Pedido realizado correctamente");
            return nuevoPedido;
        }

    }
    public static void main(String[] args) {
        crearArticulo();
    }
}
