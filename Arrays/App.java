package Arrays;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        pruebaVectores prueba = new pruebaVectores();
        ContadorDias contador = new ContadorDias(); // Instancia de ContadorDias
        int[] vector = prueba.crearVector(12);
        double[] vectorDouble = { 8, 9, 7, 10, 9, 8, 7 };
        int[] vectorInvertido = prueba.invertirVector(vector);
        int[] rotar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

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
        System.out.println("11. Contar días");
        System.out.println("12. Estadistica luz solar");

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
                System.out.println("indique el tamaño del vector: ");
                int tamanoVector = scanner.nextInt();
                int[] vector1 = new int[tamanoVector];
                for (int i = 0; i < vector1.length; i++) {
                    System.out.println("Introduzca el valor de la posicion " + i);
                    vector1[i] = scanner.nextInt();
                }
                System.out.println("Vector rotado a la izquierda: ");
                prueba.rotarIzquierda(vector1);
                break;
            case 9:
                System.out.println("Introduzca el tamaño del vector: ");
                int tamano = scanner.nextInt();
                System.out.println("Vector generado: ");
                prueba.generaArray(tamano);
                break;
            case 10:
                prueba.calcularFrecuencias();
                break;
            case 11:
                int dias = contador.contarDias(16, 11, 2023);
                System.out.println("Días transcurridos: " + dias);
                break;
            case 12:
                EstadisticaLuzSolar estadistica = new EstadisticaLuzSolar();
                System.out.println("Media de horas de sol: " + estadistica.getMediaSol());
                System.out.println("Mes más soleado: " + estadistica.mesMasSoleado());
                System.out.println("Mes menos soleado: " + estadistica.mesMenosSoleado());
                break;
            default:
                break;
        }

        scanner.close();
    }
}
