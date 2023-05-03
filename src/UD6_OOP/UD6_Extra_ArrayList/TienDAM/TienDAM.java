package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TienDAM {

    private static Scanner in = new Scanner(System.in).nextInt();
    private static void mostrarLista(List lista, String txt) {
        Iterator itLista = lista.iterator();
        int contador = 0;
        System.out.println(txt);
        while(itLista.hasNext()) {
            System.out.println("ID: " + contador + "\n" +  itLista.next());
        }
    }
    private static String pideString(String txt) {
        System.out.println(txt);
        return in.nextLine();
    }

    private static double pideDouble(String txt) {
        System.out.println(txt);
        return in.nextDouble();
    }

    private static int pideInt(String txt) {
        System.out.println(txt);
        return in.nextInt();
    }

    private static TiposIva pideTipoIva() {
        System.out.println("TIPOS DE IVA");
        System.out.println("ID \t TIPO DE IVA \t PROCENTAJE\n");
        TiposIva[] tipos = TiposIva.values();
        for(int i = 0; i<tipos.length; i++) {
            System.out.println(i + "\t"  + tipos[i].getNombre() + "\t" + tipos[i].getProcentaje() + "\n");
        }

        return tipos[pideInt("Introduce el ID  del tipo de iva que quieres aplicar")];
    }

    private static boolean checksArticulo(Articulo articulo)  {
        if(articulo.getNombre() == null) {
            System.out.println("El nombre debe de contener mas de un caracter alfanumerico");
        }
        if(articulo.getPrecioSinIva() == 0) {
            System.out.println("Debes de inidcar un precio mayor que 0");
        }
    }
    private static Articulo crearArticulo() {
        String nombre = pideString("Introduce el nombre del nuevo articulo: ");
        double precioSinIva = pideDouble("Introduce el precio sin iva del nuevo articulo: ");
        int cantidad = pideInt("Introduce la cantidad del nuevo articulo(Debe de ser superior a 0): ");
        TiposIva iva = pideTipoIva();
        return new Articulo(nombre, precioSinIva, iva, cantidad);
    }
    public static void main(String[] args) {
    }
}
