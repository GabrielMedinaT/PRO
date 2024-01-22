/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

/**
 *
 * @author gabriel
 */
import java.util.Arrays;
import java.util.Random;

public class Matriz {
    private int[][] elementos;
    private int filas , columnas;

    public Matriz(int filas) {
        if (filas < 1) {
            throw new IllegalArgumentException("Error en parámetro");
        }
        this.filas = filas;
        this.columnas = filas;
        inicializar();
    }

    public Matriz(int filas, int columnas) {
        if (filas < 1 || columnas < 1) {
            throw new IllegalArgumentException("Error en parámetros");
        }
        this.filas = filas;
        this.columnas = columnas;
        inicializar();
    }

    public Matriz(int[][] m) {
        verificar(m);
        this.filas = m.length;
        this.columnas = m[0].length;
        this.elementos = Arrays.copyOf(m, m.length);
    }

    private void verificar(int[][] m) {
        if (m == null || m.length == 0 || m[0].length == 0) {
            throw new IllegalArgumentException("Error en parámetro");
        }

        int numColumnas = m[0].length;

        for (int i = 1; i < m.length; i++) {
            if (m[i].length != numColumnas) {
                throw new IllegalArgumentException("Error en parámetro");
            }
        }
    }

    private void inicializar() {
        Random random = new Random();
        elementos = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                elementos[i][j] = random.nextInt(20) + 1;
            }
        }
    }

    private void comprobarIndices(int f, int c) {
        if (f < 0 || f >= filas || c < 0 || c >= columnas) {
            throw new IllegalArgumentException("Índices fuera de límites");
        }
    }

    public int getValor(int fila, int col) {
        comprobarIndices(fila, col);
        return elementos[fila][col];
    }

    public int getNumFilas() {
        return filas;
    }

    public int getNumColumnas() {
        return columnas;
    }

    public void setValor(int valor, int fila, int col) {
        comprobarIndices(fila, col);
        elementos[fila][col] = valor;
    }

    public Matriz sumar(Matriz otra) {
        if (otra == null || filas != otra.getNumFilas() || columnas != otra.getNumColumnas()) {
            throw new IllegalArgumentException("No se puede sumar matrices");
        }

        Matriz resultado = new Matriz(filas, columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.setValor(elementos[i][j] + otra.getValor(i, j), i, j);
            }
        }

        return resultado;
    }

    public Matriz restar(Matriz otra) {
        if (otra == null || filas != otra.getNumFilas() || columnas != otra.getNumColumnas()) {
            throw new IllegalArgumentException("No se puede restar matrices");
        }

        Matriz resultado = new Matriz(filas, columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.setValor(elementos[i][j] - otra.getValor(i, j), i, j);
            }
        }

        return resultado;
    }

    public Matriz multiplicarPor(int factor) {
        Matriz resultado = new Matriz(filas, columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.setValor(elementos[i][j] * factor, i, j);
            }
        }

        return resultado;
    }

    public Matriz multiplicarPor(Matriz otra) {
        if (otra == null || columnas != otra.getNumFilas()) {
            throw new IllegalArgumentException("No se puede multiplicar matrices");
        }

        Matriz resultado = new Matriz(filas, otra.getNumColumnas());

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < otra.getNumColumnas(); j++) {
                int suma = 0;
                for (int k = 0; k < columnas; k++) {
                    suma += elementos[i][k] * otra.getValor(k, j);
                }
                resultado.setValor(suma, i, j);
            }
        }

        return resultado;
    }

    public Matriz traspuesta() {
        Matriz resultado = new Matriz(columnas, filas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.setValor(elementos[i][j], j, i);
            }
        }

        return resultado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sb.append(elementos[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

