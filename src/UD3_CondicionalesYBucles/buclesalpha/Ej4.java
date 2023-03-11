package UD3_CondicionalesYBucles.buclesalpha;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Mostrar los numeros de menor a mayor");
        System.out.print("Introduce el numero menor: ");
        int menor = in.nextInt();
        System.out.println("Introduce el numero mayor: ");
        int mayor = in.nextInt();
        int cont = 1;
        boolean fallido = false;
        while (mayor < menor && !fallido) {
            System.out.print("Debes introducir un numero mayor que " + menor );
            mayor = in.nextInt();
            cont ++;
            if(cont > 3)
                fallido = true;
        }

        if(fallido) {
            System.out.println("Demasiados intentos fallidos");
            return;
        }
        
        for(int i = mayor; i >= menor; i--) {
            System.out.println(i);
        }

    }
}
