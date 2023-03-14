package UD6_OOP.EjerciciosIII_ArraysObjetos.Ejercicio_4Relojes;
import UD6_OOP.EjerciciosII_MasClases.Ejercicio4.Reloj;

public class main {
    private static Reloj[] relojes = {new Reloj(10, 11, 15), 
    new Reloj(13, 40, 0), new Reloj(15, 59, 12),
    new Reloj(12, 10, 5), new Reloj(17, 20, 8)};

    public static void tick60() {
        for(int i = 0; i<relojes.length; i++) {
            System.out.println("Inicio del reloj " + (i + 1) + " tick 60");
            for(int j = 0; j <= 60; j++) {
                System.out.print(j + "\t");
                relojes[i].tick(24);
            }
            System.out.println("Fin del reloj " + (i + 1) + " tick 60");
        }
    }

    public static void tick120() {
        for(int i = 0; i <= 60; i ++) {
            tick60();
        }
    }

    public static void main(String[] args) {
        tick120();
    }
    
}
