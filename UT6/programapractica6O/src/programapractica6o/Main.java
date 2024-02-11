package programapractica6O;

import java.util.Scanner;

/**
 * Clase principal que contiene el programa de práctica 6O.
 */
public class Main {

    /**
     * Método principal que inicia el programa.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1: Calcular Algo 1.");
            System.out.println("2: Calcular Algo 2.");
            System.out.println("3: Salir");
            System.out.print("Selecciona una opción (1-3): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> Calculos.calcularAlgo1();
                case 2 -> Calculos.calcularAlgo2();
                case 3 -> System.out.println("Saliendo del programa. ¡Hasta luego!");
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 3);
    }
}
