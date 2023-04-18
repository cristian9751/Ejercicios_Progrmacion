package UD6_OOP.UD6_Extra_ArrayList.Ejercicio1;

/**
 * Crea un programa que en su función ‘main’ haga lo siguiente en el orden indicado:
 * 1. Crear un ArrayList de cadenas de texto (String).
 * 2. Añadir varios String con diferentes colores (Rojo, Azul, Verde, Naranja y Blanco).
 * 3. Recorrer/iterar el ArrayList y mostrar por pantalla todos los colores.
 * 4. Añadir dos colores más al final de la lista (Negro y Cyan).
 * 5. Añadir dos colores más en la 1ª y 2ª posición (Amarillo y Magenta).
 * 6. Eliminar los colores de la 3ª y 4ª posición (Rojo y Azul).
 * 7. Volver a mostrar todos los colores por pantalla.
 */

import java.util.ArrayList;
import java.util.List;

public class Principal {

    protected static List<String> ListaColores = new ArrayList<>();
    protected static String[] Colores_Iniciales = {"Rojo", "Azul", "Verde", "Naranja", "Blanco"}; //Array de colores iniciales

    /***
     * Añade los colres del array de colores iniciales al arraylist ListaColores
     */
    protected static void Agregar_Inicial() {
        for(int  i = 0; i<Colores_Iniciales.length; i++) {
            ListaColores.add(Colores_Iniciales[i]);
        }
    }

    /***
     * Muestra la lista
     */
    protected static void mostrar_lista() {
        for(String  string : ListaColores) {
            System.out.println(string);
        }
    }
    protected static void main(String[] args) {
        Agregar_Inicial();
        mostrar_lista();
        ListaColores.add("Negro"); //Añade negro al final de la lista
        ListaColores.add("Cyan"); //Añade cyan al final de la lista
        ListaColores.add(1, "Amarillo");
        ListaColores.add(2, "Magenta");
        ListaColores.remove("Rojo");
        ListaColores.remove("Azul");
        mostrar_lista();
    }
}
