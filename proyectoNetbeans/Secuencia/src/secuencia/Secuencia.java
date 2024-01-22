/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuencia;

/**
 *
 * @author gabriel
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Secuencia {
    private List<Integer> secuencia;

    // Constructor que recibe el tamaño de la secuencia y la inicializa con valores aleatorios
    public Secuencia(int tamano) {
        this.secuencia = new ArrayList<>();
        inicializar(tamano);
        System.out.println("");
    }

    // Constructor que recibe un array en orden creciente
    public Secuencia(Integer[] arrayOrdenado) {
        this.secuencia = new ArrayList<>(Arrays.asList(arrayOrdenado));
    }

    // Inicializa la secuencia con valores aleatorios en orden creciente
    public void inicializar(int tamano) {
        generarAleatorio(tamano);
        ordenarSecuencia();
    }

    // Genera valores aleatorios en el rango [1, 20] y los añade a la secuencia
    private void generarAleatorio(int tamano) {
        Random random = new Random();
        for (int i = 0; i < tamano; i++) {
            secuencia.add(random.nextInt(2) + 1);
        }
    }

    // Ordena la secuencia
    private void ordenarSecuencia() {
        secuencia.sort(Integer::compareTo);
    }

    // Devuelve una copia de la secuencia
    public List<Integer> getSecuencia() {
        List<Integer> copia = new ArrayList<>(secuencia);
        return copia;
    }


    public Secuencia fusionarCon(Secuencia otraSecuencia) {
        List<Integer> nuevaSecuencia = new ArrayList<>();
        int i = 0, j = 0;

        while (i < secuencia.size() && j < otraSecuencia.secuencia.size()) {
            int valorActual = secuencia.get(i);
            int valorOtraSecuencia = otraSecuencia.secuencia.get(j);

            if (valorActual < valorOtraSecuencia) {
                nuevaSecuencia.add(valorActual);
                i++;
            } else if (valorActual > valorOtraSecuencia) {
                nuevaSecuencia.add(valorOtraSecuencia);
                j++;
            } else {
                // Ambos valores son iguales (intersección)
                nuevaSecuencia.add(valorActual);
                i++;
                j++;
            }
        }

        // Agregar los elementos restantes de ambas secuencias
        while (i < secuencia.size()) {
            nuevaSecuencia.add(secuencia.get(i));
            i++;
        }

        while (j < otraSecuencia.secuencia.size()) {
            nuevaSecuencia.add(otraSecuencia.secuencia.get(j));
            j++;
        }

        return new Secuencia(nuevaSecuencia.toArray(new Integer[0]));
    }

    // Método para encontrar la intersección con otra Secuencia
    public Secuencia interseccionCon(Secuencia otraSecuencia) {
        List<Integer> interseccion = new ArrayList<>();
        int i = 0, j = 0;

        while (i < secuencia.size() && j < otraSecuencia.secuencia.size()) {
            int valorActual = secuencia.get(i);
            int valorOtraSecuencia = otraSecuencia.secuencia.get(j);

            if (valorActual < valorOtraSecuencia) {
                i++;
            } else if (valorActual > valorOtraSecuencia) {
                j++;
            } else {
                // Ambos valores son iguales (intersección)
                interseccion.add(valorActual);
                i++;
                j++;
            }
        }

        return new Secuencia(interseccion.toArray(new Integer[0]));
    }

   
    @Override
    public String toString() {
        return Arrays.toString(secuencia.toArray());
    }

    // Ejemplo de uso
    
}


