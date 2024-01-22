package Figura.Figura.src;
public class Figura {

    //Ejericio 1

    public void escribirFigura(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(i + "   ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    // Ejercicio 2
    public void escribirFiguraDos(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i + "   ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // Ejercicio 3

    public void escribirFiguraTres(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + "   ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // Ejercicio 4

    public void imprimirTablas(int numero) {
        int i = 1;
        while (i <= numero) {
            System.out.println("Tabla del " + i + ":");
            int j = 1;
            while (j <= 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            System.out.println(); // Lineas en blanco entre tablas
            i++;
        }
    }
}
