package proyectoNetbeans.ArraysSinRepetir.src.arrayssinrepetir;

import java.util.Arrays;
import java.util.Scanner;

class InterfazUsuario {
    private ArraySinRepetidos unArray, otroArray;
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
                for (int i=0; i>unArray.getElementos().length ; i ++){
                    System.out.println(unArray.getElementos()[i]);
                }
            }
            for (int i = 0; i < 10; i++) {
                System.out.print(unArray.getElementos()[i] +" ");
            }

        } while (nuevoElemento != 0 && !unArray.estaCompleto());
    }


    public void ejecutarOrdenadamente() {
        Arrays.sort(unArray.getElementos());
        int[] elementos = unArray.getElementos();
        System.out.println();
        imprimir();
        for (int i = elementos.length -1; i>= 0; i --){
            //if (elementos[i] != 0) System.out.print(elementos[i] + " ");
            System.out.print(elementos[i] + " ");

        }
    }









    public void imprimir() {
        System.out.println("Elementos del array:");
        //int[] elementos = unArray.getElementos();
        //for (int i = 0; i < unArray.getElementos().length; i++) {
          //  System.out.print(unArray.getElementos()[i]+ " ");
        //}

    }
}
