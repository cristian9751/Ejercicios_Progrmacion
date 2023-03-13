package UD4_EstructurasDatos.Strings.ejercicios1;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un texto");
        String cadena = in.nextLine().toLowerCase();

        int sumA = 0;
        int sumE = 0;
        int sumI = 0;
        int sumO = 0;
        int sumU = 0;


        for(int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a':
                    sumA ++;
                    break;
                case 'e':
                    sumE ++;
                    break;
                
                case 'i':
                    sumI ++;
                    break; 
                case 'o':
                    sumO ++;
                    break;
                case 'u':
                    sumU ++;
                    break;
            };
        }

        System.out.println("Numero de A: " + sumA);
        System.out.println("Numero de E: " + sumE);
        System.out.println("Numero de I: " + sumI);
        System.out.println("Numero de O: " + sumO);
        System.out.println("Numero de U: " + sumU);
    }
}
