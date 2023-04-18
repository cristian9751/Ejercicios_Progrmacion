package UD6_OOP.UD6_Extra_ArrayList.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    protected static List<Integer> notas = new ArrayList<>();
    protected static boolean  comprobar_nota(int nota) {
        boolean res = false;
        if(nota >= 0 && nota <= 10) {
            res = true;
        } else  {
            System.out.println("La nota debe estar entre 0 y 10. Introduce -1 si quieres dejar de introducir" +
                    " notas");
        }

        if(nota == -1) {
            res = true;
        }

        return res;
    }

    protected static void mostrar_notas() {
        for(Integer nota : notas) {
            if(nota != -1) {
                System.out.println(nota);
            }
        }
    }

    protected static int count_aprobados() {
        int contador = 0;
        for(Integer nota : notas) {
            if(nota >= 5 && nota != -1) {
                contador++;
            }
        }
        return contador;
    }

    protected static int count_suspendidos() {
        int contador = 0;
        for(Integer nota : notas) {
            if(nota <= 5 && nota != -1) {
                contador++;
            }
        }
        return contador;
    }

    protected static  int  PideNota(int num) {
        int res;
      do {
          System.out.println("Introduce la nota " + num);
          res = new Scanner(System.in).nextInt();
      } while(!comprobar_nota(res));

      return res;
    }


    protected static int CalcularMedia() {
        int suma = 0;
        for(Integer nota : notas) {
            suma += nota;
        }

        return suma / (notas.size() -1);
    }

    protected static void ImprimeExists(int num) {
        if(existe(num)) {
            System.out.println("Hay alumnos que tienen " + num);
        } else {
            System.out.println("No hay alumnos que tienen " + num);
        }
    }

    protected static boolean  existe(int num) {
        boolean res = false;
        for(Integer nota : notas) {
            if(nota == num) {
                res = true;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nota;
        int cont = 1;
        System.out.println("Puedes introducir notas hasta que introduzcas -1");
        do {
            nota = PideNota(cont);
            notas.add(nota);
            cont++;
        } while(nota != -1);

        System.out.println("TODAS LAS NOTAS: ");
        mostrar_notas();
        System.out.println("Hay " + count_aprobados() + " alunnos aprobados");
        System.out.println("hAY " + count_suspendidos() + " alumnos suspendidos");
        System.out.println("La media de todas las notas es " + CalcularMedia());
        ImprimeExists(0);
        ImprimeExists(10);
    }
}
