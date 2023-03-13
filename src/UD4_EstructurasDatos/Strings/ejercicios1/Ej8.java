package UD4_EstructurasDatos.Strings.ejercicios1;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String F = in.nextLine().toLowerCase();
        System.out.println("Introduce una palabra para buscar: ");
        String P = in.nextLine().toLowerCase();
        int  cont = 0;
        int pos = F.indexOf(P);

        while(pos != -1) {
            pos = F.indexOf(P, (pos + 1));
            cont++;
        }

        System.out.println("La palabra " + P.toUpperCase() + "  esta " + cont + " veces ");

         
    }
}
