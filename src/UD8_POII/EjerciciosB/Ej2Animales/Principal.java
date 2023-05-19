package UD8_POII.EjerciciosB.Ej2Animales;

import org.w3c.dom.ls.LSOutput;

public class Principal {
    private static Animal animal1 = new Animal();
   private static Pajaro pajaro1 = new Pajaro();
    Pez pez1 = new Pez();

   private static Carpintero carpintero1 = new Carpintero();
  private static   Gallo gallo1 = new Gallo();

   private static PezPayaso pezpayaso1 = new PezPayaso();
   private static PezEspada pezespada1 = new PezEspada();

    public static void main(String[] args) {
        System.out.println(animal1);
        System.out.println(pajaro1);
        System.out.println(carpintero1);
        System.out.println(gallo1);
        System.out.println(pezpayaso1);
        System.out.println(pezespada1);
    }
}
