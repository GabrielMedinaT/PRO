/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crearrombro;

/**
 *
 * Author: gabriel
 */
import java.util.Random;
class Partido {
    private static int contadorPartido = 1;
    private int numeroPartido;
    private char resultado;

    public Partido() {
        this.numeroPartido = contadorPartido++;
    }

    public char getResultado() {
        return resultado;
    }

    public void generarResultado() {
        Random random = new Random();
        int valor = random.nextInt(3);

        if (valor == 0) {
            resultado = '1';
        } else if (valor == 1) {
            resultado = 'X';
        } else {
            resultado = '2';
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:  %c _ %c", numeroPartido, (resultado == '1') ? '_' : (resultado == '2') ? '_' : 'X', (resultado == 'X') ? 'X' : '_');
    }
}

class Quiniela {
    private int numeroJornada;

    public Quiniela(int numeroJornada) {
        this.numeroJornada = numeroJornada;
    }

    public void generarQuinielas(int numeroQuinielas) {
        System.out.println("Jornada nª " + numeroJornada);
        System.out.println("  1  X  2");

        for (int i = 1; i <= numeroQuinielas; i++) {
            System.out.println("Quiniela " + i);
            generarResultados();
            System.out.println();
        }
    }

    private void generarResultados() {
        Partido[] partidos = new Partido[15];

        for (int i = 0; i < partidos.length; i++) {
            partidos[i] = new Partido();
            partidos[i].generarResultado();
            System.out.println(partidos[i]);
        }
    }
}