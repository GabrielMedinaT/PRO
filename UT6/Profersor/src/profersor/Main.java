/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profersor;

/**
 *
 * @author gabri
 */
public class Main {
    public static void main(String[] args) {
        // Crear un profesor
        Profesor profesor1 = new Profesor("Juan");

        // Crear una materia
        Materia materia1 = new Materia("Matematicas");
        Materia materia3 = new Materia ("Ingles");
        // Añadir materia al profesor
        profesor1.añadirMateria(materia1);

        // Clonar al profesor
        Profesor profesor2 = profesor1.clone();
        profesor2.añadirMateria(materia3);


        System.out.println("Añado otra materia al profesor 1");

        // Añadir otra materia al primer profesor
        profesor1.añadirMateria(new Materia("Fisica"));

        // Mostrar las materias de cada profesor
        System.out.println("Nombre profesor 1 = " + profesor1.getNombre()+"\nMaterias del primer profesor:");
        for (Materia materia : profesor1.getMaterias()) {
            System.out.println(materia.getNombre());
        }

        System.out.println("Nombre profesor 2 = "+ profesor2.getNombre() + "\nMaterias del segundo profesor:");
        for (Materia materia : profesor2.getMaterias()) {
            System.out.println(materia.getNombre());
        }



    }
}
