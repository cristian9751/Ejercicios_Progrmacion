package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

public class Articulo {
    private String Nombre;
    private Double Precio_Sin_Iva;
    private Double Precio_Final; //Precio en el que se incluye el iva del atriculo
    private int Cantidad;
    private TiposIva Iva;

    public Articulo(String Nombre, Double Precio_Sin_Iva, TiposIva Iva, int Cantidad) {
        this.Nombre = Nombre;
        this.Precio_Sin_Iva = Precio_Sin_Iva;
        this.Iva = Iva;
        this.Cantidad = Cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public boolean setNombre(String Nombre) {
        if(Nombre.length() > 1) {
            this.Nombre = Nombre;
            return true;
        } else {
            return false;
        }
    }

    public TiposIva getIva() {
        return Iva;
    }

    public void setIva(TiposIva Iva) {
        this.Iva = Iva;
    }

    public boolean setPrecio_Sin_Iva(Double Precio_Sin_Iva) {
        if(Precio_Sin_Iva > 0) {
            this.Precio_Sin_Iva = Precio_Sin_Iva;
            return Calc_Precio_Final();
        } else {
            return false;
        }
    }

    public Double getPrecio_Sin_Iva() {
        return Precio_Sin_Iva;
    }

    public Double getPrecio_Final() {
        return Precio_Final;
    }
    private boolean Calc_Precio_Final() {
        Double Precio = (Precio_Sin_Iva * Iva.getProcentaje()) / 100;
        if(Precio <= 0) {
            return false;
        } else {
            this.Precio_Final = Precio;
            return true;
        }
    }

    public boolean Aumentar_Cantidad(int Cantidad) {
        int nueva_cantidad = this.Cantidad + Cantidad;
        if(nueva_cantidad <= 0) {
            return false;
        } else {
            this.Cantidad = nueva_cantidad;
            return true;
        }
    }

    public boolean Reducir_Cantidad(int Cantidad) {
        int nueva_cantidad = this.Cantidad - Cantidad;
        if(nueva_cantidad <= 0) {
            return false;
        } else {
            this.Cantidad = nueva_cantidad;
            return true;
        }
    }


    public String toString(String Nombre, Double Precio_Sin_Iva, Double Precio_Final, int cantidad, TiposIva Iva) {
        return "----------\n"+
                "Nombre: " + Nombre + "\n" +
                "Precio Sin Iva: " + Precio_Sin_Iva + "€\n" +
                "IVA: " + Iva.getNombre() + " " + "(" + Iva.getProcentaje() + ")\n"+
                "Precio(Iva incluido): " + Precio_Final + "€\n" +
                "----------\n";
    }
}
