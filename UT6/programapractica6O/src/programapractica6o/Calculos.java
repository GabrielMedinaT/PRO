package programapractica6O;

import java.util.Scanner;

/**
 * Clase que contiene los métodos de cálculo.
 */
public class Calculos {

    /**
     * Método que realiza el cálculo 1.
     */
    public static void calcularAlgo1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero < 20) {
            System.out.println("Cálculo para " + numero + ": " + realizarCalculo1(numero));
        } else {
            System.out.println("El número ingresado es mayor o igual a 20. Intenta nuevamente.");
        }
    }

    /**
     * Método recursivo que realiza el cálculo 1.
     * 
     * @param n El número para el cálculo.
     * @return El resultado del cálculo.
     */
    public static int realizarCalculo1(int n) {
        if (n <= 1) {
            return n;
        } else {
            return realizarCalculo1(n - 1) + realizarCalculo1(n - 2);
        }
    }

    /**
     * Método que realiza el cálculo 2.
     */
    public static void calcularAlgo2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número (n): ");
        int n = scanner.nextInt();
        System.out.print("Ingrese el segundo número (r): ");
        int r = scanner.nextInt();

        if (n >= r) {
            System.out.println("Operación (" + n + " sobre " + r + "): " + realizarCalculo2(n, r));
        } else {
            System.out.println("El primer número (n) debe ser mayor o igual al segundo número (r). Intenta nuevamente.");
        }
    }

    /**
     * Método recursivo que realiza el cálculo 2.
     * 
     * @param n El primer número.
     * @param r El segundo número.
     * @return El resultado del cálculo.
     */
    public static long realizarCalculo2(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        } else {
            return realizarCalculo2(n - 1, r - 1) + realizarCalculo2(n - 1, r);
        }
    }
}
