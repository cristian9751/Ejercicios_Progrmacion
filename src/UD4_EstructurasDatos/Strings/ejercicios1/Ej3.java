import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Texto 1: ");
            String s1 = in.nextLine();
            System.out.print("Texto 2: ");
            String s2 = in.nextLine();

            if(s1.compareToIgnoreCase(s2) < 0) {
                System.out.println(s1);
                System.out.println(s2);
            } else if(s1.compareToIgnoreCase(s2) > 0) {
                System.out.println(s2);
                System.out.println(s1);
            } else {
                System.out.println("El texto es identico");
            }

    }
}
