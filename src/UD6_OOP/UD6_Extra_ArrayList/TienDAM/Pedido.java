package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pedido {
    private static List<Pedido> pedidos = new ArrayList<>();
    private HashMap<Articulo,Integer> carrito= new HashMap<>();

    private String nombreCliente;

    Pedido(String nombre) {
        setNombre(nombre);
        pedidos.add(this);
    }

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

    public int addArticulo(Articulo articulo, int cantidad) {
        if(cantidad <= 0)
            return 0;
        if(cantidad > articulo.getCantidad())
            return 1;
        carrito.put(articulo,  cantidad);
        return 2;
    }

    public boolean removeArticulo(Articulo articulo) {
        if(!carrito.containsKey(articulo)) {
            return false;
        }
        carrito.remove(articulo);
        return true;
    }

    public static Pedido getPedido(int idPedido) {
        return pedidos.get(idPedido);
    }

    public boolean existsInPedido(Articulo articulo) {
        if(carrito.containsKey(articulo)) {
            return true;
        }
        return false;
    }

    public double getTotal() {
        Double resultado = 0.0;
        for(Articulo articulo : carrito.keySet()) {
            resultado += articulo.getPrecioFinal();
        }
        return resultado;
    }


    public double getTotal(double descuento) {
        return this.getTotal() - descuento;
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
