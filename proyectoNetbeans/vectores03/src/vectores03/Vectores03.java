/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores03;

/**
 *
 * @author gabriel
 */
public class Vectores03 {

    /**
     * @param args the command line arguments
     */
    private int[] vector;
    private int max;

    //getter y setter de max
    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    // rellenar el vector con valores aleatorios
    public void rellenarVector() {
        vector = new int[max];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }
    // tostring

    public String toString() {
        String cadena = "";
        for (int i = 0; i < vector.length; i++) {
            cadena += vector[i] + " ";
        }
        return cadena;
    }

    // ordenar el vector
    public void ordenarVector() {
        int aux;
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] > vector[j]) {
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }
    // ordenar vector de forma descendente

    public void ordenarVectorDesc() {
        int aux;
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] < vector[j]) {
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }

}
