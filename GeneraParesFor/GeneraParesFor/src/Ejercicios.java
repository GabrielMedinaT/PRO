package GeneraParesFor.GeneraParesFor.src;

public class Ejercicios {

    private int[] notas = new int[30];

    public void secuencia() {
        int contadorPar = 0;

        for (int i = 0; i < 20; i++) {
            int numero = (int) (Math.random() * 50) + 1;
            if (numero % 2 == 0) {
                System.out.println("Numero " + (i + 1) + " : " + numero + " es par");
                contadorPar++;
            } else {
                System.out.println("Numero " + (i + 1) + " : " + numero + " es impar");

            }
        }
        System.out.println("Hay " + contadorPar + " numeros pares");
        System.out.println("Hay " + (20 - contadorPar) + " numeros impares");

    }

    public int max() {
        int maximo = 0;
        int numero = 0;
        for (int i = 0; i < 100; i++) {
            numero = (int) (Math.random() * 100);
            if (numero > maximo) {
                maximo = numero;
            }
        }
        System.out.println("El numero maximo es: " + maximo);

        return maximo;
    }

    public void notas(int maximo) {

        int notaMaxima = 0;
        int notaMinima = 1;
        double media = 0;
        int vecesMaxima = 0;
        int vecesMinima = 0;
        int nota = 0;
        int suma = 0;
        int MAX = maximo;

        for (int i = 0; i < MAX; i++) {
            nota = (int) (Math.random() * 10) + 1;

            suma += nota;
            if (nota > notaMaxima) {
                notaMaxima = nota;
                vecesMaxima = 1;
            } else if (nota == notaMaxima) {
                vecesMaxima++;
            }
            if (nota < notaMinima) {
                notaMinima = nota;
                vecesMinima = 1;
            } else if (nota == notaMinima) {
                vecesMinima++;
            }
        }
        media = (double) suma / MAX;
        System.out.println("La nota maxima es: " + notaMaxima);
        System.out.println("La nota minima es: " + notaMinima);
        System.out.println("La media es: " + media);
        System.out.println("La nota maxima se repite: " + vecesMaxima);
        System.out.println("La nota minima se repite: " + vecesMinima);

    }

}
