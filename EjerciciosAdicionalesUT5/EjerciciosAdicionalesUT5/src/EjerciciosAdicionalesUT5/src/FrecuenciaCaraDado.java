package EjerciciosAdicionalesUT5.EjerciciosAdicionalesUT5.src.EjerciciosAdicionalesUT5.src;

import java.util.Random;

public class FrecuenciaCaraDado {
    private static final int CARAS = 20;
    private Random random;
    private int[] frecuencia;

    public FrecuenciaCaraDado() {
        random = new Random(); // Inicializa el generador de números aleatorios
        frecuencia = new int[CARAS]; // Inicializa el array de frecuencias
    }

    public void tirarDado(int veces) { // Realiza un número de tiradas
        for (int i = 0; i < veces; i++) { // Incrementa la frecuencia de la cara obtenida en la tirada
            int resultado = random.nextInt(CARAS) + 1; // Genera un número aleatorio entre 1 y 6
            frecuencia[resultado -1 ]++; // Incrementa la frecuencia de la cara
        }
    }

    public void escribirFrecuencia() { // Muestra la frecuencia de cada cara
        System.out.println("Cara\tFrecuencia");
        for (int i = 0; i < CARAS; i++) {
            if (frecuencia[i] != 0) System.out.println((i + 1) + "\t" + frecuencia[i]);
        }
    }

    public static void main(String[] args) {
        FrecuenciaCaraDado tiradaDado = new FrecuenciaCaraDado();
        tiradaDado.tirarDado(10);
        tiradaDado.escribirFrecuencia();
    }
}

