package UD3_CondicionalesYBucles.ejbuclesclase;

import java.util.Scanner;

public class EjO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe todos los numeros que quieras. Para parar introduce un 0");
        int acum = 0;
        boolean menorcien = false;
        int num = -1;
        do {
            acum++;
            System.out.print("Numero: " + acum);
            num = in.nextInt();
            if(num < 100) {
                menorcien = true;
            }
        } while (num != 0);
    }
}
