package javaapplication5;

import java.util.Comparator;

public class compararPorNotas implements Comparator<Alumno> {
    // compara por notas si son iguales compara por certificado
    @Override
    public int compare(Alumno e1, Alumno e2) {
        if (e1.notas == e2.notas) {
            // Si las notas son iguales, compara por certificación
            return e2.certificacion.compareTo(e1.certificacion);
        } else if (e2.notas > e1.notas) {
            return 1;
        } else {
            return -1;
        }
    }
}
