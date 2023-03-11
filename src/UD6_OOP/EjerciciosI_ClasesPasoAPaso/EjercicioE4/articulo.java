package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioE4;

import java.util.Random;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB4
 * @created 10/3/23
 */
public class articulo {


    private Double iva;

    private final static Double ivas[] = {21.0, 10.0, 4.0};

    private  String nombre;
    private Double precio;
    private int CuantosQuedan = 100;

    public articulo(String nombre, Double precio, int cuantosQuedan, int sel_iva) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = ivas[sel_iva];
        CuantosQuedan = cuantosQuedan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Double getIva() {
        return this.iva;
    }
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCuantosQuedan() {
        return CuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        CuantosQuedan = cuantosQuedan;
    }


    private Double calc_proc(Double num_proc) {
        return num_proc / 100;
    }
    public Double pvp() {
        return precio * (calc_proc(iva) + 1);
    }

    public Double descuento_final(Double proc_descuento) {
        return this.precio - (this.precio * calc_proc(proc_descuento));
    }


    private boolean comprobar_stock(int resultado) {
        if(resultado > 0 && resultado < 100) {
            this.CuantosQuedan = resultado;
            return true;
        } else {
            return false;
        }
    }

    public boolean vender() {
        int resultado = this.CuantosQuedan -1;
        return comprobar_stock(resultado);
    }

    public boolean almacenar() {
        int resultado = this.CuantosQuedan +1;
        return comprobar_stock(resultado);
    }

    //METODO TO STRING
    public String toString() {
        return "articulo{" +
                "nombre='" + nombre + '\'' +
                ", iva=" + iva +
                ", precio=" + precio +
                ", CuantosQuedan=" + CuantosQuedan +
                '}';
    }

}
