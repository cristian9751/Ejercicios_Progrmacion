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

    public static Coche crearCoche(int i) {
        String txt = "del vehiculo " + (i + 1);
        String modelo = PideString("Introduce el modelo " + txt + ": " );
        String color = PideString("Introduce el color " + txt + ": ");
        boolean metalizado = metalizado();
        int fabricacion = PideInt("Año de fabricacion " + txt +": ");
        String matricula = PideString("Matricula " + txt + ": ");
        modalidad_seguro modalidad = sel_modalidad();
        return new Coche(modelo, modalidad, metalizado, color, fabricacion, matricula);
       
    }

    static boolean metalizado() {
        int input = sel_dato("¿El color es metalizado?" +
                "(Si: 1 No: 2)");

        if(input == 1) {
            return true;
        } else {
            return false;
        }
    }

    static modalidad_seguro sel_modalidad() {
        int input = sel_dato("Selecciona la " +
                "modalidad  de seguro 1" +
                "o la modalidad 2");
        if(input == 1) {
            return modalidad_seguro.TERCEROS;
        } else {
            return modalidad_seguro.TODO_RIESGO;
        }

    }
    static int sel_dato(String texto) {
        int input;
        do {
            input = PideInt(texto);
            texto = "Debes introducir 1 o 2";
        } while(input != 1 && input != 2);

        return input;
    }


    public static void main(String[] args) {
        Coche coches[] = new Coche[3];
        for(int i = 0; i<coches.length; i++) {
            coches[i] = crearCoche(i);
        }
    }
}
