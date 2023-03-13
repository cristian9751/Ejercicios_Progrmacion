import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        String nombre = in.nextLine();
        System.out.print("Introduce el primer apillido: ");
        String apellido = in.nextLine();
        System.out.print("Introduce el segundo apellido: ");
        String apellido2 = in.nextLine();

        System.out.print("Respuesta: ");
        System.out.println((nombre.substring(0,3) + apellido.substring(0, 3) + apellido2.substring(0, 3)).toUpperCase());

    }
}
