package Arrays;

public class pruebaVectores {

    public int[] crearVector(int tamaño) {
        int[] vector = new int[tamaño];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.round((float) Math.random() * 10);
        }
        return vector;
    }

    //invertir vector sin crear copia
    public void invertirVectorSinCopia(int[] vector) {
        int aux;
        for (int i = 0; i < vector.length / 2; i++) {
            aux = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = aux;

        }
    }



    //duplica vector y lo devuelve invertido
    public int[] invertirVector(int[] vector) {
        int[] vectorInvertido = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            vectorInvertido[i] = vector[vector.length - 1 - i];
        }
        return vectorInvertido;
    }

    //imprimir vector
    public void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + " ");
        }
    }

    //calcular media de el vector 
    public double calcularMedia(double[] vector) {
        double media = 0;
        for (int i = 0; i < vector.length; i++) {
            media += vector[i];
        }
        System.out.printf("La media de las notas es: %.2f%n", media / vector.length);

        return  media / vector.length;
    }



}
