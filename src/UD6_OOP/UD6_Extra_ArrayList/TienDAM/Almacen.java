package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Articulo> articulos =new ArrayList<>();
    private static List<Almacen> almacenes = new ArrayList<>();
    public Almacen() {
        almacenes.add(this);
    }

    public List<Articulo> buscarArticulo(String nombre) {
        List<Articulo> resultado = new ArrayList<>();
        for(Articulo articulo : articulos) {
            if(articulo.getNombre().toUpperCase().contains(nombre.toUpperCase())) {
                resultado.add(articulo);
            }
        }
        return resultado;
    }

    public List<Articulo> getArticulos() {
        return this.articulos;
    }

    public boolean eliminarArticulo(int id_articulo) {
        if(!checkArticuloExists(articulos.get(id_articulo).getNombre())) {
            return false;
        } else {
            articulos.remove(id_articulo);
            return true;
        }
    }

    public boolean agregarArticulo(Articulo nuevo_articulo) {
        if(checkArticuloExists(nuevo_articulo.getNombre())) {
            return false;
        } else {
            articulos.add(nuevo_articulo);
            return true;
        }
    }

    public Articulo getArticulo(int idArticulo) {
        return articulos.get(idArticulo);
    }

    /**
     * Comprueba si el articulo esta en la lista de articulos de la instancia almacen correspondiente
     * @param nombre NOmbre del articulo que queremos comprobar
     * @return Devuelve un valor booleano. True si se encuentra o false si no se encuentra
     */
    private boolean checkArticuloExists(String nombre) {
        if(buscarArticulo(nombre).isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Comprueba si hay articulos añadidos en el almacen
     * @return Devuelve verdadero si hay articulos añadidos al almacen o falso si no
     */
    public boolean stockArticulos() {
        return articulos.isEmpty();
    }

    /**
     * Comprueba si hay instancias de almacen en la lista de almacenes
     * @return Devuelve verdadero si hay instancias en la lista o falso si no hay instancias
     */
    public static boolean isEmpty() {
        return almacenes.isEmpty();
    }

    /**
     * Devulve la cantidad de instancias de almacen que hay en la lista de almacenes
     * @return Devulve un entero que se corresponde a la cantidad de instancias en la lista
     */
    public static int getSize() {
        return almacenes.size();
    }

    /**
     * Metodo getter de almacen
     * @param idAlmacen Entero que se corresponde con la posicion que tiene la instancia de Almacen en la lista
     * @return Devulve la instancia de Almacen en la posicion de la lista
     */
    public static Almacen getAlmacen(int idAlmacen) {
        return almacenes.get(idAlmacen);
    }

    public static List<Almacen> getList() {
        return almacenes;
    }

    public static boolean checkExists(int idAlmacen) {
        if(almacenes.get(idAlmacen) == null) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean eliminarAlmacen(int idAlmacen) {
        if(!checkExists(idAlmacen)) {
            return false;
        } else {
            almacenes.remove(idAlmacen);
            return false;
        }
    }
}
