package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.sql.Array;

public enum MenuOpciones {
    PRINCIPAL("MENU PRINCIPAL" ,  new String[]{"Almacen, Pedidos, Salir"}),
    ALMACEN("MENU_PRINCIPAL", new String[]{"1. Ver almacens", "2. Crear almacen",
    "Agregar articulos", "Retirar articulos", "Eliminar almacen"});
    String titulo;
    String[] opciones;
    private MenuOpciones(String titulo, String[] opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getOpcionFinal() {
        return opciones.length -1;
    }
    public void mostrarOpciones() {
        for(int i = 0; i< opciones.length; i++) {
            System.out.println(i + ". " + opciones[i]);
        }
    }
}
