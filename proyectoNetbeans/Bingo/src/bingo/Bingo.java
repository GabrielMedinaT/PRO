
package bingo;

/**
 *
 * @author gabriel
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class Bingo {
    // Constantes de clase
    private static final int FILAS = 3;
    private static final int COLUMNAS = 5;

    // Matriz para almacenar los números del cartón
    private int[][] carton;

    // Constructor
    public Bingo() {
        carton = new int[FILAS][COLUMNAS];
        generarNuevoCarton();
    }

    // Método para generar un nuevo cartón
    private void generarNuevoCarton() {
        Random random = new Random();

        for (int j = 0; j < COLUMNAS; j++) {
            int inicioRango = 1 + (j * 17);
            int finRango = inicioRango + 16;

            for (int i = 0; i < FILAS; i++) {
                int numero;
                do {
                    numero = random.nextInt(17) + inicioRango;
                } while (estaNumero(numero));

                carton[i][j] = numero;
            }
        }
    }

    // Método para comprobar si un número está en el cartón
    private boolean estaNumero(int numero) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (carton[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    // Clase interna para representar la posición de un número en el cartón
    private class Posicion {
        int fila;
        int columna;

        public Posicion(int fila, int columna) {
            this.fila = fila;
            this.columna = columna;
        }
    }

    // Método para obtener la posición de un número en el cartón
    private Posicion obtenerPosicionNumero(int numero) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (carton[i][j] == numero) {
                    return new Posicion(i, j);
                }
            }
        }
        return null;
    }

    // Método para tachar un número en el cartón
    public void tacharNumero(int numero) {
        Posicion posicion = obtenerPosicionNumero(numero);
        if (posicion != null) {
            carton[posicion.fila][posicion.columna] = 0;
        }
    }

    // Método para verificar si hay línea en una fila específica
    public boolean esLinea(int fila) {
        for (int j = 0; j < COLUMNAS; j++) {
            if (carton[fila][j] != 0) {
                return false; // Hay un número sin tachar en la fila
            }
        }
        return true; // Todos los números en la fila están tachados
    }

    // Método para verificar si se ha hecho bingo
    public boolean esBingo() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (carton[i][j] != 0) {
                    return false; // Hay un número sin tachar en el cartón
                }
            }
        }
        return true; // Todos los números en el cartón están tachados
    }

    // Método para mostrar el cartón al usuario
    public void escribirCarton() {
        StringBuilder cartonStr = new StringBuilder("Cartón de Bingo:\n");

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                cartonStr.append(carton[i][j]).append("\t\t");
            }
            cartonStr.append("\n");
        }

        JOptionPane.showMessageDialog(null, cartonStr.toString(), "Cartón de Bingo", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Bingo cartonBingo = new Bingo();
        cartonBingo.escribirCarton();
        cartonBingo.esBingo();
    }
}

