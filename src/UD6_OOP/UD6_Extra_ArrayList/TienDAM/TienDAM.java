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
             "5. Salir " + "\n";

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

        in.nextLine();

        return respuesta;
    }

    private static Double pideDouble(String txt) {
        System.out.println(txt);
        boolean valido = true;
        in.nextLine();
        Double respuesta = 0.0;
        do {
            try {
                respuesta = in.nextDouble();
                return respuesta;
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un nuemero con un decimal, siguiendo el siguiente formato:" +
                        " 0.0");
            }
        } while(!valido);

        return respuesta;
    }

    private static TiposIva pideIva() {
        List<TiposIva> tipos = Arrays.asList(TiposIva.values());
        int sel = obtenerId(tipos,"Tipos de iva disponibles: ",
                "Selecciona la id del tipo  de iva que se va a aplicar");
        return tipos.get(sel);
    }
    private static void recogerOpcion(String menu , int opcionFinal, Almacen almacen, Articulo articulo, Pedido pedido) {
        int opcion = 0;

        do {
            System.out.print(menu);
            opcion = pideInt("Selecciona una opcion");
            manejarOpcion(opcion, menu, almacen, articulo, pedido);
        } while(opcion != opcionFinal);



    }

    private static void manejarOpcion(int opcion, String menu, Almacen almacen, Articulo articulo, Pedido pedido) {

        if(menu.contains("MENU PRINCIPAL")) {
            manejarMenuPrincipal(opcion, almacen, articulo, pedido);
        } else if(menu.contains("MENU ALMACEN")) {
            manejarMenuAlmacen(opcion, almacen, articulo);
        }

        almacen = null;
        articulo = null;
        pedido = null;
    }


    private static Almacen escogerAlmacen() {
        if(Almacen.getAlmacenes().isEmpty()) {
            System.out.print("No se puede hacer esto porque no hay ningun almacen");
           Almacen nuevoAlmacen = crearAlmacen();
           return nuevoAlmacen;
        } else {
            int sel = obtenerId(Almacen.getAlmacenes(), "Lista de almacenes disponibles", "Selecciona un almacen");
            return Almacen.getAlmacen(sel);
        }

    }


    private static Almacen crearAlmacen() {
        String respuesta = pideString("¿Quieres crear un nuevo almacen?(SI para crear uno nuevo): ");
        if(respuesta.toUpperCase().equals("SI")) {
            System.out.println("Almacen creado correctamente");
            return new Almacen();
        } else {
            return null;
        }
    }

    private static Articulo crearArticulo() {
        Articulo nuevoArticulo = null;
        String nombre = pideString("Introduce el nombre del nuevo articulo");
        Double precioSinIva = pideDouble("Introduce el  precio del articulo sin iva");
        int cantidad = pideInt("Introduce la cantidad de " + nombre + " que va a haber en el almacen inicialmente");
        TiposIva tipoIva = pideIva();
        try {
            nuevoArticulo = new Articulo(nombre, precioSinIva, tipoIva, cantidad);
            System.out.println("Se ha creado el articulo con exito");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return nuevoArticulo;
    }
    private static void manejarMenuPrincipal(int opcion, Almacen almacen, Articulo articulo, Pedido pedido) {
        if(opcion != 3) {
            almacen = escogerAlmacen();
        }
        if(almacen == null)
            return;
        switch (opcion) {
            case 1:
                recogerOpcion(menuAlmacen, 5, almacen, articulo, pedido);
                break;
            case 2:
                recogerOpcion(menuPedido, 6, almacen, articulo, pedido);
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

    private static int obtenerId(List lista , String txt, String txt2) {
        int resultado = 0;
        boolean valido = true;
        do {
            mostrarLista(lista, txt);
            resultado = pideInt(txt2);
            try {
                lista.get(resultado);
            } catch(IndexOutOfBoundsException e ) {
                System.out.println("La id que has seleccionado no existe");
                valido = false;
            }
        } while(!valido);
        return resultado;
    }

    private static int obtenerIdArticulo(String busqueda, Almacen almacen) {
        List lista = almacen.buscarArticulo(busqueda);
        return obtenerId(lista, "Articulos cuyo nombre coindide con " + busqueda, "Seleccioe la " +
                " IS del articulo ");
    }

    private static void manejarMenuAlmacen(int opcion, Almacen almacen, Articulo articulo) {
        String busqueda = new String();
        int idArticulo = 0;
        switch (opcion) {
            case 1:
                mostrarLista(almacen.getArticulos(), "Lista de articulos del almacen: ");
                break;
            case 2:
               busqueda = pideString("Introduce el nombre del articulo que quieres buscar: ");
                mostrarLista(almacen.buscarArticulo(busqueda), "Articulos cuyo nombre coincide con: " +
                        busqueda);
                break;
            case 3:
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
                System.out.println("Has seleccionado volver al menu principal");
                break;
            default:
                System.out.println("Debes seleccionar una opcion del 1 al 5");
                break;


        }
    }


    public static void main(String[] args) {
        Almacen almacen = null;
        Pedido pedido = null;
        Articulo articulo = null;;
        recogerOpcion(menuPrincipal, 3, almacen, articulo, pedido);
    }
}

