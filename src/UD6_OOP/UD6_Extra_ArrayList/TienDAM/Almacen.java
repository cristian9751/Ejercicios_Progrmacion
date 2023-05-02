package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Articulo> articulos =new ArrayList<>();
    public Almacen() {
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

    public boolean eliminarArticulo(int id_articulo) {
        if(!checkExists(articulos.get(id_articulo).getNombre())) {
            return false;
        } else {
            articulos.remove(id_articulo);
            return true;
        }
    }

    public boolean agregarArticulo(Articulo nuevo_articulo) {
        if(checkExists(nuevo_articulo.getNombre())) {
            return false;
        } else {
            articulos.add(nuevo_articulo);
            return true;
        }
    }

    /**
     * Comprueba si el articulo esta en la lista de articulos de la instancia almacen correspondiente
     * @param nombre NOmbre del articulo que queremos comprobar
     * @return Devuelve un valor booleano. True si se encuentra o false si no se encuentra
     */
    private boolean checkExists(String nombre) {
        if(buscarArticulo(nombre).isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkEmpty() {
        return articulos.isEmpty();
    }

    @Override
    public String toString() {
        return "Articulos del Almacen:\n" +
                articulos;
    }
}
