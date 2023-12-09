package EjerciciosAdicionalesUT5.EjerciciosAdicionalesUT5.src.EjerciciosAdicionalesUT5.src;
import java.util.Arrays;
import java.util.Random;

public class Histograma {
    private static final int MAX = 10;  // Cambia MAX al valor deseado
    private int[] valores;

    public Histograma() {
        valores = new int[MAX];
        inicializar();
    }

    private void inicializar() {
        for (int i = 0; i < MAX; i++) {
            valores[i] = generarAleatorio(5, 50);
        }
    }

    private int generarAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public void escribirHistograma() {
        System.out.println("Histograma:");
        for (int i = 0; i < MAX; i++) {
            System.out.print("Valor " + i + ": ");
            for (int j = 0; j < valores[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Histograma histograma = new Histograma();
        histograma.escribirHistograma();
    }
}

