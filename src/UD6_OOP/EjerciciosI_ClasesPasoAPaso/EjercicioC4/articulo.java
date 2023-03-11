package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioC4;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB4
 * @created 10/3/23
 */
public class articulo {

    //ATRIBUTOS ESTATICOS
    private  Double iva = 21.0;

    //ATRIBUTOS DINAMICOS

    private  String nombre;
    private Double precio;
    private int CuantosQuedan;

    public articulo(String nombre, Double precio, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        CuantosQuedan = cuantosQuedan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
