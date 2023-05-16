package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.ArrayList;
import java.util.List;


public class Almacen {
    private List<Articulo> articulos =new ArrayList<>();
    private static List<Almacen> almacenes = new ArrayList<>();

    /**
     * Constructor vacio de almacen que añade dicho almacen al arraylist estatico almacenes
     */
    public Almacen() {
        almacenes.add(this);
    }

    /**
     * Metodo que devulve el restultado de una busqueda
     * @param nombre Nombre del articulo que se busca
     * @return Devulve una lista de los articulos cuyo nombre coincide o contiene el string busqueda
     */
    public List<Articulo> buscarArticulo(String nombre) {
        List<Articulo> resultado = new ArrayList<>();
        for(Articulo articulo : articulos) {
            if(articulo.getNombre().toUpperCase().contains(nombre.toUpperCase())) {
                resultado.add(articulo);
            }
        }
        return resultado;
    }

    /**
     * Metodo para obtener la lista de articulos de la instancia de almacen correspondiente
     * @return Devuelve un arraylist de articulos
     */
    public List<Articulo> getArticulos() {
        return this.articulos;
    }

    /**
     * Metodo que elimina un articulo de un almacen
     * @param id_articulo posicion de l articulo que se quiere eliminaren el arraylist de articulo
     * @return Devuelve true si se ha podido eliminar el articulo del almacen en caso contrario devuelve false
     */
    public boolean eliminarArticulo(int id_articulo) {
        if(!checkArticuloExists(articulos.get(id_articulo).getNombre())) {
            return false;
        } else {
            articulos.remove(id_articulo);
            return true;
        }
    }

    /**
     * Metodo que agrega un articulo a la instancia de almacen correspondiente
     * @param nuevo_articulo Articulo que se quiere añadir al almcen
     * @return Devuelve true si se ha añadido el articulo al almacen o false si no se ha podido añadir
     */
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

    /**
     * Getter de la lista de almacenes
     * @return Devuelve la lista estatica de almacenes
     */
    public static List<Almacen> getAlmacenes() {
        return almacenes;
    }

    /**
     * Metodo que comprueba si existe un almacen
     * @param idAlmacen Se le pasa una posicion del arraylist estatico de almacenes
     * @return Devuelve booleano si existe el almacen o devulve false si no existe el almacen
     */
    public static boolean checkExists(int idAlmacen) {
        if(almacenes.get(idAlmacen) == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Metodo que quita un almacen del arraylist estatico almacenes
     * @param idAlmacen Posicion que tiene el almacen que queremos eliminar en el arraylist estatico de almacenes
     * @return
     */
    public static boolean eliminarAlmacen(int idAlmacen) {
        if(!checkExists(idAlmacen)) {
            return false;
        } else {
            almacenes.remove(idAlmacen);
            return false;
        }
    }

}
