package UD3_CondicionalesYBucles.ejbuclesclase;

import java.util.Scanner;

public class EjM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean nn = false;
        String txt = null;
        for(int i = 1; i<= 10; i++) {
            switch (i) {
                case 1:
                    txt = "primer";
                    break;
                case 2:
                    txt = "segundo";
                    break;
                case 3:
                    txt = "tercer";
                    break;
                case 4:
                    txt = "cuarto";
                    break;
                case 5:
                    txt = "quinto";
                    break;
                case 6:
                    txt = "sexto";
                    break;
                case 7:
                    txt = "septimo";
                    break;
                case 8:
                    txt = "octavo";
                    break;
                case 9:
                    txt = "noveno";
                    break;
                case 10:
                    txt = "decimo";
                    break;
            }

            System.out.print("Introduce el " + txt + " numero: ");
            int num = in.nextInt();
            if(num == 99) {
                nn = true;
            }
        }
        if(nn) {
            System.out.println("Si has introducido un 99");
        } else {
            System.out.println("No has introducido un 99");
        }
    }
}
