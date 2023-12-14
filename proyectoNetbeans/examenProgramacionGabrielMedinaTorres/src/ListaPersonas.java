/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel
 */

import java.util.Scanner;

public class ListaPersonas {
    private Persona persona1, persona2, persona3, persona4;
    private int numeroPersonas;

    public ListaPersonas() {
        numeroPersonas = 0;
    }

    public void addPersona(Persona p) {
        if (numeroPersonas == 0) {
            persona1 = p;
            numeroPersonas++;
        } else if (numeroPersonas == 1) {
            persona2 = p;
            numeroPersonas++;
        } else if (numeroPersonas == 2) {
            persona3 = p;
            numeroPersonas++;
        } else if (numeroPersonas == 3) {
            persona4 = p;
            numeroPersonas++;
        } else {
            System.out.println("La lista esta llena");
        }
    }

    public void mostrarLista() {
        System.out.println("Lista de personas");
        System.out.println("Nombre\tEstado Civil\tFecha de nacimiento");
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println(persona4);
    }
    // borrar persona por numero y reordenar el resto

    public void borrarPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de persona que quieres borrar");
        int numero = sc.nextInt();
        if (numero == 1 && persona1 != null) {
            persona1 = persona2;
            persona2 = persona3;
            persona3 = persona4;
            persona4 = null;
            numeroPersonas--;
            System.out.println("Persona borrada");
        } else if (numero == 2 && persona2 != null)  {
            persona2 = persona3;
            persona3 = persona4;
            persona4 = null;
            numeroPersonas--;
            System.out.println("Persona borrada");
        } else if (numero == 3 && persona3 != null) {
            persona3 = persona4;
            persona4 = null;
            numeroPersonas--;
            System.out.println("Persona borrada");
        } else if (numero == 4 && persona4 !=null) {
            persona4 = null;
            numeroPersonas--;
            System.out.println("Persona borrada");
        } else {
            System.out.println("No existe esa persona");
        }
    }

    public void borrarSolteros() {
        if (persona1.getEstadoCivil().equals("Soltero")) {
            persona1 = null;
            numeroPersonas--;
            System.out.println("Persona borrada");

        }
        if (persona2.getEstadoCivil().equals("Soltero")) {
            persona2 = null;
            numeroPersonas--;
            System.out.println("Persona borrada");

        }
        if (persona3.getEstadoCivil().equals("Soltero")) {
            persona3 = null;
            numeroPersonas--;
            System.out.println("Persona borrada");

        }
        if (persona4.getEstadoCivil().equals("Soltero")) {
            persona4 = null;
            numeroPersonas--;
            System.out.println("Persona borrada");

        }

    }

    public int pedirNumeros(int numero) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = sc.nextInt();
        while (numero != 999) {
            System.out.println("Introduce un numero");
            numero = sc.nextInt();
        }
        return numero;
    }

    public void generarNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int veces = sc.nextInt();
        int numero;
        for (int i = 0; i < veces; i++) {
            numero = (int) (Math.random() * 10 + 1);
            System.out.println(numero);

            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
