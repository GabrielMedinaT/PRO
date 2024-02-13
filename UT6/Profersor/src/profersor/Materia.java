/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profersor;

/**
 *
 * @author gabri
 */
import java.util.ArrayList;
import java.util.List;

class Materia implements Cloneable {
    private String nombre;

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    protected Materia clone() throws CloneNotSupportedException {
        try {
            return (Materia) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
