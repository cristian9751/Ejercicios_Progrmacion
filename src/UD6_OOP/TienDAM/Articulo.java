package UD6_OOP.TienDAM;
public class Articulo {
    private String Nombre;
    private Double Precio_Sin_Iva;
    private Double Precio_Final;
    private int Cantidad;
    private TiposIva TipoIva;

    public Articulo(String Nombre, Double Precio_Sin_Iva, TiposIva TipoIva, int Cantidad) {
        this.Nombre = Nombre;
        this.Precio_Sin_Iva = Precio_Sin_Iva;
        this.TipoIva = TipoIva;
        this.Cantidad = Cantidad;
        this.Calc_Precio_Final();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Double getPrecio_Sin_Iva() {
        return Precio_Sin_Iva;
    }

    public void setPrecio_Sin_Iva(Double precio_Sin_Iva) {
        Precio_Sin_Iva = precio_Sin_Iva;
    }

    public TiposIva getTipoIva() {
        return TipoIva;
    }

    public void setTipoIva(TiposIva tipoIva) {
        TipoIva = tipoIva;
    }

    public int getCantidad() {
        return Cantidad;
    }

    private void Calc_Precio_Final() {
        this.Precio_Final = (Precio_Sin_Iva * TipoIva.getProcentaje()) / 100;
    }

    public boolean Aumentar_Cantidad(int cantidad) {
        if(cantidad > 0) {
            this.Cantidad += cantidad;
            return true;
        } else {
            return false;
        }
    }

    public boolean Disminuir_Cantidad(int cantidad) {
        if(cantidad > 0) {
            this.Cantidad -= cantidad;
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Articulo{" +
                "Nombre='" + Nombre + '\'' +
                ", Precio_Sin_Iva=" + Precio_Sin_Iva +
                ", Precio_Final=" + Precio_Final +
                ", Cantidad=" + Cantidad +
                ", TipoIva=" + TipoIva +
                '}';
    }}


