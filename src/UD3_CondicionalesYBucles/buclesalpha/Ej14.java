package UD3_CondicionalesYBucles.buclesalpha;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean multiplodiez = false;
        for(int i = 1; i<= 5; i++) {
            if(i == 1) {
                System.out.print("introduce un numero: ");
            } else {
                System.out.print("introduce otro numero: ");
            }

            int num = in.nextInt();

            if(num % 10 == 0) {
                multiplodiez = true;
            }

        }

        if(multiplodiez) {
            System.out.println("Si hay un multiplo de diez");
        } else {
            System.out.println("No hay un multiplo de diez");
        }
    }
}
