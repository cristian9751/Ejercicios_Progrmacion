package UD4_EstructurasDatos.Strings.ejercicios1;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String F = in.nextLine().toLowerCase();
        System.out.print("Introduce una palabra: ");
        String P = in.next().toLowerCase();

        if(F.startsWith(P)) {
            System.out.println("La frase " + F + " comienza con " + P);
        } else if(F.endsWith(P)) {
            System.out.println("La frase " + F + "termina con " + P);
        } else if(F.contains(P)) {
            System.out.println("La frase " + P + " contiene la palabra " + P);
        } else {
            System.out.println("La frase " + F + "no contiene la palabra " + P);
        }
    }
}
