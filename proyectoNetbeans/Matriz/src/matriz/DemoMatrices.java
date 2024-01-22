/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz;

/**
 *
 * @author gabriel
 */
public class DemoMatrices {
    public static void main(String[] args) {
        // Ejemplo de uso
        Matriz matriz1 = new Matriz(2, 2);
        Matriz matriz2 = new Matriz(2, 2);
        

        System.out.println("Matriz 1:");
        System.out.println(matriz1);

        System.out.println("Matriz 2:");
        System.out.println(matriz2);

        Matriz suma = matriz1.sumar(matriz2);
        System.out.println("Suma de Matriz 1 y Matriz 2:");
        System.out.println(suma);

        Matriz resta = matriz1.restar(matriz2);
        System.out.println("Resta de Matriz 1 y Matriz 2:");
        System.out.println(resta);

        Matriz multiplicacion = matriz1.multiplicarPor(matriz2);
        System.out.println("Multiplicación de Matriz 1 y Matriz 2:");
        System.out.println(multiplicacion);

        Matriz traspuesta = matriz1.traspuesta();
        System.out.println("Traspuesta de Matriz 1:");
        System.out.println(traspuesta);
    }
}

