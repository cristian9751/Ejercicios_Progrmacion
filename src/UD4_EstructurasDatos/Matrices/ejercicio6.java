package UD4_EstructurasDatos.Matrices;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array: ");
        int n = in.nextInt();
        int[][] cuadrado = new int[n][n];

        int esperado = -1;
        boolean magico = true;

        //Bucle para introducir valores en la matriz
        for(int f = 0; f<cuadrado.length; f++) {
            for(int c = 0; c<cuadrado.length; c++) {
                System.out.println("Introduce el valor " + f + " " + c);
                cuadrado[f][c] = in.nextInt();
            }
        }
        int diagonal_uno = 0;
        int diagonal_dos = 0;
        int sumacols = 0; 
        
        //Bucle para iterar filas
        for(int f = 0; f<cuadrado.length; f++) {
            int sumarows = 0;
            //Bucle anidado para iterar columnas
            for(int c = 0; c<cuadrado.length; c++) {
                sumacols = cuadrado[0][c];
                //Valor para sumar los valores de una misma fila
                sumarows += cuadrado[f][c];
                if(c == (cuadrado.length -1) - f) {
                    diagonal_dos += cuadrado[f][c];
                }

                if(f == 0) {
                    for(int i = 1; i<cuadrado.length; i++) {
                        sumacols += cuadrado[i][c];
                    }
    
                    if(c == 0) {
                        esperado = sumacols;
                    }
    
                    if(sumacols != esperado)
                        magico = false;
                    
                    sumacols = 0;
                }


            }
 
            

        
            //Valor para sumar los valores en diagonal desde arriba a la izquierda hasta abajo a la derecha
            diagonal_uno += cuadrado[f][f];

          if(sumarows != esperado) {
            magico = false;
          }
        
        }

        if(diagonal_uno != esperado || diagonal_dos != esperado) {
            magico = false;
        }

        if(magico) {
            System.out.println("La matriz es un cuadrado magico");
        } else {
            System.out.println("La matriz no es un cuadrado magico");
        }
    }
}
