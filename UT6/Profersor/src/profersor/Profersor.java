/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package profersor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
class Profesor implements Cloneable {
    private String nombre;
    private List<Materia> materias;

    public Profesor(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void añadirMateria(Materia materia) {
        this.materias.add(materia);
    }

    @Override
    protected Profesor clone() {
        try {
            Profesor clonedProfesor = (Profesor) super.clone();
            clonedProfesor.materias = new ArrayList<>(this.materias);
            return clonedProfesor;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}