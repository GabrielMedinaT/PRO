package TableroAjedrez;

public class ArbolNavidad {

    public static void main(String[] args) {
        dibujarArbol(20); // Puedes ajustar la altura del árbol cambiando el número
    }

    public static void dibujarArbol(int altura) {
        int numero = 1;
        for (int i = 0; i < altura; i++) {
            // Espacios en blanco a la izquierda
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }

            // Parte superior del árbol
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(numero);

            }

            System.out.println();
        }

        // Dibuja el tronco del árbol
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < altura - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("0");
        }
    }
}

