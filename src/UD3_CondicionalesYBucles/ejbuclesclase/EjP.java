package UD3_CondicionalesYBucles.ejbuclesclase;

import java.util.Scanner;

public class EjP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean fin = false;
        int passc = 1234;
        int i = 1;
        String txt = "Introduce la clave: ";
        String resultado = null;

        do {
            System.out.println(txt);
            int pass = in.nextInt();
            i++;

            if(i > 3) {
                resultado = "Demasiados intentos fallidos. ";
                fin = true;
            } else {
                txt  = "Clave erronea. Intentelo de nuevo: ";
            }

            if(pass == passc) {
                resultado = "Clave correcta!";
                fin = true;
            }
        } while (!fin);

        System.out.print(resultado);
    }
}
