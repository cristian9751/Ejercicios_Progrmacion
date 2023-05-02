package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

public class Articulo {
    private String nombre;
    private double precio_sin_iva;
    //private double precio_final; //Precio en el que se incluye el iva del atriculo
    private int cantidad;
    private TiposIva iva;

    public Articulo(String nombre, double precio_sin_iva, TiposIva iva, int cantidad) {
        setNombre(nombre);
        setPrecioSinIva(precio_sin_iva);
        this.iva = iva;
        if(cantidad > 0) {
            this.cantidad = cantidad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public boolean setNombre(String Nombre) {
        if(Nombre.length() > 1) {
            this.nombre = Nombre;
            return true;
        } else {
            System.out.println();
            return false;
        }
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

    public boolean setPrecioSinIva(Double Precio_Sin_Iva) {
        if(Precio_Sin_Iva > 0) {
            this.precio_sin_iva = Precio_Sin_Iva;
            return true;
        } else {
            return false;
        }
    }

    public Double get_precio_sin_iva() {
        return precio_sin_iva;
    }

    /***
     * Dado el precio sin iva y el procentaje calcula el precio final
     * @return Devuelve el precio final del articulo
     */
    public double getPrecioFinal() {
        return (precio_sin_iva + (precio_sin_iva * iva.getProcentaje() / 100));
    }

    public boolean aumentarCantidad(int Cantidad) {
        int nueva_cantidad = this.cantidad + Cantidad;
        if(nueva_cantidad <= 0) {
            return false;
        } else {
            this.cantidad = nueva_cantidad;
            return true;
        }
    }

    public boolean reducirCantidad(int Cantidad) {
        int nueva_cantidad = this.cantidad - Cantidad;
        if(nueva_cantidad <= 0) {
            return false;
        } else {
            this.cantidad = nueva_cantidad;
            return true;
        }
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
