package Calculadora.Calculadora.src;
public class Calculadora {
    private int cantidad;
    private int suma;
    private int maximo;
    private int minimo;

    public Calculadora() {
        cantidad = 0;
        suma = 0;
        maximo = Integer.MIN_VALUE;
        minimo = Integer.MAX_VALUE;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getSuma() {
        return suma;
    }

    public int getMaximo() {
        return maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public void introducirNumero(int numero) {
        cantidad++;
        suma += numero;
        if (numero > maximo) {
            maximo = numero;
        }
        if (numero < minimo) {
            minimo = numero;
        }
    }

    public double getMedia() {
        if (cantidad == 0) {
            return 0.0;
        }
        return (double) suma / cantidad;
    }
}
