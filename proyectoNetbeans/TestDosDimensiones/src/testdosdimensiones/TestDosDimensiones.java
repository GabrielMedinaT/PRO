
package testdosdimensiones;

public class TestDosDimensiones {
    private static final int FILAS = 3;
    private static final int COLUMNAS = 2;
    private static final int DIAMETRO = 20;

    private Circulo[][] circulosEn;

    public TestDosDimensiones() {
        circulosEn = new Circulo[FILAS][COLUMNAS];
        rellenarArray();
    }

    private void rellenarArray() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                Punto centro = new Punto(j * DIAMETRO, i * DIAMETRO);
                circulosEn[i][j] = new Circulo(centro, DIAMETRO);
            }
        }
    }

    public void escribirArray() {
        System.out.println("Matriz de Círculos:");
        for (int i = 0; i < FILAS; i++) {
            System.out.println("Circulos en la fila " + (i+1));
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(circulosEn[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        TestDosDimensiones test = new TestDosDimensiones();
        test.escribirArray();
    }
}
