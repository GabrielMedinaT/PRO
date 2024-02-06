
/**
 *
 * @author Gabriel Medina
 */
package programaexameno;

import java.util.Scanner;

public class ProgramaExamenO {
    /**
     * Método main que inicializa un menu .
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1 Número de pares ");
            System.out.println("2 Cuantas d/D en una palabra o frase");
            System.out.println("3 Salir");
            System.out.print("Selecciona una opción (1-3): ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número entre el 2 y el 100 por favor : ");
                    int numero = scanner.nextInt();
                    cuantosPares(numero);
                    break;
                case 2:
                    cuantasD();
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción ...... Inténtalo de nuevo.");
            }
        } while (opcion != 3);
    }

     /**
     * Método que realiza el cálculo de generar los pares de un número introducido por el usuario.
     */
    public static void cuantosPares(int numero) {
        if (numero < 100 ) {
            System.out.println("El número de pares que hay en  " + numero + " son : ");
            for (int i = 0; i <= numero; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println("El número introducido no es correcto volviendo a menú......");
        }
    }
    /**
     * Método que muestra la cantidad de d en miúsculas o matúsculas de una palabra o frase que introduzca el usuario .
     */
    public static void cuantasD() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese ......: ");
        String frase = scanner.nextLine();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'd' || frase.charAt(i) == 'D') {
                contador++;
            }
        }
        System.out.println("El número de D/d en la frase: " + contador);
    }
}
