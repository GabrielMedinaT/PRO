/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eliminarelementosarray;

/**
 *
 * @author gabriel
 */
public class Main {

    public static void main(String[] args) {
        EliminarElementosArray eliminarElementosArray = new EliminarElementosArray();
        int[] array = {1, 2, 3, 4, 5};
        int indice = 2;
        int[] arrayAux = eliminarElementosArray.eliminarElemento(array, indice);
        for (int i = 0; i < arrayAux.length; i++) {
            System.out.print(arrayAux[i]);
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

}
