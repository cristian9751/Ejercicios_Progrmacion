package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
    private String nombre;
    private double precio_sin_iva;
    private int cantidad;
    private TiposIva iva;
    private static List<Articulo > articulosList = new ArrayList<>(); //LISTA DE TODOS LOS ARTICULOS EN GENERAL


    public Articulo(String nombre, double precio_sin_iva, TiposIva iva, int cantidad) throws Exception {
        setNombre(nombre);
        setPrecioSinIva(precio_sin_iva);
        this.iva = iva;
        if(cantidad < 0) {
           throw new Exception("La cantidad no puede ser  negativa o cero");
        } else {
            this.cantidad = cantidad;
        }

        articulosList.add(this);
    }

    public static Articulo getArticulo(int idArticulo) {
        return articulosList.get(idArticulo);
    }

    public static List<Articulo> getArticulosList() {
        return articulosList;
    }
    public String getNombre() {
        return nombre;
    }

    public boolean setNombre(String Nombre) throws Exception {
        boolean res = false;
        if(Nombre.length() > 1) {
            this.nombre = Nombre;
            res = true;
        } else {
            throw new Exception("El nombre debe de contener mas de una caracter");
        }
        return res;
    }

    public TiposIva getIva() {
        return iva;
    }

    public void setIva(TiposIva Iva) {
        this.iva = Iva;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    /**
     * Metodo que actualiza o indica el parametro PrecioSinIva de la instancia de articulo
     * @param Precio_Sin_Iva Double que se quiere indicar como PrecioSinIva
     * @return Devuelve true si se ha podido establecer el precioSinIva o false si no se ha podido
     * @throws Exception Si el precio es menor que 0
     */
    public boolean setPrecioSinIva(Double Precio_Sin_Iva) throws Exception {
        boolean res = false;
        if(Precio_Sin_Iva > 0) {
            this.precio_sin_iva = Precio_Sin_Iva;
            res = true;
        } else {
            throw new Exception("El precio sin iva debe de ser mayor que 0");
        }
        return res;
    }


    /**
     *
     * @return Double PrecioSinIva
     */
    public Double getPrecioSinIva() {
        return precio_sin_iva;
    }

    /***
     * Dado el precio sin iva y el procentaje calcula el precio final
     * @return Devuelve el precio final del articulo
     */
    public double getPrecioFinal() {
        return (precio_sin_iva + (precio_sin_iva * iva.getProcentaje() / 100));
    }

    /**
     * Aumenta el int parametro cantidad de la instancia de articulo correspondiente
     * @param Cantidad Nueva cantidad que queremos aplicar al parametro cantidad
     * @return Devuelve verdadero si se ha podido modificar la cantidad o false si no se ha podido
     */
    public boolean aumentarCantidad(int Cantidad) throws Exception {
        boolean res = false;
        int nueva_cantidad = this.cantidad + Cantidad;
        if(nueva_cantidad <= 0) {
            throw new Exception("La cantidad no puede  ser cero o menor que cero");
        } else {
            this.cantidad = nueva_cantidad;
            res = true;
        }
        return res;
    }


    public boolean reducirCantidad(int cantidad) throws  Exception {
        boolean res = false;
        int nueva_cantidad = this.cantidad -= cantidad;
        if(nueva_cantidad <= 0) {
            throw new Exception("La cantidad no puede ser cero o menor que cero");
        } else if(cantidad > this.cantidad) {
            throw new Exception("La cantidad no puede ser mayor  que la que hay en el almacen");
        } else {
            this.cantidad = nueva_cantidad;
            res = true;
        }
        return res;
    }



    public String toString() {
        return "\n----------\n"+
                "Nombre: " + nombre + "\n" +
                "Precio Sin Iva: " + precio_sin_iva + "€\n" +
                "IVA: " + iva.getNombre() + " " + "(" + iva.getProcentaje() + ")\n"+
                "Precio(Iva incluido): " + getPrecioFinal() + "€\n" +
                "Cantidad: " + cantidad + " unidades\n" +
                "----------\n";
    }
}
