package UD4_EstructurasDatos.Matrices;

import java.util.Random;
import java.util.Scanner;

public class tenraya {
    //Metodo para mostrar el tablero
    public static void mostrar(char[][] tablero) {
        for(int f = 0; f<tablero.length; f++) {
            for(int c = 0; c<tablero.length; c++) {
                System.out.print(tablero[f][c] + "\t");
            }
            System.out.println();
        }
    }

    //Metodo para validar la coordenada de la ficha
    public static boolean validar(int f, int c, char[][] tablero) {
        if(f <= 2 && c<= 2 && tablero[f][c] == '.') {
            return true;
        } else {
            return false;
        }
    } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] tablero = new char[3][3];

        //Bucle para rellenar el tablero con .
        for(int f = 0; f<tablero.length; f++) {
            for(int c = 0; c<tablero.length; c++) {
                tablero[f][c] = '.';
            }
        }

        //Contador de rondas
        int ronda = 0;
        //Cont de fichas consecutivas
        int cont = 0;

        int fila = 0;

        int col = 0;

        //Bucle para la partida
        while(ronda <= 9) {
            //Inicializa el cont a 0 
            cont = 0;
            //Valor que almacena la fila y columna 
            fila = 0;
            col = 0;
            //Si es par es turno del jugador, sino, es turno de la maquina
            if(ronda % 2 == 1) {
                boolean valido = false;
                String txt = "Es tu turno";
                //Pide la fila y la columna al jugador
                while(!valido) {
                    System.out.println(txt);
                    System.out.println("Introduce la fila: ");
                    fila = in.nextInt();
                    System.out.println("Introduce la columna: ");
                    col = in.nextInt();
                    valido = validar(fila, col, tablero);
                    txt = "Coordenadas invalidas, intentalo de nuevo otra vez";

                }
                tablero[fila][col] = 'O';
                mostrar(tablero);
        
            } else {
      
                System.out.println("Turno de la maquina:");
                boolean valido = false;
                while(!valido) {
                    //Genera la fila y la columna de manera random
                    fila = new Random().nextInt(tablero.length);
                    col = new Random().nextInt(tablero.length);
                    valido = validar(fila, col, tablero);
                }

                tablero[fila][col] = 'X';
                mostrar(tablero);
           
            }
            ronda++;
            
            if(ronda < 2)
                continue;

            //Comprueba el tres en raya de la fila
            for(int f = 0; f<tablero.length; f++) {
                for(int c = 0; c< tablero.length -1; c++) {
                    if(tablero[f] [ c + 1] == tablero[f][c] && tablero[f][c] != '.') {
                        cont++;
                    }
                }

            }

            //Reinicia el contador
            if(cont == 3) {
                break;
            } else {
                cont = 0;
            }

            //Comprueba el tres en raya en la columna
            for(int f = 0; f<tablero.length; f++) {
                for(int c = 0; c < tablero.length -1; c++) {
                    if(tablero[f][c + 1] == tablero[f][c] && tablero[f][c] != '.') {
                        cont++;
                    }
                }
            }

            if(cont == 2) {
                break;
            } else {
                cont = 0;
            }

            //Comprueba los tres en raya en diagonal

            for(int f = 0; f<tablero.length -1; f++) {
                for(int c = 0; c<tablero.length -1; c++) {
                    if(tablero[f + 1][c + 1] == tablero[f][c] && tablero[f][c] != '.') {
                        cont++;
                    }
                      
                      if(c == (tablero.length -1) / 2 && f == (tablero.length -1) / 2) {
                        if(tablero[f][c] != '.') {
                            if(tablero[f][c] == tablero[f + 1][c - 1] 
                            && tablero[f][c] == tablero[f - 1][c + 1]){
                                cont = 2;
                            }
                        }
                    } 
                }
            }

            if(cont == 2) {
                break;
            } else {
                cont = 0;
            }

        }

        if(tablero[fila][col] == 'X') {
            System.out.println("Ha ganado la maquina");
        } else if(tablero[fila][col] == 'O') {
            System.out.println("Has ganado la partida");
        }
    }
}

