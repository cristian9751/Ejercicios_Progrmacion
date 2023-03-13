import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Texto 1: ");
        String s1 = in.nextLine();
        System.out.print("Texto 2: ");
        String s2 = in.nextLine();

        if(s1.equals(s2)) {
            System.out.println("Son exactamente iguales");
        } else if(s1.equalsIgnoreCase(s2)) {
            System.out.println("Son iguales ignorando mayusculas y minusculas");
        } else {
            System.out.println("No son iguales");
        }
    }
}
