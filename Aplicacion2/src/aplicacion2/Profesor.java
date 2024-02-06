/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion2;

import java.util.HashSet;

/**
 *
 * @author Gabriel Medina
 */
public class Profesor {
    public String nombreProfesor;
    HashSet<Modulo> modulos;

    // inicializamos el profesor vacio
    public Profesor() {
    }

    public Profesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    // añadir modulo al profesor
    public void addModulo(Modulo modulo) {
        if (modulos == null) {
            modulos = new HashSet<>(modulos);
        }
        modulos.add(modulo);
    }

    // get modulos del profesor
    public HashSet<Modulo> getModulos() {
        return modulos;
    }

    // metodo para clonar un profesor
    public Profesor clonar(Profesor profesor) {
        Profesor clon = new Profesor(this.nombreProfesor);
        return clon;
    }

}
