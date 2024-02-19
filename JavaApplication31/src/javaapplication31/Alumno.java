package javaapplication31;

import java.util.TreeSet;

/**
 *
 * @author gabriel
 */
public class Alumno {
    private int edad, notas;
    private String nombre;

    public void Empleado(String queNombre, int queEdad, int queNotas) {
        queNombre = nombre;
        queEdad = edad;
        queNotas = notas;
    }

    public String getnonbre() {
        return nombre;
    }

    TreeSet<Alumno> gfg = new TreeSet<>();

    public void addAlumno(Alumno a) {
        gfg.add(a);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public int getEdad() {
        return edad;
    }

    public int getNotas() {
        return notas;
    }

    public String getNombre() {
        return nombre;
    }

}
