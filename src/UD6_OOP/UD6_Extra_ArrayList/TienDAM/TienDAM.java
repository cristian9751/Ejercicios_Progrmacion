package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.List;

public class TienDAM {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Articulo 1", 21.0, TiposIva.GENERAL, 10 );
        Almacen almacen = new Almacen();
        almacen.agregarArticulo(articulo1); //agregarArticulos funciona correctamente

        //almacen.eliminarArticulo(0); //Eliminar articulos funciona correctamente
        //System.out.println("Buscar funciona " + almacen.buscarArticulo(articulo1.getNombre()));

        Pedido pedido = new Pedido("Cliente 1");
        pedido.anyadirArticulo(articulo1, 10);
        System.out.println(pedido);

    }
}
