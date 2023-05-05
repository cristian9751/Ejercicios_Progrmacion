package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pedido {
    String nombreCliente;
    double descuento;
    private HashMap<Articulo, Integer> carrito = new HashMap<>();
    private static List<Pedido> pedidos = new ArrayList<>();

    private static double descuentoDefault = 0.0;

    Pedido(String nombreCliente, double descuento, Articulo articulo, int cantidadArticulo) {
        setNombreCliente(nombreCliente);
        setDescuento(descuento);
        anyadirArticulo(articulo, cantidadArticulo);
        pedidos.add(this);
    }

    Pedido(String nombreCliente, Articulo articulo , int cantidadArticulo) {
        this(nombreCliente, descuentoDefault, articulo, cantidadArticulo);
    }

    private int setCantidadArticulo(int cantidad, Articulo articulo) {
        if(cantidad <= 0) {
            return 0;
        } else if(cantidad > articulo.getCantidad()) {
            return 1;
        } else {
            return 2;
        }
    }
    public boolean setNombreCliente(String nombreCliente) {
        if(nombreCliente.length() <= 1) {
            return false;
        } else {
            this.nombreCliente = nombreCliente;
            return true;
        }
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }


    public static boolean setDescuetoDefault(double descuento) {
        if(descuento <= 0) {
            return false;
        } else {
            descuentoDefault = descuento;
            return true;
        }
    }

    public static double getDescuentoDefault() {
        return descuentoDefault;
    }
    public boolean setDescuento(double descuento) {
        if(descuento <= 0) {
            return false;
        } else {
            this.descuento = descuento;
            return true;
        }
    }

    public double getDescuento() {
        return this.descuento;
    }

    public double getSubTotal() {
        Double suma = 0.0;
        for (Articulo articulo: carrito.keySet()) {
            suma += articulo.getPrecioFinal();
        }
        return suma;
    }

    public double getTotal() {
        return this.getSubTotal() - this.getDescuento();
    }

    private boolean checkInpedido(Articulo articulo) {
        boolean res = false;
        for(Articulo it : carrito.keySet()) {
            if(articulo == it) {
                res = true;
            }
        }
        return res;
    }

    public int anyadirArticulo(Articulo nuevoArticulo, int cantidad) {
        if(checkInpedido(nuevoArticulo)) {
            return 0;
        } else {
            return this.setCantidadArticulo(cantidad, nuevoArticulo);
        }
    }

    public boolean isEmpty() {
        return carrito.isEmpty();
    }
    public boolean quitarArticulo(Articulo eliminarArticulo) {
        if(!checkInpedido(eliminarArticulo)) {
            return false;
        } else {
            carrito.remove(eliminarArticulo);
            return true;
        }
    }

    public static List<Pedido> getList() {
        return pedidos;
    }
    @Override
    public String toString() {
        String s1 = "\n----------\n" +
                "Detalles del pedido: \n" +
                "Nombre del Cliente: " + nombreCliente + "\n";
        String s2 =  "\nArticulos pedidos:\n" +
                "Articulo \t Cantidad \t IVA";
        for(Map.Entry<Articulo, Integer> articulo : carrito.entrySet()) {
            Articulo a = articulo.getKey();
            s2 += "\n" + a.getNombre() + "\t\t" + articulo.getValue() + "\n" + a.getIva().getProcentaje();
        }

        String s3 ="Subtotal : " + this.getSubTotal() + " €\n" +
                "Descuento: " + descuento + " €\n" +
                "Total a pagar: " + getTotal() + " €\n" +
                "----------\n";

        return s1.concat(s2).concat(s3);
    }
}
