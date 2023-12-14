package proyectoNetbeans.ArraysSinRepetir.src.arrayssinrepetir;

import java.util.Arrays;
import java.util.Scanner;

class InterfazUsuario {
    private ArraySinRepetidos unArray;
    private Scanner teclado;

    public InterfazUsuario() {
        teclado = new Scanner(System.in);
        unArray = new ArraySinRepetidos();
    }

    public void ejecutar() {
        int nuevoElemento;
        do {
            System.out.print("Introduce un número (0 para salir): ");
            nuevoElemento = teclado.nextInt();
            if (nuevoElemento != 0) {
                unArray.insertar(nuevoElemento);
            }
        } while (nuevoElemento != 0 && !unArray.estaCompleto());
    }

    public void ejecutarOrdenadamente() {
        Arrays.sort(unArray.getElementos());
        imprimir();
    }

    public void imprimir() {
        System.out.println("Elementos del array:");
        int[] elementos = unArray.getElementos();
        for (int i = 0; i < unArray.getElementos().length; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}
