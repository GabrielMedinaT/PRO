package EjerciciosAdicionalesUT5.EjerciciosAdicionalesUT5.src.EjerciciosAdicionalesUT5.src;
import java.util.Arrays;
import java.util.Random;

public class FrecuenciaDado {
    private static final int MAX = 7;  // Cambia MAX al valor deseado
    private int[] valores;

    public FrecuenciaDado() {
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

    public void escribirFrecuenciaDado() {
        int veces = 0;
        System.out.println("FrecuenciaDado:");
        for (int i = 1; i < MAX; i++) {
            System.out.print("Valor " + i + ": ");
            for (int j = 0; j < valores[i]; j++) {
                veces++;
            }
            System.out.print(valores[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FrecuenciaDado dado = new FrecuenciaDado();
        dado.escribirFrecuenciaDado();
    }
}

