package Arrays;

import java.util.Scanner;

public class App {
    // array de 30 enteros ya predefinidos

    public static void main(String[] args) {

        pruebaVectores prueba = new pruebaVectores();
        int[] vector = prueba.crearVector(12);
        double[] vectorDouble = { 8, 9, 7, 10, 9, 8, 7 };
        int[] vectorInvertido = prueba.invertirVector(vector);
        int[] rotar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Vector original: ");
        prueba.imprimirVector(vector);

        System.out.println("Introduzca una opción : ");
        System.out.println("1. Invertir vector");
        System.out.println("2. Invertir vector sin copia");
        System.out.println("3. Calcular media");
        System.out.println("4. Calcular maximo");
        System.out.println("5. Encuentra pares");
        System.out.println("6. Rotar derecha");
        System.out.println("7. Rotar izquierda");
        System.out.println("8. Rotar derecha n veces");
        System.out.println("9. Genera array");
        System.out.println("10. Calcular frecuencias");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Vector invertido: ");
                prueba.imprimirVector(vectorInvertido);

                break;

            case 2:
                System.out.println("Vector original invertido sin crear copia: ");
                prueba.imprimirVector(vector);
                System.out.println("Vector invertido sin crear copia: ");
                prueba.invertirVectorSinCopia(vector);
                break;
            case 3:
                System.out.println("La media es: " + prueba.calcularMedia(vectorDouble));
                break;
            case 4:
                System.out.println("El maximo es: " + prueba.calculaMaximo(vectorDouble));
                break;
            case 5:
                System.out.println("Los pares son: ");
                prueba.encuentraPares(vector);
                break;
            case 6:
                System.out.println("Vector rotado a la derecha: ");
                prueba.rotarDerecha(rotar);
                break;
            case 7:
                System.out.println("Vector rotado a la izquierda: ");
                prueba.rotarIzquierda(rotar);
                break;
            case 9:
                System.out.println("Vector generado: ");
                prueba.generaArray(90);
                break;


            case 10:
                prueba.calcularFrecuencias();
                break;

            default:
                break;
        }


    }
}
