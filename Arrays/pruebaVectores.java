package Arrays;

public class pruebaVectores {

    public int[] crearVector(int tamaño) {
        int[] vector = new int[tamaño];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.round((float) Math.random() * 10);
        }
        return vector;
    }

    // invertir vector sin crear copia
    public void invertirVectorSinCopia(int[] vector) {
        int aux;
        for (int i = 0; i < vector.length / 2; i++) {
            aux = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = aux;

        }
    }

    // duplica vector y lo devuelve invertido
    public int[] invertirVector(int[] vector) {
        int[] vectorInvertido = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            vectorInvertido[i] = vector[vector.length - 1 - i];
        }
        return vectorInvertido;
    }

    // imprimir vector
    public void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }

    // calcular media de el vector
    public double calcularMedia(double[] vector) {
        String cadena = "";
        double media = 0;
        for (int i = 0; i < vector.length; i++) {
            cadena += vector[i] + ", ";
            media += vector[i];
        }
        System.out.printf("La media de las notas " + cadena + " \nEs: %.2f%n", media / vector.length);

        return media / vector.length;
    }

    public double calculaMaximo(double[] vector) {

        double maximo = vector[0];
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }
        return maximo;
    }

    // *Ejericio 5.8
    public void encuentraPares(int[] vector) {
        int[] pares = new int[vector.length];
        int contador = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                pares[contador] = vector[i];
                contador++;
            }
        }

        System.out.println("El total de pares es: " + contador);
        System.out.print("Los pares son: ");

        for (int i = 0; i < contador; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println(); // Salto de línea después de imprimir los pares
    }

    // * Ejercicio 5.9

    public int rotarDerecha(int[] vector) {
        int aux = vector[vector.length - 1];
        for (int i = vector.length - 1; i > 0; i--) {
            vector[i] = vector[i - 1];
        }
        vector[0] = aux;
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        return vector[0];

    }

    // *Ejercicio 5.9 BIS
    public int rotarIzquierda(int[] vector) {
        int aux = vector[0];
        for (int i = 0; i < vector.length - 1; i++) {
            vector[i] = vector[i + 1];
        }
        vector[vector.length - 1] = aux;
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        return vector[vector.length - 1];
    }

    // * Ejercicion 5.9 BIS-2

    public void rotarDerechaNveces(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            rotarDerecha(vector);
        }

    }

    // *Ejercicio 5.9 BIS-3

    public void rotarIzquierdaNveces(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            rotarIzquierda(vector);
        }
    }

    // *Ejercicio 5.10
    public int[] generaArray(int MAX) {
        int[] localPares = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            localPares[i] = (int) (Math.random() * 50) + 1;
            if (localPares[i] % 2 == 0) {
                localPares[MAX - 1] = localPares[i];

            } else {
                i--;
            }
        }
        for (int i = 0; i < localPares.length; i++) {
            System.out.print(localPares[i] + " ");
        }

        return localPares;
    }

    // *Ejercicio 5.11
    public int[] calcularFrecuencias() {
        // Tamaño del array para almacenar los números aleatorios
        int n = 10000000;

        // Array para almacenar los números aleatorios
        int[] numerosAleatorios = new int[n];

        // Generar 100 números aleatorios entre 1 y 9 (inclusive)

        for (int i = 0; i < n; i++) {
            //numerosAleatorios[i] = Math.round((float) Math.random() * 8 + 1);
            numerosAleatorios[i] = (int) (Math.random() * 9) + 1;
        }

        // Inicializar el array de frecuencias
        int[] frecuencias = new int[9];

        // Calcular las frecuencias
        for (int i = 0; i < n; i++) {
            int numero = numerosAleatorios[i];
            frecuencias[numero - 1]++;
        }
        for (int i = 1; i <= 9; i++) {
            System.out.println("Frecuencia de " + i + ": " + frecuencias[i - 1]);
        }

        return frecuencias;
    }

}
