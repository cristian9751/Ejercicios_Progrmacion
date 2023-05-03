package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TienDAM {
    private static void mostrarLista(List lista, String txt) {
        Iterator it_lista = lista.iterator();
        int contador = 0;
        System.out.println(txt);
        while(it_lista.hasNext()) {
            System.out.println("ID: " + contador + "\n" +  it_lista.next());
        }
    }
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Articulo articulo = new Articulo("Articulo1", 21.0, TiposIva.GENERAL, 100);
        mostrarLista(Almacen.getList(), "Almacenes disponibles");
        Pedido pedido = new Pedido("Cliente1");
        mostrarLista(Pedido.getList(), "Pedidos: ");
        pedido.anyadirArticulo(articulo, 10);
    }
}
