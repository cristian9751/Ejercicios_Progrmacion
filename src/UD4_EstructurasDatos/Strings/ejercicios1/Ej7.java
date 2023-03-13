import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String F = in.nextLine().toLowerCase();
        System.out.print("Introduce la palabra para reemplazar: ");
        String P1 = in.next().toLowerCase();
        System.out.println("Introduce la palabra por la que reemplazar: ");
        String P2 = in.next().toLowerCase();

        System.out.println(F.replaceAll(P1, P2));
    }
}
