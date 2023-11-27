package TableroAjedrez;

public class TableroAjedrez {
    public static void main(String[] args) {
        dibujarTablero();
    }

    public static void dibujarTablero() {
        int filas = 8;
        int columnas = 8;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Alternar entre '*' y ' ' basado en la posición de la casilla
                if ((i + j) % 2 == 0) {
                    dibujarCasilla("*");
                } else {
                    dibujarCasilla(" ");
                }
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
    }

    public static void dibujarCasilla(String contenido) {
        // Dibujar una casilla de 3x3 caracteres con el contenido proporcionado
        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 2; j++) {
                System.out.print(contenido);
            }
            // Salto de línea después de cada fila de la casilla
           // System.out.println();
        }
    }
}

