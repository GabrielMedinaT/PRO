/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Gabriel Medina
 */
public class JavaApplication7 {


   public static boolean resolverSudoku(int[][] board) {
        // Encuentra la primera casilla sin asignar
        int[] noAsignado = encuentraSinAsignar(board);
        if (noAsignado[0] == -1) // Si no hay casillas sin asignar, el sudoku está resuelto
            return true;
        int fila = noAsignado[0];
        int columna = noAsignado[1];

        // Intenta colocar números del 1 al 9
        for (int num = 1; num <= 9; num++) {
            if (esSeguro(board,
                    fila, columna, num)) {
                board[fila][columna] = num; // Asigna el número si es seguro

                if (resolverSudoku(board)) // Llama recursivamente para resolver el sudoku
                    return true;

                board[fila][columna] = 0; // Retrocede si no es posible resolver con este número
            }
        }
        return false; // No se encontró ninguna solución válida
    }

    public static int[] encuentraSinAsignar(int[][] board) {
        int[] result = new int[] { -1, -1 };
        for (int fila = 0; fila < board.length; fila++) {
            for (int columna = 0; columna < board[0].length; columna++) {
                if (board[fila][columna] == 0) {
                    result[0] = fila;
                    result[1] = columna;
                    return result;
                }
            }
        }
        return result; // Retorna [-1, -1] si no hay casillas sin asignar
    }

    // Verifica si es seguro asignar el número num en la fila, columna y caja
    public static boolean esSeguro(int[][] board, int fila, int columna, int num) {
        return !usadaEnFila(board,
                fila, num) &&
                !usadaEnColumna(board, columna, num) &&
                !usadaEnCaja(board, fila - fila % 3, columna - columna % 3, num);
    }

    public static boolean usadaEnFila(int[][] board, int fila, int num) {
        for (int columna = 0; columna < board.length; columna++) {
            if (board[fila][columna] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean usadaEnColumna(int[][] board, int columna, int num) {
        for (int fila = 0; fila < board.length; fila++) {
            if (board[fila][columna] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean usadaEnCaja(int[][] board, int iniciarFilaEnCaja, int iniciarColumnaEnCaja, int num) {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (board[fila + iniciarFilaEnCaja][columna + iniciarColumnaEnCaja] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void imprimirSudoku(int[][] board) {
        for (int fila = 0; fila < board.length; fila++) {
            for (int columna = 0; columna < board[0].length; columna++) {
                System.out.print(board[fila][columna] + "|");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                { 0, 0, 8,  0, 0, 0,  0, 4, 0 },
                { 0, 6, 0,  0, 0, 3,  0, 0, 0 },
                { 2, 0, 0,  0, 5, 0,  1, 0, 8 },

                { 0, 0, 0,  0, 0, 0,  0, 0, 9 },
                { 8, 0, 0,  0, 1, 0,  7, 0, 5 },
                { 0, 0, 2,  8, 0, 0,  0, 0, 0 },

                { 0, 0, 0,  0, 4, 0,  0, 2, 0 },
                { 0, 0, 3,  0, 0, 5,  4, 0, 7 },
                { 7, 0, 0,  0, 0, 0,  0, 9, 0 }
        };
                /*int[][] boardLimpia = {
                { 0, 0, 0,  0, 0, 0,  0, 0, 0 },
                { 0, 0, 0,  0, 0, 0,  0, 0, 0 },
                { 0, 0, 0,  0, 0, 0,  0, 0, 0 },

                { 0, 0, 0,  0, 0, 0,  0, 0, 0 },
                { 0, 0, 0,  0, 0, 0,  0, 0, 0 },
                { 0, 0, 0,  0, 0, 0,  0, 0, 0 },

                { 0, 0, 0,  0, 0, 0,  0, 0, 0 },
                { 0, 0, 0,  0, 0, 0,  0, 0, 0 },
                { 0, 0, 0,  0, 0, 0,  0, 0, 0 }
        };*/
        

        if (resolverSudoku(board)) {
            System.out.println("Sudoku resuelto:");
            imprimirSudoku(board);
        } else {
            System.out.println("No se pudo resolver el Sudoku.");
        }
    }

}
