package UD4_EstructurasDatos.Matrices;

import java.util.Scanner;

public class appnotas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce cuantas notas maximo vas a introducir");
        int max = 100;
        int[] notas = new int[max];
        String[] nombres = new String[max];

        int opcion; 
        int pos = 0;

        do {
            System.out.println();
            System.out.println("1. Ver notas");     
            System.out.println("2. Añadir nota");
            System.out.println("3. Borrar nota");
            System.out.println("4. Estadistica");
            System.out.println("5. Ver suspendidos");
            System.out.println("6. Salir del menu");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                 for(int i = 0; i<pos; i++) {
                        System.out.println("Nota alumno " + nombres[i] + ": " + notas[i]);
                }
                    break;

                case 2: 
                    in.nextLine();
                    System.out.print("Introduce el nombre del alumno: ");
                    nombres[pos] = in.nextLine();
                    System.out.print("INtroduce la nota de " + nombres[pos]);
                    notas[pos] = in.nextInt();
                    System.out.println("Se ha añadido al alumno " + nombres[pos] + " con la nota: " + notas[pos]);
                    pos++;
                    break;
                case 3:
                    in.nextLine();
                    System.out.print("Introduce el nombre del alumno a buscar: ");
                    String alumno = in.nextLine();
                    int pos_alumno = 0;

                    for(int i = 0; i<max; i++) {
                        if(nombres[i].equalsIgnoreCase(alumno)) {
                            pos_alumno = i;
                            break;
                        }
                    }

                    for(int i = pos_alumno; i<= (pos - 1); i++) {
                        nombres[i] = nombres[i + 1];
                        notas[i] = notas[i + 1];
                    }
                    pos--;
                    break;

                case 4:
                    int suma = 0;
                    int min = notas[0];
                    int maximo = notas[0];
                    for(int i = 0; i<pos; i++) {
                        if(notas[i] > maximo) {
                            maximo = notas[i];
                        }

                        if(notas[i] < min) {
                            min = notas[i];
                        }

                        suma += notas[i];

                    }

                    int media =  suma / (pos + 1);
                    System.out.println("La media de todas las notas es " + media);
                    System.out.println("La nota maxima es " + maximo);
                    System.out.println("La nota minima es " + min);
                break;
                case 5:
                    System.out.println("Suspendidos: ");
                    for(int i = 0; i<pos; i++) {    
                        if(notas[i] < 5) {
                            System.out.print(nombres[i] + " : " + notas[i]);
                        }
                    }
                break;
                case 6:
                    System.out.println("Adios");
                break;
                default:
                    System.out.println("Debes de seleccionar una opcion del menu(Del 1 al 6)");
                    break;
            }
        } while (opcion != 6);
    }
}
