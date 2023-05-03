package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TienDAM {
    private static void mostrarLista(List lista, String txt) {
        Iterator itLista = lista.iterator();
        int contador = 0;
        System.out.println(txt);
        while(itLista.hasNext()) {
            System.out.println("ID: " + contador + "\n" +  itLista.next());
        }
    }
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Articulo articulo = new Articulo("Articulo1", 21.0, TiposIva.GENERAL, 100);
        mostrarLista(Almacen.getList(), "Almacenes disponibles");
        Pedido pedido = new Pedido("Cliente1");
        pedido.anyadirArticulo(articulo, 10);
        mostrarLista(Pedido.getList(), "Pedidos: ");
    }
}
