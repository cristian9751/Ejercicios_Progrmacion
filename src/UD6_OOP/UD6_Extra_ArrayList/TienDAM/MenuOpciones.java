package UD6_OOP.UD6_Extra_ArrayList.TienDAM;


public enum MenuOpciones {
    PRINCIPAL("MENU PRINCIPAL" ,  new String[]{"Almacen", "Pedidos", "Salir"}),
    SUBMENU_PEDIDOS("MENU PEDIOS", new String[]{"Ver pedidos", "Crear nuevo pedido", "Agregar articulo a pedido",
            "Eliminar articulo de pedido", "Modificar cantidades del pedido", "Realizar compra", "Volver al menu principal"
    , "Salir"}),
    SUBMENU_ALMACEN("MENU ALMACEN", new String[]{"Ver almacenes", "Crear nuevo almacen", "Eliminar almacen"
    , "Recibir articulos", "Devolver articulos", "Salir"});
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
        return opciones.length ;
    }

    public void mostrarOpciones() {
        for(int i = 0; i<opciones.length; i++) {
            System.out.println((i + 1) + ". " + opciones[i] + "\n");
        }
    }


}
