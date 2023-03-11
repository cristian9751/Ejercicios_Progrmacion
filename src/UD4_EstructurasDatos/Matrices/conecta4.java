package UD4_EstructurasDatos.Matrices;

import java.util.Random;
import java.util.Scanner;

public class conecta4 {

    //Metodo para mostrar el tablero
    public static void mostrar(char[][] tablero) {

        for(int i = 0; i<tablero[0].length; i++) {
            System.out.print("\t" + i);
        }

        System.out.println();

        for(int f = 0; f< tablero.length; f++) {
            System.out.print(f + " - " + "\t");
            for(int c = 0; c < tablero[f].length; c++) {
                System.out.print(tablero[f][c] + "\t");
            }

            System.out.println();
        }
    }
    //Funcion que devuelve true si hay posiciones disponibles en la columna
    public static boolean columnspace(int[] contcols , int columna) {
        if(contcols[columna] == 6) {
            return false;
        } else {
            return true;
        }
    }

    //Funcion que devuelve la fila libre dentro de la columna
    public static int getfila(int columna, char[][] tablero, int[] contcols) {
        return (tablero.length -1) - contcols[columna];
    }

    //Funcion que devuelve true si hay 4 fichas en columna
    public static boolean columncheck(char[][] tablero) {
        boolean res = false;
        for(int c = 0; c < tablero[0].length; c++) {
            for(int f = tablero.length -1; f >= 3; f--) {
                if(tablero[f][c] != '.') {
                    if(tablero[f - 1][c] == tablero[f][c] && tablero[f - 2][c] == tablero[f][c]
                    && tablero[f - 3][c] == tablero[f][c]) {
                        res = true;
                        break;
                    }
                }
            }
        }

        return res;
    }

    //Funcion que devuelve true si hay 4 fichas en fila
    public static boolean rowcheck(char[][] tablero) {
        boolean res = false;
        for(int f = tablero.length -1; f > 0; f--) {
            for(int c = 0; c <= 3; c++) {
                if(tablero[f][c] != '.') {
                    if(tablero[f][c + 1] == tablero[f][c]
                    && tablero[f][c + 2] == tablero[f][c]
                    && tablero[f][c + 3] == tablero[f][c]) {
                        res = true;
                        break;
                    }
                }
            }
        }
        return res;
    }

    //Funcion que devuelve true si hay 4 fichas en diagonal izquierda-derecha
    public static boolean diagonalcheck(char[][] tablero) {
        boolean res = false;
        for(int f = 0; f<= 2; f++) {
            for(int c = 0; c <= 3; c++) {
                if(tablero[f][c] != '.') {
                    if(tablero[f + 1][c + 1] == tablero[f][c]
                    && tablero[f + 2][c + 2] == tablero[f][c]
                    && tablero[f + 3][c + 3] == tablero[f][c]) {
                        res = true;
                        break;
                    }
                }
            }
        }
        return res;
    }
    //Funcion que devuelve true si hay 4 fichas en diagonal derecha-izquierda
    public static boolean diagonalinvcheck(char[][] tablero) {
        boolean res = false;
        for(int f = 0; f<=2; f++) {
            for(int c = tablero.length -1; c >= 3; c--) {
                if(tablero[f][c] != '.') {
                    if(tablero[f + 1][c - 1] == tablero[f][c]
                    && tablero[f + 2][c - 2] == tablero[f][c]
                    && tablero[f + 3][c - 3] == tablero[f][c]) {
                        res = true;
                        break;
                    }
                }
            }
        }

        return(res);
    }

    //Metodo para insertar una ficha
    public static void insertar(char[][] tablero, int[] contcols, int columna, char caracter) {
        String txt1 = new String();
        int fil = getfila(columna, tablero, contcols);
        tablero[fil][columna] = caracter;
        contcols[columna] ++;

        if(caracter == 'X') {
            txt1 = "La maquina ha colocado la ficha ";
        } else if(caracter == 'O') {
            txt1 = "Has colocado la ficha ";
        }
        System.out.println( txt1 +"en la posicion f" + fil + " c" + columna);
        mostrar(tablero);
    }
    //Funcion que devuelve la columna en la que se va a colocar la ficha
    public static int asignarcolumna(int[] contcols, int columna, char[][] tablero, char caracter) {
        while(!columnspace(contcols, columna)) {
            columna++;
        }
        insertar(tablero,contcols, columna, caracter);
        return columna;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] tablero = new char[6][7];

        //Bucle que inicializa el tablero a .
        for(int f = 0; f< tablero.length; f++) {
            for(int c = 0; c<tablero[f].length; c++) {
                tablero[f][c] = '.';
            }
        }

        //Declaracion de array para contar las filas utilizadas en una columna
        int[] contcols = new int[tablero[0].length];
        //Contador de los turnos de la partida
        int turno = 0;
        //Total de posiciones que tiene el tablero
        int size = tablero.length * tablero[0].length;
        //Columna en la que se quiere insertar la ficha
        int columna = 0;
        //Inicializa booleano para saber si hay o no hay ganador de la partida
        boolean ganador = false;

        //Bucle principal de la partida
        while(turno < size) {
            columna = 0;
            //Si el turno es par es el turno del jugador, si es impar es el turno de la maquina
            if(turno % 2 == 1) {
                System.out.println("ES TU TURNO: ");
                mostrar(tablero);
                System.out.println("Introduce la columna (0 - " + (tablero[0].length -1) + ")");
                columna = in.nextInt();
                columna = asignarcolumna(contcols, columna, tablero, 'O');      
            } else {
                System.out.println("VA A JUGAR LA MAQUINA: ");
                mostrar(tablero);
                columna = new Random().nextInt(tablero[0].length);
                columna = asignarcolumna(contcols, columna, tablero, 'X');      
                
            }
            turno++;
            //Si el turno es menor que cuatro para la ejecucion y vuelve al principio
            if(turno < 4)
                continue;

    
            if(columncheck(tablero) || rowcheck(tablero) || diagonalcheck(tablero) || diagonalinvcheck(tablero)){
                ganador = true;
                break;
            }

        }
        //Una vez finalizado el bucle comprueba si hay ganador de ser asi muestra cual
        System.out.println("RESULTADO FINAL:");

        if(!ganador) {
            System.out.println("La partida ha terminado en empate");
        } else {
            int fila = getfila(columna, tablero, contcols) + 1;
            if(tablero[fila][columna] == 'X') {
                System.out.println("La maquina ha ganado la partida");
            } else if(tablero[fila][columna] == 'O') {
                System.out.println("Has ganado la partida");
            }
        }
        

        mostrar(tablero);
    }
}
