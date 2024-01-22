package Ejercicio4_14.JavaApplication1.src.javaapplication1;

public class App {

    public static void main(String[] args) {
        pruebaWhile ejercicios = new pruebaWhile();

        // a) Escribir números desde 10 hasta 30
        System.out.println("a) Escribir números desde 10 hasta 30:");
        ejercicios.escribirNumero(10, 30);

        // b) Mostrar números pares entre 2 y 50
        System.out.println("\nb) Mostrar números pares entre 2 y 50:");
        ejercicios.mostrarPares();

        // c) Generar aleatorios y contar veces que sale el 12
        System.out.println("\nc) Generar aleatorios y contar veces que sale el 12:");
        int veces12 = ejercicios.generarAleatorios();
        System.out.println("El número 12 salió " + veces12 + " veces.");

        // d) Sumar serie hasta n
        System.out.println("\nd) Sumar serie hasta n:");
        double sumaSerie = ejercicios.sumarSerie(5);
        System.out.println("La suma de la serie hasta n=5 es: " + sumaSerie);

        // e) Sumar serie hasta n usando la fórmula de la pregunta d)
        System.out.println("\ne) Sumar serie (fórmula) hasta n:");
        double sumaSerieFormula = ejercicios.sumarSerieFormula(5);
        System.out.println("La suma de la serie (fórmula) hasta n=5 es: " + sumaSerieFormula);

        // f) Sumar divisores de un número
        System.out.println("\nf) Sumar divisores de un número:");
        int sumaDivisores = ejercicios.sumarDivisores(12);
        System.out.println("La suma de los divisores de 12 es: " + sumaDivisores);

        // g) Sumar dígitos de un número
        System.out.println("\ng) Sumar dígitos de un número:");
        int sumaDigitos = ejercicios.sumarDigitos(12345);
        System.out.println("La suma de los dígitos de 12345 es: " + sumaDigitos);
    }
}

