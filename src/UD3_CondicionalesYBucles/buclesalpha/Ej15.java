package UD3_CondicionalesYBucles.buclesalpha;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean negativo = false;
        boolean nn = false;

        for(int i = 1; i<= 5; i++) {
            if(i == 1) {
                System.out.print("Introduce un numero: ");
            } else {
                System.out.print("Introduce otro numero: ");
            }

            int num = in.nextInt();

            if(num < 0) {
                negativo = true;
            } else if(num == 99) {
                nn = true;
            }
        }

        if(negativo) {
            System.out.println("Si han habido numeros negativos");
        } else {
            System.out.println("No han habido numeros negativos");
        }

        if(nn) {
            System.out.println("Si ha habido un 99");
        } else {
            System.out.println("No ha habido un 99");
        }
    }
}
