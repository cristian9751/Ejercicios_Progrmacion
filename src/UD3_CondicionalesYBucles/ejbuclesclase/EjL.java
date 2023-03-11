package UD3_CondicionalesYBucles.ejbuclesclase;

import java.util.Scanner;

public class EjL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 10 numeros tanto negativos como positivos");
        int positivos, negativos;
        positivos = 0;
        negativos = 0;
        for(int i = 1; i<= 10; i++) {
            String txt = null;
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
            System.out.print("introduce el " + txt + " numero: ");
            int num = in.nextInt();
            if(num < 0) {
                negativos ++;
            } else {
                positivos ++;
            }

        }

        System.out.println("Has introducido " + positivos + " numero/s positivo/s y " + negativos + " negativo/s");
    }
}
