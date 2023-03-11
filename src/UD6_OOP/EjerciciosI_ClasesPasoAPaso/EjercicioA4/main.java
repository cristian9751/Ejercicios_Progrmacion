package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioA4;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioA4
 * @created 10/3/23
 */
public class main {
    public static void main(String[] args) {
        articulo miarticulo = new articulo();
        miarticulo.nombre = "MiProducto";
        miarticulo.precio = 256.0;
        miarticulo.CuantosQuedan = 7;

        System.out.println(miarticulo.toString());
    }

}
