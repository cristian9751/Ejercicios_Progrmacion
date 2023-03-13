package UD6_OOP.EjerciciosIII_ArraysObjetos.Ejercicio2_Coches;

import java.util.Scanner;

import UD6_OOP.EjerciciosIII_ArraysObjetos.Ejercicio2_Coches.Coche.modalidad_seguro;

public class main {

    public static String  PideString(String txt) {
        System.out.println(txt);
        return new Scanner(System.in).nextLine();
    }

    public static int PideInt(String txt) {
        System.out.println(txt);
        return new Scanner(System.in).nextInt();
    }

    static Coche crearCoche() {
       String modelo = PideString("Introduce el modelo:");
       String color = PideString("Introduce el color: ");
       boolean metalizado = metalizado();
       int fabricacion = PideInt("Año de fabricacion: ");
       String matricula = PideString("Matricula: ");
       modalidad_seguro modalidad = sel_modalidad();
       return new Coche(modelo, modalidad, metalizado, color, fabricacion, matricula);
       
    }

    static modalidad_seguro sel_modalidad() {
        modalidad_seguro res = null;
        System.out.println("Modalidades de seguro ");
        int cont = 1;
        for (modalidad_seguro modalidad : modalidad_seguro.values()) {
            System.out.println("Modalidad " + cont + " - " + modalidad.getNombre());
            cont++;
        }

        int input = PideInt("Selecciona el numero de una modalidad ");
        if(input == 1) {
            res =  modalidad_seguro.TERCEROS;
        } else if(input == 2) {
            res =  modalidad_seguro.TODO_RIESGO;
        }
 
        return res;
    }

    static boolean metalizado() {
        boolean res = false;
        String input = PideString("¿El color es metalizado?(Si o No)");
        if(input.equalsIgnoreCase("Si")) {
            res = true;
        } else if(!input.equalsIgnoreCase("No")) {
            System.out.println("Debes introducir si o no en el valor metalizado");
        }

        return res;
    } 

    public static void main(String[] args) {
        Coche coches[] = new Coche[3];
        for(int i = 0; i<coches.length; i++) {
            coches[i] = crearCoche();
        }
    }
}
