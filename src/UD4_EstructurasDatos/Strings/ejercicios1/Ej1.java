import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Escribe algo: ");
        String str = in.nextLine();

        System.out.println("Minusculas: " + str.toLowerCase());
        System.out.println("Mayusculas: " + str.toUpperCase());
    }
}
