/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion2;

/**
 *
 * @author Gabriel Medina
 */
public class Aplicacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos un profesor
        Profesor p = new Profesor("Gabriel");
        // clonamos el profesor
        Profesor p2 = p.clonar(p);
        // agregar un modulo de la lista de modulos al profesor
        Modulo pro = new Modulo("Programacion");
        Modulo fol = new Modulo("FOL");
        Modulo ssf = new Modulo ("Sistemas Informáticos");
        p.addModulo(fol);
        p.addModulo(pro);
        System.out.println(p.getModulos());
        System.out.println(p2.nombreProfesor);
        System.out.println(p2.getModulos());

    }

}
