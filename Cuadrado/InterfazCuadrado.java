package Cuadrado;

import java.util.Scanner;

public class InterfazCuadrado {
    private Scanner teclado;

    public InterfazCuadrado() {
        teclado = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion = menu();
    }

    private int menu() {
        int opc = 1;
        while (opc > 0 && opc < 5) {
            System.out.println("*************************************");
            System.out.println("*    1. Dibujar un cuadrado         *");
            System.out.println("*    2. Dibujar una equis           *");
            System.out.println("*    3. Dibujar solo en el borde    *");
            System.out.println("*    4. Dibujar un patron           *");
            System.out.println("*    5. Salir                       *");
            System.out.println("*************************************");
            System.out.println(" ");
            System.out.print("Ingrese una opcion: ");
            try {
                opc = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese un numero");
                teclado.nextLine();
            }
            controlarOpcion(opc);
        }
        return opc;
    }

    private void controlarOpcion(int o) {
        switch (o) {
            case 1:
                Cuadrado cuadrado = new Cuadrado();
                Scanner ladoScanner = new Scanner(System.in);
                System.out.print("Ingrese el lado del cuadrado: ");
                int lado = ladoScanner.nextInt();
                cuadrado.dibujarPatron(lado, 'x');
                System.out.println("Pulsa enter para volver al menú ....");
                teclado.nextLine();
                teclado.nextLine();
                break;
            case 2:
                Cuadrado cuadrado1 = new Cuadrado();
                Scanner ladoScanner1 = new Scanner(System.in);
                System.out.print("Ingrese el lado de la equis: ");
                int lado1 = ladoScanner1.nextInt();
                cuadrado1.dibujarUnaEquis(lado1, 'x');
                System.out.println("Pulsa enter para volver al menú ....");
                teclado.nextLine();
                teclado.nextLine();

                break;
            case 3:
                Scanner ladoScanner2 = new Scanner(System.in);
                System.out.print("Ingrese el lado del cuadrado: ");
                int lado2 = ladoScanner2.nextInt();
                Cuadrado cuadrado2 = new Cuadrado();
                cuadrado2.dibujarSoloEnElBorde(lado2, 'x');
                System.out.println("Pulsa enter para volver al menú ....");
                teclado.nextLine();
                teclado.nextLine();
                break;
            case 4:
                GeneradorSeries generador = new GeneradorSeries();
                generador.serieAlfabeto();
                generador.serieLetras();
                System.out.println("Pulsa enter para volver al menú ....");
                teclado.nextLine();
                break;
            case 5:
                System.out.println("Gracias por usar el programa");
                break;
            default:
                break;
        }
    }
}
