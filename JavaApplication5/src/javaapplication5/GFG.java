package javaapplication5;

import java.util.TreeSet;

class GFG {
    public static void main(String[] args) {

        System.out.println(
                "Comparar por certificacion");
        TreeSet<Alumno> gfg4 = new TreeSet<>(new compararPorNotas());

        gfg4.add(new Alumno(6, "Pepe", 4, "A1"));
        gfg4.add(new Alumno(10, "Ana de las Tejas Verdes", 23, "C2"));
        gfg4.add(new Alumno(10, "Pipi Lastrum", 26, "B1"));
        gfg4.add(new Alumno(7, "Thor", 25, "A2"));
        gfg4.add(new Alumno(6, "Laura", 25, "A1"));

        for (Alumno alumno : gfg4) {
            System.out.println(alumno);
        }

    }
}
