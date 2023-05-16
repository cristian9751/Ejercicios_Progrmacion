package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.*;

public class TienDAM {
    private static String menuPrincipal =
            "MENU PRINCIPAL " + "\n" +
            "1. Almacen" + "\n" +
            "2. Pedido" + "\n" +
            "3. Crear un nuevo articulo" + "\n" +
            "4. Salir"  + "\n";

    private static String menuAlmacen =
            "MENU ALMACEN " + "\n" +
            "1.Ver articulos" + "\n" +
            "2. Buscar articulo " + "\n" +
            "3. Recibir articulo " + "\n" +
             "4. Devolve articulo " + "\n" +
             "5. Agregar articulo " + "\n" +
             "6. Eliminar articulo " + "\n" +
             "7. Salir" + "\n";

    private static String menuPedido =
            "MENU PEDIDOS " + "\n" +
                "1.Crear un nuevo pedido" + "\n" +
             "2. Eliminar un pedido " + "\n" +
             "3. Aplicar descuento a un pedido" + "\n" +
             "4. Modificar pedido " + "\n" +
             "5. Hacer compra " + "\n" +
             "6. Ver pedidos " + "\n" +
             "7. Salir" + "\n";

    private static String menuModificarPedido =
            "MENU MODIFICAR PEDIDO" + "\n" +
            "1. Agregar articulo " + "\n" +
            "2. Eliminar articulo" + "\n" +
            "3. MModificar cantidad" + "\n" +
            "4. Salir" + "\n";
    private static Scanner in = new Scanner(System.in);


    /**
     * Metodo que muestra los elementos de un ArrayList
     * @param lista ArrayList del cual queremos mostrar sus elementos
     * @param txt Texto que se imprimira por pantalla
     */
    private static void  mostrarLista(List lista, String txt) {
        if(lista.isEmpty()) {
            System.out.println("No hay elementos que mostrar");
            return;
        }

        Iterator itLista = lista.iterator();
        int contador = 0;
        System.out.println(txt);
        while(itLista.hasNext()) {
            System.out.println("ID: " + contador + "\n" + itLista.next());
            contador++;
        }
    }

    private static String pideString(String txt) {
        System.out.println(txt);
        String respuesta = new String();
        boolean valido = true;
        do {
            try {
                respuesta = in.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un texto");
                valido = false;
            }
        }while(!valido);

        return respuesta;
    }

    private static int pideInt(String txt) {
        System.out.println(txt);
        int respuesta = 0;
        boolean valido = true;
        do {
            try{
                respuesta = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un numero entero");
                valido = false;
            }
        }while(!valido);

        in.nextLine(); //SE LIMPIA EL BUFFER DEL SCANNER

        return respuesta;
    }

    private static Double pideDouble(String txt) {
        System.out.println(txt);
        boolean valido = true;
        Double respuesta = 0.0;
        do {
            try {
                respuesta = in.nextDouble();
                in.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un nuemero con un decimal, siguiendo el siguiente formato:" +
                        " 0.0");
                valido = false;
            }
        } while(!valido);

        in.nextLine();
        return respuesta;
    }

    private static TiposIva pideIva() {
        List<TiposIva> tipos = Arrays.asList(TiposIva.values());
        int sel = obtenerId(tipos,"Tipos de iva disponibles: ",
                "Selecciona la id del tipo  de iva que se va a aplicar");
        return tipos.get(sel);
    }

    /**
     * Metodo que muestra el menu y recoge la opcion escogida por el usuario que posteriormente pasa como
     * parametro a la funcion ManejarOpcioon
     * @param menu String que seran las opciones del menu
     * @param opcionFinal Ultima opcion del menu
     * @param almacen Instancia de almacen
     * @param articulo Instancia de articulo
     * @param pedido Instancia de pedido
     */
    private static void recogerOpcion(String menu , int opcionFinal, Almacen almacen, Articulo articulo, Pedido pedido) {
        int opcion = 0;

        do {
            System.out.print(menu);
            opcion = pideInt("Selecciona una opcion");
            manejarOpcion(opcion, menu, almacen, articulo, pedido);
        } while(opcion != opcionFinal);



    }

    /**
     * Dado el menu maneja al metodo correspondiente al cual debe pasar la opcion escogida y el resto de parametros
     * @param opcion Opcion escogida por el usuario
     * @param menu Opciones del menu
     * @param almacen Instancia de almacen
     * @param articulo Instancia de articulo
     * @param pedido Instancia de pedido
     */
    private static void manejarOpcion(int opcion, String menu, Almacen almacen, Articulo articulo, Pedido pedido) {

        if(menu.contains("MENU PRINCIPAL")) {
            manejarMenuPrincipal(opcion, almacen, articulo, pedido);
        } else if(menu.contains("MENU ALMACEN")) {
            manejarMenuAlmacen(opcion, almacen, articulo);
        }//CONTINUAR

        almacen = null;
        articulo = null;
        pedido = null;
    }


    /**
     * Metodo para esscoger un almacen
     * @return Almacen escogido por el usuario segun la id
     */
    private static Almacen escogerAlmacen() {
        if(Almacen.getAlmacenes().isEmpty()) {
            System.out.print("No se puede hacer esto porque no hay ningun almacen");
            Almacen nuevoAlmacen = crearAlmacen();
            return nuevoAlmacen;
        } else if(Almacen.getAlmacenes().size() == 1) {
            return Almacen.getAlmacen(0);
        } else {
            int sel = obtenerId(Almacen.getAlmacenes(), "Lista de almacenes disponibles",
                    "Selecciona un almacen");
            return Almacen.getAlmacen(sel);
        }

    }


    /**
     * Metodo que pregunta al usuario si quiere añadir un almacen
     * @return Devuelve null si no se crea un almacen, o en caso contrario, devuelve el nuevo almacen
     */
    private static Almacen crearAlmacen() {
        String respuesta = pideString("¿Quieres crear un nuevo almacen?(SI para crear uno nuevo): ");
        if(respuesta.toUpperCase().equals("SI")) {
            System.out.println("Almacen creado correctamente");
            return new Almacen();
        } else {
            return null;
        }
    }

    /**
     * Metodo que crea un nuevo articulo
     * @return Devuelve el nuevo articulo que se ha creado
     */

    private static Articulo crearArticulo() {
        Articulo nuevoArticulo = null;
        String nombre = pideString("Introduce el nombre del nuevo articulo");
        Double precioSinIva = pideDouble("Introduce el  precio del articulo sin iva");
        int cantidad = pideInt("Introduce la cantidad de " + nombre + " que va a haber en el almacen inicialmente");
        TiposIva tipoIva = pideIva();
        try {
            nuevoArticulo = new Articulo(nombre, precioSinIva, tipoIva, cantidad);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if(nuevoArticulo != null) {
                System.out.println("Se ha creado el articulo " + nombre + " correctamente");
            }
        }
        return nuevoArticulo;
    }

    /**
     * Metodo que maneja el menu principal
     * @param opcion Opcion escogida por el usuario en el menu principal
     * @param almacen
     * @param articulo
     * @param pedido
     */
    private static void manejarMenuPrincipal(int opcion, Almacen almacen, Articulo articulo, Pedido pedido) {
        //SI LA OPCION NO ES LA 3 SE TENDRA QUE ESCOGER EL ALMACE N
        if(opcion != 3 && opcion != 4) {
            almacen = escogerAlmacen();
        }
        //SI EL ALMACEN ES NULO LA FUNCION TERMINA Y VUELVE A DONDE FUE LLAMADA
        if(almacen == null && opcion != 3 && opcion != 4)
            return;
        switch (opcion) {
            case 1:
                recogerOpcion(menuAlmacen, 7, almacen, articulo, pedido);
                break;
            case 2:
                recogerOpcion(menuPedido, 7, almacen, articulo, pedido);
                break;
            case 3:
                crearArticulo();
                break;
            case 4:
                System.out.println("Has seleccionado salir. Hasta la proxima");
                break;
            default:
                System.out.println("Debes seleccionar una opcion del 1 al 3.");
                break;

        }
    }

    /**
     * Metodo en el que dada una lista se muestra la lista y se pide el resultado hasta que este sea una posicion
     * valida en dicha lista
     * @param lista Lista de la cual queremos obtener la posicon
     * @param txt Parametro que se pasa como argumento  al metodo mostrarlista
     * @param txt2 Texto que se muestra por pantalla al usuario
     * @return
     */
    private static int obtenerId(List lista , String txt, String txt2) {
        int resultado = 0;
        boolean valido = true;
        do {
            mostrarLista(lista, txt);
            resultado = pideInt(txt2);
            try {
                lista.get(resultado);
            } catch(IndexOutOfBoundsException e ) {
                System.out.println("La id que has seleccionado no existe. Intentalo de nuevo");
                valido = false;
            }
        } while(!valido);
        return resultado;
    }

    /**
     * Metodo que ustilizando obtenerId devulve la posicion de un articulo en la lista de articulos de un almacen
     * @param busqueda Nombre del articulo del cual se quiere saber la posicion
     * @param almacen Almacen en el cual se encuentra el articulo del cual queremos saber la posicion
     * @return
     */
    private static int obtenerIdArticulo(String busqueda, Almacen almacen) {
        List lista = almacen.buscarArticulo(busqueda);
        return obtenerId(lista, "Articulos cuyo nombre coindide con " + busqueda, "Seleccioe la " +
                " IS del articulo ");
    }


    /**
     * Metodo que maneja el menu almacen
     * @param opcion
     * @param almacen
     * @param articulo
     */

    private static void manejarMenuAlmacen(int opcion, Almacen almacen, Articulo articulo) {
        String busqueda = new String();
        int idArticulo = 0;
        switch (opcion) {
            case 1:
                //MUESTRA LA LISTA DE ARTICULOS DEL ALMACEN
                mostrarLista(almacen.getArticulos(), "Lista de articulos del almacen: ");
                break;
            case 2:
                //MUESTRA EL RESULTADO DE UNA BUSQUEDA DE ARTICULOS EN EL ALMACEN SEGUN EL NOMBRE
               busqueda = pideString("Introduce el nombre del articulo que quieres buscar: ");
                mostrarLista(almacen.buscarArticulo(busqueda), "Articulos cuyo nombre coincide con: " +
                        busqueda);
                break;
            case 3:
                //AUMENTA LA CANTIDAD DE UN ARTICULO TRAS RECIBIR UNIDADES DEL MISMO
                busqueda = pideString("Introduce el nombre del  articulo que se ha recibido");
                idArticulo = obtenerIdArticulo(busqueda, almacen);
                articulo = almacen.getArticulo(idArticulo);

                try  {
                    articulo.aumentarCantidad(pideInt("Introduce la cantidad recibida de "
                    + articulo.getNombre()));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
                break;

            case 4:
                //DEVUELVE ARTICULOS
                busqueda = pideString("Introduce el nombre del articulo que se va a devolver");
                idArticulo = obtenerIdArticulo(busqueda, almacen);
                articulo = almacen.getArticulo(idArticulo);
                try {
                    articulo.reducirCantidad(pideInt("Introduce la cantidad que se ha devuelto de " +
                             articulo.getNombre()));
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                }
                break;


            case 5:
                busqueda = pideString("Introduce el nombre del articulo que quieres agregar al almacen: ");
                idArticulo = obtenerId(Articulo.getArticulosList(), "Lista de articulos que se pueden añadir"
                , "Selecciona la id del articulo que quieres agregar al almacen");
                articulo = Articulo.getArticulo(idArticulo);
                if(almacen.agregarArticulo(articulo)) {
                    System.out.println("Se ha añadido el articulo " + articulo.getNombre()
                     + " al almacen correctamente");
                } else {
                    System.out.println("No se ha podido añadir el articulo " + articulo.getNombre()
                    + " al almacen");
                }
                break;

            case 6:
                busqueda = pideString("Introduce el nomrbe del articulo que quieres eliminar del almacen");
                idArticulo = obtenerIdArticulo(busqueda, almacen);
                if(almacen.eliminarArticulo(idArticulo)) {
                    System.out.println("Se ha eliminado el articulo del almacen correctamente");
                } else {
                    System.out.println("No se ha podido eliminar el articulo del almacen");
                }
            case 7:
                System.out.println("Has seleccionado volver al menu principal");
                break;
            default:
                System.out.println("Debes seleccionar una opcion del 1 al 5");
                break;


        }
    }


    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Pedido pedido = null;
        Articulo articulo = null;;
        recogerOpcion(menuPrincipal, 4, almacen, articulo, pedido);
    }
}

