
package eliminarelementosarray;

public class EliminarElementosArray {
    
    private int tam;

    public int[] eliminarElemento(int[] array, int indice) {
        int[] arrayAux = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != indice) {
                arrayAux[j] = array[i];
                j++;
            }
        }
        return arrayAux;

    }

}
