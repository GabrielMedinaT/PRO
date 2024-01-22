/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosstring;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */

public class Interfaz {

    private int opcion;

    public void menu() {
        System.out.println("1. Invertir cadena");
        System.out.println("2. Contar vocales");
        System.out.println("3. Comparar cadenas");
        System.out.println("4. Ver si es palindromo");
        System.out.println("5. Comprobar nombre en lista ");
        System.out.println("6. Salir");
        setOpcion();
    }

    public void setOpcion() {
        Scanner pasa = new Scanner(System.in);
        System.out.println("Introduce una opcion: ");
        int opcion = pasa.nextInt();
        this.opcion = opcion;
        opcionElegida(opcion);
    }

    public void opcionElegida(int opcion) {
        switch (opcion) {
            case 1:
                Scanner pasa = new Scanner(System.in);
                System.out.println("Introduce un texto: ");
                String cadena = pasa.nextLine();
                MetodosString metodos = new MetodosString();
                System.out.println(metodos.invertirCadena(cadena));
                break;
            case 2:
                Scanner pasa2 = new Scanner(System.in);
                System.out.println("Introduce un texto: ");
                String cadena2 = pasa2.nextLine();
                MetodosString metodos2 = new MetodosString();
                System.out.println(metodos2.contarVocales(cadena2));
                break;
            case 3:
                Scanner pasa3 = new Scanner(System.in);
                System.out.println("Introduce un texto: ");
                String cadena3 = pasa3.nextLine();
                MetodosString metodos3 = new MetodosString();
                System.out.println(metodos3.compararCadenas(cadena3));
                break;
            case 4:
                Scanner pasa4 = new Scanner(System.in);
                System.out.println("Introduce un texto: ");
                String cadena4 = pasa4.nextLine();
                MetodosString metodos4 = new MetodosString();
                System.out.println(metodos4.palindromo(cadena4));
                break;
            case 5:

                MetodosString metodos5 = new MetodosString();
                System.out.println(metodos5.insertarNombre());
                break;
            case 6:
                

            default:
                System.out.println("Opcion no valida");
                break;
        }

    }

}
