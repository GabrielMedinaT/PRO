/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraybidimensionales;

/**
 *
 * @author gabriel
 */
public class ArrayBidimensionales {

    int[][] matriz = new int[4][8];
    int[][] matriz2 = { { 2, 3, 4, 5 }, { 3, 3, 2 } };
    int[][][] matriz3D = {
            { // Capa 1
                    { 2, 3, 4 },
                    { 5, 6, 7 },
                    { 8, 9, 10 }
            },
            { // Capa 2
                    { 11, 12, 13 },
                    { 14, 15, 16 },
                    { 17, 18, 19 }
            },
            {
                    { 11, 12, 13 },
                    { 14, 15, 16 },
                    { 17, 18, 19 }

            }
    };

    public int[][] matrizIdentidad(int tam) {
        int[][] m = new int[tam][tam];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = (i == j) ? 11 : 0;
            }
        }
        // imprimir el array
        for (int i = 0; i < m.length; i++) {
            System.out.println("");
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
        }
        return m;
    }

    public static void main(String[] args) {

        ArrayBidimensionales ab = new ArrayBidimensionales();

        ab.matrizIdentidad(8);

    }

}
