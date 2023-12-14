package proyectoNetbeans.ArraysSinRepetir.src.arrayssinrepetir;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySinRepetidos {
    private static final int MAX = 10;
    private int[] elementos;
    private int siguiente;

    public ArraySinRepetidos() {
        elementos = new int[MAX];
        siguiente = 0;
    }

    public void insertar(int nuevoElemento) {
        if (!estaElemento(nuevoElemento) && siguiente < MAX) {
            elementos[siguiente++] = nuevoElemento;
            System.out.println("Elemento insertado: " + nuevoElemento);
        } else {
            System.out.println("No se pudo insertar el elemento.");
        }
    }

    private boolean estaElemento(int numero) {
        for (int i = 0; i < siguiente; i++) {
            if (elementos[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public boolean estaCompleto() {
        return siguiente == MAX;
    }

    public int[] getElementos() {
        return elementos;
    }
}
