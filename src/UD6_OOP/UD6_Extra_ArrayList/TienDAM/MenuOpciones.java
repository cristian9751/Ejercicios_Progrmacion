package UD6_OOP.UD6_Extra_ArrayList.TienDAM;


public enum MenuOpciones {
    PRINCIPAL("MENU PRINCIPAL" ,  new String[]{"Almacen, Pedidos, Salir"}),
    ALMACEN("MENU_PRINCIPAL", new String[]{"Ver almacenes", "Crear nuevo almacen",
    "Agregar  nuevoarticulo al almacen", "Retirar articulo del almacen", "Eliminar almacen",
            "Recibir unidades", "Devolver unidades"});
    String titulo;
    String[] opciones;
    MenuOpciones(String titulo, String[] opciones) {
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
        for(int i = 0; i<opciones.length; i++) {
            System.out.println((i + 1) + ". " + opciones[i] + "\n");
        }
    }


}
