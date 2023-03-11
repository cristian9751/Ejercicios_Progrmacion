package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB4;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB4
 * @created 10/3/23
 */
public class articulo {

    //ATRIBUTOS ESTATICOS
    String nombre;
    Double iva = 21.0;

    //ATRIBUTOS DINAMICOS
    Double precio;
    int CuantosQuedan;

    public articulo(String nombre, Double precio, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
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
