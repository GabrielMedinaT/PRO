/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;
/**
 *
 * @author gabriel
 */
import java.util.Arrays;

public class CursoPles {
    private static final int MAX_ALUMNOS = 25;
    private String[] nombresAlumnos;
    private double[] notasPles;
    private int numAlumnos;

    public CursoPles() {
        nombresAlumnos = new String[MAX_ALUMNOS];
        notasPles = new double[MAX_ALUMNOS];
        numAlumnos = 0;
    }

    public void altaAlumno(String nombre, double nota) {
        if (numAlumnos < MAX_ALUMNOS) {
            nombresAlumnos[numAlumnos] = nombre;
            notasPles[numAlumnos] = nota;
            numAlumnos++;
            ordenarPorNombre();
        } else {
            System.out.println("El curso está completo. No se puede añadir más alumnos.");
        }
    }

    public void escribirListado() {
        System.out.println("Listado de alumnos y notas:");
        System.out.println("-------------------------");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("|\t" + nombresAlumnos[i] + ":\t" + notasPles[i] + "\t|");
        }
        System.out.println("-------------------------");
    }

    public void ordenarPorNombre() {
        for (int i = 0; i < numAlumnos - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numAlumnos; j++) {
                if (nombresAlumnos[j].compareToIgnoreCase(nombresAlumnos[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String tempNombre = nombresAlumnos[minIndex];
            nombresAlumnos[minIndex] = nombresAlumnos[i];
            nombresAlumnos[i] = tempNombre;

            double tempNota = notasPles[minIndex];
            notasPles[minIndex] = notasPles[i];
            notasPles[i] = tempNota;
        }
    }

    public void ordenarPorNota() {
        // Implementa el método de ordenación burbuja para ordenar las notas de mayor a
        // menor
        for (int i = 0; i < numAlumnos - 1; i++) {
            for (int j = 0; j < numAlumnos - i - 1; j++) {
                if (notasPles[j] < notasPles[j + 1]) {
                    double tempNota = notasPles[j];
                    notasPles[j] = notasPles[j + 1];
                    notasPles[j + 1] = tempNota;

                    String tempNombre = nombresAlumnos[j];
                    nombresAlumnos[j] = nombresAlumnos[j + 1];
                    nombresAlumnos[j + 1] = tempNombre;
                }
            }
        }
        System.out.println("Listado ordenado por nota (de mayor a menor):");
        escribirListado();
    }

    public static void main(String[] args) {

        CursoPles curso = new CursoPles();
        curso.altaAlumno("Juan", 8.5);
        curso.altaAlumno("Ana", 7.8);
        curso.altaAlumno("Carlos", 9.2);
        curso.altaAlumno("Elena", 6.5);
        curso.altaAlumno("Adrian", 10);
        curso.altaAlumno("L", 10);
        curso.altaAlumno("M", 1.6);
        curso.altaAlumno("N", 3);

        curso.escribirListado();
        curso.ordenarPorNota();
    }
}
