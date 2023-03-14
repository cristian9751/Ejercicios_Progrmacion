package UD6_OOP.EjerciciosIII_ArraysObjetos.Ejercicio5_Dni;
import java.util.Random;

import javax.sound.sampled.SourceDataLine;

import UD6_OOP.EjerciciosII_MasClases.Ejercicio5.Dni;;;

public class main {

    public static Dni array_dni[] = new Dni[10000];
    public static char[] vocales = {'A', 'E', 'I', 'O', 'U'};

    public static void rellenar_array() {
        for(int i = 0; i<= array_dni.length; i++) {
            int dni_rand = Dni.dni_rand();
            array_dni[i] = new Dni(dni_rand);
            array_dni[i].imprime();
        }
    }

    public static void comprobar_vocales() {
        for(int i = 0; i< vocales.length; i++) {
            for(int j = 0; j<array_dni.length; j++) {
                if(array_dni[j].getLetra() == vocales[i]) {
                    array_dni[j].imprime();
                }
            }
        }
    }
    public static void main(String[] args) {
        rellenar_array();
        comprobar_vocales();
    }


}
