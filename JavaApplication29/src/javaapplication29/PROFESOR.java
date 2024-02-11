package javaapplication29;

import java.util.ArrayList;
import java.util.Iterator;

public class PROFESOR implements Cloneable {

    public static String cadena;
    public String NOMBRE;
    public ArrayList<MODULO> MATERIAS;

    public PROFESOR(String NOMBRE, MODULO M) {
        this.NOMBRE = NOMBRE;
        this.MATERIAS = new ArrayList<>();
        this.MATERIAS.add(M);
    }

    @Override
    public PROFESOR clone() {
        PROFESOR objeto = null;
        try {
            objeto = (PROFESOR) super.clone();
            objeto.MATERIAS = new ArrayList<>();
        } catch (CloneNotSupportedException ex) {
            System.out.println(" no se puede duplicar");
        }

        Iterator i = this.MATERIAS.iterator();
        while (i.hasNext()) {
            MODULO puntero = (MODULO) i.next();
            if (puntero != null) {
                objeto.MATERIAS.add((MODULO) puntero.clone());
            }
        }
        return objeto;
    }

    public void agregarModulo(MODULO M) {
        this.MATERIAS.add(M);
    }

    @Override
    public String toString() {
        cadena = ""; //variable global
        this.MATERIAS.forEach(m -> {
            cadena += ((MODULO) m).NOMBRE + " ";
        });
        return cadena;
    }
}
