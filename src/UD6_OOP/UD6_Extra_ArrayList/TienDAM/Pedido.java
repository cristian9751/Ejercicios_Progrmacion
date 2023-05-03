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

    Pedido(String nombreCliente, double descuento) {
        setNombreCliente(nombreCliente);
        setDescuento(descuento);
        pedidos.add(this);
    }

    Pedido(String nombreCliente) {
        this(nombreCliente, 0.0);
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

    public boolean anyadirArticulo(Articulo nuevoArticulo, int cantidad) {
        if(checkInpedido(nuevoArticulo)) {
            System.out.println("El articulo que has seleccionado ya esta en el carrito.");
            return false;
        } else if(nuevoArticulo.getCantidad() < cantidad) {
            System.out.println("No hay existencias suficientes de " + nuevoArticulo.getNombre());
            return false;
        } else {
            carrito.put(nuevoArticulo, cantidad);
            return true;
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
