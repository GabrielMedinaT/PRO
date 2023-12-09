package Cuadrado;

public class GeneradorSeries {

    public void serieAlfabeto() {
        char letra = 'A';

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(letra + "\t");
                letra = (char) ((letra - 'A' + 1) % 26 + 'A'); 
            }
            System.out.println();
        }
    }

    public void serieLetras() {
        char letra = 'A';
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(letra + "\t");
            }
            System.out.println();
            letra = (char) ((letra - 'A' + 1) % 26 + 'A');
        }
    }

    public void serieAlterna(int numFilas, int numColumnas) {
        for (int i = 0; i < numFilas; i++) {
            if (i % 2 == 0) {
                escribirFila('*', numColumnas);
            } else {
                escribirFila('=', numColumnas);
            }
        }
    }

    private void escribirFila(char car, int cuantas) {
        for (int i = 0; i < cuantas; i++) {
            System.out.print(car);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GeneradorSeries generador = new GeneradorSeries();

        System.out.println("Serie Alfabeto:");
        generador.serieAlfabeto();

        System.out.println("\nSerie Letras:");
        generador.serieLetras();

        System.out.println("\nSerie Alterna:");
        generador.serieAlterna(5, 20);
    }
}
