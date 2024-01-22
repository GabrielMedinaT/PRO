/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio20;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class interfaz {
    private String nombre;
    private double nota;

    public interfaz(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public interfaz() {
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del alumno: ");
        nombre = sc.nextLine();
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota del alumno: ");
        nota = sc.nextDouble();
        this.nota = nota;
    }
    



}
