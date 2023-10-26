package Ejercicio4_14.JavaApplication1.src.javaapplication1;
public class pruebaWhile {
    public static void main(String[] args) {

        pruebaWhile ejercicios = new pruebaWhile();


        ejercicios.escribirNumero(10, 30);


        ejercicios.mostrarPares();


        int veces12 = ejercicios.generarAleatorios();
        System.out.println("El número 12 salió " + veces12 + " veces.");


        double sumaSerie = ejercicios.sumarSerie(5);
        System.out.println("La suma de la serie hasta n=5 es: " + sumaSerie);


        double sumaSerieFormula = ejercicios.sumarSerieFormula(5);
        System.out.println("La suma de la serie (fórmula) hasta n=5 es: " + sumaSerieFormula);


        int sumaDivisores = ejercicios.sumarDivisores(12);
        System.out.println("La suma de los divisores de 12 es: " + sumaDivisores);


        int sumaDigitos = ejercicios.sumarDigitos(12345);
        System.out.println("La suma de los dígitos de 12345 es: " + sumaDigitos);
    }

    public void escribirNumero(int desde, int hasta) {
        while (desde <= hasta) {
            System.out.print(desde + " ");
            desde++;
            System.out.println();
        }
    }

    public void mostrarPares() {
        int contador = 0;
        while(contador <= 50) {
            if (contador % 2 == 0) {
                System.out.print( contador + " ");
            }
            contador++;
        }
    }

    public int generarAleatorios() {
        int veces12 = 0;
        int numero;
        do {
            numero = (int) (Math.random() * 100) + 1;
            System.out.print(numero + " ");
            if (numero == 12) {
                veces12++;
            }
        } while (numero != 99 && veces12 < 30);
        System.out.println();
        return veces12;
    }

    public double sumarSerie(int n) {
        double suma = 0;
        int contador=0;
        while (contador<n){
            contador++;
            suma += 1.0 / contador;
        }
        return suma;
        /*for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;
        }
        return suma;*/
    }

    public double sumarSerieFormula(int n) {
        return Math.log(n) + 0.57721566490153286060; // Constante de Euler-Mascheroni
    }

    public int sumarDivisores(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public int sumarDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }
}
