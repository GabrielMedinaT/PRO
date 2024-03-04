
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
        int size = board.length;
        int subgridSize = (int) Math.sqrt(size);

        // Imprimir la parte superior del tablero
        System.out.println("+-------+-------+-------+");

        for (int fila = 0; fila < size; fila++) {
            System.out.print("| ");
            for (int columna = 0; columna < size; columna++) {
                System.out.print(board[fila][columna] + " ");
                if ((columna + 1) % subgridSize == 0) {
                    System.out.print("| ");
                }
            }
            System.out.println();

            // Imprimir las líneas horizontales divisorias
            if ((fila + 1) % subgridSize == 0) {
                System.out.println("+-------+-------+-------+");
            }
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },

                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },

                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        /*
         * int[][] boardLimpia = {
         * { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         * { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         * { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         *
         * { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         * { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         * { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         *
         * { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         * { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         * { 0, 0, 0, 0, 0, 0, 0, 0, 0 }
         * };
         */

        if (resolverSudoku(board)) {
            System.out.println("Sudoku resuelto:");
            imprimirSudoku(board);
        } else {
            System.out.println("+-------+-------+-------+");
            System.out.println("+-------+-------+-------+");
            System.out.println("+-------+-------+-------+");

            System.out.println("No se pudo resolver el Sudoku.");
            System.out.println("Asegúrate de que el Sudoku sea válido.");


            System.out.println("+-------+-------+-------+");
            System.out.println("+-------+-------+-------+");
            System.out.println("+-------+-------+-------+");

            //crear un array de 10 nombres
            String[] nombres = new String[10];
            //rellenar array
            nombres[0] = "Gabriel";
            nombres[1] = "Medina";
            nombres[2] = "Gonzalez";
            nombres[3] = "Luis";
            nombres[4] = "Miguel";
            nombres[5] = "Angel";
            nombres[6] = "Ricardo";
            nombres[7] = "Javier";
            nombres[8] = "Alejandro";
            nombres[9] = "Fernando";
            //imprimir array
            for (int i = 0; i < nombres.length; i++) {
                System.out.println(nombres[i]);
            }

            //crear funcion que multiplique matrice


            //crear funcion que sume matrices




        }
    }

}
