package UD6_OOP.UD6_Extra_ArrayList.TienDAM;


public enum MenuOpciones {
    PRINCIPAL("MENU PRINCIPAL" ,  new String[]{"Almacen, Pedidos, Salir"}),
    ALMACEN("MENU ALMACENES", new String[]{"Ver almacenes", "Crear nuevo almacen", "Eliminar almacen"}),

    SUBMENU_ALMACEN("MENU ARTICULOS", new String[]{ "Ver articulos del almacen", "Añadir articulos al almacen"
    , "Eliminar articulo del almacen", "Recibir unidades de un articulo", "Devolver unidades de un articulo"}),

    SUBMENU_PEDIDOS("MENU PEDIOS", new String[]{"Ver pedidos", "Crear nuevo pedido", "Agregar articulo a pedido",
            "Eliminar articulo a pedido", "Modificar pedido"});
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
