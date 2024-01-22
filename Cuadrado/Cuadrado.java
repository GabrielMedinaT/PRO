package Cuadrado;

public class Cuadrado {

    public void dibujarPatron(int lado, char caracter) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < i +1; j++) {
                System.out.print("*");
            }

            for (int j = i; j < lado; j++) {
                System.out.print(caracter);
            }

            System.out.println("");
        }
    }

    public void dibujarUnaEquis(int lado, char caracter) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == j || i + j == lado - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public void dibujarSoloEnElBorde (int lado, char caracter) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print(caracter );
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }



    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.dibujarPatron(9, 'x');
        System.out.println();


        cuadrado.dibujarUnaEquis(3, 'x');
        System.out.println();

        cuadrado.dibujarSoloEnElBorde(5, 'x');


    }
}
