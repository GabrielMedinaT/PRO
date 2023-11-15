package Diccionario;

import java.util.Scanner;

public class InterfazDiccionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Diccionario diccionario = new Diccionario(10); // Puedes ajustar el número inicial de palabras

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Añadir palabra");
            System.out.println("2. Mostrar diccionario");
            System.out.println("3. Obtener traducción");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la palabra en castellano: ");
                    String castellano = scanner.nextLine();
                    System.out.print("Introduce la palabra en inglés: ");
                    String ingles = scanner.nextLine();
                    Palabra nuevaPalabra = new Palabra(castellano, ingles);
                    diccionario.insertarPalabra(nuevaPalabra);
                    break;
                case 2:
                    diccionario.escribirDiccionario();
                    break;
                case 3:
                    System.out.print("Introduce la posición de la palabra: ");
                    int posicion = scanner.nextInt();
                    Palabra palabraObtenida = diccionario.obtenerPalabra(posicion);
                    if (palabraObtenida != null) {
                        System.out.println("Traducción: " + palabraObtenida.getIngles());
                    }
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
