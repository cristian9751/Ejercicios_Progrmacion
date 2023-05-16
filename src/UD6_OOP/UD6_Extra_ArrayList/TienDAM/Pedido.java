package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pedido {
    private static List<Pedido> pedidos = new ArrayList<>(); //Lista de pedidos
    private HashMap<Articulo,Integer> carrito= new HashMap<>(); //HashMap de los articulos y su cantidad

    private String nombreCliente;

    Pedido(String nombre) {
        setNombre(nombre);
        pedidos.add(this);
    }

    /**
     *
     * @return Lista de los pedidos
     */
    public static List<Pedido> getPedidos() {
        return pedidos;
    }
    public boolean setNombre(String nombre) {
        if(nombre.length() <= 0) {
            return false;
        } else {
            this.nombreCliente = nombre;
            return true;
        }
    }

    public String getNombre() {
        return this.nombreCliente;
    }

    public int getCantidadArticulo(Articulo articulo) {
        return carrito.get(articulo);
    }


    public boolean addArticulo(Articulo articulo, int cantidad) throws Exception {
        if(cantidad <= 0) {
            throw new Exception("La cantidad de un producto no pude ser meno que cero o cero");
        } else if(cantidad > articulo.getCantidad()) {
            throw new Exception("No hay stock suficiente del articulo seleccionado");
        } else {
            carrito.put(articulo, cantidad);
            return true;
        }
    }

    public boolean removeArticulo(Articulo articulo) throws Exception {
        if(!carrito.containsKey(articulo)) {
            throw new Exception("El articulo seleccionado no  esta en el pedido");
        }
        carrito.remove(articulo);
        return true;
    }

    public static Pedido getPedido(int idPedido) {
        return pedidos.get(idPedido);
    }

    /**
     * Metodo que calcula el total del pedido
     * @return Devuelve un double que es el total del pedido
     */
    public double getTotal() {
        Double resultado = 0.0;
        for(Articulo articulo : carrito.keySet()) {
            resultado += articulo.getPrecioFinal();
        }
        return resultado;
    }


    /**
     * Metodo  que calcula el total del pedido indicando un procentaje de descuento
     * @param descuento Procentaje de descuento
     * @return Devuelve un docuble que es el total despues de aplicar el descuento
     */
    public double getTotal(int descuento) throws Exception {
        if(descuento <= 0) {
            throw new Exception("El descuento no peude ser menor que cero o cero");
        }
        double sinDescuento = this.getTotal();
        descuento = (int) (sinDescuento * descuento) / 100;
        return sinDescuento - descuento;
    }


    @Override
    public String toString() {
        String s1 = "NOMBRE DEL CLIENTE\t\tARTICULO\t\tCANTIDAD\t\tIVA\t\tPRECIO FINAL\n";
        String s2 = new String();
        for(Map.Entry<Articulo, Integer> articulo : carrito.entrySet()) {
            Articulo a = articulo.getKey();
            System.out.println(nombreCliente + "\t\t" + a.getNombre() + getCantidadArticulo(a)
            + "\t\t" + a.getIva().getProcentaje() + "\t\t" + a.getPrecioFinal());
            System.out.println();

        }
        return s1.concat(s2);
    }
}
