package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TienDAM {
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
        try {
            return in.nextLine();
        } catch InputMismatchException e {
            System.out.println();
        }
    }
}
