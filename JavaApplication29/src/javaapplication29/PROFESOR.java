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
public PROFESOR clone() throws CloneNotSupportedException {
    // Creamos un objeto clonado inicializado a null
    PROFESOR objeto = null;
    try {
        // Clonación superficial del objeto PROFESOR actual
        objeto = (PROFESOR) super.clone();
        
        // Inicializamos una nueva lista de materias para el objeto clonado
        objeto.MATERIAS = new ArrayList<>();
    } catch (CloneNotSupportedException ex) {
        // Manejo de excepción si la clonación no es compatible
        System.out.println(" no se puede duplicar");
    }

    // Iteramos sobre la lista de materias del objeto original
    Iterator i = this.MATERIAS.iterator();
    while (i.hasNext()) {
        // Obtenemos la referencia a cada materia (MODULO)
        MODULO puntero = (MODULO) i.next();
        if (puntero != null) {
            // Si la materia no es nula, la clonamos y la agregamos a la lista de materias del objeto clonado
            objeto.MATERIAS.add((MODULO) puntero.clone());
        }
    }
    // Devolvemos el objeto clonado que contiene copias profundas de sus materias
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
